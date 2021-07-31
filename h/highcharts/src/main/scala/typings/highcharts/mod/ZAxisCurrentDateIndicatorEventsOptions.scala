package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZAxisCurrentDateIndicatorEventsOptions extends StObject {
  
  /**
    * (Gantt) Click event on a plot band.
    */
  var click: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Gantt) Mouse move event on a plot band.
    */
  var mousemove: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Gantt) Mouse out event on the corner of a plot band.
    */
  var mouseout: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
  
  /**
    * (Gantt) Mouse over event on a plot band.
    */
  var mouseover: js.UndefOr[EventCallbackFunction[PlotLineOrBand]] = js.undefined
}
object ZAxisCurrentDateIndicatorEventsOptions {
  
  @scala.inline
  def apply(): ZAxisCurrentDateIndicatorEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZAxisCurrentDateIndicatorEventsOptions]
  }
  
  @scala.inline
  implicit class ZAxisCurrentDateIndicatorEventsOptionsMutableBuilder[Self <: ZAxisCurrentDateIndicatorEventsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setMousemove(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mousemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousemoveUndefined: Self = StObject.set(x, "mousemove", js.undefined)
    
    @scala.inline
    def setMouseout(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mouseout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseoutUndefined: Self = StObject.set(x, "mouseout", js.undefined)
    
    @scala.inline
    def setMouseover(value: EventCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "mouseover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseoverUndefined: Self = StObject.set(x, "mouseover", js.undefined)
  }
}
