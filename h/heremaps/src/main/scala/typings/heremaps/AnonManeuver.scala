package typings.heremaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManeuver extends js.Object {
  var maneuver: js.Array[AnonId]
}

object AnonManeuver {
  @scala.inline
  def apply(maneuver: js.Array[AnonId]): AnonManeuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonManeuver]
  }
}

