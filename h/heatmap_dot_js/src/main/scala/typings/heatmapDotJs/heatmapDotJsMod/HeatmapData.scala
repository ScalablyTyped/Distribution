package typings.heatmapDotJs.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapData[T] extends js.Object {
  /**
    * An array of data points
    */
  var data: js.Array[T]
  /**
    * Max value of the valueField
    */
  var max: Double
  /**
    * Min value of the valueField
    */
  var min: Double
}

object HeatmapData {
  @scala.inline
  def apply[T](data: js.Array[T], max: Double, min: Double): HeatmapData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HeatmapData[T]]
  }
}

