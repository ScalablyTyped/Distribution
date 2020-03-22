package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderDisabled extends js.Object {
  var border: js.UndefOr[AnonRadius] = js.undefined
  var disabled: js.UndefOr[AnonOpacityOpacityType] = js.undefined
}

object AnonBorderDisabled {
  @scala.inline
  def apply(border: AnonRadius = null, disabled: AnonOpacityOpacityType = null): AnonBorderDisabled = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderDisabled]
  }
}

