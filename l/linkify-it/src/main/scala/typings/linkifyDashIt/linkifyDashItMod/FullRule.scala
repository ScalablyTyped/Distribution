package typings.linkifyDashIt.linkifyDashItMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRule extends js.Object {
  var normalize: js.UndefOr[js.Function1[/* match */ Match, Unit]] = js.undefined
  var validate: String | RegExp | Validate
}

object FullRule {
  @scala.inline
  def apply(validate: String | RegExp | Validate, normalize: /* match */ Match => Unit = null): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[FullRule]
  }
}

