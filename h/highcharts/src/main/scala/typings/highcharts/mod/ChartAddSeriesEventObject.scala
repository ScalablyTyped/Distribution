package typings.highcharts.mod

import typings.highcharts.highchartsStrings.addSeries
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartAddSeriesEventObject extends StObject {
  
  /**
    * The series options that were passed to the `addSeries` method.
    */
  var options: SeriesOptionsType = js.native
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function = js.native
  
  /**
    * The event target.
    */
  var target: Chart_ = js.native
  
  /**
    * The event type.
    */
  var `type`: addSeries = js.native
}
object ChartAddSeriesEventObject {
  
  @scala.inline
  def apply(options: SeriesOptionsType, preventDefault: js.Function, target: Chart_, `type`: addSeries): ChartAddSeriesEventObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAddSeriesEventObject]
  }
  
  @scala.inline
  implicit class ChartAddSeriesEventObjectMutableBuilder[Self <: ChartAddSeriesEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: SeriesOptionsType): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: addSeries): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
