package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[jpmLib.sdkPanelMod.PanelPosition] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Focus {
  @scala.inline
  def apply(
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    position: jpmLib.sdkPanelMod.PanelPosition = null,
    width: scala.Int | scala.Double = null
  ): Anon_Focus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Focus]
  }
}

