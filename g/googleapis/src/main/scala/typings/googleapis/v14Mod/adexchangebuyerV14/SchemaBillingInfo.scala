package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange billing info.
  */
@js.native
trait SchemaBillingInfo extends js.Object {
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * Account name.
    */
  var accountName: js.UndefOr[String] = js.native
  /**
    * A list of adgroup IDs associated with this particular account. These IDs
    * may show up as part of a realtime bidding BidRequest, which indicates a
    * bid request for this account.
    */
  var billingId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBillingInfo {
  @scala.inline
  def apply(
    accountId: js.UndefOr[Double] = js.undefined,
    accountName: String = null,
    billingId: js.Array[String] = null,
    kind: String = null
  ): SchemaBillingInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountId)) __obj.updateDynamic("accountId")(accountId.get.asInstanceOf[js.Any])
    if (accountName != null) __obj.updateDynamic("accountName")(accountName.asInstanceOf[js.Any])
    if (billingId != null) __obj.updateDynamic("billingId")(billingId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBillingInfo]
  }
}

