package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Events extends js.Object {
  var hiResImageLoad: js.UndefOr[IVEvent] = js.native
  var imageLoad: js.UndefOr[IVEvent] = js.native
  var mouseEnterSnapView: js.UndefOr[IVEvent] = js.native
  var mouseLeaveSnapView: js.UndefOr[IVEvent] = js.native
  var onWindowResize: js.UndefOr[IVEvent] = js.native
  var pinchStart: js.UndefOr[IVEvent] = js.native
  var snapViewOnMouseMove: js.UndefOr[IVEvent] = js.native
}

object Events {
  @scala.inline
  def apply(): Events = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
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
    def setHiResImageLoad(value: () => Unit): Self = this.set("hiResImageLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHiResImageLoad: Self = this.set("hiResImageLoad", js.undefined)
    @scala.inline
    def setImageLoad(value: () => Unit): Self = this.set("imageLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteImageLoad: Self = this.set("imageLoad", js.undefined)
    @scala.inline
    def setMouseEnterSnapView(value: () => Unit): Self = this.set("mouseEnterSnapView", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMouseEnterSnapView: Self = this.set("mouseEnterSnapView", js.undefined)
    @scala.inline
    def setMouseLeaveSnapView(value: () => Unit): Self = this.set("mouseLeaveSnapView", js.Any.fromFunction0(value))
    @scala.inline
    def deleteMouseLeaveSnapView: Self = this.set("mouseLeaveSnapView", js.undefined)
    @scala.inline
    def setOnWindowResize(value: () => Unit): Self = this.set("onWindowResize", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnWindowResize: Self = this.set("onWindowResize", js.undefined)
    @scala.inline
    def setPinchStart(value: () => Unit): Self = this.set("pinchStart", js.Any.fromFunction0(value))
    @scala.inline
    def deletePinchStart: Self = this.set("pinchStart", js.undefined)
    @scala.inline
    def setSnapViewOnMouseMove(value: () => Unit): Self = this.set("snapViewOnMouseMove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSnapViewOnMouseMove: Self = this.set("snapViewOnMouseMove", js.undefined)
  }
  
}

