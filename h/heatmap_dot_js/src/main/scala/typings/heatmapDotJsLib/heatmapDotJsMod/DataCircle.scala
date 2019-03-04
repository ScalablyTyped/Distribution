package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataCircle extends js.Object {
  var radius: scala.Double
  var value: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object DataCircle {
  @scala.inline
  def apply(radius: scala.Double, value: scala.Double, x: scala.Double, y: scala.Double): DataCircle = {
    val __obj = js.Dynamic.literal(radius = radius, value = value, x = x, y = y)
  
    __obj.asInstanceOf[DataCircle]
  }
}

