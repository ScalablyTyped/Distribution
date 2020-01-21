package typings.leafletLabel.mod

import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var clickable: js.UndefOr[Boolean] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var noHide: js.UndefOr[Boolean] = js.undefined
  var offset: js.UndefOr[Point_] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
   // 'left' | 'right' | 'auto';
  var pane: js.UndefOr[String] = js.undefined
  var zoomAnimation: js.UndefOr[Boolean] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    className: String = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    direction: String = null,
    noHide: js.UndefOr[Boolean] = js.undefined,
    offset: Point_ = null,
    opacity: Int | Double = null,
    pane: String = null,
    zoomAnimation: js.UndefOr[Boolean] = js.undefined
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(noHide)) __obj.updateDynamic("noHide")(noHide.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelOptions]
  }
}

