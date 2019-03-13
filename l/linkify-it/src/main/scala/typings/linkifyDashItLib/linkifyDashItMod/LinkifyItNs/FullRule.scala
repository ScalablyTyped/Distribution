package typings
package linkifyDashItLib.linkifyDashItMod.LinkifyItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRule extends js.Object {
  var normalize: js.UndefOr[js.Function1[/* match */ Match, scala.Unit]] = js.undefined
  var validate: java.lang.String | stdLib.RegExp | Validate
}

object FullRule {
  @scala.inline
  def apply(
    validate: java.lang.String | stdLib.RegExp | Validate,
    normalize: /* match */ Match => scala.Unit = null
  ): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[FullRule]
  }
}

