package typings.materialUiCore.textFieldTextFieldMod

import typings.materialUiCore.anon.PartialInputProps
import typings.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typings.materialUiCore.materialUiCoreStrings.standard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  var InputProps: js.UndefOr[PartialInputProps] = js.native
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  @JSName("variant")
  var variant_StandardTextFieldProps: js.UndefOr[standard] = js.native
}

object StandardTextFieldProps {
  @scala.inline
  def apply(): StandardTextFieldProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardTextFieldProps]
  }
  @scala.inline
  implicit class StandardTextFieldPropsOps[Self <: StandardTextFieldProps] (val x: Self) extends AnyVal {
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
    def setInputProps(value: PartialInputProps): Self = this.set("InputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("InputProps", js.undefined)
    @scala.inline
    def setVariant(value: standard): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
  }
  
}

