package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var containerDim: js.UndefOr[Dim] = js.undefined
  var imageDim: js.UndefOr[Dim] = js.undefined
  var loaded: js.UndefOr[Boolean] = js.undefined
  var snapHandleDim: js.UndefOr[Dim] = js.undefined
  var snapImageDim: js.UndefOr[Dim] = js.undefined
  var snapViewVisible: js.UndefOr[Boolean] = js.undefined
  var zoomSliderLength: js.UndefOr[Double] = js.undefined
  var zoomValue: js.UndefOr[Double] = js.undefined
  var zooming: js.UndefOr[Boolean] = js.undefined
}

object State {
  @scala.inline
  def apply(
    containerDim: Dim = null,
    imageDim: Dim = null,
    loaded: js.UndefOr[Boolean] = js.undefined,
    snapHandleDim: Dim = null,
    snapImageDim: Dim = null,
    snapViewVisible: js.UndefOr[Boolean] = js.undefined,
    zoomSliderLength: Int | Double = null,
    zoomValue: Int | Double = null,
    zooming: js.UndefOr[Boolean] = js.undefined
  ): State = {
    val __obj = js.Dynamic.literal()
    if (containerDim != null) __obj.updateDynamic("containerDim")(containerDim.asInstanceOf[js.Any])
    if (imageDim != null) __obj.updateDynamic("imageDim")(imageDim.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (snapHandleDim != null) __obj.updateDynamic("snapHandleDim")(snapHandleDim.asInstanceOf[js.Any])
    if (snapImageDim != null) __obj.updateDynamic("snapImageDim")(snapImageDim.asInstanceOf[js.Any])
    if (!js.isUndefined(snapViewVisible)) __obj.updateDynamic("snapViewVisible")(snapViewVisible.asInstanceOf[js.Any])
    if (zoomSliderLength != null) __obj.updateDynamic("zoomSliderLength")(zoomSliderLength.asInstanceOf[js.Any])
    if (zoomValue != null) __obj.updateDynamic("zoomValue")(zoomValue.asInstanceOf[js.Any])
    if (!js.isUndefined(zooming)) __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}

