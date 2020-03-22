package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonColorSide extends js.Object {
  var border: js.UndefOr[AnonColorSide] = js.undefined
}

object AnonBorderAnonColorSide {
  @scala.inline
  def apply(border: AnonColorSide = null): AnonBorderAnonColorSide = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonColorSide]
  }
}

