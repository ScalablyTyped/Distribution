package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingOrShippingRecurringPayInData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePayInRecurringRegistration extends StObject {
  
  var Billing: js.UndefOr[BillingOrShippingRecurringPayInData] = js.undefined
  
  var CardId: js.UndefOr[String] = js.undefined
  
  var Shipping: js.UndefOr[BillingOrShippingRecurringPayInData] = js.undefined
  
  var Status: js.UndefOr[UpdateRecurringPaymentStatus] = js.undefined
}
object UpdatePayInRecurringRegistration {
  
  inline def apply(): UpdatePayInRecurringRegistration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePayInRecurringRegistration]
  }
  
  extension [Self <: UpdatePayInRecurringRegistration](x: Self) {
    
    inline def setBilling(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "CardId", js.undefined)
    
    inline def setShipping(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
    
    inline def setStatus(value: UpdateRecurringPaymentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
