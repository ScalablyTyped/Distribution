package typings.ivViewer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sliders extends js.Object {
  var imageSlider: js.UndefOr[Slider] = js.undefined
  var snapSlider: js.UndefOr[Slider] = js.undefined
  var zoomSlider: js.UndefOr[Slider] = js.undefined
}

object Sliders {
  @scala.inline
  def apply(imageSlider: Slider = null, snapSlider: Slider = null, zoomSlider: Slider = null): Sliders = {
    val __obj = js.Dynamic.literal()
    if (imageSlider != null) __obj.updateDynamic("imageSlider")(imageSlider.asInstanceOf[js.Any])
    if (snapSlider != null) __obj.updateDynamic("snapSlider")(snapSlider.asInstanceOf[js.Any])
    if (zoomSlider != null) __obj.updateDynamic("zoomSlider")(zoomSlider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sliders]
  }
}

