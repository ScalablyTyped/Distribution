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
    slideMomentumCheck: Int | Double = null,
    sliderMomentumFrame: Int | Double = null,
    snapViewTimeout: Int | Double = null,
    zoomFrame: Int | Double = null
  ): Frames = {
    val __obj = js.Dynamic.literal()
    if (slideMomentumCheck != null) __obj.updateDynamic("slideMomentumCheck")(slideMomentumCheck.asInstanceOf[js.Any])
    if (sliderMomentumFrame != null) __obj.updateDynamic("sliderMomentumFrame")(sliderMomentumFrame.asInstanceOf[js.Any])
    if (snapViewTimeout != null) __obj.updateDynamic("snapViewTimeout")(snapViewTimeout.asInstanceOf[js.Any])
    if (zoomFrame != null) __obj.updateDynamic("zoomFrame")(zoomFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frames]
  }
}

