package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  /**
    * The abbreviated form of text. If this is present, there will also be an abbr_priority value.
    * See the Examples of Abbreviations table below for an example of using abbr and abbr_priority.
    */
  var abbr: js.UndefOr[String] = js.undefined
  /**
    * An integer indicating the order in which the abbreviation abbr should be used in place of text.
    * The highest priority is 0 and a higher integer value means it should have a lower priority. There are no gaps in
    * integer values. Multiple components can have the same abbr_priority and when this happens all components with the
    * same abbr_priority should be abbreviated at the same time. Finding no larger values of abbr_priority means that the
    * string is fully abbreviated.
    */
  var abbr_priority: js.UndefOr[Double] = js.undefined
  /**
    * (present if component is lane): A boolean telling you if that lane can be used to complete the upcoming maneuver.
    * If multiple lanes are active, then they can all be used to complete the upcoming maneuver.
    */
  var active: Boolean
  /**
    * (present if component is lane): An array indicating which directions you can go from a lane (left, right, or straight).
    * If the value is ['left', 'straight'], the driver can go straight or left from that lane
    */
  var directions: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * String pointing to a shield image to use instead of the text.
    */
  var imageBaseURL: js.UndefOr[String] = js.undefined
  /**
    * The sub-string of the parent object's text that may have additional context associated with it.
    */
  var text: String
  /**
    * String giving you more context about the component which may help in visual markup/display choices.
    * If the type of the components is unknown it should be treated as text. Note: Introduction of new types
    * is not considered a breaking change. See the Types of Banner Components table below for more info on each type.
    */
  var `type`: String
}

object Component {
  @scala.inline
  def apply(
    active: Boolean,
    text: String,
    `type`: String,
    abbr: String = null,
    abbr_priority: Int | Double = null,
    directions: js.Array[String] = null,
    imageBaseURL: String = null
  ): Component = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (abbr != null) __obj.updateDynamic("abbr")(abbr.asInstanceOf[js.Any])
    if (abbr_priority != null) __obj.updateDynamic("abbr_priority")(abbr_priority.asInstanceOf[js.Any])
    if (directions != null) __obj.updateDynamic("directions")(directions.asInstanceOf[js.Any])
    if (imageBaseURL != null) __obj.updateDynamic("imageBaseURL")(imageBaseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
}

