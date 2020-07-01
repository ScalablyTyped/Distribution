package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderDisabled extends js.Object {
  var border: js.UndefOr[Radius] = js.undefined
  var disabled: js.UndefOr[`0`] = js.undefined
}

object BorderDisabled {
  @scala.inline
  def apply(border: Radius = null, disabled: `0` = null): BorderDisabled = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDisabled]
  }
}

