package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/ListItemText/ListItemText.ListItemTextClassKey>> */
@js.native
trait PartialClassNameMapListItDense extends js.Object {
  
  var dense: js.UndefOr[String] = js.native
  
  var inset: js.UndefOr[String] = js.native
  
  var primary: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var secondary: js.UndefOr[String] = js.native
  
  var textDense: js.UndefOr[String] = js.native
}
object PartialClassNameMapListItDense {
  
  @scala.inline
  def apply(): PartialClassNameMapListItDense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapListItDense]
  }
  
  @scala.inline
  implicit class PartialClassNameMapListItDenseOps[Self <: PartialClassNameMapListItDense] (val x: Self) extends AnyVal {
    
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
    def setDense(value: String): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setInset(value: String): Self = this.set("inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInset: Self = this.set("inset", js.undefined)
    
    @scala.inline
    def setPrimary(value: String): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSecondary(value: String): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
    
    @scala.inline
    def setTextDense(value: String): Self = this.set("textDense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDense: Self = this.set("textDense", js.undefined)
  }
}
