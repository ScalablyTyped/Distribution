package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeg extends js.Object {
  var leg: js.Array[AnonManeuver]
  var mode: AnonFeature
  var shape: js.Array[String]
  var summary: AnonBaseTime
  var waypoint: js.Array[AnonLabel]
}

object AnonLeg {
  @scala.inline
  def apply(
    leg: js.Array[AnonManeuver],
    mode: AnonFeature,
    shape: js.Array[String],
    summary: AnonBaseTime,
    waypoint: js.Array[AnonLabel]
  ): AnonLeg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeg]
  }
}

