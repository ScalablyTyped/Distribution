package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderReturn extends StObject {
  
  /** The actor that created the refund. Acceptable values are: - "`customer`" - "`googleBot`" - "`googleCustomerService`" - "`googlePayments`" - "`googleSabre`" - "`merchant`" */
  var actor: js.UndefOr[String] = js.undefined
  
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[String] = js.undefined
  
  /** Quantity that is returned. */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The reason for the return. Acceptable values are: - "`customerDiscretionaryReturn`" - "`customerInitiatedMerchantCancel`" - "`deliveredTooLate`" - "`expiredItem`" -
    * "`invalidCoupon`" - "`malformedShippingAddress`" - "`other`" - "`productArrivedDamaged`" - "`productNotAsDescribed`" - "`qualityNotAsExpected`" - "`undeliverableShippingAddress`" -
    * "`unsupportedPoBoxAddress`" - "`wrongProductShipped`"
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}
object OrderReturn {
  
  inline def apply(): OrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderReturn]
  }
  
  extension [Self <: OrderReturn](x: Self) {
    
    inline def setActor(value: String): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setActorUndefined: Self = StObject.set(x, "actor", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    inline def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
