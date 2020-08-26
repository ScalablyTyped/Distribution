package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Leg extends js.Object {
  var leg: js.Array[Maneuver] = js.native
  var mode: Feature = js.native
  var shape: js.Array[String] = js.native
  var summary: BaseTime = js.native
  var waypoint: js.Array[Label] = js.native
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
  @scala.inline
  implicit class LegOps[Self <: Leg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLegVarargs(value: Maneuver*): Self = this.set("leg", js.Array(value :_*))
    @scala.inline
    def setLeg(value: js.Array[Maneuver]): Self = this.set("leg", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: Feature): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: String*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[String]): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: BaseTime): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointVarargs(value: Label*): Self = this.set("waypoint", js.Array(value :_*))
    @scala.inline
    def setWaypoint(value: js.Array[Label]): Self = this.set("waypoint", value.asInstanceOf[js.Any])
  }
  
}

