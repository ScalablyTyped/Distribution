package typings.leafletDraw.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var drawControl: js.UndefOr[Boolean] = js.undefined
  var drawControlTooltips: js.UndefOr[Boolean] = js.undefined
  var touchExtend: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    drawControl: js.UndefOr[Boolean] = js.undefined,
    drawControlTooltips: js.UndefOr[Boolean] = js.undefined,
    touchExtend: js.UndefOr[Boolean] = js.undefined
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drawControl)) __obj.updateDynamic("drawControl")(drawControl.asInstanceOf[js.Any])
    if (!js.isUndefined(drawControlTooltips)) __obj.updateDynamic("drawControlTooltips")(drawControlTooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(touchExtend)) __obj.updateDynamic("touchExtend")(touchExtend.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

