package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frames extends js.Object {
  var slideMomentumCheck: js.UndefOr[Double] = js.undefined
  var sliderMomentumFrame: js.UndefOr[Double] = js.undefined
  var snapViewTimeout: js.UndefOr[Double] = js.undefined
  var zoomFrame: js.UndefOr[Double] = js.undefined
}

object Frames {
  @scala.inline
  def apply(
    slideMomentumCheck: js.UndefOr[Double] = js.undefined,
    sliderMomentumFrame: js.UndefOr[Double] = js.undefined,
    snapViewTimeout: js.UndefOr[Double] = js.undefined,
    zoomFrame: js.UndefOr[Double] = js.undefined
  ): Frames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(slideMomentumCheck)) __obj.updateDynamic("slideMomentumCheck")(slideMomentumCheck.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sliderMomentumFrame)) __obj.updateDynamic("sliderMomentumFrame")(sliderMomentumFrame.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapViewTimeout)) __obj.updateDynamic("snapViewTimeout")(snapViewTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomFrame)) __obj.updateDynamic("zoomFrame")(zoomFrame.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frames]
  }
}

