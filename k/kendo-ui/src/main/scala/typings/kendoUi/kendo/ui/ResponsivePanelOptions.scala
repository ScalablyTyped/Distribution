package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponsivePanelOptions extends js.Object {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  var breakpoint: js.UndefOr[Double] = js.native
  
  var close: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[js.Function1[/* e */ ResponsivePanelEvent, Unit]] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var toggleButton: js.UndefOr[String] = js.native
}
object ResponsivePanelOptions {
  
  @scala.inline
  def apply(): ResponsivePanelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponsivePanelOptions]
  }
  
  @scala.inline
  implicit class ResponsivePanelOptionsOps[Self <: ResponsivePanelOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoClose(value: Boolean): Self = this.set("autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoClose: Self = this.set("autoClose", js.undefined)
    
    @scala.inline
    def setBreakpoint(value: Double): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ ResponsivePanelEvent => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ ResponsivePanelEvent => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setToggleButton(value: String): Self = this.set("toggleButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleButton: Self = this.set("toggleButton", js.undefined)
  }
}
