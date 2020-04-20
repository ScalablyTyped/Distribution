package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  var hiResImageLoad: js.UndefOr[IVEvent] = js.undefined
  var imageLoad: js.UndefOr[IVEvent] = js.undefined
  var mouseEnterSnapView: js.UndefOr[IVEvent] = js.undefined
  var mouseLeaveSnapView: js.UndefOr[IVEvent] = js.undefined
  var onWindowResize: js.UndefOr[IVEvent] = js.undefined
  var pinchStart: js.UndefOr[IVEvent] = js.undefined
  var snapViewOnMouseMove: js.UndefOr[IVEvent] = js.undefined
}

object Events {
  @scala.inline
  def apply(
    hiResImageLoad: () => Unit = null,
    imageLoad: () => Unit = null,
    mouseEnterSnapView: () => Unit = null,
    mouseLeaveSnapView: () => Unit = null,
    onWindowResize: () => Unit = null,
    pinchStart: () => Unit = null,
    snapViewOnMouseMove: () => Unit = null
  ): Events = {
    val __obj = js.Dynamic.literal()
    if (hiResImageLoad != null) __obj.updateDynamic("hiResImageLoad")(js.Any.fromFunction0(hiResImageLoad))
    if (imageLoad != null) __obj.updateDynamic("imageLoad")(js.Any.fromFunction0(imageLoad))
    if (mouseEnterSnapView != null) __obj.updateDynamic("mouseEnterSnapView")(js.Any.fromFunction0(mouseEnterSnapView))
    if (mouseLeaveSnapView != null) __obj.updateDynamic("mouseLeaveSnapView")(js.Any.fromFunction0(mouseLeaveSnapView))
    if (onWindowResize != null) __obj.updateDynamic("onWindowResize")(js.Any.fromFunction0(onWindowResize))
    if (pinchStart != null) __obj.updateDynamic("pinchStart")(js.Any.fromFunction0(pinchStart))
    if (snapViewOnMouseMove != null) __obj.updateDynamic("snapViewOnMouseMove")(js.Any.fromFunction0(snapViewOnMouseMove))
    __obj.asInstanceOf[Events]
  }
}

