package typings
package heatmapDotJsLib.heatmapDotJsMod

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
  var max: scala.Double
  /**
    * Min value of the valueField
    */
  var min: scala.Double
}

object HeatmapData {
  @scala.inline
  def apply[T](data: js.Array[T], max: scala.Double, min: scala.Double): HeatmapData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.asInstanceOf[HeatmapData[T]]
  }
}

