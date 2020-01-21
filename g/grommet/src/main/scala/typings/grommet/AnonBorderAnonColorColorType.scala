package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonColorColorType extends js.Object {
  var border: js.UndefOr[AnonColorColorType] = js.undefined
}

object AnonBorderAnonColorColorType {
  @scala.inline
  def apply(border: AnonColorColorType = null): AnonBorderAnonColorColorType = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonColorColorType]
  }
}

