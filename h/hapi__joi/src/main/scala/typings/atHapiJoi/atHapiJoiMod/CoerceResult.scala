package typings.atHapiJoi.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoerceResult extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorReport]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CoerceResult {
  @scala.inline
  def apply(errors: js.Array[ErrorReport] = null, value: js.Any = null): CoerceResult = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CoerceResult]
  }
}

