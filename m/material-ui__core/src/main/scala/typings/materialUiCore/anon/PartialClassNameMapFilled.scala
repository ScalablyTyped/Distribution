package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FilledInput/FilledInput.FilledInputClassKey>> */
@js.native
trait PartialClassNameMapFilled extends js.Object {
  
  var adornedEnd: js.UndefOr[String] = js.native
  
  var adornedStart: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var focused: js.UndefOr[String] = js.native
  
  var input: js.UndefOr[String] = js.native
  
  var inputAdornedEnd: js.UndefOr[String] = js.native
  
  var inputAdornedStart: js.UndefOr[String] = js.native
  
  var inputMarginDense: js.UndefOr[String] = js.native
  
  var inputMultiline: js.UndefOr[String] = js.native
  
  var multiline: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var underline: js.UndefOr[String] = js.native
}
object PartialClassNameMapFilled {
  
  @scala.inline
  def apply(): PartialClassNameMapFilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFilled]
  }
  
  @scala.inline
  implicit class PartialClassNameMapFilledOps[Self <: PartialClassNameMapFilled] (val x: Self) extends AnyVal {
    
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
    def setAdornedEnd(value: String): Self = this.set("adornedEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdornedEnd: Self = this.set("adornedEnd", js.undefined)
    
    @scala.inline
    def setAdornedStart(value: String): Self = this.set("adornedStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdornedStart: Self = this.set("adornedStart", js.undefined)
    
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
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setInputAdornedEnd(value: String): Self = this.set("inputAdornedEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAdornedEnd: Self = this.set("inputAdornedEnd", js.undefined)
    
    @scala.inline
    def setInputAdornedStart(value: String): Self = this.set("inputAdornedStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputAdornedStart: Self = this.set("inputAdornedStart", js.undefined)
    
    @scala.inline
    def setInputMarginDense(value: String): Self = this.set("inputMarginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMarginDense: Self = this.set("inputMarginDense", js.undefined)
    
    @scala.inline
    def setInputMultiline(value: String): Self = this.set("inputMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputMultiline: Self = this.set("inputMultiline", js.undefined)
    
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
