package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonSide extends js.Object {
  var border: js.UndefOr[AnonSide] = js.undefined
}

object AnonBorderAnonSide {
  @scala.inline
  def apply(border: AnonSide = null): AnonBorderAnonSide = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonSide]
  }
}

