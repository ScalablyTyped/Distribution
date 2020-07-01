package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleapis.anon.BidProtocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration data for an Ad Exchange buyer account.
  */
@js.native
trait SchemaAccount extends js.Object {
  /**
    * When this is false, bid requests that include a deal ID for a private
    * auction or preferred deal are always sent to your bidder. When true, all
    * active pretargeting configs will be applied to private auctions and
    * preferred deals. Programmatic Guaranteed deals (when enabled) are always
    * sent to your bidder.
    */
  var applyPretargetingToNonGuaranteedDeals: js.UndefOr[Boolean] = js.native
  /**
    * Your bidder locations that have distinct URLs.
    */
  var bidderLocation: js.UndefOr[js.Array[BidProtocol]] = js.native
  /**
    * The nid parameter value used in cookie match requests. Please contact
    * your technical account manager if you need to change this.
    */
  var cookieMatchingNid: js.UndefOr[String] = js.native
  /**
    * The base URL used in cookie match requests.
    */
  var cookieMatchingUrl: js.UndefOr[String] = js.native
  /**
    * Account id.
    */
  var id: js.UndefOr[Double] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The maximum number of active creatives that an account can have, where a
    * creative is active if it was inserted or bid with in the last 30 days.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumActiveCreatives: js.UndefOr[Double] = js.native
  /**
    * The sum of all bidderLocation.maximumQps values cannot exceed this.
    * Please contact your technical account manager if you need to change this.
    */
  var maximumTotalQps: js.UndefOr[Double] = js.native
  /**
    * The number of creatives that this account inserted or bid with in the
    * last 30 days.
    */
  var numberActiveCreatives: js.UndefOr[Double] = js.native
}

object SchemaAccount {
  @scala.inline
  def apply(
    applyPretargetingToNonGuaranteedDeals: js.UndefOr[Boolean] = js.undefined,
    bidderLocation: js.Array[BidProtocol] = null,
    cookieMatchingNid: String = null,
    cookieMatchingUrl: String = null,
    id: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    maximumActiveCreatives: js.UndefOr[Double] = js.undefined,
    maximumTotalQps: js.UndefOr[Double] = js.undefined,
    numberActiveCreatives: js.UndefOr[Double] = js.undefined
  ): SchemaAccount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyPretargetingToNonGuaranteedDeals)) __obj.updateDynamic("applyPretargetingToNonGuaranteedDeals")(applyPretargetingToNonGuaranteedDeals.get.asInstanceOf[js.Any])
    if (bidderLocation != null) __obj.updateDynamic("bidderLocation")(bidderLocation.asInstanceOf[js.Any])
    if (cookieMatchingNid != null) __obj.updateDynamic("cookieMatchingNid")(cookieMatchingNid.asInstanceOf[js.Any])
    if (cookieMatchingUrl != null) __obj.updateDynamic("cookieMatchingUrl")(cookieMatchingUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumActiveCreatives)) __obj.updateDynamic("maximumActiveCreatives")(maximumActiveCreatives.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumTotalQps)) __obj.updateDynamic("maximumTotalQps")(maximumTotalQps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberActiveCreatives)) __obj.updateDynamic("numberActiveCreatives")(numberActiveCreatives.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAccount]
  }
}

