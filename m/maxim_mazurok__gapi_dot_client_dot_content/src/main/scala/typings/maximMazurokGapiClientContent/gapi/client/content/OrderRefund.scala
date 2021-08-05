package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderRefund extends StObject {
  
  /** The actor that created the refund. Acceptable values are: - "`customer`" - "`googleBot`" - "`googleCustomerService`" - "`googlePayments`" - "`googleSabre`" - "`merchant`" */
  var actor: js.UndefOr[String] = js.undefined
  
  /** The amount that is refunded. */
  var amount: js.UndefOr[Price] = js.undefined
  
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the refund. Acceptable values are: - "`adjustment`" - "`autoPostInternal`" - "`autoPostInvalidBillingAddress`" - "`autoPostNoInventory`" - "`autoPostPriceError`" -
    * "`autoPostUndeliverableShippingAddress`" - "`couponAbuse`" - "`courtesyAdjustment`" - "`customerCanceled`" - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" -
    * "`customerSupportRequested`" - "`deliveredLateByCarrier`" - "`deliveredTooLate`" - "`expiredItem`" - "`failToPushOrderGoogleError`" - "`failToPushOrderMerchantError`" -
    * "`failToPushOrderMerchantFulfillmentError`" - "`failToPushOrderToMerchant`" - "`failToPushOrderToMerchantOutOfStock`" - "`feeAdjustment`" - "`invalidCoupon`" -
    * "`lateShipmentCredit`" - "`malformedShippingAddress`" - "`merchantDidNotShipOnTime`" - "`noInventory`" - "`orderTimeout`" - "`other`" - "`paymentAbuse`" - "`paymentDeclined`" -
    * "`priceAdjustment`" - "`priceError`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`promoReallocation`" - "`qualityNotAsExpected`" - "`returnRefundAbuse`" -
    * "`shippingCostAdjustment`" - "`shippingPriceError`" - "`taxAdjustment`" - "`taxError`" - "`undeliverableShippingAddress`" - "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}
object OrderRefund {
  
  inline def apply(): OrderRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderRefund]
  }
  
  extension [Self <: OrderRefund](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
