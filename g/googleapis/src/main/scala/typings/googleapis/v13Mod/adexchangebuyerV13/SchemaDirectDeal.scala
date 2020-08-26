package typings.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange direct deal.
  */
@js.native
trait SchemaDirectDeal extends js.Object {
  /**
    * The account id of the buyer this deal is for.
    */
  var accountId: js.UndefOr[Double] = js.native
  /**
    * The name of the advertiser this deal is for.
    */
  var advertiser: js.UndefOr[String] = js.native
  /**
    * Whether the publisher for this deal is eligible for alcohol ads.
    */
  var allowsAlcohol: js.UndefOr[Boolean] = js.native
  /**
    * The account id that this deal was negotiated for. It is either the buyer
    * or the client that this deal was negotiated on behalf of.
    */
  var buyerAccountId: js.UndefOr[String] = js.native
  /**
    * The currency code that applies to the fixed_cpm value. If not set then
    * assumed to be USD.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * The deal type such as programmatic reservation or fixed price and so on.
    */
  var dealTier: js.UndefOr[String] = js.native
  /**
    * End time for when this deal stops being active. If not set then this deal
    * is valid until manually disabled by the publisher. In seconds since the
    * epoch.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The fixed price for this direct deal. In cpm micros of currency according
    * to currency_code. If set, then this deal is eligible for the fixed price
    * tier of buying (highest priority, pay exactly the configured fixed
    * price).
    */
  var fixedCpm: js.UndefOr[String] = js.native
  /**
    * Deal id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Deal name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The minimum price for this direct deal. In cpm micros of currency
    * according to currency_code. If set, then this deal is eligible for the
    * private exchange tier of buying (below fixed price priority, run as a
    * second price auction).
    */
  var privateExchangeMinCpm: js.UndefOr[String] = js.native
  /**
    * If true, the publisher has opted to have their blocks ignored when a
    * creative is bid with for this deal.
    */
  var publisherBlocksOverriden: js.UndefOr[Boolean] = js.native
  /**
    * The name of the publisher offering this direct deal.
    */
  var sellerNetwork: js.UndefOr[String] = js.native
  /**
    * Start time for when this deal becomes active. If not set then this deal
    * is active immediately upon creation. In seconds since the epoch.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaDirectDeal {
  @scala.inline
  def apply(): SchemaDirectDeal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectDeal]
  }
  @scala.inline
  implicit class SchemaDirectDealOps[Self <: SchemaDirectDeal] (val x: Self) extends AnyVal {
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
    def setAccountId(value: Double): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiser(value: String): Self = this.set("advertiser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiser: Self = this.set("advertiser", js.undefined)
    @scala.inline
    def setAllowsAlcohol(value: Boolean): Self = this.set("allowsAlcohol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowsAlcohol: Self = this.set("allowsAlcohol", js.undefined)
    @scala.inline
    def setBuyerAccountId(value: String): Self = this.set("buyerAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuyerAccountId: Self = this.set("buyerAccountId", js.undefined)
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    @scala.inline
    def setDealTier(value: String): Self = this.set("dealTier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealTier: Self = this.set("dealTier", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setFixedCpm(value: String): Self = this.set("fixedCpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixedCpm: Self = this.set("fixedCpm", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrivateExchangeMinCpm(value: String): Self = this.set("privateExchangeMinCpm", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateExchangeMinCpm: Self = this.set("privateExchangeMinCpm", js.undefined)
    @scala.inline
    def setPublisherBlocksOverriden(value: Boolean): Self = this.set("publisherBlocksOverriden", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherBlocksOverriden: Self = this.set("publisherBlocksOverriden", js.undefined)
    @scala.inline
    def setSellerNetwork(value: String): Self = this.set("sellerNetwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerNetwork: Self = this.set("sellerNetwork", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

