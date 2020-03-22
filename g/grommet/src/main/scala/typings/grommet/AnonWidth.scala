package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWidth extends js.Object {
  var radius: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object AnonWidth {
  @scala.inline
  def apply(radius: String = null, width: String = null): AnonWidth = {
    val __obj = js.Dynamic.literal()
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWidth]
  }
}

