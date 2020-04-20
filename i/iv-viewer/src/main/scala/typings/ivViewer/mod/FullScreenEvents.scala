package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullScreenEvents extends Events {
  var onCloseBtnClick: js.UndefOr[IVEvent] = js.undefined
}

object FullScreenEvents {
  @scala.inline
  def apply(
    hiResImageLoad: () => Unit = null,
    imageLoad: () => Unit = null,
    mouseEnterSnapView: () => Unit = null,
    mouseLeaveSnapView: () => Unit = null,
    onCloseBtnClick: () => Unit = null,
    onWindowResize: () => Unit = null,
    pinchStart: () => Unit = null,
    snapViewOnMouseMove: () => Unit = null
  ): FullScreenEvents = {
    val __obj = js.Dynamic.literal()
    if (hiResImageLoad != null) __obj.updateDynamic("hiResImageLoad")(js.Any.fromFunction0(hiResImageLoad))
    if (imageLoad != null) __obj.updateDynamic("imageLoad")(js.Any.fromFunction0(imageLoad))
    if (mouseEnterSnapView != null) __obj.updateDynamic("mouseEnterSnapView")(js.Any.fromFunction0(mouseEnterSnapView))
    if (mouseLeaveSnapView != null) __obj.updateDynamic("mouseLeaveSnapView")(js.Any.fromFunction0(mouseLeaveSnapView))
    if (onCloseBtnClick != null) __obj.updateDynamic("onCloseBtnClick")(js.Any.fromFunction0(onCloseBtnClick))
    if (onWindowResize != null) __obj.updateDynamic("onWindowResize")(js.Any.fromFunction0(onWindowResize))
    if (pinchStart != null) __obj.updateDynamic("pinchStart")(js.Any.fromFunction0(pinchStart))
    if (snapViewOnMouseMove != null) __obj.updateDynamic("snapViewOnMouseMove")(js.Any.fromFunction0(snapViewOnMouseMove))
    __obj.asInstanceOf[FullScreenEvents]
  }
}

