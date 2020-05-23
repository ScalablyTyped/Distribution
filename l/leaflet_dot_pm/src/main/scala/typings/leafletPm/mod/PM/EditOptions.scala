package typings.leafletPm.mod.PM

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
    snapDistance: js.UndefOr[Double] = js.undefined,
    snappable: js.UndefOr[Boolean] = js.undefined
  ): EditOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapDistance)) __obj.updateDynamic("snapDistance")(snapDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snappable)) __obj.updateDynamic("snappable")(snappable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditOptions]
  }
}

