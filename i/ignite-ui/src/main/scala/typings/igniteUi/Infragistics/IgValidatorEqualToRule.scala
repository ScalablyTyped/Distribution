package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorEqualToRule extends js.Object {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String = js.native
  
  /**
    * Gets the error message type to get from locale settings (matching as "<type>Message>"). Returns the rule name by default.
    * Only used when there's no errorMessage option available through getRuleMessage.
    *
    * @param options
    */
  def getMessageType(options: js.Object): String = js.native
  
  /**
    * Gets an errorMessage from either the rule or field/global options.
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): String = js.native
  
  def isValid(options: js.Object, value: js.Object): Unit = js.native
  
  /**
    * Checks if rule should run on the current field and/or value.
    *
    * @param options Options for the validator, if fields are used this parameter is already populated with inherited ones.
    * @param value The stringified value to check.
    */
  def shouldRun(options: js.Object, value: String): Boolean = js.native
}
object IgValidatorEqualToRule {
  
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: js.Object => String,
    getRuleMessage: js.Object => String,
    isValid: (js.Object, js.Object) => Unit,
    shouldRun: (js.Object, String) => Boolean
  ): IgValidatorEqualToRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction1(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction2(isValid), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorEqualToRule]
  }
  
  @scala.inline
  implicit class IgValidatorEqualToRuleOps[Self <: IgValidatorEqualToRule] (val x: Self) extends AnyVal {
    
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
    def setFormatMessage(value: String => String): Self = this.set("formatMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMessageType(value: js.Object => String): Self = this.set("getMessageType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuleMessage(value: js.Object => String): Self = this.set("getRuleMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValid(value: (js.Object, js.Object) => Unit): Self = this.set("isValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setShouldRun(value: (js.Object, String) => Boolean): Self = this.set("shouldRun", js.Any.fromFunction2(value))
  }
}
