package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Stepper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStepper extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Stepper = js.native
  
  /* static member */
  var fn: Stepper = js.native
}
object TypeofStepper {
  
  @scala.inline
  def apply(extend: js.Object => Stepper, fn: Stepper): TypeofStepper = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofStepper]
  }
  
  @scala.inline
  implicit class TypeofStepperMutableBuilder[Self <: TypeofStepper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Stepper): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Stepper): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
