package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectDataObject extends js.Object {
  var axis: Axis
  var max: Double
  var min: Double
}

object SelectDataObject {
  @scala.inline
  def apply(axis: Axis, max: Double, min: Double): SelectDataObject = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectDataObject]
  }
}

