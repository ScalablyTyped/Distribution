package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import typings.maximMazurokGapiClientAdexchangebuyer.anon.Advertiser
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Contexts
import typings.maximMazurokGapiClientAdexchangebuyer.anon.Date
import typings.maximMazurokGapiClientAdexchangebuyer.anon.DetectedProviderIds
import typings.maximMazurokGapiClientAdexchangebuyer.anon.DisapprovalReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Creative extends StObject {
  
  /** The HTML snippet that displays the ad when inserted in the web page. If set, videoURL, videoVastXML, and nativeAd should not be set. */
  var HTMLSnippet: js.UndefOr[String] = js.undefined
  
  /** Account id. */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /** The link to the Ad Preferences page. This is only supported for native ads. */
  var adChoicesDestinationUrl: js.UndefOr[String] = js.undefined
  
  var adTechnologyProviders: js.UndefOr[DetectedProviderIds] = js.undefined
  
  /** Detected advertiser id, if any. Read-only. This field should not be set in requests. */
  var advertiserId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The name of the company being advertised in the creative. A list of advertisers is provided in the advertisers.txt file. */
  var advertiserName: js.UndefOr[String] = js.undefined
  
  /** The agency id for this creative. */
  var agencyId: js.UndefOr[String] = js.undefined
  
  /**
    * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for uploads. (formatted RFC 3339
    * timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * List of buyer selectable attributes for the ads that may be shown from this snippet. Each attribute is represented by an integer as defined in
    * buyer-declarable-creative-attributes.txt.
    */
  var attribute: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** A buyer-specific id identifying the creative in this ad. */
  var buyerCreativeId: js.UndefOr[String] = js.undefined
  
  /** The set of destination urls for the snippet. */
  var clickThroughUrl: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests. */
  var corrections: js.UndefOr[js.Array[Contexts]] = js.undefined
  
  /**
    * Creative status identity type that the creative item applies to. Ad Exchange real-time bidding is migrating to the sizeless creative verification. Originally, Ad Exchange assigned
    * creative verification status to a unique combination of a buyer creative ID and creative dimensions. Post-migration, a single verification status will be assigned at the buyer
    * creative ID level. This field allows to distinguish whether a given creative status applies to a unique combination of a buyer creative ID and creative dimensions, or to a buyer
    * creative ID as a whole.
    */
  var creativeStatusIdentityType: js.UndefOr[String] = js.undefined
  
  /**
    * Top-level deals status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=DIRECT_DEALS (or ALL) in servingRestrictions will also exist.
    * Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from servingRestrictions directly.
    */
  var dealsStatus: js.UndefOr[String] = js.undefined
  
  /** Detected domains for this creative. Read-only. This field should not be set in requests. */
  var detectedDomains: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The filtering reasons for the creative. Read-only. This field should not be set in requests. */
  var filteringReasons: js.UndefOr[Date] = js.undefined
  
  /** Ad height. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** The set of urls to be called to record an impression. */
  var impressionTrackingUrl: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Detected languages for this creative. Read-only. This field should not be set in requests. */
  var languages: js.UndefOr[js.Array[String]] = js.undefined
  
  /** If nativeAd is set, HTMLSnippet, videoVastXML, and the videoURL outside of nativeAd should not be set. (The videoURL inside nativeAd can be set.) */
  var nativeAd: js.UndefOr[Advertiser] = js.undefined
  
  /**
    * Top-level open auction status. Read-only. This field should not be set in requests. If disapproved, an entry for auctionType=OPEN_AUCTION (or ALL) in servingRestrictions will also
    * exist. Note that this may be nuanced with other contextual restrictions, in which case it may be preferable to read from ServingRestrictions directly.
    */
  var openAuctionStatus: js.UndefOr[String] = js.undefined
  
  /** Detected product categories, if any. Each category is represented by an integer as defined in  ad-product-categories.txt. Read-only. This field should not be set in requests. */
  var productCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** All restricted categories for the ads that may be shown from this snippet. Each category is represented by an integer as defined in the  ad-restricted-categories.txt. */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** Detected sensitive categories, if any. Each category is represented by an integer as defined in  ad-sensitive-categories.txt. Read-only. This field should not be set in requests. */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The granular status of this ad in specific contexts. A context here relates to where something ultimately serves (for example, a physical location, a platform, an HTTPS vs HTTP
    * request, or the type of auction). Read-only. This field should not be set in requests. See the examples in the Creatives guide for more details.
    */
  var servingRestrictions: js.UndefOr[js.Array[DisapprovalReasons]] = js.undefined
  
  /** List of vendor types for the ads that may be shown from this snippet. Each vendor type is represented by an integer as defined in vendors.txt. */
  var vendorType: js.UndefOr[js.Array[Double]] = js.undefined
  
  /** The version for this creative. Read-only. This field should not be set in requests. */
  var version: js.UndefOr[Double] = js.undefined
  
  /** The URL to fetch a video ad. If set, HTMLSnippet, videoVastXML, and nativeAd should not be set. Note, this is different from resource.native_ad.video_url above. */
  var videoURL: js.UndefOr[String] = js.undefined
  
  /** The contents of a VAST document for a video ad. This document should conform to the VAST 2.0 or 3.0 standard. If set, HTMLSnippet, videoURL, and nativeAd and should not be set. */
  var videoVastXML: js.UndefOr[String] = js.undefined
  
  /** Ad width. */
  var width: js.UndefOr[Double] = js.undefined
}
object Creative {
  
  inline def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  
  extension [Self <: Creative](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdChoicesDestinationUrl(value: String): Self = StObject.set(x, "adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    inline def setAdChoicesDestinationUrlUndefined: Self = StObject.set(x, "adChoicesDestinationUrl", js.undefined)
    
    inline def setAdTechnologyProviders(value: DetectedProviderIds): Self = StObject.set(x, "adTechnologyProviders", value.asInstanceOf[js.Any])
    
    inline def setAdTechnologyProvidersUndefined: Self = StObject.set(x, "adTechnologyProviders", js.undefined)
    
    inline def setAdvertiserId(value: js.Array[String]): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAdvertiserIdVarargs(value: String*): Self = StObject.set(x, "advertiserId", js.Array(value :_*))
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setApiUploadTimestamp(value: String): Self = StObject.set(x, "apiUploadTimestamp", value.asInstanceOf[js.Any])
    
    inline def setApiUploadTimestampUndefined: Self = StObject.set(x, "apiUploadTimestamp", js.undefined)
    
    inline def setAttribute(value: js.Array[Double]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributeVarargs(value: Double*): Self = StObject.set(x, "attribute", js.Array(value :_*))
    
    inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    inline def setClickThroughUrl(value: js.Array[String]): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setClickThroughUrlVarargs(value: String*): Self = StObject.set(x, "clickThroughUrl", js.Array(value :_*))
    
    inline def setCorrections(value: js.Array[Contexts]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
    
    inline def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
    
    inline def setCorrectionsVarargs(value: Contexts*): Self = StObject.set(x, "corrections", js.Array(value :_*))
    
    inline def setCreativeStatusIdentityType(value: String): Self = StObject.set(x, "creativeStatusIdentityType", value.asInstanceOf[js.Any])
    
    inline def setCreativeStatusIdentityTypeUndefined: Self = StObject.set(x, "creativeStatusIdentityType", js.undefined)
    
    inline def setDealsStatus(value: String): Self = StObject.set(x, "dealsStatus", value.asInstanceOf[js.Any])
    
    inline def setDealsStatusUndefined: Self = StObject.set(x, "dealsStatus", js.undefined)
    
    inline def setDetectedDomains(value: js.Array[String]): Self = StObject.set(x, "detectedDomains", value.asInstanceOf[js.Any])
    
    inline def setDetectedDomainsUndefined: Self = StObject.set(x, "detectedDomains", js.undefined)
    
    inline def setDetectedDomainsVarargs(value: String*): Self = StObject.set(x, "detectedDomains", js.Array(value :_*))
    
    inline def setFilteringReasons(value: Date): Self = StObject.set(x, "filteringReasons", value.asInstanceOf[js.Any])
    
    inline def setFilteringReasonsUndefined: Self = StObject.set(x, "filteringReasons", js.undefined)
    
    inline def setHTMLSnippet(value: String): Self = StObject.set(x, "HTMLSnippet", value.asInstanceOf[js.Any])
    
    inline def setHTMLSnippetUndefined: Self = StObject.set(x, "HTMLSnippet", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
    
    inline def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "languages", js.undefined)
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    inline def setNativeAd(value: Advertiser): Self = StObject.set(x, "nativeAd", value.asInstanceOf[js.Any])
    
    inline def setNativeAdUndefined: Self = StObject.set(x, "nativeAd", js.undefined)
    
    inline def setOpenAuctionStatus(value: String): Self = StObject.set(x, "openAuctionStatus", value.asInstanceOf[js.Any])
    
    inline def setOpenAuctionStatusUndefined: Self = StObject.set(x, "openAuctionStatus", js.undefined)
    
    inline def setProductCategories(value: js.Array[Double]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
    
    inline def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
    
    inline def setProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "productCategories", js.Array(value :_*))
    
    inline def setRestrictedCategories(value: js.Array[Double]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    inline def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    inline def setRestrictedCategoriesVarargs(value: Double*): Self = StObject.set(x, "restrictedCategories", js.Array(value :_*))
    
    inline def setSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "sensitiveCategories", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoriesUndefined: Self = StObject.set(x, "sensitiveCategories", js.undefined)
    
    inline def setSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "sensitiveCategories", js.Array(value :_*))
    
    inline def setServingRestrictions(value: js.Array[DisapprovalReasons]): Self = StObject.set(x, "servingRestrictions", value.asInstanceOf[js.Any])
    
    inline def setServingRestrictionsUndefined: Self = StObject.set(x, "servingRestrictions", js.undefined)
    
    inline def setServingRestrictionsVarargs(value: DisapprovalReasons*): Self = StObject.set(x, "servingRestrictions", js.Array(value :_*))
    
    inline def setVendorType(value: js.Array[Double]): Self = StObject.set(x, "vendorType", value.asInstanceOf[js.Any])
    
    inline def setVendorTypeUndefined: Self = StObject.set(x, "vendorType", js.undefined)
    
    inline def setVendorTypeVarargs(value: Double*): Self = StObject.set(x, "vendorType", js.Array(value :_*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
    
    inline def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
    
    inline def setVideoVastXML(value: String): Self = StObject.set(x, "videoVastXML", value.asInstanceOf[js.Any])
    
    inline def setVideoVastXMLUndefined: Self = StObject.set(x, "videoVastXML", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
