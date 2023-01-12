package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepEnabled extends StObject {
  
  /** Indicates whether the step is enabled (meaning the flow process has to go through this step) or this step will be skipped. */
  var isEnabled: Boolean
}
object SavingsStepEnabled {
  
  inline def apply(isEnabled: Boolean): SavingsStepEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepEnabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsStepEnabled] (val x: Self) extends AnyVal {
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
  }
}
