package typings.jpm

import typings.jpm.sdkPanelMod.PanelPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  var focus: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[PanelPosition] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Focus {
  @scala.inline
  def apply(
    focus: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    position: PanelPosition = null,
    width: Int | Double = null
  ): Anon_Focus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Focus]
  }
}

