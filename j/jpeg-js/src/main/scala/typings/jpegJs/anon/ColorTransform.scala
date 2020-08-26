package typings.jpegJs.anon

import typings.jpegJs.jpegJsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorTransform extends js.Object {
  var colorTransform: js.UndefOr[Boolean] = js.native
  var formatAsRGBA: js.UndefOr[Boolean] = js.native
  var maxMemoryUsageInMB: js.UndefOr[Double] = js.native
  var maxResolutionInMP: js.UndefOr[Double] = js.native
  var tolerantDecoding: js.UndefOr[Boolean] = js.native
  var useTArray: `true` = js.native
}

object ColorTransform {
  @scala.inline
  def apply(useTArray: `true`): ColorTransform = {
    val __obj = js.Dynamic.literal(useTArray = useTArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTransform]
  }
  @scala.inline
  implicit class ColorTransformOps[Self <: ColorTransform] (val x: Self) extends AnyVal {
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
    def setUseTArray(value: `true`): Self = this.set("useTArray", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorTransform(value: Boolean): Self = this.set("colorTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorTransform: Self = this.set("colorTransform", js.undefined)
    @scala.inline
    def setFormatAsRGBA(value: Boolean): Self = this.set("formatAsRGBA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatAsRGBA: Self = this.set("formatAsRGBA", js.undefined)
    @scala.inline
    def setMaxMemoryUsageInMB(value: Double): Self = this.set("maxMemoryUsageInMB", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMemoryUsageInMB: Self = this.set("maxMemoryUsageInMB", js.undefined)
    @scala.inline
    def setMaxResolutionInMP(value: Double): Self = this.set("maxResolutionInMP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResolutionInMP: Self = this.set("maxResolutionInMP", js.undefined)
    @scala.inline
    def setTolerantDecoding(value: Boolean): Self = this.set("tolerantDecoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerantDecoding: Self = this.set("tolerantDecoding", js.undefined)
  }
  
}

