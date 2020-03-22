package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProperties extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var properties: js.UndefOr[js.Array[String]] = js.undefined
  var timing: js.UndefOr[String] = js.undefined
}

object AnonProperties {
  @scala.inline
  def apply(duration: Int | Double = null, properties: js.Array[String] = null, timing: String = null): AnonProperties = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (timing != null) __obj.updateDynamic("timing")(timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProperties]
  }
}

