package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderReportTransaction extends js.Object {
  /**
    * The disbursement amount.
    */
  var disbursementAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The date the disbursement was created, in ISO 8601 format.
    */
  var disbursementCreationDate: js.UndefOr[String] = js.native
  /**
    * The date the disbursement was initiated, in ISO 8601 format.
    */
  var disbursementDate: js.UndefOr[String] = js.native
  /**
    * The ID of the disbursement.
    */
  var disbursementId: js.UndefOr[String] = js.native
  /**
    * The ID of the managing account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The ID of the order.
    */
  var orderId: js.UndefOr[String] = js.native
  /**
    * Total amount for the items.
    */
  var productAmount: js.UndefOr[SchemaAmount] = js.native
  /**
    * Total amount with remitted tax for the items.
    */
  var productAmountWithRemittedTax: js.UndefOr[SchemaProductAmount] = js.native
  /**
    * The date of the transaction, in ISO 8601 format.
    */
  var transactionDate: js.UndefOr[String] = js.native
}

object SchemaOrderReportTransaction {
  @scala.inline
  def apply(
    disbursementAmount: SchemaPrice = null,
    disbursementCreationDate: String = null,
    disbursementDate: String = null,
    disbursementId: String = null,
    merchantId: String = null,
    merchantOrderId: String = null,
    orderId: String = null,
    productAmount: SchemaAmount = null,
    productAmountWithRemittedTax: SchemaProductAmount = null,
    transactionDate: String = null
  ): SchemaOrderReportTransaction = {
    val __obj = js.Dynamic.literal()
    if (disbursementAmount != null) __obj.updateDynamic("disbursementAmount")(disbursementAmount.asInstanceOf[js.Any])
    if (disbursementCreationDate != null) __obj.updateDynamic("disbursementCreationDate")(disbursementCreationDate.asInstanceOf[js.Any])
    if (disbursementDate != null) __obj.updateDynamic("disbursementDate")(disbursementDate.asInstanceOf[js.Any])
    if (disbursementId != null) __obj.updateDynamic("disbursementId")(disbursementId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId.asInstanceOf[js.Any])
    if (merchantOrderId != null) __obj.updateDynamic("merchantOrderId")(merchantOrderId.asInstanceOf[js.Any])
    if (orderId != null) __obj.updateDynamic("orderId")(orderId.asInstanceOf[js.Any])
    if (productAmount != null) __obj.updateDynamic("productAmount")(productAmount.asInstanceOf[js.Any])
    if (productAmountWithRemittedTax != null) __obj.updateDynamic("productAmountWithRemittedTax")(productAmountWithRemittedTax.asInstanceOf[js.Any])
    if (transactionDate != null) __obj.updateDynamic("transactionDate")(transactionDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderReportTransaction]
  }
}

