package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maneuver extends js.Object {
  var maneuver: js.Array[Id]
}

object Maneuver {
  @scala.inline
  def apply(maneuver: js.Array[Id]): Maneuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
}

