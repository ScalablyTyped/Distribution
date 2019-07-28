package typings.jqueryDashCropbox.jQueryCropBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxDragOptions extends js.Object {
  var dx: Double
  var dy: Double
  var startX: Double
  var startY: Double
}

object CropboxDragOptions {
  @scala.inline
  def apply(dx: Double, dy: Double, startX: Double, startY: Double): CropboxDragOptions = {
    val __obj = js.Dynamic.literal(dx = dx, dy = dy, startX = startX, startY = startY)
  
    __obj.asInstanceOf[CropboxDragOptions]
  }
}

