package typings.googleapis.v13Mod.adexchangebuyerV13

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
  def apply(): SchemaBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBudget]
  }
  @scala.inline
  implicit class SchemaBudgetOps[Self <: SchemaBudget] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBillingId(value: String): Self = this.set("billingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingId: Self = this.set("billingId", js.undefined)
    @scala.inline
    def setBudgetAmount(value: String): Self = this.set("budgetAmount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBudgetAmount: Self = this.set("budgetAmount", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

