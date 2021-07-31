package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Creative extends StObject {
  
  /** The account that this creative belongs to. Can be used to filter the response of the creatives.list method. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The link to AdChoices destination page. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.undefined
  
  /** Output only. The detected ad technology providers. */
  var adTechnologyProviders: js.UndefOr[AdTechnologyProviders] = js.undefined
  
  /** The name of the company being advertised in the creative. */
  var advertiserName: js.UndefOr[String] = js.undefined
  
  /** The agency ID for this creative. */
  var agencyId: js.UndefOr[String] = js.undefined
  
  /** Output only. The last update timestamp of the creative via API. */
  var apiUpdateTime: js.UndefOr[String] = js.undefined
  
  /** All attributes for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The set of destination URLs for the creative. */
  var clickThroughUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Shows any corrections that were applied to this creative. */
  var corrections: js.UndefOr[js.Array[Correction]] = js.undefined
  
  /** The buyer-defined creative ID of this creative. Can be used to filter the response of the creatives.list method. */
  var creativeId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The top-level deals status of this creative. If disapproved, an entry for 'auctionType=DIRECT_DEALS' (or 'ALL') in serving_restrictions will also exist. Note that this
    * may be nuanced with other contextual restrictions, in which case, it may be preferable to read from serving_restrictions directly. Can be used to filter the response of the
    * creatives.list method.
    */
  var dealsStatus: js.UndefOr[String] = js.undefined
  
  /** The set of declared destination URLs for the creative. */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Detected advertiser IDs, if any. */
  var detectedAdvertiserIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. The detected domains for this creative. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The detected languages for this creative. The order is arbitrary. The codes are 2 or 5 characters and are documented at
    * https://developers.google.com/adwords/api/docs/appendix/languagecodes.
    */
  var detectedLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Output only. Detected product categories, if any. See the ad-product-categories.txt file in the technical documentation for a list of IDs. */
  var detectedProductCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Output only. Detected sensitive categories, if any. See the ad-sensitive-categories.txt file in the technical documentation for a list of IDs. You should use these IDs along with
    * the excluded-sensitive-category field in the bid request to filter your bids.
    */
  var detectedSensitiveCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** An HTML creative. */
  var html: js.UndefOr[HtmlContent] = js.undefined
  
  /** The set of URLs to be called to record an impression. */
  var impressionTrackingUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A native creative. */
  var native: js.UndefOr[NativeContent] = js.undefined
  
  /**
    * Output only. The top-level open auction status of this creative. If disapproved, an entry for 'auctionType = OPEN_AUCTION' (or 'ALL') in serving_restrictions will also exist. Note
    * that this may be nuanced with other contextual restrictions, in which case, it may be preferable to read from serving_restrictions directly. Can be used to filter the response of
    * the creatives.list method.
    */
  var openAuctionStatus: js.UndefOr[String] = js.undefined
  
  /** All restricted categories for the ads that may be shown from this creative. */
  var restrictedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Output only. The granular status of this ad in specific contexts. A context here relates to where something ultimately serves (for example, a physical location, a platform, an HTTPS
    * vs HTTP request, or the type of auction).
    */
  var servingRestrictions: js.UndefOr[js.Array[ServingRestriction]] = js.undefined
  
  /** All vendor IDs for the ads that may be shown from this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. */
  var vendorIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Output only. The version of this creative. */
  var version: js.UndefOr[Double] = js.undefined
  
  /** A video creative. */
  var video: js.UndefOr[VideoContent] = js.undefined
}
object Creative {
  
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  
  @scala.inline
  implicit class CreativeMutableBuilder[Self <: Creative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAdChoicesDestinationUrl(value: String): Self = StObject.set(x, "adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdChoicesDestinationUrlUndefined: Self = StObject.set(x, "adChoicesDestinationUrl", js.undefined)
    
    @scala.inline
    def setAdTechnologyProviders(value: AdTechnologyProviders): Self = StObject.set(x, "adTechnologyProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdTechnologyProvidersUndefined: Self = StObject.set(x, "adTechnologyProviders", js.undefined)
    
    @scala.inline
    def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    @scala.inline
    def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    @scala.inline
    def setApiUpdateTime(value: String): Self = StObject.set(x, "apiUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUpdateTimeUndefined: Self = StObject.set(x, "apiUpdateTime", js.undefined)
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setClickThroughUrls(value: js.Array[String]): Self = StObject.set(x, "clickThroughUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickThroughUrlsUndefined: Self = StObject.set(x, "clickThroughUrls", js.undefined)
    
    @scala.inline
    def setClickThroughUrlsVarargs(value: String*): Self = StObject.set(x, "clickThroughUrls", js.Array(value :_*))
    
    @scala.inline
    def setCorrections(value: js.Array[Correction]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
    
    @scala.inline
    def setCorrectionsVarargs(value: Correction*): Self = StObject.set(x, "corrections", js.Array(value :_*))
    
    @scala.inline
    def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    @scala.inline
    def setDealsStatus(value: String): Self = StObject.set(x, "dealsStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDealsStatusUndefined: Self = StObject.set(x, "dealsStatus", js.undefined)
    
    @scala.inline
    def setDeclaredClickThroughUrls(value: js.Array[String]): Self = StObject.set(x, "declaredClickThroughUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredClickThroughUrlsUndefined: Self = StObject.set(x, "declaredClickThroughUrls", js.undefined)
    
    @scala.inline
    def setDeclaredClickThroughUrlsVarargs(value: String*): Self = StObject.set(x, "declaredClickThroughUrls", js.Array(value :_*))
    
    @scala.inline
    def setDetectedAdvertiserIds(value: js.Array[String]): Self = StObject.set(x, "detectedAdvertiserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedAdvertiserIdsUndefined: Self = StObject.set(x, "detectedAdvertiserIds", js.undefined)
    
    @scala.inline
    def setDetectedAdvertiserIdsVarargs(value: String*): Self = StObject.set(x, "detectedAdvertiserIds", js.Array(value :_*))
    
    @scala.inline
    def setDetectedDomains(value: js.Array[String]): Self = StObject.set(x, "detectedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedDomainsUndefined: Self = StObject.set(x, "detectedDomains", js.undefined)
    
    @scala.inline
    def setDetectedDomainsVarargs(value: String*): Self = StObject.set(x, "detectedDomains", js.Array(value :_*))
    
    @scala.inline
    def setDetectedLanguages(value: js.Array[String]): Self = StObject.set(x, "detectedLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedLanguagesUndefined: Self = StObject.set(x, "detectedLanguages", js.undefined)
    
    @scala.inline
    def setDetectedLanguagesVarargs(value: String*): Self = StObject.set(x, "detectedLanguages", js.Array(value :_*))
    
    @scala.inline
    def setDetectedProductCategories(value: js.Array[Double]): Self = StObject.set(x, "detectedProductCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedProductCategoriesUndefined: Self = StObject.set(x, "detectedProductCategories", js.undefined)
    
    @scala.inline
    def setDetectedProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "detectedProductCategories", js.Array(value :_*))
    
    @scala.inline
    def setDetectedSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "detectedSensitiveCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedSensitiveCategoriesUndefined: Self = StObject.set(x, "detectedSensitiveCategories", js.undefined)
    
    @scala.inline
    def setDetectedSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "detectedSensitiveCategories", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: HtmlContent): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrls(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionTrackingUrlsUndefined: Self = StObject.set(x, "impressionTrackingUrls", js.undefined)
    
    @scala.inline
    def setImpressionTrackingUrlsVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrls", js.Array(value :_*))
    
    @scala.inline
    def setNative(value: NativeContent): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    @scala.inline
    def setOpenAuctionStatus(value: String): Self = StObject.set(x, "openAuctionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAuctionStatusUndefined: Self = StObject.set(x, "openAuctionStatus", js.undefined)
    
    @scala.inline
    def setRestrictedCategories(value: js.Array[String]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    @scala.inline
    def setRestrictedCategoriesVarargs(value: String*): Self = StObject.set(x, "restrictedCategories", js.Array(value :_*))
    
    @scala.inline
    def setServingRestrictions(value: js.Array[ServingRestriction]): Self = StObject.set(x, "servingRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServingRestrictionsUndefined: Self = StObject.set(x, "servingRestrictions", js.undefined)
    
    @scala.inline
    def setServingRestrictionsVarargs(value: ServingRestriction*): Self = StObject.set(x, "servingRestrictions", js.Array(value :_*))
    
    @scala.inline
    def setVendorIds(value: js.Array[Double]): Self = StObject.set(x, "vendorIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVendorIdsUndefined: Self = StObject.set(x, "vendorIds", js.undefined)
    
    @scala.inline
    def setVendorIdsVarargs(value: Double*): Self = StObject.set(x, "vendorIds", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVideo(value: VideoContent): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
