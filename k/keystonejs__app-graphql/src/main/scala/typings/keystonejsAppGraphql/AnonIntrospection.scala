package typings.keystonejsAppGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIntrospection extends js.Object {
  var introspection: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object AnonIntrospection {
  @scala.inline
  def apply(introspection: js.UndefOr[Boolean] = js.undefined, validationRules: js.Array[js.Any] = null): AnonIntrospection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIntrospection]
  }
}

