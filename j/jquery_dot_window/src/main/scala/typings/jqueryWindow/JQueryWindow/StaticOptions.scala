package typings.jqueryWindow.JQueryWindow

import typings.jqueryWindow.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Static options
@js.native
trait StaticOptions extends js.Object {
  
  /**
    the speed of animations: maximize, minimize, restore, shift, in milliseconds
    **/
  var animationSpeed: js.UndefOr[Double] = js.native
  
  /**
    the direction of minimized window dock at. the available values are [left, right, top, bottom]
    **/
  var dock: js.UndefOr[String] = js.native
  
  /**
    the area which the windows will dock at
    **/
  var dockArea: js.UndefOr[JQuery | HTMLElement] = js.native
  
  /**
    to handle browser scrollbar when window status changed(maximize, minimize, cascade)
    **/
  var handleScrollbar: js.UndefOr[Boolean] = js.native
  
  /**
    the long dimension of minimized window
    **/
  var minWinLong: js.UndefOr[Double] = js.native
  
  /**
    the narrow dimension of minimized window
    **/
  var minWinNarrow: js.UndefOr[Double] = js.native
  
  /**
    to decide show log in firebug, IE8, chrome console
    **/
  var showLog: js.UndefOr[Boolean] = js.native
}
object StaticOptions {
  
  @scala.inline
  def apply(): StaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticOptions]
  }
  
  @scala.inline
  implicit class StaticOptionsOps[Self <: StaticOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimationSpeed(value: Double): Self = this.set("animationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationSpeed: Self = this.set("animationSpeed", js.undefined)
    
    @scala.inline
    def setDock(value: String): Self = this.set("dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDock: Self = this.set("dock", js.undefined)
    
    @scala.inline
    def setDockArea(value: JQuery | HTMLElement): Self = this.set("dockArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockArea: Self = this.set("dockArea", js.undefined)
    
    @scala.inline
    def setHandleScrollbar(value: Boolean): Self = this.set("handleScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleScrollbar: Self = this.set("handleScrollbar", js.undefined)
    
    @scala.inline
    def setMinWinLong(value: Double): Self = this.set("minWinLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWinLong: Self = this.set("minWinLong", js.undefined)
    
    @scala.inline
    def setMinWinNarrow(value: Double): Self = this.set("minWinNarrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWinNarrow: Self = this.set("minWinNarrow", js.undefined)
    
    @scala.inline
    def setShowLog(value: Boolean): Self = this.set("showLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLog: Self = this.set("showLog", js.undefined)
  }
}
