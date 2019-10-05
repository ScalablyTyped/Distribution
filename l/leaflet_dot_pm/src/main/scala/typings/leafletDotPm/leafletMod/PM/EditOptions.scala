package typings.leafletDotPm.leafletMod.PM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditOptions extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.undefined
  var snapDistance: js.UndefOr[Double] = js.undefined
  var snappable: js.UndefOr[Boolean] = js.undefined
}

object EditOptions {
  @scala.inline
  def apply(
    draggable: js.UndefOr[Boolean] = js.undefined,
    snapDistance: Int | Double = null,
    snappable: js.UndefOr[Boolean] = js.undefined
  ): EditOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (snapDistance != null) __obj.updateDynamic("snapDistance")(snapDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(snappable)) __obj.updateDynamic("snappable")(snappable)
    __obj.asInstanceOf[EditOptions]
  }
}

