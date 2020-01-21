package typings.keystonejsAppGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValidationRules extends js.Object {
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object AnonValidationRules {
  @scala.inline
  def apply(validationRules: js.Array[js.Any] = null): AnonValidationRules = {
    val __obj = js.Dynamic.literal()
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValidationRules]
  }
}

