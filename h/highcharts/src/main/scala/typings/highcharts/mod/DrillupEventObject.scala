package typings.highcharts.mod

import typings.highcharts.highchartsStrings.drillup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrillupEventObject extends StObject {
  
  /**
    * Prevents the default behaviour of the event.
    */
  var preventDefault: js.Function
  
  /**
    * Options for the new series.
    */
  var seriesOptions: js.UndefOr[SeriesOptionsType] = js.undefined
  
  /**
    * The event target.
    */
  var target: Chart_
  
  /**
    * The event type.
    */
  var `type`: drillup
}
object DrillupEventObject {
  
  @scala.inline
  def apply(preventDefault: js.Function, target: Chart_): DrillupEventObject = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("drillup")
    __obj.asInstanceOf[DrillupEventObject]
  }
  
  @scala.inline
  implicit class DrillupEventObjectMutableBuilder[Self <: DrillupEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventDefault(value: js.Function): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptions(value: SeriesOptionsType): Self = StObject.set(x, "seriesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesOptionsUndefined: Self = StObject.set(x, "seriesOptions", js.undefined)
    
    @scala.inline
    def setTarget(value: Chart_): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: drillup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
