package typings.luminoApplication.mod

import typings.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlugin[T, U] extends js.Object {
  /**
    * Whether the plugin should be activated on application start.
    *
    * #### Notes
    * The default is `false`.
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  /**
    * The human readable id of the plugin.
    *
    * #### Notes
    * This must be unique within an application.
    */
  var id: String = js.native
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
  var optional: js.UndefOr[js.Array[Token[_]]] = js.native
  /**
    * The type of service provided by the plugin, if any.
    *
    * #### Notes
    * This token corresponds to the service exported by the plugin.
    *
    * When the plugin is activated, the return value of `activate()`
    * is used as the concrete instance of the type.
    */
  var provides: js.UndefOr[Token[U]] = js.native
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
  var requires: js.UndefOr[js.Array[Token[_]]] = js.native
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
  def activate(app: T, args: js.Any*): U | js.Promise[U] = js.native
}

object IPlugin {
  @scala.inline
  def apply[T, U](activate: (T, /* repeated */ js.Any) => U | js.Promise[U], id: String): IPlugin[T, U] = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction2(activate), id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlugin[T, U]]
  }
  @scala.inline
  implicit class IPluginOps[Self <: IPlugin[_, _], T, U] (val x: Self with (IPlugin[T, U])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivate(value: (T, /* repeated */ js.Any) => U | js.Promise[U]): Self = this.set("activate", js.Any.fromFunction2(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    @scala.inline
    def setOptionalVarargs(value: Token[js.Any]*): Self = this.set("optional", js.Array(value :_*))
    @scala.inline
    def setOptional(value: js.Array[Token[_]]): Self = this.set("optional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptional: Self = this.set("optional", js.undefined)
    @scala.inline
    def setProvides(value: Token[U]): Self = this.set("provides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvides: Self = this.set("provides", js.undefined)
    @scala.inline
    def setRequiresVarargs(value: Token[js.Any]*): Self = this.set("requires", js.Array(value :_*))
    @scala.inline
    def setRequires(value: js.Array[Token[_]]): Self = this.set("requires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequires: Self = this.set("requires", js.undefined)
  }
  
}

