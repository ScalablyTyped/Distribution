package typings.heremaps.H.map.ViewPort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents viewport padding definition.
  * @property top {number} - the padding on the top edge (in pixels)
  * @property right {number} - the padding on the right edge (in pixels)
  * @property bottom {number} - the padding on the bottom edge (in pixels)
  * @property left {number} - the padding on the left edge (in pixels)
  */
trait Padding extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object Padding {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Padding]
  }
}

