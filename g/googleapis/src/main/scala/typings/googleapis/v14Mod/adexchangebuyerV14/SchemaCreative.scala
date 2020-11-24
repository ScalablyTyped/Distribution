package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleapis.anon.AppIcon
import typings.googleapis.anon.Contexts
import typings.googleapis.anon.Date
import typings.googleapis.anon.DisapprovalReasons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A creative and its classification data.
  */
@js.native
trait SchemaCreative extends js.Object {
  
  /**
    * The HTML snippet that displays the ad when inserted in the web page. If
    * set, videoURL, videoVastXML, and nativeAd should not be set.
    */
  var HTMLSnippet: js.UndefOr[String] = js.native
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  
  /**
    * The link to the Ad Preferences page. This is only supported for native
    * ads.
    */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.native
  
  /**
    * Detected advertiser id, if any. Read-only. This field should not be set
    * in requests.
    */
  var advertiserId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the company being advertised in the creative. The value
    * provided must exist in the advertisers.txt file.
    */
  var advertiserName: js.UndefOr[String] = js.native
  
  /**
    * The agency id for this creative.
    */
  var agencyId: js.UndefOr[String] = js.native
  
  /**
    * The last upload timestamp of this creative if it was uploaded via API.
    * Read-only. The value of this field is generated, and will be ignored for
    * uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.native
  
  /**
    * List of buyer selectable attributes for the ads that may be shown from
    * this snippet. Each attribute is represented by an integer as defined in
    * buyer-declarable-creative-attributes.txt.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * A buyer-specific id identifying the creative in this ad.
    */
  var buyerCreativeId: js.UndefOr[String] = js.native
  
  /**
    * The set of destination urls for the snippet.
    */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Shows any corrections that were applied to this creative. Read-only. This
    * field should not be set in requests.
    */
  var corrections: js.UndefOr[js.Array[Contexts]] = js.native
  
  /**
    * Creative status identity type that the creative item applies to. Ad
    * Exchange real-time bidding is migrating to the sizeless creative
    * verification. Originally, Ad Exchange assigned creative verification
    * status to a unique combination of a buyer creative ID and creative
    * dimensions. Post-migration, a single verification status will be assigned
    * at the buyer creative ID level. This field allows to distinguish whether
    * a given creative status applies to a unique combination of a buyer
    * creative ID and creative dimensions, or to a buyer creative ID as a
    * whole.
    */
  var creativeStatusIdentityType: js.UndefOr[String] = js.native
  
  /**
    * Top-level deals status. Read-only. This field should not be set in
    * requests. If disapproved, an entry for auctionType=DIRECT_DEALS (or ALL)
    * in servingRestrictions will also exist. Note that this may be nuanced
    * with other contextual restrictions, in which case it may be preferable to
    * read from servingRestrictions directly.
    */
  var dealsStatus: js.UndefOr[String] = js.native
  
  /**
    * Detected domains for this creative. Read-only. This field should not be
    * set in requests.
    */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The filtering reasons for the creative. Read-only. This field should not
    * be set in requests.
    */
  var filteringReasons: js.UndefOr[Date] = js.native
  
  /**
    * Ad height.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * The set of urls to be called to record an impression.
    */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Detected languages for this creative. Read-only. This field should not be
    * set in requests.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If nativeAd is set, HTMLSnippet, videoVastXML, and the videoURL outside
    * of nativeAd should not be set. (The videoURL inside nativeAd can be set.)
    */
  var nativeAd: js.UndefOr[AppIcon] = js.native
  
  /**
    * Top-level open auction status. Read-only. This field should not be set in
    * requests. If disapproved, an entry for auctionType=OPEN_AUCTION (or ALL)
    * in servingRestrictions will also exist. Note that this may be nuanced
    * with other contextual restrictions, in which case it may be preferable to
    * read from ServingRestrictions directly.
    */
  var openAuctionStatus: js.UndefOr[String] = js.native
  
  /**
    * Detected product categories, if any. Each category is represented by an
    * integer as defined in  ad-product-categories.txt. Read-only. This field
    * should not be set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * All restricted categories for the ads that may be shown from this
    * snippet. Each category is represented by an integer as defined in the
    * ad-restricted-categories.txt.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Detected sensitive categories, if any. Each category is represented by an
    * integer as defined in  ad-sensitive-categories.txt. Read-only. This field
    * should not be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The granular status of this ad in specific contexts. A context here
    * relates to where something ultimately serves (for example, a physical
    * location, a platform, an HTTPS vs HTTP request, or the type of auction).
    * Read-only. This field should not be set in requests. See the examples in
    * the Creatives guide for more details.
    */
  var servingRestrictions: js.UndefOr[js.Array[DisapprovalReasons]] = js.native
  
  /**
    * List of vendor types for the ads that may be shown from this snippet.
    * Each vendor type is represented by an integer as defined in vendors.txt.
    */
  var vendorType: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The version for this creative. Read-only. This field should not be set in
    * requests.
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * The URL to fetch a video ad. If set, HTMLSnippet, videoVastXML, and
    * nativeAd should not be set. Note, this is different from
    * resource.native_ad.video_url above.
    */
  var videoURL: js.UndefOr[String] = js.native
  
  /**
    * The contents of a VAST document for a video ad. This document should
    * conform to the VAST 2.0 or 3.0 standard. If set, HTMLSnippet, videoURL,
    * and nativeAd and should not be set.
    */
  var videoVastXML: js.UndefOr[String] = js.native
  
  /**
    * Ad width.
    */
  var width: js.UndefOr[Double] = js.native
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
    def setHTMLSnippet(value: String): Self = this.set("HTMLSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHTMLSnippet: Self = this.set("HTMLSnippet", js.undefined)
    
    @scala.inline
    def setAccountId(value: Double): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAdChoicesDestinationUrl(value: String): Self = this.set("adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdChoicesDestinationUrl: Self = this.set("adChoicesDestinationUrl", js.undefined)
    
    @scala.inline
    def setAdvertiserIdVarargs(value: String*): Self = this.set("advertiserId", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserId(value: js.Array[String]): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAdvertiserName(value: String): Self = this.set("advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserName: Self = this.set("advertiserName", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = this.set("agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgencyId: Self = this.set("agencyId", js.undefined)
    
    @scala.inline
    def setApiUploadTimestamp(value: String): Self = this.set("apiUploadTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiUploadTimestamp: Self = this.set("apiUploadTimestamp", js.undefined)
    
    @scala.inline
    def setAttributeVarargs(value: Double*): Self = this.set("attribute", js.Array(value :_*))
    
    @scala.inline
    def setAttribute(value: js.Array[Double]): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setBuyerCreativeId(value: String): Self = this.set("buyerCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuyerCreativeId: Self = this.set("buyerCreativeId", js.undefined)
    
    @scala.inline
    def setClickThroughUrlVarargs(value: String*): Self = this.set("clickThroughUrl", js.Array(value :_*))
    
    @scala.inline
    def setClickThroughUrl(value: js.Array[String]): Self = this.set("clickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrl: Self = this.set("clickThroughUrl", js.undefined)
    
    @scala.inline
    def setCorrectionsVarargs(value: Contexts*): Self = this.set("corrections", js.Array(value :_*))
    
    @scala.inline
    def setCorrections(value: js.Array[Contexts]): Self = this.set("corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrections: Self = this.set("corrections", js.undefined)
    
    @scala.inline
    def setCreativeStatusIdentityType(value: String): Self = this.set("creativeStatusIdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeStatusIdentityType: Self = this.set("creativeStatusIdentityType", js.undefined)
    
    @scala.inline
    def setDealsStatus(value: String): Self = this.set("dealsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDealsStatus: Self = this.set("dealsStatus", js.undefined)
    
    @scala.inline
    def setDetectedDomainsVarargs(value: String*): Self = this.set("detectedDomains", js.Array(value :_*))
    
    @scala.inline
    def setDetectedDomains(value: js.Array[String]): Self = this.set("detectedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectedDomains: Self = this.set("detectedDomains", js.undefined)
    
    @scala.inline
    def setFilteringReasons(value: Date): Self = this.set("filteringReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteringReasons: Self = this.set("filteringReasons", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlVarargs(value: String*): Self = this.set("impressionTrackingUrl", js.Array(value :_*))
    
    @scala.inline
    def setImpressionTrackingUrl(value: js.Array[String]): Self = this.set("impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionTrackingUrl: Self = this.set("impressionTrackingUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    
    @scala.inline
    def setNativeAd(value: AppIcon): Self = this.set("nativeAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeAd: Self = this.set("nativeAd", js.undefined)
    
    @scala.inline
    def setOpenAuctionStatus(value: String): Self = this.set("openAuctionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenAuctionStatus: Self = this.set("openAuctionStatus", js.undefined)
    
    @scala.inline
    def setProductCategoriesVarargs(value: Double*): Self = this.set("productCategories", js.Array(value :_*))
    
    @scala.inline
    def setProductCategories(value: js.Array[Double]): Self = this.set("productCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCategories: Self = this.set("productCategories", js.undefined)
    
    @scala.inline
    def setRestrictedCategoriesVarargs(value: Double*): Self = this.set("restrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setRestrictedCategories(value: js.Array[Double]): Self = this.set("restrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedCategories: Self = this.set("restrictedCategories", js.undefined)
    
    @scala.inline
    def setSensitiveCategoriesVarargs(value: Double*): Self = this.set("sensitiveCategories", js.Array(value :_*))
    
    @scala.inline
    def setSensitiveCategories(value: js.Array[Double]): Self = this.set("sensitiveCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSensitiveCategories: Self = this.set("sensitiveCategories", js.undefined)
    
    @scala.inline
    def setServingRestrictionsVarargs(value: DisapprovalReasons*): Self = this.set("servingRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setServingRestrictions(value: js.Array[DisapprovalReasons]): Self = this.set("servingRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServingRestrictions: Self = this.set("servingRestrictions", js.undefined)
    
    @scala.inline
    def setVendorTypeVarargs(value: Double*): Self = this.set("vendorType", js.Array(value :_*))
    
    @scala.inline
    def setVendorType(value: js.Array[Double]): Self = this.set("vendorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorType: Self = this.set("vendorType", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVideoURL(value: String): Self = this.set("videoURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoURL: Self = this.set("videoURL", js.undefined)
    
    @scala.inline
    def setVideoVastXML(value: String): Self = this.set("videoVastXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoVastXML: Self = this.set("videoVastXML", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
