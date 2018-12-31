package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationAsyncRuleDefinition extends KnockoutValidationRuleBase {
  var async: scala.Boolean
  def validator(value: js.Any, params: js.Any, callback: KnockoutValidationAsyncCallback): scala.Unit
}

