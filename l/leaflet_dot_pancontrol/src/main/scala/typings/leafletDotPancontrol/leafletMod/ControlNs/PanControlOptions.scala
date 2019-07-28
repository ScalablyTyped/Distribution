package typings.leafletDotPancontrol.leafletMod.ControlNs

import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanControlOptions extends ControlOptions {
  var panOffset: js.UndefOr[Double] = js.undefined
}

object PanControlOptions {
  @scala.inline
  def apply(panOffset: Int | Double = null, position: ControlPosition = null): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    if (panOffset != null) __obj.updateDynamic("panOffset")(panOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PanControlOptions]
  }
}

