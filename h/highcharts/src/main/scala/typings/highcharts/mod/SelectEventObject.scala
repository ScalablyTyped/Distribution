package typings.highcharts.mod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectEventObject extends js.Object {
  
  var originalEvent: Event = js.native
  
  var xAxis: js.Array[SelectDataObject] = js.native
  
  var yAxis: js.Array[SelectDataObject] = js.native
}
object SelectEventObject {
  
  @scala.inline
  def apply(originalEvent: Event, xAxis: js.Array[SelectDataObject], yAxis: js.Array[SelectDataObject]): SelectEventObject = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectEventObject]
  }
  
  @scala.inline
  implicit class SelectEventObjectOps[Self <: SelectEventObject] (val x: Self) extends AnyVal {
    
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
    def setOriginalEvent(value: Event): Self = this.set("originalEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAxisVarargs(value: SelectDataObject*): Self = this.set("xAxis", js.Array(value :_*))
    
    @scala.inline
    def setXAxis(value: js.Array[SelectDataObject]): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisVarargs(value: SelectDataObject*): Self = this.set("yAxis", js.Array(value :_*))
    
    @scala.inline
    def setYAxis(value: js.Array[SelectDataObject]): Self = this.set("yAxis", value.asInstanceOf[js.Any])
  }
}
