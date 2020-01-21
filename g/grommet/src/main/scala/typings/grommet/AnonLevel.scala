package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: js.UndefOr[String] = js.undefined
}

object AnonLevel {
  @scala.inline
  def apply(level: String = null): AnonLevel = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

