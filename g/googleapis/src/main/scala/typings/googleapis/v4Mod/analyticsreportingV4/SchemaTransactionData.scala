package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents details collected when the visitor performs a transaction on the
  * page.
  */
@js.native
trait SchemaTransactionData extends js.Object {
  /**
    * The transaction ID, supplied by the e-commerce tracking method, for the
    * purchase in the shopping cart.
    */
  var transactionId: js.UndefOr[String] = js.native
  /**
    * The total sale revenue (excluding shipping and tax) of the transaction.
    */
  var transactionRevenue: js.UndefOr[Double] = js.native
  /**
    * Total cost of shipping.
    */
  var transactionShipping: js.UndefOr[Double] = js.native
  /**
    * Total tax for the transaction.
    */
  var transactionTax: js.UndefOr[Double] = js.native
}

object SchemaTransactionData {
  @scala.inline
  def apply(
    transactionId: String = null,
    transactionRevenue: js.UndefOr[Double] = js.undefined,
    transactionShipping: js.UndefOr[Double] = js.undefined,
    transactionTax: js.UndefOr[Double] = js.undefined
  ): SchemaTransactionData = {
    val __obj = js.Dynamic.literal()
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionRevenue)) __obj.updateDynamic("transactionRevenue")(transactionRevenue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionShipping)) __obj.updateDynamic("transactionShipping")(transactionShipping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transactionTax)) __obj.updateDynamic("transactionTax")(transactionTax.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTransactionData]
  }
}

