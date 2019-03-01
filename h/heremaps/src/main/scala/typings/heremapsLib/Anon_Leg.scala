package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Leg extends js.Object {
  var leg: js.Array[Anon_Maneuver]
  var mode: Anon_Feature
  var shape: js.Array[java.lang.String]
  var summary: Anon_BaseTime
  var waypoint: js.Array[Anon_Label]
}

object Anon_Leg {
  @scala.inline
  def apply(
    leg: js.Array[Anon_Maneuver],
    mode: Anon_Feature,
    shape: js.Array[java.lang.String],
    summary: Anon_BaseTime,
    waypoint: js.Array[Anon_Label]
  ): Anon_Leg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leg")(leg)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("shape")(shape)
    __obj.updateDynamic("summary")(summary)
    __obj.updateDynamic("waypoint")(waypoint)
    __obj.asInstanceOf[Anon_Leg]
  }
}

