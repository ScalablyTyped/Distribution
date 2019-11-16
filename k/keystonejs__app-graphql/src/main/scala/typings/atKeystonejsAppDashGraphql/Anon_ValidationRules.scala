package typings.atKeystonejsAppDashGraphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValidationRules extends js.Object {
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object Anon_ValidationRules {
  @scala.inline
  def apply(validationRules: js.Array[js.Any] = null): Anon_ValidationRules = {
    val __obj = js.Dynamic.literal()
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules)
    __obj.asInstanceOf[Anon_ValidationRules]
  }
}

