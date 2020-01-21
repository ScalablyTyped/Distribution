package typings.jsonSchemaMergeAllof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContains extends js.Object {
  var contains: js.UndefOr[js.Any] = js.undefined
}

object AnonContains {
  @scala.inline
  def apply(contains: js.Any = null): AnonContains = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContains]
  }
}

