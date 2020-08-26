package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lane extends js.Object {
  /**
    * Array of signs for each turn lane. There can be multiple signs. For example, a turning lane can have a sign with an arrow pointing left and another sign with an arrow pointing straight.
    */
  var indications: js.Array[String] = js.native
  /**
    * Boolean value for whether this lane can be taken to complete the maneuver. For instance, if the lane array has four objects and the
    * first two are marked as valid, then the driver can take either of the left lanes and stay on the route.
    */
  var valid: Boolean = js.native
}

object Lane {
  @scala.inline
  def apply(indications: js.Array[String], valid: Boolean): Lane = {
    val __obj = js.Dynamic.literal(indications = indications.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  @scala.inline
  implicit class LaneOps[Self <: Lane] (val x: Self) extends AnyVal {
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
    def setIndicationsVarargs(value: String*): Self = this.set("indications", js.Array(value :_*))
    @scala.inline
    def setIndications(value: js.Array[String]): Self = this.set("indications", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
  
}

