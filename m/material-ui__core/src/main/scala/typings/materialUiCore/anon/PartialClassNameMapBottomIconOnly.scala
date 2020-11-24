package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/core.@material-ui/core/BottomNavigationAction/BottomNavigationAction.BottomNavigationActionClassKey>> */
@js.native
trait PartialClassNameMapBottomIconOnly extends js.Object {
  
  var iconOnly: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var selected: js.UndefOr[String] = js.native
  
  var wrapper: js.UndefOr[String] = js.native
}
object PartialClassNameMapBottomIconOnly {
  
  @scala.inline
  def apply(): PartialClassNameMapBottomIconOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapBottomIconOnly]
  }
  
  @scala.inline
  implicit class PartialClassNameMapBottomIconOnlyOps[Self <: PartialClassNameMapBottomIconOnly] (val x: Self) extends AnyVal {
    
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
    def setIconOnly(value: String): Self = this.set("iconOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconOnly: Self = this.set("iconOnly", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
}
