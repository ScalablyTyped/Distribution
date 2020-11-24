package typings.highcharts.exportingMod.highchartsAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles displaying chart's container in the fullscreen mode.
  *
  * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
  */
@js.native
trait Fullscreen extends js.Object {
  
  /**
    * Chart managed by the fullscreen controller.
    */
  var chart: Chart = js.native
  
  /**
    * Stops displaying the chart in fullscreen mode. Exporting module
    * required.
    */
  def close(): Unit = js.native
  
  /**
    * The flag is set to `true` when the chart is displayed in the
    * fullscreen mode.
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Displays the chart in fullscreen mode. When fired customly by user
    * before exporting context button is created, button's text will not be
    * replaced - it's on the user side. Exporting module required.
    */
  def open(): Unit = js.native
  
  /**
    * Toggles displaying the chart in fullscreen mode. By default, when the
    * exporting module is enabled, a context button with a drop down menu
    * in the upper right corner accesses this function. Exporting module
    * required.
    */
  def toggle(): Unit = js.native
}
object Fullscreen {
  
  @scala.inline
  def apply(chart: Chart, close: () => Unit, open: () => Unit, toggle: () => Unit): Fullscreen = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Fullscreen]
  }
  
  @scala.inline
  implicit class FullscreenOps[Self <: Fullscreen] (val x: Self) extends AnyVal {
    
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
    def setChart(value: Chart): Self = this.set("chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
  }
}
