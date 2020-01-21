package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorder extends js.Object {
  var border: js.UndefOr[AnonColorRadius] = js.undefined
  var disabled: js.UndefOr[AnonOpacity] = js.undefined
}

object AnonBorder {
  @scala.inline
  def apply(border: AnonColorRadius = null, disabled: AnonOpacity = null): AnonBorder = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorder]
  }
}

