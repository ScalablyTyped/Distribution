package typings.jupyterlabApplication.shellMod.ILabShell

import typings.luminoWidgets.docklayoutMod.DockLayout.ILayoutConfig
import typings.luminoWidgets.dockpanelMod.DockPanel.Mode
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The restorable description of the main application area.
  */
@js.native
trait IMainArea extends js.Object {
  
  /**
    * The current widget that has application focus.
    */
  val currentWidget: Widget | Null = js.native
  
  /**
    * The contents of the main application dock panel.
    */
  val dock: ILayoutConfig | Null = js.native
  
  /**
    * The document mode (i.e., multiple/single) of the main dock panel.
    */
  val mode: Mode | Null = js.native
}
object IMainArea {
  
  @scala.inline
  def apply(): IMainArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMainArea]
  }
  
  @scala.inline
  implicit class IMainAreaOps[Self <: IMainArea] (val x: Self) extends AnyVal {
    
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
    def setCurrentWidget(value: Widget): Self = this.set("currentWidget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentWidgetNull: Self = this.set("currentWidget", null)
    
    @scala.inline
    def setDock(value: ILayoutConfig): Self = this.set("dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockNull: Self = this.set("dock", null)
    
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = this.set("mode", null)
  }
}
