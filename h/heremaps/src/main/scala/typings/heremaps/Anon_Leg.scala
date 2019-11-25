package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leg extends js.Object {
  var leg: js.Array[Anon_Maneuver]
  var mode: Anon_Feature
  var shape: js.Array[String]
  var summary: Anon_BaseTime
  var waypoint: js.Array[Anon_Label]
}

object Anon_Leg {
  @scala.inline
  def apply(
    leg: js.Array[Anon_Maneuver],
    mode: Anon_Feature,
    shape: js.Array[String],
    summary: Anon_BaseTime,
    waypoint: js.Array[Anon_Label]
  ): Anon_Leg = {
    val __obj = js.Dynamic.literal(leg = leg.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], waypoint = waypoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Leg]
  }
}

