package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Maneuver extends js.Object {
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right after the maneuver
    */
  var bearing_after: Double
  /**
    * Number between 0 and 360 indicating the clockwise angle from true north to the direction of travel right before the maneuver
    */
  var bearing_before: Double
  /**
    * A human-readable instruction of how to execute the returned maneuver
    */
  var instruction: String
  /**
    * Array of [ longitude, latitude ] coordinates for the point of the maneuver
    */
  var location: js.Array[Double]
  /**
    * Optional String indicating the direction change of the maneuver
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.undefined
  /**
    * String indicating the type of maneuver
    */
  var `type`: ManeuverType
}

object Maneuver {
  @scala.inline
  def apply(
    bearing_after: Double,
    bearing_before: Double,
    instruction: String,
    location: js.Array[Double],
    `type`: ManeuverType,
    modifier: ManeuverModifier = null
  ): Maneuver = {
    val __obj = js.Dynamic.literal(bearing_after = bearing_after, bearing_before = bearing_before, instruction = instruction, location = location)
    __obj.updateDynamic("type")(`type`)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    __obj.asInstanceOf[Maneuver]
  }
}

