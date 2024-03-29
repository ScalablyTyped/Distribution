package typings.highcharts.mod

import typings.highcharts.modulesExportingMod.highchartsAugmentingMod.Chart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles displaying chart's container in the fullscreen mode.
  *
  * **Note**: Fullscreen is not supported on iPhone due to iOS limitations.
  */
trait Fullscreen extends StObject {
  
  /**
    * Chart managed by the fullscreen controller.
    */
  var chart: Chart
  
  /**
    * Stops displaying the chart in fullscreen mode. Exporting module
    * required.
    */
  def close(): Unit
  
  /**
    * The flag is set to `true` when the chart is displayed in the
    * fullscreen mode.
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Displays the chart in fullscreen mode. When fired customly by user
    * before exporting context button is created, button's text will not be
    * replaced - it's on the user side. Exporting module required.
    */
  def open(): Unit
  
  /**
    * Toggles displaying the chart in fullscreen mode. By default, when the
    * exporting module is enabled, a context button with a drop down menu
    * in the upper right corner accesses this function. Exporting module
    * required.
    */
  def toggle(): Unit
}
object Fullscreen {
  
  inline def apply(chart: Chart, close: () => Unit, open: () => Unit, toggle: () => Unit): Fullscreen = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Fullscreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    
    inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
