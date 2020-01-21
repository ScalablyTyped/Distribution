package typings.jimpPluginCrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends js.Object {
  var `class`: CropClass
}

object Crop {
  @scala.inline
  def apply(`class`: CropClass): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
}

