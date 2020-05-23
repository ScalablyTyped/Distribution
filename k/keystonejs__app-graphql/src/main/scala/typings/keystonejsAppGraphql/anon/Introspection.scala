package typings.keystonejsAppGraphql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Introspection extends js.Object {
  var introspection: js.UndefOr[Boolean] = js.undefined
  var validationRules: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object Introspection {
  @scala.inline
  def apply(introspection: js.UndefOr[Boolean] = js.undefined, validationRules: js.Array[js.Any] = null): Introspection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(introspection)) __obj.updateDynamic("introspection")(introspection.get.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Introspection]
  }
}

