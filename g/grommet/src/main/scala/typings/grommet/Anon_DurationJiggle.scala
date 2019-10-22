package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationJiggle extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
  var jiggle: js.UndefOr[Anon_Duration] = js.undefined
}

object Anon_DurationJiggle {
  @scala.inline
  def apply(duration: String = null, jiggle: Anon_Duration = null): Anon_DurationJiggle = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (jiggle != null) __obj.updateDynamic("jiggle")(jiggle)
    __obj.asInstanceOf[Anon_DurationJiggle]
  }
}

