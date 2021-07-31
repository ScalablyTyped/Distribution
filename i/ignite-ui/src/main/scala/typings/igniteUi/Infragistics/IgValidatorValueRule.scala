package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgValidatorValueRule extends StObject {
  
  def getMessageType(): Unit
  
  def isValid(options: js.Object, value: js.Object): Unit
}
object IgValidatorValueRule {
  
  @scala.inline
  def apply(getMessageType: () => Unit, isValid: (js.Object, js.Object) => Unit): IgValidatorValueRule = {
    val __obj = js.Dynamic.literal(getMessageType = js.Any.fromFunction0(getMessageType), isValid = js.Any.fromFunction2(isValid))
    __obj.asInstanceOf[IgValidatorValueRule]
  }
  
  @scala.inline
  implicit class IgValidatorValueRuleMutableBuilder[Self <: IgValidatorValueRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetMessageType(value: () => Unit): Self = StObject.set(x, "getMessageType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsValid(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "isValid", js.Any.fromFunction2(value))
  }
}
