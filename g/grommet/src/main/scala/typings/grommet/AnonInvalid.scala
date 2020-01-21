package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalid extends js.Object {
  var invalid: js.UndefOr[String] = js.undefined
  var required: js.UndefOr[String] = js.undefined
}

object AnonInvalid {
  @scala.inline
  def apply(invalid: String = null, required: String = null): AnonInvalid = {
    val __obj = js.Dynamic.literal()
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalid]
  }
}

