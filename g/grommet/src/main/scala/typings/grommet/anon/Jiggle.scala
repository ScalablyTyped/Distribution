package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jiggle extends js.Object {
  var duration: js.UndefOr[String] = js.undefined
  var jiggle: js.UndefOr[Duration] = js.undefined
}

object Jiggle {
  @scala.inline
  def apply(duration: String = null, jiggle: Duration = null): Jiggle = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (jiggle != null) __obj.updateDynamic("jiggle")(jiggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jiggle]
  }
}

