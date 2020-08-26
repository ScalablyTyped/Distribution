package typings.lwip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GifBufferParams extends js.Object {
  var colors: js.UndefOr[Double] = js.native
  var interlaced: js.UndefOr[Boolean] = js.native
  var threshold: Double = js.native
  var transparency: js.UndefOr[Boolean | String] = js.native
}

object GifBufferParams {
  @scala.inline
  def apply(threshold: Double): GifBufferParams = {
    val __obj = js.Dynamic.literal(threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GifBufferParams]
  }
  @scala.inline
  implicit class GifBufferParamsOps[Self <: GifBufferParams] (val x: Self) extends AnyVal {
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
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: Double): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setInterlaced(value: Boolean): Self = this.set("interlaced", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterlaced: Self = this.set("interlaced", js.undefined)
    @scala.inline
    def setTransparency(value: Boolean | String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
  }
  
}

