package typings.highcharts.mod

import typings.highcharts.highchartsStrings.addSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartAddSeriesEventObject extends StObject {
  
  /**
    * The series options that were passed to the `addSeries` method.
    */
  var options: SeriesOptionsType
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  
  /**
    * The event target.
    */
  var target: Chart_
  
  /**
    * The event type.
    */
  var `type`: addSeries
}
object ChartAddSeriesEventObject {
  
  inline def apply(options: SeriesOptionsType, preventDefault: js.Function, target: Chart_): ChartAddSeriesEventObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("addSeries")
    __obj.asInstanceOf[ChartAddSeriesEventObject]
  }
  
  extension [Self <: ChartAddSeriesEventObject](x: Self) {
    
    inline def setOptions(value: SeriesOptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: addSeries): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
