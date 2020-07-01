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
  def apply(
    accountId: js.UndefOr[Double] = js.undefined,
    advertiser: String = null,
    allowsAlcohol: js.UndefOr[Boolean] = js.undefined,
    buyerAccountId: String = null,
    currencyCode: String = null,
    dealTier: String = null,
    endTime: String = null,
    fixedCpm: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    privateExchangeMinCpm: String = null,
    publisherBlocksOverriden: js.UndefOr[Boolean] = js.undefined,
    sellerNetwork: String = null,
    startTime: String = null
  ): SchemaDirectDeal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accountId)) __obj.updateDynamic("accountId")(accountId.get.asInstanceOf[js.Any])
    if (advertiser != null) __obj.updateDynamic("advertiser")(advertiser.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsAlcohol)) __obj.updateDynamic("allowsAlcohol")(allowsAlcohol.get.asInstanceOf[js.Any])
    if (buyerAccountId != null) __obj.updateDynamic("buyerAccountId")(buyerAccountId.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (dealTier != null) __obj.updateDynamic("dealTier")(dealTier.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fixedCpm != null) __obj.updateDynamic("fixedCpm")(fixedCpm.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (privateExchangeMinCpm != null) __obj.updateDynamic("privateExchangeMinCpm")(privateExchangeMinCpm.asInstanceOf[js.Any])
    if (!js.isUndefined(publisherBlocksOverriden)) __obj.updateDynamic("publisherBlocksOverriden")(publisherBlocksOverriden.get.asInstanceOf[js.Any])
    if (sellerNetwork != null) __obj.updateDynamic("sellerNetwork")(sellerNetwork.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDirectDeal]
  }
}

