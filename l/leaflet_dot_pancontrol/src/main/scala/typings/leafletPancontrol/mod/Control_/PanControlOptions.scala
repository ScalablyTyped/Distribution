package typings.leafletPancontrol.mod.Control_

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanControlOptions extends ControlOptions {
  var panOffset: js.UndefOr[Double] = js.undefined
}

object PanControlOptions {
  @scala.inline
  def apply(panOffset: js.UndefOr[Double] = js.undefined, position: ControlPosition = null): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(panOffset)) __obj.updateDynamic("panOffset")(panOffset.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanControlOptions]
  }
}

