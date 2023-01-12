package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxisPlotBandsEventsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Click event on a plot band.
    */
  var click: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Mouse move event on a plot band.
    */
  var mousemove: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Mouse out event on the corner of a plot
    * band.
    */
  var mouseout: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Mouse over event on a plot band.
    */
  var mouseover: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
}
object XAxisPlotBandsEventsOptions {
  
  inline def apply(): XAxisPlotBandsEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAxisPlotBandsEventsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAxisPlotBandsEventsOptions] (val x: Self) extends AnyVal {
    
    inline def setClick(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setMousemove(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    inline def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    inline def setMouseout(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    inline def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    inline def setMouseover(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    inline def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
  }
}
