package typings
package linkifyDashItLib.linkifyDashItMod.LinkifyItNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FullRule extends js.Object {
  var normalize: js.UndefOr[js.Function1[/* match */ java.lang.String, java.lang.String]] = js.undefined
  var validate: java.lang.String | stdLib.RegExp | Validate
}

object FullRule {
  @scala.inline
  def apply(
    validate: java.lang.String | stdLib.RegExp | Validate,
    normalize: /* match */ java.lang.String => java.lang.String = null
  ): FullRule = {
    val __obj = js.Dynamic.literal(validate = validate.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction1(normalize))
    __obj.asInstanceOf[FullRule]
  }
}

