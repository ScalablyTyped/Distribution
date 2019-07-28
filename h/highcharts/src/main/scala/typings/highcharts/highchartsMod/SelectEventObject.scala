package typings.highcharts.highchartsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectEventObject extends js.Object {
  var originalEvent: Event
  var xAxis: js.Array[SelectDataObject]
  var yAxis: js.Array[SelectDataObject]
}

object SelectEventObject {
  @scala.inline
  def apply(originalEvent: Event, xAxis: js.Array[SelectDataObject], yAxis: js.Array[SelectDataObject]): SelectEventObject = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent, xAxis = xAxis, yAxis = yAxis)
  
    __obj.asInstanceOf[SelectEventObject]
  }
}

