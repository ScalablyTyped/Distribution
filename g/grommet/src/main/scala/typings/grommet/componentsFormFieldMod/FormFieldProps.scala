package typings.grommet.componentsFormFieldMod

import typings.grommet.Anon_Message
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFieldProps extends js.Object {
  var component: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[String | ReactNode] = js.undefined
  var help: js.UndefOr[String | ReactNode] = js.undefined
  var htmlFor: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String | ReactNode] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pad: js.UndefOr[Boolean] = js.undefined
  // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var required: js.UndefOr[Boolean] = js.undefined
  var validate: js.UndefOr[Anon_Message | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object FormFieldProps {
  @scala.inline
  def apply(
    component: js.Any = null,
    error: String | ReactNode = null,
    help: String | ReactNode = null,
    htmlFor: String = null,
    label: String | ReactNode = null,
    margin: MarginType = null,
    name: String = null,
    pad: js.UndefOr[Boolean] = js.undefined,
    placeholder: PlaceHolderType = null,
    required: js.UndefOr[Boolean] = js.undefined,
    validate: Anon_Message | (js.Function1[/* repeated */ js.Any, _]) = null
  ): FormFieldProps = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (help != null) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pad)) __obj.updateDynamic("pad")(pad.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormFieldProps]
  }
}

