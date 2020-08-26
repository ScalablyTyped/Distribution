package typings.grommet.formFieldMod

import typings.grommet.anon.Message
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PlaceHolderType
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormFieldProps extends js.Object {
  var component: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[String | ReactNode] = js.native
  var help: js.UndefOr[String | ReactNode] = js.native
  var htmlFor: js.UndefOr[String] = js.native
  var info: js.UndefOr[String | ReactNode] = js.native
  var label: js.UndefOr[String | ReactNode] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var name: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Array[String]] = js.native
  var pad: js.UndefOr[Boolean] = js.native
  // Although Placeholder is not a prop within FormField we Omit the HTML placeholder attribute and replaced with following.
  var placeholder: js.UndefOr[PlaceHolderType] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var validate: js.UndefOr[
    Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])])
  ] = js.native
}

object FormFieldProps {
  @scala.inline
  def apply(): FormFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormFieldProps]
  }
  @scala.inline
  implicit class FormFieldPropsOps[Self <: FormFieldProps] (val x: Self) extends AnyVal {
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
    def setComponent(value: js.Any): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: String | ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setHelp(value: String | ReactNode): Self = this.set("help", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    @scala.inline
    def setHtmlFor(value: String): Self = this.set("htmlFor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlFor: Self = this.set("htmlFor", js.undefined)
    @scala.inline
    def setInfo(value: String | ReactNode): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setLabel(value: String | ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: String*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: js.Array[String]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPad(value: Boolean): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPlaceholder(value: PlaceHolderType): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setValidateVarargs(value: (Message | (js.Function1[js.Any, js.Any]))*): Self = this.set("validate", js.Array(value :_*))
    @scala.inline
    def setValidateFunction1(value: /* repeated */ js.Any => _): Self = this.set("validate", js.Any.fromFunction1(value))
    @scala.inline
    def setValidate(
      value: Message | (js.Function1[/* repeated */ js.Any, _]) | (js.Array[Message | (js.Function1[/* repeated */ _, _])])
    ): Self = this.set("validate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
  }
  
}

