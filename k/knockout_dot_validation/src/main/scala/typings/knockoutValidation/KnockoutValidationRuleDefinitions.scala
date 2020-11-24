package typings.knockoutValidation

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationRuleDefinitions extends /* ruleName */ StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] {
  
  var date: KnockoutValidationRuleDefinition = js.native
  
  var dateISO: KnockoutValidationRuleDefinition = js.native
  
  var digit: KnockoutValidationRuleDefinition = js.native
  
  var email: KnockoutValidationRuleDefinition = js.native
  
  var equal: KnockoutValidationRuleDefinition = js.native
  
  var max: KnockoutValidationRuleDefinition = js.native
  
  var maxLength: KnockoutValidationRuleDefinition = js.native
  
  var min: KnockoutValidationRuleDefinition = js.native
  
  var minLength: KnockoutValidationRuleDefinition = js.native
  
  var notEqual: KnockoutValidationRuleDefinition = js.native
  
  var number: KnockoutValidationRuleDefinition = js.native
  
  var pattern: KnockoutValidationRuleDefinition = js.native
  
  var phoneUS: KnockoutValidationRuleDefinition = js.native
  
  var required: KnockoutValidationRuleDefinition = js.native
  
  var step: KnockoutValidationRuleDefinition = js.native
  
  var unique: KnockoutValidationRuleDefinition = js.native
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
    unique: KnockoutValidationRuleDefinition
  ): KnockoutValidationRuleDefinitions = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateISO = dateISO.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], equal = equal.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], notEqual = notEqual.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], phoneUS = phoneUS.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutValidationRuleDefinitions]
  }
  
  @scala.inline
  implicit class KnockoutValidationRuleDefinitionsOps[Self <: KnockoutValidationRuleDefinitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDate(value: KnockoutValidationRuleDefinition): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateISO(value: KnockoutValidationRuleDefinition): Self = this.set("dateISO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigit(value: KnockoutValidationRuleDefinition): Self = this.set("digit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: KnockoutValidationRuleDefinition): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqual(value: KnockoutValidationRuleDefinition): Self = this.set("equal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: KnockoutValidationRuleDefinition): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: KnockoutValidationRuleDefinition): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: KnockoutValidationRuleDefinition): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLength(value: KnockoutValidationRuleDefinition): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotEqual(value: KnockoutValidationRuleDefinition): Self = this.set("notEqual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: KnockoutValidationRuleDefinition): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: KnockoutValidationRuleDefinition): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUS(value: KnockoutValidationRuleDefinition): Self = this.set("phoneUS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: KnockoutValidationRuleDefinition): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: KnockoutValidationRuleDefinition): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: KnockoutValidationRuleDefinition): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
}
