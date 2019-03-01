package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends DivOverlayOptions {
  var direction: js.UndefOr[Direction] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var permanent: js.UndefOr[scala.Boolean] = js.undefined
  var sticky: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    direction: Direction = null,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    offset: PointExpression = null,
    opacity: scala.Int | scala.Double = null,
    pane: java.lang.String = null,
    permanent: js.UndefOr[scala.Boolean] = js.undefined,
    sticky: js.UndefOr[scala.Boolean] = js.undefined,
    zoomAnimation: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (!js.isUndefined(permanent)) __obj.updateDynamic("permanent")(permanent)
    if (!js.isUndefined(sticky)) __obj.updateDynamic("sticky")(sticky)
    if (!js.isUndefined(zoomAnimation)) __obj.updateDynamic("zoomAnimation")(zoomAnimation)
    __obj.asInstanceOf[TooltipOptions]
  }
}

