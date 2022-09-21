package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPaymentOptions extends StObject {
  
  /**
    * Cash. The hotel accepts payment by paper/coin currency.
    */
  var cash: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cash exception.
    */
  var cashException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cheque. The hotel accepts a printed document issued by the guest's bank in the guest's name as a form of payment.
    */
  var cheque: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Cheque exception.
    */
  var chequeException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Credit card. The hotel accepts payment by a card issued by a bank or credit card company. Also known as charge card, debit card, bank card, or charge plate.
    */
  var creditCard: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Credit card exception.
    */
  var creditCardException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Debit card. The hotel accepts a bank-issued card that immediately deducts the charged funds from the guest's bank account upon processing.
    */
  var debitCard: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Debit card exception.
    */
  var debitCardException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mobile nfc. The hotel has the compatible computer hardware terminal that reads and charges a payment app on the guest's smartphone without requiring the two devices to make physical contact. Also known as Apple Pay, Google Pay, Samsung Pay.
    */
  var mobileNfc: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Mobile nfc exception.
    */
  var mobileNfcException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPaymentOptions {
  
  inline def apply(): SchemaPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPaymentOptions]
  }
  
  extension [Self <: SchemaPaymentOptions](x: Self) {
    
    inline def setCash(value: Boolean): Self = StObject.set(x, "cash", value.asInstanceOf[js.Any])
    
    inline def setCashException(value: String): Self = StObject.set(x, "cashException", value.asInstanceOf[js.Any])
    
    inline def setCashExceptionNull: Self = StObject.set(x, "cashException", null)
    
    inline def setCashExceptionUndefined: Self = StObject.set(x, "cashException", js.undefined)
    
    inline def setCashNull: Self = StObject.set(x, "cash", null)
    
    inline def setCashUndefined: Self = StObject.set(x, "cash", js.undefined)
    
    inline def setCheque(value: Boolean): Self = StObject.set(x, "cheque", value.asInstanceOf[js.Any])
    
    inline def setChequeException(value: String): Self = StObject.set(x, "chequeException", value.asInstanceOf[js.Any])
    
    inline def setChequeExceptionNull: Self = StObject.set(x, "chequeException", null)
    
    inline def setChequeExceptionUndefined: Self = StObject.set(x, "chequeException", js.undefined)
    
    inline def setChequeNull: Self = StObject.set(x, "cheque", null)
    
    inline def setChequeUndefined: Self = StObject.set(x, "cheque", js.undefined)
    
    inline def setCreditCard(value: Boolean): Self = StObject.set(x, "creditCard", value.asInstanceOf[js.Any])
    
    inline def setCreditCardException(value: String): Self = StObject.set(x, "creditCardException", value.asInstanceOf[js.Any])
    
    inline def setCreditCardExceptionNull: Self = StObject.set(x, "creditCardException", null)
    
    inline def setCreditCardExceptionUndefined: Self = StObject.set(x, "creditCardException", js.undefined)
    
    inline def setCreditCardNull: Self = StObject.set(x, "creditCard", null)
    
    inline def setCreditCardUndefined: Self = StObject.set(x, "creditCard", js.undefined)
    
    inline def setDebitCard(value: Boolean): Self = StObject.set(x, "debitCard", value.asInstanceOf[js.Any])
    
    inline def setDebitCardException(value: String): Self = StObject.set(x, "debitCardException", value.asInstanceOf[js.Any])
    
    inline def setDebitCardExceptionNull: Self = StObject.set(x, "debitCardException", null)
    
    inline def setDebitCardExceptionUndefined: Self = StObject.set(x, "debitCardException", js.undefined)
    
    inline def setDebitCardNull: Self = StObject.set(x, "debitCard", null)
    
    inline def setDebitCardUndefined: Self = StObject.set(x, "debitCard", js.undefined)
    
    inline def setMobileNfc(value: Boolean): Self = StObject.set(x, "mobileNfc", value.asInstanceOf[js.Any])
    
    inline def setMobileNfcException(value: String): Self = StObject.set(x, "mobileNfcException", value.asInstanceOf[js.Any])
    
    inline def setMobileNfcExceptionNull: Self = StObject.set(x, "mobileNfcException", null)
    
    inline def setMobileNfcExceptionUndefined: Self = StObject.set(x, "mobileNfcException", js.undefined)
    
    inline def setMobileNfcNull: Self = StObject.set(x, "mobileNfc", null)
    
    inline def setMobileNfcUndefined: Self = StObject.set(x, "mobileNfc", js.undefined)
  }
}
