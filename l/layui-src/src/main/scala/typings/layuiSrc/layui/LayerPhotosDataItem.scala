package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerPhotosDataItem extends js.Object {
  var alt: String = js.native
  var pid: js.UndefOr[Double] = js.native
  var src: String = js.native
  var thumb: String = js.native
}

object LayerPhotosDataItem {
  @scala.inline
  def apply(alt: String, src: String, thumb: String): LayerPhotosDataItem = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPhotosDataItem]
  }
  @scala.inline
  implicit class LayerPhotosDataItemOps[Self <: LayerPhotosDataItem] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumb(value: String): Self = this.set("thumb", value.asInstanceOf[js.Any])
    @scala.inline
    def setPid(value: Double): Self = this.set("pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("pid", js.undefined)
  }
  
}

