package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.Advertiser
import typings.googleapis.anon.Date
import typings.googleapis.anon.Details
import typings.googleapis.anon.DetectedProviderIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreative extends StObject {
  
  /**
    * The HTML snippet that displays the ad when inserted in the web page. If set, videoURL should not be set.
    */
  var HTMLSnippet: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double | Null] = js.undefined
  
  var adTechnologyProviders: js.UndefOr[DetectedProviderIds | Null] = js.undefined
  
  /**
    * Detected advertiser id, if any. Read-only. This field should not be set in requests.
    */
  var advertiserId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The name of the company being advertised in the creative.
    */
  var advertiserName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The agency id for this creative.
    */
  var agencyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last upload timestamp of this creative if it was uploaded via API. Read-only. The value of this field is generated, and will be ignored for uploads. (formatted RFC 3339 timestamp).
    */
  var apiUploadTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All attributes for the ads that may be shown from this snippet.
    */
  var attribute: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * A buyer-specific id identifying the creative in this ad.
    */
  var buyerCreativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The set of destination urls for the snippet.
    */
  var clickThroughUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Shows any corrections that were applied to this creative. Read-only. This field should not be set in requests.
    */
  var corrections: js.UndefOr[js.Array[Details] | Null] = js.undefined
  
  /**
    * The reasons for disapproval, if any. Note that not all disapproval reasons may be categorized, so it is possible for the creative to have a status of DISAPPROVED with an empty list for disapproval_reasons. In this case, please reach out to your TAM to help debug the issue. Read-only. This field should not be set in requests.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details] | Null] = js.undefined
  
  /**
    * The filtering reasons for the creative. Read-only. This field should not be set in requests.
    */
  var filteringReasons: js.UndefOr[Date | Null] = js.undefined
  
  /**
    * Ad height.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The set of urls to be called to record an impression.
    */
  var impressionTrackingUrl: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If nativeAd is set, HTMLSnippet and videoURL should not be set.
    */
  var nativeAd: js.UndefOr[Advertiser | Null] = js.undefined
  
  /**
    * Detected product categories, if any. Read-only. This field should not be set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * All restricted categories for the ads that may be shown from this snippet.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Detected sensitive categories, if any. Read-only. This field should not be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Creative serving status. Read-only. This field should not be set in requests.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All vendor types for the ads that may be shown from this snippet.
    */
  var vendorType: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The version for this creative. Read-only. This field should not be set in requests.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should not be set.
    */
  var videoURL: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ad width.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCreative {
  
  inline def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  
  extension [Self <: SchemaCreative](x: Self) {
    
    inline def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdTechnologyProviders(value: DetectedProviderIds): Self = StObject.set(x, "adTechnologyProviders", value.asInstanceOf[js.Any])
    
    inline def setAdTechnologyProvidersNull: Self = StObject.set(x, "adTechnologyProviders", null)
    
    inline def setAdTechnologyProvidersUndefined: Self = StObject.set(x, "adTechnologyProviders", js.undefined)
    
    inline def setAdvertiserId(value: js.Array[String]): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAdvertiserIdVarargs(value: String*): Self = StObject.set(x, "advertiserId", js.Array(value*))
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameNull: Self = StObject.set(x, "advertiserName", null)
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdNull: Self = StObject.set(x, "agencyId", null)
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setApiUploadTimestamp(value: String): Self = StObject.set(x, "apiUploadTimestamp", value.asInstanceOf[js.Any])
    
    inline def setApiUploadTimestampNull: Self = StObject.set(x, "apiUploadTimestamp", null)
    
    inline def setApiUploadTimestampUndefined: Self = StObject.set(x, "apiUploadTimestamp", js.undefined)
    
    inline def setAttribute(value: js.Array[Double]): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeNull: Self = StObject.set(x, "attribute", null)
    
    inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
    
    inline def setAttributeVarargs(value: Double*): Self = StObject.set(x, "attribute", js.Array(value*))
    
    inline def setBuyerCreativeId(value: String): Self = StObject.set(x, "buyerCreativeId", value.asInstanceOf[js.Any])
    
    inline def setBuyerCreativeIdNull: Self = StObject.set(x, "buyerCreativeId", null)
    
    inline def setBuyerCreativeIdUndefined: Self = StObject.set(x, "buyerCreativeId", js.undefined)
    
    inline def setClickThroughUrl(value: js.Array[String]): Self = StObject.set(x, "clickThroughUrl", value.asInstanceOf[js.Any])
    
    inline def setClickThroughUrlNull: Self = StObject.set(x, "clickThroughUrl", null)
    
    inline def setClickThroughUrlUndefined: Self = StObject.set(x, "clickThroughUrl", js.undefined)
    
    inline def setClickThroughUrlVarargs(value: String*): Self = StObject.set(x, "clickThroughUrl", js.Array(value*))
    
    inline def setCorrections(value: js.Array[Details]): Self = StObject.set(x, "corrections", value.asInstanceOf[js.Any])
    
    inline def setCorrectionsNull: Self = StObject.set(x, "corrections", null)
    
    inline def setCorrectionsUndefined: Self = StObject.set(x, "corrections", js.undefined)
    
    inline def setCorrectionsVarargs(value: Details*): Self = StObject.set(x, "corrections", js.Array(value*))
    
    inline def setDisapprovalReasons(value: js.Array[Details]): Self = StObject.set(x, "disapprovalReasons", value.asInstanceOf[js.Any])
    
    inline def setDisapprovalReasonsNull: Self = StObject.set(x, "disapprovalReasons", null)
    
    inline def setDisapprovalReasonsUndefined: Self = StObject.set(x, "disapprovalReasons", js.undefined)
    
    inline def setDisapprovalReasonsVarargs(value: Details*): Self = StObject.set(x, "disapprovalReasons", js.Array(value*))
    
    inline def setFilteringReasons(value: Date): Self = StObject.set(x, "filteringReasons", value.asInstanceOf[js.Any])
    
    inline def setFilteringReasonsNull: Self = StObject.set(x, "filteringReasons", null)
    
    inline def setFilteringReasonsUndefined: Self = StObject.set(x, "filteringReasons", js.undefined)
    
    inline def setHTMLSnippet(value: String): Self = StObject.set(x, "HTMLSnippet", value.asInstanceOf[js.Any])
    
    inline def setHTMLSnippetNull: Self = StObject.set(x, "HTMLSnippet", null)
    
    inline def setHTMLSnippetUndefined: Self = StObject.set(x, "HTMLSnippet", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImpressionTrackingUrl(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrl", value.asInstanceOf[js.Any])
    
    inline def setImpressionTrackingUrlNull: Self = StObject.set(x, "impressionTrackingUrl", null)
    
    inline def setImpressionTrackingUrlUndefined: Self = StObject.set(x, "impressionTrackingUrl", js.undefined)
    
    inline def setImpressionTrackingUrlVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrl", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNativeAd(value: Advertiser): Self = StObject.set(x, "nativeAd", value.asInstanceOf[js.Any])
    
    inline def setNativeAdNull: Self = StObject.set(x, "nativeAd", null)
    
    inline def setNativeAdUndefined: Self = StObject.set(x, "nativeAd", js.undefined)
    
    inline def setProductCategories(value: js.Array[Double]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
    
    inline def setProductCategoriesNull: Self = StObject.set(x, "productCategories", null)
    
    inline def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
    
    inline def setProductCategoriesVarargs(value: Double*): Self = StObject.set(x, "productCategories", js.Array(value*))
    
    inline def setRestrictedCategories(value: js.Array[Double]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    inline def setRestrictedCategoriesNull: Self = StObject.set(x, "restrictedCategories", null)
    
    inline def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    inline def setRestrictedCategoriesVarargs(value: Double*): Self = StObject.set(x, "restrictedCategories", js.Array(value*))
    
    inline def setSensitiveCategories(value: js.Array[Double]): Self = StObject.set(x, "sensitiveCategories", value.asInstanceOf[js.Any])
    
    inline def setSensitiveCategoriesNull: Self = StObject.set(x, "sensitiveCategories", null)
    
    inline def setSensitiveCategoriesUndefined: Self = StObject.set(x, "sensitiveCategories", js.undefined)
    
    inline def setSensitiveCategoriesVarargs(value: Double*): Self = StObject.set(x, "sensitiveCategories", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVendorType(value: js.Array[Double]): Self = StObject.set(x, "vendorType", value.asInstanceOf[js.Any])
    
    inline def setVendorTypeNull: Self = StObject.set(x, "vendorType", null)
    
    inline def setVendorTypeUndefined: Self = StObject.set(x, "vendorType", js.undefined)
    
    inline def setVendorTypeVarargs(value: Double*): Self = StObject.set(x, "vendorType", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVideoURL(value: String): Self = StObject.set(x, "videoURL", value.asInstanceOf[js.Any])
    
    inline def setVideoURLNull: Self = StObject.set(x, "videoURL", null)
    
    inline def setVideoURLUndefined: Self = StObject.set(x, "videoURL", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
