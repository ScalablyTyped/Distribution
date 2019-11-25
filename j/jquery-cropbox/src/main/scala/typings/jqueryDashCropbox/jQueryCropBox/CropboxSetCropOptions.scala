package typings.jqueryDashCropbox.jQueryCropBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxSetCropOptions extends js.Object {
  var cropH: Double
  var cropW: Double
  var cropX: Double
  var cropY: Double
}

object CropboxSetCropOptions {
  @scala.inline
  def apply(cropH: Double, cropW: Double, cropX: Double, cropY: Double): CropboxSetCropOptions = {
    val __obj = js.Dynamic.literal(cropH = cropH.asInstanceOf[js.Any], cropW = cropW.asInstanceOf[js.Any], cropX = cropX.asInstanceOf[js.Any], cropY = cropY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CropboxSetCropOptions]
  }
}

