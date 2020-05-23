package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leg extends js.Object {
  var leg: js.Array[Maneuver]
  var mode: Feature
  var shape: js.Array[String]
  var summary: BaseTime
  var waypoint: js.Array[Label]
}

object Leg {
  @scala.inline
  def apply(
    leg: js.Array[Maneuver],
    mode: Feature,
    shape: js.Array[String],
    summary: BaseTime,
    waypoint: js.Array[Label]
  ): Leg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leg]
  }
}

