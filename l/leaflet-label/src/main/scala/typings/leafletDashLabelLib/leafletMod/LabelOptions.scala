package typings
package leafletDashLabelLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var noHide: js.UndefOr[scala.Boolean] = js.undefined
  var offset: js.UndefOr[leafletLib.leafletMod.Point] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
   // 'left' | 'right' | 'auto';
  var pane: js.UndefOr[java.lang.String] = js.undefined
  var zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
}

object LabelOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    direction: java.lang.String = null,
    noHide: js.UndefOr[scala.Boolean] = js.undefined,
    offset: leafletLib.leafletMod.Point = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): LabelOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(noHide)) __obj.updateDynamic("noHide")(noHide)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[LabelOptions]
  }
}

