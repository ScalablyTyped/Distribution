package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait PaymentDataRequestUpdate extends js.Object {
  
  /**
    * Error for the last PaymentData, will be displayed to the user.
    *
    * Note: This field is currently only for web only.
    */
  var error: js.UndefOr[PaymentDataError] = js.native
  
  /**
    * Contains updated shipping option parameters. All fields in
    * ShippingOptionParameters are allowed in the update.
    *
    * If this field is present it should be the full list of shipping
    * options instead of a delta of any earlier version. Note: This field
    * is currently only for web only.
    */
  var newShippingOptionParameters: js.UndefOr[ShippingOptionParameters] = js.native
  
  /**
    * Contains updated totals and line items. Only changes in totalPrice,
    * totalPriceStatus, transactionNote, displayItems will be allowed.
    *
    * Note: This field is currently only for web only.
    */
  var newTransactionInfo: js.UndefOr[TransactionInfo] = js.native
}
object PaymentDataRequestUpdate {
  
  @scala.inline
  def apply(): PaymentDataRequestUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentDataRequestUpdate]
  }
  
  @scala.inline
  implicit class PaymentDataRequestUpdateOps[Self <: PaymentDataRequestUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: PaymentDataError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setNewShippingOptionParameters(value: ShippingOptionParameters): Self = this.set("newShippingOptionParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewShippingOptionParameters: Self = this.set("newShippingOptionParameters", js.undefined)
    
    @scala.inline
    def setNewTransactionInfo(value: TransactionInfo): Self = this.set("newTransactionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewTransactionInfo: Self = this.set("newTransactionInfo", js.undefined)
  }
}
