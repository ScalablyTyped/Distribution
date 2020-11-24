package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/Input/Input.InputClassKey>> */
@js.native
trait PartialClassNameMapInputC extends js.Object {
  
  var disabled: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var focused: js.UndefOr[String] = js.native
  
  var formControl: js.UndefOr[String] = js.native
  
  var fullWidth: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[String] = js.native
  
  var inputMarginDense: js.UndefOr[String] = js.native
  
  var inputMultiline: js.UndefOr[String] = js.native
  
  var inputType: js.UndefOr[String] = js.native
  
  var inputTypeSearch: js.UndefOr[String] = js.native
  
  var multiline: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var underline: js.UndefOr[String] = js.native
}
object PartialClassNameMapInputC {
  
  @scala.inline
  def apply(): PartialClassNameMapInputC = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapInputC]
  }
  
  @scala.inline
  implicit class PartialClassNameMapInputCOps[Self <: PartialClassNameMapInputC] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setFormControl(value: String): Self = this.set("formControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormControl: Self = this.set("formControl", js.undefined)
    
    @scala.inline
    def setFullWidth(value: String): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputMarginDense(value: String): Self = this.set("inputMarginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMarginDense: Self = this.set("inputMarginDense", js.undefined)
    
    @scala.inline
    def setInputMultiline(value: String): Self = this.set("inputMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMultiline: Self = this.set("inputMultiline", js.undefined)
    
    @scala.inline
    def setInputType(value: String): Self = this.set("inputType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputType: Self = this.set("inputType", js.undefined)
    
    @scala.inline
    def setInputTypeSearch(value: String): Self = this.set("inputTypeSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputTypeSearch: Self = this.set("inputTypeSearch", js.undefined)
    
    @scala.inline
    def setMultiline(value: String): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setUnderline(value: String): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderline: Self = this.set("underline", js.undefined)
  }
}
