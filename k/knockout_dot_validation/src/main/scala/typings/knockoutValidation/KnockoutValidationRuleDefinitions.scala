package typings.knockoutValidation

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutValidationRuleDefinitions
  extends StObject
     with /* ruleName */ StringDictionary[KnockoutValidationRuleDefinition | KnockoutValidationAsyncRuleDefinition] {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: KnockoutValidationRuleDefinitions] (val x: Self) extends AnyVal {
    
    inline def setDate(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateISO(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "dateISO", value.asInstanceOf[js.Any])
    
    inline def setDigit(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEqual(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "equal", value.asInstanceOf[js.Any])
    
    inline def setMax(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMin(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setNotEqual(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "notEqual", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPhoneUS(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "phoneUS", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setStep(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: KnockoutValidationRuleDefinition): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
  }
}
