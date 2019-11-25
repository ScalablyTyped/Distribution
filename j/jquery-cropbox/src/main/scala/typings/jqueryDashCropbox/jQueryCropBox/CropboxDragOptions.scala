package typings.jqueryDashCropbox.jQueryCropBox

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
    val __obj = js.Dynamic.literal(dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CropboxDragOptions]
  }
}

