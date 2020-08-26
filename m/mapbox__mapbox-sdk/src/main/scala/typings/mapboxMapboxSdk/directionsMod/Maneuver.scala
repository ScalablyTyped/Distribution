package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Maneuver extends js.Object {
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right after the maneuver
    */
  var bearing_after: Double = js.native
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right before the maneuver
    */
  var bearing_before: Double = js.native
  /**
    * A human-readable instruction of how to execute the returned maneuver
    */
  var instruction: String = js.native
  /**
    * Array of [ longitude, latitude ] coordinates for the point of the maneuver
    */
  var location: js.Array[Double] = js.native
  /**
    * Optional String indicating the direction change of the maneuver
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.native
  /**
    * String indicating the type of maneuver
    */
  var `type`: ManeuverType = js.native
}

object Maneuver {
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    instruction: String,
    location: js.Array[Double],
    `type`: ManeuverType
  ): Maneuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after.asInstanceOf[js.Any], bearing_before = bearing_before.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setBearing_after(value: Double): Self = this.set("bearing_after", value.asInstanceOf[js.Any])
    @scala.inline
    def setBearing_before(value: Double): Self = this.set("bearing_before", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationVarargs(value: Double*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ManeuverType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setModifier(value: ManeuverModifier): Self = this.set("modifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
  }
  
}

