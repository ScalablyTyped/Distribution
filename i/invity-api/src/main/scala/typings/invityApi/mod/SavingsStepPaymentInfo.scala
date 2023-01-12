package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsStepPaymentInfo
  extends StObject
     with SavingsStepEnabled {
  
  var coinTransferDelayed: Boolean
  
  var isAutomaticPaymentPlanningEnabled: Boolean
  
  var showReceivingAddressChangePaymentInfo: Boolean
}
object SavingsStepPaymentInfo {
  
  inline def apply(
    coinTransferDelayed: Boolean,
    isAutomaticPaymentPlanningEnabled: Boolean,
    isEnabled: Boolean,
    showReceivingAddressChangePaymentInfo: Boolean
  ): SavingsStepPaymentInfo = {
    val __obj = js.Dynamic.literal(coinTransferDelayed = coinTransferDelayed.asInstanceOf[js.Any], isAutomaticPaymentPlanningEnabled = isAutomaticPaymentPlanningEnabled.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], showReceivingAddressChangePaymentInfo = showReceivingAddressChangePaymentInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsStepPaymentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsStepPaymentInfo] (val x: Self) extends AnyVal {
    
    inline def setCoinTransferDelayed(value: Boolean): Self = StObject.set(x, "coinTransferDelayed", value.asInstanceOf[js.Any])
    
    inline def setIsAutomaticPaymentPlanningEnabled(value: Boolean): Self = StObject.set(x, "isAutomaticPaymentPlanningEnabled", value.asInstanceOf[js.Any])
    
    inline def setShowReceivingAddressChangePaymentInfo(value: Boolean): Self = StObject.set(x, "showReceivingAddressChangePaymentInfo", value.asInstanceOf[js.Any])
  }
}
