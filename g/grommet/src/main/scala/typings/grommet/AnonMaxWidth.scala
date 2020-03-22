package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaxWidth extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonMaxWidth {
  @scala.inline
  def apply(height: String = null, maxWidth: String = null, size: String = null): AnonMaxWidth = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMaxWidth]
  }
}

