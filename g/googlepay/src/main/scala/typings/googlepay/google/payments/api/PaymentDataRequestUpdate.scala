package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An updated request for payment data.
  *
  * This is generated after a callback has been triggered and should be
  * used to patch the old PaymentDataRequest. Note that only the fields
  * that's been changed need to be set in this request update.
  *
  * Note: This interface is currently only for web only.
  */
trait PaymentDataRequestUpdate extends StObject {
  
  /**
    * Error for the last PaymentData, will be displayed to the user.
    *
    * Note: This field is currently only for web only.
    */
  var error: js.UndefOr[PaymentDataError] = js.undefined
  
  /**
    * Contains the updated offer information. All fields in OfferInfo are
    * allowed in the update.
    *
    * If this field is present it should be the full list of offer info
    * instead of a delta of any earlier version. Note: This field is
    * currently only for web only.
    */
  var newOfferInfo: js.UndefOr[OfferInfo] = js.undefined
  
  /**
    * Contains updated shipping option parameters. All fields in
    * ShippingOptionParameters are allowed in the update.
    *
    * If this field is present it should be the full list of shipping
    * options instead of a delta of any earlier version. Note: This field
    * is currently only for web only.
    */
  var newShippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.undefined
  
  /**
    * Contains updated totals and line items. Only changes in totalPrice,
    * totalPriceStatus, transactionNote, displayItems will be allowed.
    *
    * Note: This field is currently only for web only.
    */
  var newTransactionInfo: js.UndefOr[TransactionInfo] = js.undefined
}
object PaymentDataRequestUpdate {
  
  inline def apply(): PaymentDataRequestUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDataRequestUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentDataRequestUpdate] (val x: Self) extends AnyVal {
    
    inline def setError(value: PaymentDataError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setNewOfferInfo(value: OfferInfo): Self = StObject.set(x, "newOfferInfo", value.asInstanceOf[js.Any])
    
    inline def setNewOfferInfoUndefined: Self = StObject.set(x, "newOfferInfo", js.undefined)
    
    inline def setNewShippingOptionParameters(value: ShippingOptionParameters): Self = StObject.set(x, "newShippingOptionParameters", value.asInstanceOf[js.Any])
    
    inline def setNewShippingOptionParametersUndefined: Self = StObject.set(x, "newShippingOptionParameters", js.undefined)
    
    inline def setNewTransactionInfo(value: TransactionInfo): Self = StObject.set(x, "newTransactionInfo", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionInfoUndefined: Self = StObject.set(x, "newTransactionInfo", js.undefined)
  }
}
