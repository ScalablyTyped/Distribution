package typings.jsonSchemaMergeAllof.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contains extends js.Object {
  var contains: js.UndefOr[js.Any] = js.undefined
}

object Contains {
  @scala.inline
  def apply(contains: js.Any = null): Contains = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contains]
  }
}

