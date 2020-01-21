package typings.iotaLibJs

import typings.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEndSecurity extends js.Object {
  var end: Double
  var security: js.UndefOr[Security] = js.undefined
  var start: Double
}

object AnonEndSecurity {
  @scala.inline
  def apply(end: Double, start: Double, security: Security = null): AnonEndSecurity = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEndSecurity]
  }
}

