package typings.jqueryDashCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxArea extends js.Object {
  var cropH: Double
  var cropW: Double
  var cropX: Double
  var cropY: Double
}

object CropboxArea {
  @scala.inline
  def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxArea = {
    val __obj = js.Dynamic.literal(cropH = cropH, cropW = cropW, cropX = cropX, cropY = cropY)
  
    __obj.asInstanceOf[CropboxArea]
  }
}

