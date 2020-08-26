package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends js.Object {
  var align: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
  var keepAspectRatio: js.UndefOr[Boolean] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var scale: js.UndefOr[Double] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ImageOptions {
  @scala.inline
  def apply(): ImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setKeepAspectRatio(value: Boolean): Self = this.set("keepAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAspectRatio: Self = this.set("keepAspectRatio", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

