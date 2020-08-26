package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maneuver extends js.Object {
  var maneuver: js.Array[Id] = js.native
}

object Maneuver {
  @scala.inline
  def apply(maneuver: js.Array[Id]): Maneuver = {
    val __obj = js.Dynamic.literal(maneuver = maneuver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maneuver]
  }
  @scala.inline
  implicit class ManeuverOps[Self <: Maneuver] (val x: Self) extends AnyVal {
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
    def setManeuverVarargs(value: Id*): Self = this.set("maneuver", js.Array(value :_*))
    @scala.inline
    def setManeuver(value: js.Array[Id]): Self = this.set("maneuver", value.asInstanceOf[js.Any])
  }
  
}

