package typings.heatmapDotJs.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCircle extends js.Object {
  var radius: Double
  var value: Double
  var x: Double
  var y: Double
}

object DataCircle {
  @scala.inline
  def apply(radius: Double, value: Double, x: Double, y: Double): DataCircle = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataCircle]
  }
}

