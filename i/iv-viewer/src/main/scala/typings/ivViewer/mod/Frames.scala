package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frames extends js.Object {
  var slideMomentumCheck: js.UndefOr[Double] = js.native
  var sliderMomentumFrame: js.UndefOr[Double] = js.native
  var snapViewTimeout: js.UndefOr[Double] = js.native
  var zoomFrame: js.UndefOr[Double] = js.native
}

object Frames {
  @scala.inline
  def apply(): Frames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Frames]
  }
  @scala.inline
  implicit class FramesOps[Self <: Frames] (val x: Self) extends AnyVal {
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
    def setSlideMomentumCheck(value: Double): Self = this.set("slideMomentumCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideMomentumCheck: Self = this.set("slideMomentumCheck", js.undefined)
    @scala.inline
    def setSliderMomentumFrame(value: Double): Self = this.set("sliderMomentumFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSliderMomentumFrame: Self = this.set("sliderMomentumFrame", js.undefined)
    @scala.inline
    def setSnapViewTimeout(value: Double): Self = this.set("snapViewTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapViewTimeout: Self = this.set("snapViewTimeout", js.undefined)
    @scala.inline
    def setZoomFrame(value: Double): Self = this.set("zoomFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomFrame: Self = this.set("zoomFrame", js.undefined)
  }
  
}

