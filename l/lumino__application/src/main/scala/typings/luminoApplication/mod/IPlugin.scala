package typings.luminoApplication.mod

import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlugin[T, U] extends js.Object {
  /**
    * Whether the plugin should be activated on application start.
    *
    * #### Notes
    * The default is `false`.
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**
    * The human readable id of the plugin.
    *
    * #### Notes
    * This must be unique within an application.
    */
  var id: String
  /**
    * The types of optional services for the plugin, if any.
    *
    * #### Notes
    * These tokens correspond to the services that can be used by the
    * plugin if available, but are not necessarily required.
    *
    * The optional services will be passed to the `activate()` function
    * following all required services. If an optional service cannot be
    * resolved, `null` will be passed in its place.
    */
  var optional: js.UndefOr[js.Array[Token[_]]] = js.undefined
  /**
    * The type of service provided by the plugin, if any.
    *
    * #### Notes
    * This token corresponds to the service exported by the plugin.
    *
    * When the plugin is activated, the return value of `activate()`
    * is used as the concrete instance of the type.
    */
  var provides: js.UndefOr[Token[U]] = js.undefined
  /**
    * The types of required services for the plugin, if any.
    *
    * #### Notes
    * These tokens correspond to the services that are required by
    * the plugin for correct operation.
    *
    * When the plugin is activated, a concrete instance of each type
    * will be passed to the `activate()` function, in the order they
    * are specified in the `requires` array.
    */
  var requires: js.UndefOr[js.Array[Token[_]]] = js.undefined
  /**
    * A function invoked to activate the plugin.
    *
    * @param app - The application which owns the plugin.
    *
    * @param args - The services specified by the `requires` property.
    *
    * @returns The provided service, or a promise to the service.
    *
    * #### Notes
    * This function will be called whenever the plugin is manually
    * activated, or when another plugin being activated requires
    * the service it provides.
    *
    * This function will not be called unless all of its required
    * services can be fulfilled.
    */
  def activate(app: T, args: js.Any*): U | js.Promise[U]
}

object IPlugin {
  @scala.inline
  def apply[T, U](
    activate: (T, /* repeated */ js.Any) => U | js.Promise[U],
    id: String,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    optional: js.Array[Token[_]] = null,
    provides: Token[U] = null,
    requires: js.Array[Token[_]] = null
  ): IPlugin[T, U] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (optional != null) __obj.updateDynamic("optional")(optional.asInstanceOf[js.Any])
    if (provides != null) __obj.updateDynamic("provides")(provides.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin[T, U]]
  }
}

