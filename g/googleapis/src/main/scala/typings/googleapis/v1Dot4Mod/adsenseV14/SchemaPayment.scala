package typings.googleapis.v1Dot4Mod.adsenseV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPayment extends StObject {
  
  /**
    * Unique identifier of this Payment.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of resource this is, in this case adsense#payment.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount to be paid.
    */
  var paymentAmount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency code for the amount to be paid.
    */
  var paymentAmountCurrencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date this payment was/will be credited to the user, or none if the payment threshold has not been met.
    */
  var paymentDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaPayment {
  
  inline def apply(): SchemaPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPayment]
  }
  
  extension [Self <: SchemaPayment](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPaymentAmount(value: String): Self = StObject.set(x, "paymentAmount", value.asInstanceOf[js.Any])
    
    inline def setPaymentAmountCurrencyCode(value: String): Self = StObject.set(x, "paymentAmountCurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setPaymentAmountCurrencyCodeNull: Self = StObject.set(x, "paymentAmountCurrencyCode", null)
    
    inline def setPaymentAmountCurrencyCodeUndefined: Self = StObject.set(x, "paymentAmountCurrencyCode", js.undefined)
    
    inline def setPaymentAmountNull: Self = StObject.set(x, "paymentAmount", null)
    
    inline def setPaymentAmountUndefined: Self = StObject.set(x, "paymentAmount", js.undefined)
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentDateNull: Self = StObject.set(x, "paymentDate", null)
    
    inline def setPaymentDateUndefined: Self = StObject.set(x, "paymentDate", js.undefined)
  }
}
