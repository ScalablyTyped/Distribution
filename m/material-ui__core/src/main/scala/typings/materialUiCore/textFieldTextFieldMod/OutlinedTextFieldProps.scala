package typings.materialUiCore.textFieldTextFieldMod

import typings.materialUiCore.anon.PartialOutlinedInputProps
import typings.materialUiCore.inputBaseInputBaseMod.InputBaseComponentProps
import typings.materialUiCore.materialUiCoreStrings.outlined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlinedTextFieldProps
  extends BaseTextFieldProps
     with TextFieldProps {
  
  var InputProps: js.UndefOr[PartialOutlinedInputProps] = js.native
  
  var inputProps: js.UndefOr[InputBaseComponentProps] = js.native
  
  @JSName("variant")
  var variant_OutlinedTextFieldProps: outlined = js.native
}
object OutlinedTextFieldProps {
  
  @scala.inline
  def apply(variant: outlined): OutlinedTextFieldProps = {
    val __obj = js.Dynamic.literal(variant = variant.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlinedTextFieldProps]
  }
  
  @scala.inline
  implicit class OutlinedTextFieldPropsOps[Self <: OutlinedTextFieldProps] (val x: Self) extends AnyVal {
    
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
    def setVariant(value: outlined): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProps(value: PartialOutlinedInputProps): Self = this.set("InputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("InputProps", js.undefined)
  }
}
