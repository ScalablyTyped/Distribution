package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionObject extends js.Object {
  /**
    * X position of the element.
    */
  var x: Double
  /**
    * Y position of the element.
    */
  var y: Double
}

object PositionObject {
  @scala.inline
  def apply(x: Double, y: Double): PositionObject = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PositionObject]
  }
}

