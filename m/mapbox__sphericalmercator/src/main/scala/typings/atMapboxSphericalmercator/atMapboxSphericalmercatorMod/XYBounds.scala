package typings.atMapboxSphericalmercator.atMapboxSphericalmercatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XYBounds extends js.Object {
  var maxX: Double
  var maxY: Double
  var minX: Double
  var minY: Double
}

object XYBounds {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): XYBounds = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[XYBounds]
  }
}

