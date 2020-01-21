package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcons extends js.Object {
  var icons: js.UndefOr[AnonColorColorType] = js.undefined
}

object AnonIcons {
  @scala.inline
  def apply(icons: AnonColorColorType = null): AnonIcons = {
    val __obj = js.Dynamic.literal()
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcons]
  }
}

