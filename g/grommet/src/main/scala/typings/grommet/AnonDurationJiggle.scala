package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDurationJiggle extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
  var jiggle: js.UndefOr[AnonDuration] = js.undefined
}

object AnonDurationJiggle {
  @scala.inline
  def apply(duration: String = null, jiggle: AnonDuration = null): AnonDurationJiggle = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (jiggle != null) __obj.updateDynamic("jiggle")(jiggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDurationJiggle]
  }
}

