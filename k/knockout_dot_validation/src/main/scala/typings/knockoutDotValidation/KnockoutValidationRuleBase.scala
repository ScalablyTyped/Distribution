package typings.knockoutDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleBase extends js.Object {
  var message: String | KnockoutValidationMessageFunction
}

object KnockoutValidationRuleBase {
  @scala.inline
  def apply(message: String | KnockoutValidationMessageFunction): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
}

