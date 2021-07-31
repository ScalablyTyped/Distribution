package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSeriesPointOptions extends StObject {
  
  /**
    * (Highstock) Events for each single point.
    */
  var events: js.UndefOr[PointEventsOptionsObject] = js.undefined
}
object PlotSeriesPointOptions {
  
  @scala.inline
  def apply(): PlotSeriesPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSeriesPointOptions]
  }
  
  @scala.inline
  implicit class PlotSeriesPointOptionsMutableBuilder[Self <: PlotSeriesPointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: PointEventsOptionsObject): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
  }
}
