package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonSideSize extends js.Object {
  var border: js.UndefOr[AnonSideSize] = js.undefined
}

object AnonBorderAnonSideSize {
  @scala.inline
  def apply(border: AnonSideSize = null): AnonBorderAnonSideSize = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonSideSize]
  }
}

