package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleBase extends js.Object {
  var message: java.lang.String
}

object KnockoutValidationRuleBase {
  @scala.inline
  def apply(message: java.lang.String): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
}

