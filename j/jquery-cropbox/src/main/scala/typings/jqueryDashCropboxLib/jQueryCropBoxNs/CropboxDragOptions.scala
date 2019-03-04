package typings
package jqueryDashCropboxLib.jQueryCropBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxDragOptions extends js.Object {
  var dx: scala.Double
  var dy: scala.Double
  var startX: scala.Double
  var startY: scala.Double
}

object CropboxDragOptions {
  @scala.inline
  def apply(dx: scala.Double, dy: scala.Double, startX: scala.Double, startY: scala.Double): CropboxDragOptions = {
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, startX = startX, startY = startY)
  
    __obj.asInstanceOf[CropboxDragOptions]
  }
}

