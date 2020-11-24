package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/InputLabel/InputLabel.InputLabelClassKey>> */
@js.native
trait PartialClassNameMapInputL extends js.Object {
  
  var animated: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var filled: js.UndefOr[String] = js.native
  
  var focused: js.UndefOr[String] = js.native
  
  var formControl: js.UndefOr[String] = js.native
  
  var marginDense: js.UndefOr[String] = js.native
  
  var outlined: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var shrink: js.UndefOr[String] = js.native
}
object PartialClassNameMapInputL {
  
  @scala.inline
  def apply(): PartialClassNameMapInputL = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapInputL]
  }
  
  @scala.inline
  implicit class PartialClassNameMapInputLOps[Self <: PartialClassNameMapInputL] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: String): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    
    @scala.inline
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFilled(value: String): Self = this.set("filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    
    @scala.inline
    def setFocused(value: String): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setFormControl(value: String): Self = this.set("formControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormControl: Self = this.set("formControl", js.undefined)
    
    @scala.inline
    def setMarginDense(value: String): Self = this.set("marginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginDense: Self = this.set("marginDense", js.undefined)
    
    @scala.inline
    def setOutlined(value: String): Self = this.set("outlined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlined: Self = this.set("outlined", js.undefined)
    
    @scala.inline
    def setRequired(value: String): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setShrink(value: String): Self = this.set("shrink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShrink: Self = this.set("shrink", js.undefined)
  }
}
