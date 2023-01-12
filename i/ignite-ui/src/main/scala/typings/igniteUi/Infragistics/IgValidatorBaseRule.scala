package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorBaseRule extends StObject {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  
  /**
    * Gets the error message type to get from locale settings (matching as "<type>Message>"). Returns the rule name by default.
    * Only used when there's no errorMessage option available through getRuleMessage.
    *
    * @param options
    */
  def getMessageType(options: js.Object): String
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String
  
  /**
    * Validates a value against this rule and returns the result.
    *
    * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
    * @param value The value to check.
    */
  def isValid(options: js.Object, value: js.Object): Boolean
  
  /**
    * Checks if rule should run on the current field and/or value.
    *
    * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
    * @param value The stringified value to check.
    */
  def shouldRun(options: js.Object, value: String): Boolean
}
object IgValidatorBaseRule {
  
  inline def apply(
    formatMessage: String => String,
    getMessageType: js.Object => String,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Boolean,
    shouldRun: (js.Object, String) => Boolean
  ): IgValidatorBaseRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction1(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorBaseRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgValidatorBaseRule] (val x: Self) extends AnyVal {
    
    inline def setFormatMessage(value: String => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
    
    inline def setGetMessageType(value: js.Object => String): Self = StObject.set(x, "getMessageType", js.Any.fromFunction1(value))
    
    inline def setGetRuleMessage(value: js.Object => String): Self = StObject.set(x, "getRuleMessage", js.Any.fromFunction1(value))
    
    inline def setIsValid(value: (js.Object, js.Object) => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
    
    inline def setShouldRun(value: (js.Object, String) => Boolean): Self = StObject.set(x, "shouldRun", js.Any.fromFunction2(value))
  }
}
