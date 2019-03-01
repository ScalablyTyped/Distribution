package typings
package leafletDotPmLib.leafletMod.PMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOptions extends js.Object {
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var snapDistance: js.UndefOr[scala.Double] = js.undefined
  var snappable: js.UndefOr[scala.Boolean] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    snapDistance: scala.Int | scala.Double = null,
    snappable: js.UndefOr[scala.Boolean] = js.undefined
  ): EditOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (snapDistance != null) __obj.updateDynamic("snapDistance")(snapDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(snappable)) __obj.updateDynamic("snappable")(snappable)
    __obj.asInstanceOf[EditOptions]
  }
}

