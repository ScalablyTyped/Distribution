package typings
package heremapsLib.HNs.mapNs.ViewPortNs

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
  var bottom: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
}

object Padding {
  @scala.inline
  def apply(bottom: scala.Double, left: scala.Double, right: scala.Double, top: scala.Double): Padding = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
  
    __obj.asInstanceOf[Padding]
  }
}

