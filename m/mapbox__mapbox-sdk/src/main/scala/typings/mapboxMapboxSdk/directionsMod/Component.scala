package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /**
    * The abbreviated form of text. If this is present, there will also be an abbr_priority value.
    * See the Examples of Abbreviations table below for an example of using abbr and abbr_priority.
    */
  var abbr: js.UndefOr[String] = js.native
  /**
    * An integer indicating the order in which the abbreviation abbr should be used in place of text.
    * The highest priority is 0 and a higher integer value means it should have a lower priority. There are no gaps in
    * integer values. Multiple components can have the same abbr_priority and when this happens all components with the
    * same abbr_priority should be abbreviated at the same time. Finding no larger values of abbr_priority means that the
    * string is fully abbreviated.
    */
  var abbr_priority: js.UndefOr[Double] = js.native
  /**
    * (present if component is lane): A boolean telling you if that lane can be used to complete the upcoming maneuver.
    * If multiple lanes are active, then they can all be used to complete the upcoming maneuver.
    */
  var active: Boolean = js.native
  /**
    * (present if component is lane): An array indicating which directions you can go from a lane (left, right, or straight).
    * If the value is ['left', 'straight'], the driver can go straight or left from that lane
    */
  var directions: js.UndefOr[js.Array[String]] = js.native
  /**
    * String pointing to a shield image to use instead of the text.
    */
  var imageBaseURL: js.UndefOr[String] = js.native
  /**
    * The sub-string of the parent object's text that may have additional context associated with it.
    */
  var text: String = js.native
  /**
    * String giving you more context about the component which may help in visual markup/display choices.
    * If the type of the components is unknown it should be treated as text. Note: Introduction of new types
    * is not considered a breaking change. See the Types of Banner Components table below for more info on each type.
    */
  var `type`: String = js.native
}

object Component {
  @scala.inline
  def apply(active: Boolean, text: String, `type`: String): Component = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbbr(value: String): Self = this.set("abbr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbbr: Self = this.set("abbr", js.undefined)
    @scala.inline
    def setAbbr_priority(value: Double): Self = this.set("abbr_priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbbr_priority: Self = this.set("abbr_priority", js.undefined)
    @scala.inline
    def setDirectionsVarargs(value: String*): Self = this.set("directions", js.Array(value :_*))
    @scala.inline
    def setDirections(value: js.Array[String]): Self = this.set("directions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    @scala.inline
    def setImageBaseURL(value: String): Self = this.set("imageBaseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageBaseURL: Self = this.set("imageBaseURL", js.undefined)
  }
  
}

