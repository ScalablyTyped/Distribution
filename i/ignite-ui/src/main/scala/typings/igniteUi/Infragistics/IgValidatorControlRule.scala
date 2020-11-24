package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorControlRule extends js.Object {
  
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String = js.native
  
  def getMessageType(): Unit = js.native
  
  /**
    * Returns an error message for the rule from options
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): Unit = js.native
  
  def isValid(options: js.Object): Unit = js.native
  
  def shouldRun(options: js.Object, value: js.Object): Unit = js.native
}
object IgValidatorControlRule {
  
  @scala.inline
  def apply(
    formatMessage: String => String,
    getMessageType: () => Unit,
    getRuleMessage: js.Object => Unit,
    isValid: js.Object => Unit,
    shouldRun: (js.Object, js.Object) => Unit
  ): IgValidatorControlRule = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), getMessageType = js.Any.fromFunction0(getMessageType), getRuleMessage = js.Any.fromFunction1(getRuleMessage), isValid = js.Any.fromFunction1(isValid), shouldRun = js.Any.fromFunction2(shouldRun))
    __obj.asInstanceOf[IgValidatorControlRule]
  }
  
  @scala.inline
  implicit class IgValidatorControlRuleOps[Self <: IgValidatorControlRule] (val x: Self) extends AnyVal {
    
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
    def setGetMessageType(value: () => Unit): Self = this.set("getMessageType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRuleMessage(value: js.Object => Unit): Self = this.set("getRuleMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsValid(value: js.Object => Unit): Self = this.set("isValid", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShouldRun(value: (js.Object, js.Object) => Unit): Self = this.set("shouldRun", js.Any.fromFunction2(value))
  }
}
