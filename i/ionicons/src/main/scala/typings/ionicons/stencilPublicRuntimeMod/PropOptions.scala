package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropOptions extends js.Object {
  /** @deprecated: "attr" has been deprecated, please use "attribute" instead. */
  var attr: js.UndefOr[String] = js.undefined
  /**
    * The name of the associated DOM attribute.
    * Stencil uses different heuristics to determine the default name of the attribute,
    * but using this property, you can override the default behaviour.
    */
  var attribute: js.UndefOr[String | Null] = js.undefined
  /** @deprecated "connect" has been deprecated, please use ES modules and/or dynamic imports instead. */
  var connect: js.UndefOr[String] = js.undefined
  /** @deprecated "context" has been deprecated. */
  var context: js.UndefOr[String] = js.undefined
  /**
    * A Prop is _by default_ immutable from inside the component logic.
    * Once a value is set by a user, the component cannot update it internally.
    * However, it's possible to explicitly allow a Prop to be mutated from inside the component,
    * by setting this `mutable` option to `true`.
    */
  var mutable: js.UndefOr[Boolean] = js.undefined
  /**
    * In some cases it may be useful to keep a Prop in sync with an attribute.
    * In this case you can set the `reflect` option to `true`, since it defaults to `false`:
    */
  var reflect: js.UndefOr[Boolean] = js.undefined
  /** @deprecated "reflectToAttr" has been deprecated, please use "reflect" instead. */
  var reflectToAttr: js.UndefOr[Boolean] = js.undefined
}

object PropOptions {
  @scala.inline
  def apply(
    attr: String = null,
    attribute: js.UndefOr[Null | String] = js.undefined,
    connect: String = null,
    context: String = null,
    mutable: js.UndefOr[Boolean] = js.undefined,
    reflect: js.UndefOr[Boolean] = js.undefined,
    reflectToAttr: js.UndefOr[Boolean] = js.undefined
  ): PropOptions = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr.asInstanceOf[js.Any])
    if (!js.isUndefined(attribute)) __obj.updateDynamic("attribute")(attribute.asInstanceOf[js.Any])
    if (connect != null) __obj.updateDynamic("connect")(connect.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(mutable)) __obj.updateDynamic("mutable")(mutable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reflect)) __obj.updateDynamic("reflect")(reflect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reflectToAttr)) __obj.updateDynamic("reflectToAttr")(reflectToAttr.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropOptions]
  }
}

