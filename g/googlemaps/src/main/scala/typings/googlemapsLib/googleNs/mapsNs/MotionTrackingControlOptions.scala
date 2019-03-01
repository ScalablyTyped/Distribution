package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionTrackingControlOptions extends js.Object {
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object MotionTrackingControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null): MotionTrackingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[MotionTrackingControlOptions]
  }
}

