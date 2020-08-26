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
  def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  @scala.inline
  implicit class SchemaCreativeOps[Self <: SchemaCreative] (val x: Self) extends AnyVal {
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
    def setAdChoicesDestinationUrl(value: String): Self = this.set("adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdChoicesDestinationUrl: Self = this.set("adChoicesDestinationUrl", js.undefined)
    @scala.inline
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    @scala.inline
    def setApiUpdateTime(value: String): Self = this.set("apiUpdateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiUpdateTime: Self = this.set("apiUpdateTime", js.undefined)
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setClickThroughUrlsVarargs(value: String*): Self = this.set("clickThroughUrls", js.Array(value :_*))
    @scala.inline
    def setClickThroughUrls(value: js.Array[String]): Self = this.set("clickThroughUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThroughUrls: Self = this.set("clickThroughUrls", js.undefined)
    @scala.inline
    def setCorrectionsVarargs(value: SchemaCorrection*): Self = this.set("corrections", js.Array(value :_*))
    @scala.inline
    def setCorrections(value: js.Array[SchemaCorrection]): Self = this.set("corrections", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorrections: Self = this.set("corrections", js.undefined)
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setDealsStatus(value: String): Self = this.set("dealsStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDealsStatus: Self = this.set("dealsStatus", js.undefined)
    @scala.inline
    def setDeclaredClickThroughUrlsVarargs(value: String*): Self = this.set("declaredClickThroughUrls", js.Array(value :_*))
    @scala.inline
    def setDeclaredClickThroughUrls(value: js.Array[String]): Self = this.set("declaredClickThroughUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaredClickThroughUrls: Self = this.set("declaredClickThroughUrls", js.undefined)
    @scala.inline
    def setDetectedAdvertiserIdsVarargs(value: String*): Self = this.set("detectedAdvertiserIds", js.Array(value :_*))
    @scala.inline
    def setDetectedAdvertiserIds(value: js.Array[String]): Self = this.set("detectedAdvertiserIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedAdvertiserIds: Self = this.set("detectedAdvertiserIds", js.undefined)
    @scala.inline
    def setDetectedDomainsVarargs(value: String*): Self = this.set("detectedDomains", js.Array(value :_*))
    @scala.inline
    def setDetectedDomains(value: js.Array[String]): Self = this.set("detectedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedDomains: Self = this.set("detectedDomains", js.undefined)
    @scala.inline
    def setDetectedLanguagesVarargs(value: String*): Self = this.set("detectedLanguages", js.Array(value :_*))
    @scala.inline
    def setDetectedLanguages(value: js.Array[String]): Self = this.set("detectedLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedLanguages: Self = this.set("detectedLanguages", js.undefined)
    @scala.inline
    def setDetectedProductCategoriesVarargs(value: Double*): Self = this.set("detectedProductCategories", js.Array(value :_*))
    @scala.inline
    def setDetectedProductCategories(value: js.Array[Double]): Self = this.set("detectedProductCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedProductCategories: Self = this.set("detectedProductCategories", js.undefined)
    @scala.inline
    def setDetectedSensitiveCategoriesVarargs(value: Double*): Self = this.set("detectedSensitiveCategories", js.Array(value :_*))
    @scala.inline
    def setDetectedSensitiveCategories(value: js.Array[Double]): Self = this.set("detectedSensitiveCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedSensitiveCategories: Self = this.set("detectedSensitiveCategories", js.undefined)
    @scala.inline
    def setFilteringStats(value: SchemaFilteringStats): Self = this.set("filteringStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteringStats: Self = this.set("filteringStats", js.undefined)
    @scala.inline
    def setHtml(value: SchemaHtmlContent): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setImpressionTrackingUrlsVarargs(value: String*): Self = this.set("impressionTrackingUrls", js.Array(value :_*))
    @scala.inline
    def setImpressionTrackingUrls(value: js.Array[String]): Self = this.set("impressionTrackingUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionTrackingUrls: Self = this.set("impressionTrackingUrls", js.undefined)
    @scala.inline
    def setNative(value: SchemaNativeContent): Self = this.set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    @scala.inline
    def setOpenAuctionStatus(value: String): Self = this.set("openAuctionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenAuctionStatus: Self = this.set("openAuctionStatus", js.undefined)
    @scala.inline
    def setRestrictedCategoriesVarargs(value: String*): Self = this.set("restrictedCategories", js.Array(value :_*))
    @scala.inline
    def setRestrictedCategories(value: js.Array[String]): Self = this.set("restrictedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictedCategories: Self = this.set("restrictedCategories", js.undefined)
    @scala.inline
    def setServingRestrictionsVarargs(value: SchemaServingRestriction*): Self = this.set("servingRestrictions", js.Array(value :_*))
    @scala.inline
    def setServingRestrictions(value: js.Array[SchemaServingRestriction]): Self = this.set("servingRestrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServingRestrictions: Self = this.set("servingRestrictions", js.undefined)
    @scala.inline
    def setVendorIdsVarargs(value: Double*): Self = this.set("vendorIds", js.Array(value :_*))
    @scala.inline
    def setVendorIds(value: js.Array[Double]): Self = this.set("vendorIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVendorIds: Self = this.set("vendorIds", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVideo(value: SchemaVideoContent): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
  
}

