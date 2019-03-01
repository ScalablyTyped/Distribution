package typings
package knockoutDotValidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutValidationRuleDefinitions
  extends /* ruleName */ org.scalablytyped.runtime.StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] {
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
    StringDictionary: /* ruleName */ org.scalablytyped.runtime.StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] = null
  ): KnockoutValidationRuleDefinitions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("dateISO")(dateISO)
    __obj.updateDynamic("digit")(digit)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("equal")(equal)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("minLength")(minLength)
    __obj.updateDynamic("notEqual")(notEqual)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("phoneUS")(phoneUS)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("step")(step)
    __obj.updateDynamic("unique")(unique)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[KnockoutValidationRuleDefinitions]
  }
}

