package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepPaymentInfo
  extends StObject
     with SavingsStepEnabled {
  
  var isAutomaticPaymentPlanningEnabled: Boolean
}
object SavingsStepPaymentInfo {
  
  inline def apply(isAutomaticPaymentPlanningEnabled: Boolean, isEnabled: Boolean): SavingsStepPaymentInfo = {
    val __obj = js.Dynamic.literal(isAutomaticPaymentPlanningEnabled = isAutomaticPaymentPlanningEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepPaymentInfo]
  }
  
  extension [Self <: SavingsStepPaymentInfo](x: Self) {
    
    inline def setIsAutomaticPaymentPlanningEnabled(value: Boolean): Self = StObject.set(x, "isAutomaticPaymentPlanningEnabled", value.asInstanceOf[js.Any])
  }
}
