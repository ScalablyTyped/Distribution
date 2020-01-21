package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnonColorSideColorType extends js.Object {
  var border: js.UndefOr[AnonColorSideColorType] = js.undefined
}

object AnonBorderAnonColorSideColorType {
  @scala.inline
  def apply(border: AnonColorSideColorType = null): AnonBorderAnonColorSideColorType = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnonColorSideColorType]
  }
}

