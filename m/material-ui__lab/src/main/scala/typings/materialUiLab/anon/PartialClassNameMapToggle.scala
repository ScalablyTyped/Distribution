package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/ToggleButtonGroup/ToggleButtonGroup.ToggleButtonGroupClassKey>> */
@js.native
trait PartialClassNameMapToggle extends js.Object {
  
  var grouped: js.UndefOr[String] = js.native
  
  var groupedHorizontal: js.UndefOr[String] = js.native
  
  var groupedVertical: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var vertical: js.UndefOr[String] = js.native
}
object PartialClassNameMapToggle {
  
  @scala.inline
  def apply(): PartialClassNameMapToggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapToggle]
  }
  
  @scala.inline
  implicit class PartialClassNameMapToggleOps[Self <: PartialClassNameMapToggle] (val x: Self) extends AnyVal {
    
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
    def setGrouped(value: String): Self = this.set("grouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrouped: Self = this.set("grouped", js.undefined)
    
    @scala.inline
    def setGroupedHorizontal(value: String): Self = this.set("groupedHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedHorizontal: Self = this.set("groupedHorizontal", js.undefined)
    
    @scala.inline
    def setGroupedVertical(value: String): Self = this.set("groupedVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupedVertical: Self = this.set("groupedVertical", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setVertical(value: String): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
