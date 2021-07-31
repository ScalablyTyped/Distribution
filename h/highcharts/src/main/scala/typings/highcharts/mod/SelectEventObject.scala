package typings.highcharts.mod

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectEventObject extends StObject {
  
  var originalEvent: Event
  
  var xAxis: js.Array[SelectDataObject]
  
  var yAxis: js.Array[SelectDataObject]
}
object SelectEventObject {
  
  @scala.inline
  def apply(originalEvent: Event, xAxis: js.Array[SelectDataObject], yAxis: js.Array[SelectDataObject]): SelectEventObject = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventObject]
  }
  
  @scala.inline
  implicit class SelectEventObjectMutableBuilder[Self <: SelectEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxis(value: js.Array[SelectDataObject]): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisVarargs(value: SelectDataObject*): Self = StObject.set(x, "xAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: js.Array[SelectDataObject]): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisVarargs(value: SelectDataObject*): Self = StObject.set(x, "yAxis", js.Array(value :_*))
  }
}
