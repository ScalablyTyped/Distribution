package typings.knockoutDotValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleBase extends js.Object {
  var message: String
}

object KnockoutValidationRuleBase {
  @scala.inline
  def apply(message: String): KnockoutValidationRuleBase = {
    val __obj = js.Dynamic.literal(message = message)
  
    __obj.asInstanceOf[KnockoutValidationRuleBase]
  }
}

