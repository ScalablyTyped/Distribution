package typings.jimpPluginCrop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crop extends js.Object {
  var `class`: CropClass = js.native
}

object Crop {
  @scala.inline
  def apply(`class`: CropClass): Crop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
  @scala.inline
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClass(value: CropClass): Self = this.set("class", value.asInstanceOf[js.Any])
  }
  
}

