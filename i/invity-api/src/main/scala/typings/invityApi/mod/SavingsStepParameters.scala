package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepParameters
  extends StObject
     with SavingsStepEnabled {
  
  var receivingAddressCount: Double
}
object SavingsStepParameters {
  
  inline def apply(isEnabled: Boolean, receivingAddressCount: Double): SavingsStepParameters = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], receivingAddressCount = receivingAddressCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsStepParameters] (val x: Self) extends AnyVal {
    
    inline def setReceivingAddressCount(value: Double): Self = StObject.set(x, "receivingAddressCount", value.asInstanceOf[js.Any])
  }
}
