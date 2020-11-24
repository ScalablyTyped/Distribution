package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorValueRule extends js.Object {
  
  def getMessageType(): Unit = js.native
  
  def isValid(options: js.Object, value: js.Object): Unit = js.native
}
object IgValidatorValueRule {
  
  @scala.inline
  def apply(getMessageType: () => Unit, isValid: (js.Object, js.Object) => Unit): IgValidatorValueRule = {
    val __obj = js.Dynamic.literal(getMessageType = js.Any.fromFunction0(getMessageType), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[IgValidatorValueRule]
  }
  
  @scala.inline
  implicit class IgValidatorValueRuleOps[Self <: IgValidatorValueRule] (val x: Self) extends AnyVal {
    
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
    def setGetMessageType(value: () => Unit): Self = this.set("getMessageType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: (js.Object, js.Object) => Unit): Self = this.set("isValid", js.Any.fromFunction2(value))
  }
}
