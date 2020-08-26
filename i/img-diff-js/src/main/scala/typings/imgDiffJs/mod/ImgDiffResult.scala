package typings.imgDiffJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImgDiffResult extends js.Object {
  var diffCount: Double = js.native
  var height: Double = js.native
  var imagesAreSame: Boolean = js.native
  var width: Double = js.native
}

object ImgDiffResult {
  @scala.inline
  def apply(diffCount: Double, height: Double, imagesAreSame: Boolean, width: Double): ImgDiffResult = {
    val __obj = js.Dynamic.literal(diffCount = diffCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], imagesAreSame = imagesAreSame.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgDiffResult]
  }
  @scala.inline
  implicit class ImgDiffResultOps[Self <: ImgDiffResult] (val x: Self) extends AnyVal {
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
    def setDiffCount(value: Double): Self = this.set("diffCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesAreSame(value: Boolean): Self = this.set("imagesAreSame", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

