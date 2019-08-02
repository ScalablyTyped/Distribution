package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instruction extends js.Object {
  /**
    * Objects that, together, make up what should be displayed in the banner.
    * Includes additional information intended to be used to aid in visual layout
    */
  var components: js.Array[Component]
  /**
    * The degrees at which you will be exiting a roundabout, assuming 180 indicates going straight through the roundabout.
    */
  var degrees: js.UndefOr[Double] = js.undefined
  /**
    * A string representing which side the of the street people drive on in that location. Can be 'left' or 'right'.
    */
  var driving_side: DirectionsSide
  /**
    * The modifier for the maneuver. Can be used in combination with the type (and, if it is a roundabout, the degrees)
    * to for an icon to display. Possible values: 'left', 'right', 'slight left', 'slight right', 'sharp left', 'sharp right', 'straight', 'uturn'
    */
  var modifier: js.UndefOr[ManeuverModifier] = js.undefined
  /**
    * String that contains all the text that should be displayed.
    */
  var text: String
  /**
    * The type of maneuver. May be used in combination with the modifier (and, if it is a roundabout, the degrees) to for an icon to
    * display. Possible values: 'turn', 'merge', 'depart', 'arrive', 'fork', 'off ramp', 'roundabout'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Instruction {
  @scala.inline
  def apply(
    components: js.Array[Component],
    driving_side: DirectionsSide,
    text: String,
    degrees: Int | Double = null,
    modifier: ManeuverModifier = null,
    `type`: String = null
  ): Instruction = {
    val __obj = js.Dynamic.literal(components = components, driving_side = driving_side, text = text)
    if (degrees != null) __obj.updateDynamic("degrees")(degrees.asInstanceOf[js.Any])
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Instruction]
  }
}

