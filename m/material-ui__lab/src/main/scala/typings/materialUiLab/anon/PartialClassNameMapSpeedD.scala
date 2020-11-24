package typings.materialUiLab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/withStyles.ClassNameMap<@material-ui/lab.@material-ui/lab/SpeedDialAction/SpeedDialAction.SpeedDialActionClassKey>> */
@js.native
trait PartialClassNameMapSpeedD extends js.Object {
  
  var fab: js.UndefOr[String] = js.native
  
  var fabClosed: js.UndefOr[String] = js.native
  
  var staticTooltip: js.UndefOr[String] = js.native
  
  var staticTooltipClosed: js.UndefOr[String] = js.native
  
  var staticTooltipLabel: js.UndefOr[String] = js.native
  
  var tooltipPlacementLeft: js.UndefOr[String] = js.native
}
object PartialClassNameMapSpeedD {
  
  @scala.inline
  def apply(): PartialClassNameMapSpeedD = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassNameMapSpeedD]
  }
  
  @scala.inline
  implicit class PartialClassNameMapSpeedDOps[Self <: PartialClassNameMapSpeedD] (val x: Self) extends AnyVal {
    
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
    def setFab(value: String): Self = this.set("fab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFab: Self = this.set("fab", js.undefined)
    
    @scala.inline
    def setFabClosed(value: String): Self = this.set("fabClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFabClosed: Self = this.set("fabClosed", js.undefined)
    
    @scala.inline
    def setStaticTooltip(value: String): Self = this.set("staticTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticTooltip: Self = this.set("staticTooltip", js.undefined)
    
    @scala.inline
    def setStaticTooltipClosed(value: String): Self = this.set("staticTooltipClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticTooltipClosed: Self = this.set("staticTooltipClosed", js.undefined)
    
    @scala.inline
    def setStaticTooltipLabel(value: String): Self = this.set("staticTooltipLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticTooltipLabel: Self = this.set("staticTooltipLabel", js.undefined)
    
    @scala.inline
    def setTooltipPlacementLeft(value: String): Self = this.set("tooltipPlacementLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipPlacementLeft: Self = this.set("tooltipPlacementLeft", js.undefined)
  }
}
