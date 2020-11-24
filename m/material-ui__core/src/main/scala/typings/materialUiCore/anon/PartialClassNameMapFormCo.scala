package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/FormControl/FormControl.FormControlClassKey>> */
@js.native
trait PartialClassNameMapFormCo extends js.Object {
  
  var fullWidth: js.UndefOr[String] = js.native
  
  var marginDense: js.UndefOr[String] = js.native
  
  var marginNormal: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapFormCo {
  
  @scala.inline
  def apply(): PartialClassNameMapFormCo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapFormCo]
  }
  
  @scala.inline
  implicit class PartialClassNameMapFormCoOps[Self <: PartialClassNameMapFormCo] (val x: Self) extends AnyVal {
    
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
    def setFullWidth(value: String): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setMarginDense(value: String): Self = this.set("marginDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginDense: Self = this.set("marginDense", js.undefined)
    
    @scala.inline
    def setMarginNormal(value: String): Self = this.set("marginNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginNormal: Self = this.set("marginNormal", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
