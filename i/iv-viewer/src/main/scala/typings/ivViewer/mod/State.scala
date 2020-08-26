package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var containerDim: js.UndefOr[Dim] = js.native
  var imageDim: js.UndefOr[Dim] = js.native
  var loaded: js.UndefOr[Boolean] = js.native
  var snapHandleDim: js.UndefOr[Dim] = js.native
  var snapImageDim: js.UndefOr[Dim] = js.native
  var snapViewVisible: js.UndefOr[Boolean] = js.native
  var zoomSliderLength: js.UndefOr[Double] = js.native
  var zoomValue: js.UndefOr[Double] = js.native
  var zooming: js.UndefOr[Boolean] = js.native
}

object State {
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setContainerDim(value: Dim): Self = this.set("containerDim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerDim: Self = this.set("containerDim", js.undefined)
    @scala.inline
    def setImageDim(value: Dim): Self = this.set("imageDim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageDim: Self = this.set("imageDim", js.undefined)
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    @scala.inline
    def setSnapHandleDim(value: Dim): Self = this.set("snapHandleDim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapHandleDim: Self = this.set("snapHandleDim", js.undefined)
    @scala.inline
    def setSnapImageDim(value: Dim): Self = this.set("snapImageDim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapImageDim: Self = this.set("snapImageDim", js.undefined)
    @scala.inline
    def setSnapViewVisible(value: Boolean): Self = this.set("snapViewVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapViewVisible: Self = this.set("snapViewVisible", js.undefined)
    @scala.inline
    def setZoomSliderLength(value: Double): Self = this.set("zoomSliderLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomSliderLength: Self = this.set("zoomSliderLength", js.undefined)
    @scala.inline
    def setZoomValue(value: Double): Self = this.set("zoomValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomValue: Self = this.set("zoomValue", js.undefined)
    @scala.inline
    def setZooming(value: Boolean): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

