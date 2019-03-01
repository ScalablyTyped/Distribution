package typings
package jqueryDashCropboxLib.jQueryCropBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropboxArea extends js.Object {
  var cropH: scala.Double
  var cropW: scala.Double
  var cropX: scala.Double
  var cropY: scala.Double
}

object CropboxArea {
  @scala.inline
  def apply(cropH: scala.Double, cropW: scala.Double, cropX: scala.Double, cropY: scala.Double): CropboxArea = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cropH")(cropH)
    __obj.updateDynamic("cropW")(cropW)
    __obj.updateDynamic("cropX")(cropX)
    __obj.updateDynamic("cropY")(cropY)
    __obj.asInstanceOf[CropboxArea]
  }
}

