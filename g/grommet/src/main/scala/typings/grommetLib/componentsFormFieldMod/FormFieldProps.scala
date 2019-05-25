package typings
package grommetLib.componentsFormFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldProps extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var help: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var htmlFor: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNode] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var pad: js.UndefOr[scala.Boolean] = js.undefined
  var required: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[grommetLib.Anon_Message | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object FormFieldProps {
  @scala.inline
  def apply(
    component: js.Any = null,
    error: java.lang.String | reactLib.reactMod.ReactNode = null,
    help: java.lang.String | reactLib.reactMod.ReactNode = null,
    htmlFor: java.lang.String = null,
    label: java.lang.String | reactLib.reactMod.ReactNode = null,
    name: java.lang.String = null,
    pad: js.UndefOr[scala.Boolean] = js.undefined,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    validate: grommetLib.Anon_Message | (js.Function1[/* repeated */ js.Any, _]) = null
  ): FormFieldProps = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldProps]
  }
}

