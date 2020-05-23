package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgValidatorValueRule extends js.Object {
  def getMessageType(): Unit
  def isValid(options: js.Object, value: js.Object): Unit
}

object IgValidatorValueRule {
  @scala.inline
  def apply(getMessageType: () => Unit, isValid: (js.Object, js.Object) => Unit): IgValidatorValueRule = {
    val __obj = js.Dynamic.literal(getMessageType = js.Any.fromFunction0(getMessageType), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[IgValidatorValueRule]
  }
}

