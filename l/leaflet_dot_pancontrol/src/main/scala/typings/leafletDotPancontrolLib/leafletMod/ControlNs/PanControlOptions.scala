package typings
package leafletDotPancontrolLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanControlOptions
  extends leafletLib.leafletMod.ControlOptions {
  var panOffset: js.UndefOr[scala.Double] = js.undefined
}

object PanControlOptions {
  @scala.inline
  def apply(panOffset: scala.Int | scala.Double = null, position: leafletLib.leafletMod.ControlPosition = null): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    if (panOffset != null) __obj.updateDynamic("panOffset")(panOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PanControlOptions]
  }
}

