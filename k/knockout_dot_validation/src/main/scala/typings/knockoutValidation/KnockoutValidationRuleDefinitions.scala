package typings.knockoutValidation

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleDefinitions extends /* ruleName */ StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] {
  var date: KnockoutValidationRuleDefinition
  var dateISO: KnockoutValidationRuleDefinition
  var digit: KnockoutValidationRuleDefinition
  var email: KnockoutValidationRuleDefinition
  var equal: KnockoutValidationRuleDefinition
  var max: KnockoutValidationRuleDefinition
  var maxLength: KnockoutValidationRuleDefinition
  var min: KnockoutValidationRuleDefinition
  var minLength: KnockoutValidationRuleDefinition
  var notEqual: KnockoutValidationRuleDefinition
  var number: KnockoutValidationRuleDefinition
  var pattern: KnockoutValidationRuleDefinition
  var phoneUS: KnockoutValidationRuleDefinition
  var required: KnockoutValidationRuleDefinition
  var step: KnockoutValidationRuleDefinition
  var unique: KnockoutValidationRuleDefinition
}

object KnockoutValidationRuleDefinitions {
  @scala.inline
  def apply(
    date: KnockoutValidationRuleDefinition,
    dateISO: KnockoutValidationRuleDefinition,
    digit: KnockoutValidationRuleDefinition,
    email: KnockoutValidationRuleDefinition,
    equal: KnockoutValidationRuleDefinition,
    max: KnockoutValidationRuleDefinition,
    maxLength: KnockoutValidationRuleDefinition,
    min: KnockoutValidationRuleDefinition,
    minLength: KnockoutValidationRuleDefinition,
    notEqual: KnockoutValidationRuleDefinition,
    number: KnockoutValidationRuleDefinition,
    pattern: KnockoutValidationRuleDefinition,
    phoneUS: KnockoutValidationRuleDefinition,
    required: KnockoutValidationRuleDefinition,
    step: KnockoutValidationRuleDefinition,
    unique: KnockoutValidationRuleDefinition,
    StringDictionary: /* ruleName */ StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] = null
  ): KnockoutValidationRuleDefinitions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateISO = dateISO.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], notEqual = notEqual.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], phoneUS = phoneUS.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutValidationRuleDefinitions]
  }
}

