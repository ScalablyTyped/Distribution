package typings.mapboxGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraForBoundsOptions extends CameraOptions {
  var maxZoom: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[PointLike] = js.native
  var padding: js.UndefOr[Double | PaddingOptions] = js.native
}

object CameraForBoundsOptions {
  @scala.inline
  def apply(): CameraForBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CameraForBoundsOptions]
  }
  @scala.inline
  implicit class CameraForBoundsOptionsOps[Self <: CameraForBoundsOptions] (val x: Self) extends AnyVal {
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
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setOffset(value: PointLike): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPadding(value: Double | PaddingOptions): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

