package typings.highcharts.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BBoxObject]
  }
}

