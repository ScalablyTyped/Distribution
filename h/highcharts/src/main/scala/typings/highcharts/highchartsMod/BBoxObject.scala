package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBoxObject extends PositionObject {
  /**
    * Height of the bounding box.
    */
  var height: Double
  /**
    * Width of the bounding box.
    */
  var width: Double
}

object BBoxObject {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BBoxObject = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[BBoxObject]
  }
}

