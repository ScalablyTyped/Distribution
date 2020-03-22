package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An updated request for payment data.
  *
  * This is generated after a callback has been triggered and should be
  * used to patch the old PaymentDataRequest. Note that only the fields
  * that's been changed need to be set in this request update.
  *
  * Note: This interface is currently only for web only.
  */
trait PaymentDataRequestUpdate extends js.Object {
  /**
    * Error for the last PaymentData, will be displayed to the user.
    *
    * Note: This field is currently only for web only.
    */
  var error: js.UndefOr[PaymentDataError] = js.undefined
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
  @scala.inline
  def apply(
    error: PaymentDataError = null,
    newShippingOptionParameters: ShippingOptionParameters = null,
    newTransactionInfo: TransactionInfo = null
  ): PaymentDataRequestUpdate = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (newShippingOptionParameters != null) __obj.updateDynamic("newShippingOptionParameters")(newShippingOptionParameters.asInstanceOf[js.Any])
    if (newTransactionInfo != null) __obj.updateDynamic("newTransactionInfo")(newTransactionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDataRequestUpdate]
  }
}

