package typings.jpm.anon

import typings.jpm.panelMod.PanelPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PanelPosition] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Focus {
  @scala.inline
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    position: PanelPosition = null,
    width: js.UndefOr[Double] = js.undefined
  ): Focus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
}

