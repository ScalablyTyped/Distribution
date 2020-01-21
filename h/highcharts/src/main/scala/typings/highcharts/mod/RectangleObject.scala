package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleObject extends js.Object {
  /**
    * Height of the rectangle.
    */
  var height: Double
  /**
    * Width of the rectangle.
    */
  var width: Double
  /**
    * Horizontal position of the rectangle.
    */
  var x: Double
  /**
    * Vertical position of the rectangle.
    */
  var y: Double
}

object RectangleObject {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): RectangleObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RectangleObject]
  }
}

