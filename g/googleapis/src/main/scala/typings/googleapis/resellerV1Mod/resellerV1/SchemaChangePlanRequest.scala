package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChangePlanRequest extends StObject {
  
  /**
    * Google-issued code (100 char max) for discounted pricing on subscription plans. Deal code must be included in `changePlan` request in order to receive discounted rate. This property is optional. If a deal code has already been added to a subscription, this property may be left empty and the existing discounted rate will still apply (if not empty, only provide the deal code that is already present on the subscription). If a deal code has never been added to a subscription and this property is left blank, regular pricing will apply.
    */
  var dealCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the resource as a subscription change plan request. Value: `subscriptions#changePlanRequest`
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The `planName` property is required. This is the name of the subscription's payment plan. For more information about the Google payment plans, see API concepts. Possible values are: - `ANNUAL_MONTHLY_PAY` - The annual commitment plan with monthly payments *Caution: *`ANNUAL_MONTHLY_PAY` is returned as `ANNUAL` in all API responses. - `ANNUAL_YEARLY_PAY` - The annual commitment plan with yearly payments - `FLEXIBLE` - The flexible plan - `TRIAL` - The 30-day free trial plan
    */
  var planName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is an optional property. This purchase order (PO) information is for resellers to use for their company tracking usage. If a `purchaseOrderId` value is given it appears in the API responses and shows up in the invoice. The property accepts up to 80 plain text characters.
    */
  var purchaseOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is a required property. The seats property is the number of user seat licenses.
    */
  var seats: js.UndefOr[SchemaSeats] = js.undefined
}
object SchemaChangePlanRequest {
  
  inline def apply(): SchemaChangePlanRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangePlanRequest]
  }
  
  extension [Self <: SchemaChangePlanRequest](x: Self) {
    
    inline def setDealCode(value: String): Self = StObject.set(x, "dealCode", value.asInstanceOf[js.Any])
    
    inline def setDealCodeNull: Self = StObject.set(x, "dealCode", null)
    
    inline def setDealCodeUndefined: Self = StObject.set(x, "dealCode", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameNull: Self = StObject.set(x, "planName", null)
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    inline def setPurchaseOrderId(value: String): Self = StObject.set(x, "purchaseOrderId", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderIdNull: Self = StObject.set(x, "purchaseOrderId", null)
    
    inline def setPurchaseOrderIdUndefined: Self = StObject.set(x, "purchaseOrderId", js.undefined)
    
    inline def setSeats(value: SchemaSeats): Self = StObject.set(x, "seats", value.asInstanceOf[js.Any])
    
    inline def setSeatsUndefined: Self = StObject.set(x, "seats", js.undefined)
  }
}
