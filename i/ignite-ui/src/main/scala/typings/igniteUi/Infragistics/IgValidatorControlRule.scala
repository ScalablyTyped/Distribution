package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgValidatorControlRule extends js.Object {
  /**
    * Formats an error message using rule-specific values (usually from formatItems).
    *
    * @param message The unformatted error message the validator intends to display.
    */
  def formatMessage(message: String): String
  def getMessageType(): Unit
  /**
    * Returns an error message for the rule from options
    *
    * @param options
    */
  def getRuleMessage(options: js.Object): Unit
  def isValid(options: js.Object): Unit
  def shouldRun(options: js.Object, value: js.Object): Unit
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
}

