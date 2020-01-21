package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for Ad Exchange RTB - Budget API.
  */
@js.native
trait SchemaBudget extends js.Object {
  /**
    * The id of the account. This is required for get and update requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The billing id to determine which adgroup to provide budget information
    * for. This is required for get and update requests.
    */
  var billingId: js.UndefOr[String] = js.native
  /**
    * The daily budget amount in unit amount of the account currency to apply
    * for the billingId provided. This is required for update requests.
    */
  var budgetAmount: js.UndefOr[String] = js.native
  /**
    * The currency code for the buyer. This cannot be altered here.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The unique id that describes this item.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of the resource, i.e. &quot;adexchangebuyer#budget&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaBudget {
  @scala.inline
  def apply(
    accountId: String = null,
    billingId: String = null,
    budgetAmount: String = null,
    currencyCode: String = null,
    id: String = null,
    kind: String = null
  ): SchemaBudget = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (billingId != null) __obj.updateDynamic("billingId")(billingId.asInstanceOf[js.Any])
    if (budgetAmount != null) __obj.updateDynamic("budgetAmount")(budgetAmount.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBudget]
  }
}

