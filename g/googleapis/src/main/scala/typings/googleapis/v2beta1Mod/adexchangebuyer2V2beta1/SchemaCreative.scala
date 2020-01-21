package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends js.Object {
  /**
    * The account that this creative belongs to. Can be used to filter the
    * response of the creatives.list method.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The link to AdChoices destination page.
    */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.native
  /**
    * The name of the company being advertised in the creative.
    */
  var advertiserName: js.UndefOr[String] = js.native
  /**
    * The agency ID for this creative.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The last update timestamp of the creative via API.
    */
  var apiUpdateTime: js.UndefOr[String] = js.native
  /**
    * All attributes for the ads that may be shown from this creative. Can be
    * used to filter the response of the creatives.list method.
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of destination URLs for the creative.
    */
  var clickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Shows any corrections that were applied to this creative.
    */
  var corrections: js.UndefOr[js.Array[SchemaCorrection]] = js.native
  /**
    * The buyer-defined creative ID of this creative. Can be used to filter the
    * response of the creatives.list method.
    */
  var creativeId: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The top-level deals status of this creative. If disapproved,
    * an entry for &#39;auctionType=DIRECT_DEALS&#39; (or &#39;ALL&#39;) in
    * serving_restrictions will also exist. Note that this may be nuanced with
    * other contextual restrictions, in which case, it may be preferable to
    * read from serving_restrictions directly. Can be used to filter the
    * response of the creatives.list method.
    */
  var dealsStatus: js.UndefOr[String] = js.native
  /**
    * The set of declared destination URLs for the creative.
    */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Detected advertiser IDs, if any.
    */
  var detectedAdvertiserIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The detected domains for this creative.
    */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The detected languages for this creative. The order is
    * arbitrary. The codes are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly Detected product categories, if any. See the
    * ad-product-categories.txt file in the technical documentation for a list
    * of IDs.
    */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly Detected sensitive categories, if any. See the
    * ad-sensitive-categories.txt file in the technical documentation for a
    * list of IDs. You should use these IDs along with the
    * excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly The filtering stats for this creative. Deprecated; please use
    * bidders.accounts.filterSets.filteredBids.creatives.list method instead.
    */
  var filteringStats: js.UndefOr[SchemaFilteringStats] = js.native
  /**
    * An HTML creative.
    */
  var html: js.UndefOr[SchemaHtmlContent] = js.native
  /**
    * The set of URLs to be called to record an impression.
    */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.native
  /**
    * A native creative.
    */
  var native: js.UndefOr[SchemaNativeContent] = js.native
  /**
    * @OutputOnly The top-level open auction status of this creative. If
    * disapproved, an entry for &#39;auctionType = OPEN_AUCTION&#39; (or
    * &#39;ALL&#39;) in serving_restrictions will also exist. Note that this
    * may be nuanced with other contextual restrictions, in which case, it may
    * be preferable to read from serving_restrictions directly. Can be used to
    * filter the response of the creatives.list method.
    */
  var openAuctionStatus: js.UndefOr[String] = js.native
  /**
    * All restricted categories for the ads that may be shown from this
    * creative.
    */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.native
  /**
    * @OutputOnly The granular status of this ad in specific contexts. A
    * context here relates to where something ultimately serves (for example, a
    * physical location, a platform, an HTTPS vs HTTP request, or the type of
    * auction).
    */
  var servingRestrictions: js.UndefOr[js.Array[SchemaServingRestriction]] = js.native
  /**
    * All vendor IDs for the ads that may be shown from this creative. See
    * https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for
    * possible values.
    */
  var vendorIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * @OutputOnly The version of this creative.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * A video creative.
    */
  var video: js.UndefOr[SchemaVideoContent] = js.native
}

object SchemaCreative {
  @scala.inline
  def apply(
    accountId: String = null,
    adChoicesDestinationUrl: String = null,
    advertiserName: String = null,
    agencyId: String = null,
    apiUpdateTime: String = null,
    attributes: js.Array[String] = null,
    clickThroughUrls: js.Array[String] = null,
    corrections: js.Array[SchemaCorrection] = null,
    creativeId: String = null,
    dealsStatus: String = null,
    declaredClickThroughUrls: js.Array[String] = null,
    detectedAdvertiserIds: js.Array[String] = null,
    detectedDomains: js.Array[String] = null,
    detectedLanguages: js.Array[String] = null,
    detectedProductCategories: js.Array[Double] = null,
    detectedSensitiveCategories: js.Array[Double] = null,
    filteringStats: SchemaFilteringStats = null,
    html: SchemaHtmlContent = null,
    impressionTrackingUrls: js.Array[String] = null,
    native: SchemaNativeContent = null,
    openAuctionStatus: String = null,
    restrictedCategories: js.Array[String] = null,
    servingRestrictions: js.Array[SchemaServingRestriction] = null,
    vendorIds: js.Array[Double] = null,
    version: Int | Double = null,
    video: SchemaVideoContent = null
  ): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (adChoicesDestinationUrl != null) __obj.updateDynamic("adChoicesDestinationUrl")(adChoicesDestinationUrl.asInstanceOf[js.Any])
    if (advertiserName != null) __obj.updateDynamic("advertiserName")(advertiserName.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (apiUpdateTime != null) __obj.updateDynamic("apiUpdateTime")(apiUpdateTime.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clickThroughUrls != null) __obj.updateDynamic("clickThroughUrls")(clickThroughUrls.asInstanceOf[js.Any])
    if (corrections != null) __obj.updateDynamic("corrections")(corrections.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (dealsStatus != null) __obj.updateDynamic("dealsStatus")(dealsStatus.asInstanceOf[js.Any])
    if (declaredClickThroughUrls != null) __obj.updateDynamic("declaredClickThroughUrls")(declaredClickThroughUrls.asInstanceOf[js.Any])
    if (detectedAdvertiserIds != null) __obj.updateDynamic("detectedAdvertiserIds")(detectedAdvertiserIds.asInstanceOf[js.Any])
    if (detectedDomains != null) __obj.updateDynamic("detectedDomains")(detectedDomains.asInstanceOf[js.Any])
    if (detectedLanguages != null) __obj.updateDynamic("detectedLanguages")(detectedLanguages.asInstanceOf[js.Any])
    if (detectedProductCategories != null) __obj.updateDynamic("detectedProductCategories")(detectedProductCategories.asInstanceOf[js.Any])
    if (detectedSensitiveCategories != null) __obj.updateDynamic("detectedSensitiveCategories")(detectedSensitiveCategories.asInstanceOf[js.Any])
    if (filteringStats != null) __obj.updateDynamic("filteringStats")(filteringStats.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (impressionTrackingUrls != null) __obj.updateDynamic("impressionTrackingUrls")(impressionTrackingUrls.asInstanceOf[js.Any])
    if (native != null) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    if (openAuctionStatus != null) __obj.updateDynamic("openAuctionStatus")(openAuctionStatus.asInstanceOf[js.Any])
    if (restrictedCategories != null) __obj.updateDynamic("restrictedCategories")(restrictedCategories.asInstanceOf[js.Any])
    if (servingRestrictions != null) __obj.updateDynamic("servingRestrictions")(servingRestrictions.asInstanceOf[js.Any])
    if (vendorIds != null) __obj.updateDynamic("vendorIds")(vendorIds.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreative]
  }
}

