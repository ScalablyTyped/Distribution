package typings.jointjs.mod.dia.Paper

import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.dia.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundOptions extends js.Object {
  var color: js.UndefOr[String] = js.native
  var image: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var position: js.UndefOr[Point | String] = js.native
  var quality: js.UndefOr[Double] = js.native
  var repeat: js.UndefOr[String] = js.native
  var size: js.UndefOr[Size | String] = js.native
  var waterMarkAngle: js.UndefOr[Double] = js.native
}

object BackgroundOptions {
  @scala.inline
  def apply(): BackgroundOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackgroundOptions]
  }
  @scala.inline
  implicit class BackgroundOptionsOps[Self <: BackgroundOptions] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setPosition(value: Point | String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setRepeat(value: String): Self = this.set("repeat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    @scala.inline
    def setSize(value: Size | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setWaterMarkAngle(value: Double): Self = this.set("waterMarkAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaterMarkAngle: Self = this.set("waterMarkAngle", js.undefined)
  }
  
}

