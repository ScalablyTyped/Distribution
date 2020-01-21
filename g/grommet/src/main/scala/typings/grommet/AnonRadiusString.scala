package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRadiusString extends js.Object {
  var radius: js.UndefOr[String] = js.undefined
}

object AnonRadiusString {
  @scala.inline
  def apply(radius: String = null): AnonRadiusString = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRadiusString]
  }
}

