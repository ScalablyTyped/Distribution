package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialIcon/SpeedDialIcon.SpeedDialIconClassKey>> */
@js.native
trait PartialClassNameMapSpeedDIcon extends js.Object {
  
  var icon: js.UndefOr[String] = js.native
  
  var iconOpen: js.UndefOr[String] = js.native
  
  var iconWithOpenIconOpen: js.UndefOr[String] = js.native
  
  var openIcon: js.UndefOr[String] = js.native
  
  var openIconOpen: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialClassNameMapSpeedDIcon {
  
  @scala.inline
  def apply(): PartialClassNameMapSpeedDIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSpeedDIcon]
  }
  
  @scala.inline
  implicit class PartialClassNameMapSpeedDIconOps[Self <: PartialClassNameMapSpeedDIcon] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconOpen(value: String): Self = this.set("iconOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconOpen: Self = this.set("iconOpen", js.undefined)
    
    @scala.inline
    def setIconWithOpenIconOpen(value: String): Self = this.set("iconWithOpenIconOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconWithOpenIconOpen: Self = this.set("iconWithOpenIconOpen", js.undefined)
    
    @scala.inline
    def setOpenIcon(value: String): Self = this.set("openIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIcon: Self = this.set("openIcon", js.undefined)
    
    @scala.inline
    def setOpenIconOpen(value: String): Self = this.set("openIconOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenIconOpen: Self = this.set("openIconOpen", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
