package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleapis.anon.Advertiser
import typings.googleapis.anon.Date
import typings.googleapis.anon.Details
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
    * set, videoURL should not be set.
    */
  var HTMLSnippet: js.UndefOr[String] = js.native
  
  /**
    * Account id.
    */
  var accountId: js.UndefOr[Double] = js.native
  
  /**
    * Detected advertiser id, if any. Read-only. This field should not be set
    * in requests.
    */
  var advertiserId: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the company being advertised in the creative.
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
    * All attributes for the ads that may be shown from this snippet.
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
  var corrections: js.UndefOr[js.Array[Details]] = js.native
  
  /**
    * The reasons for disapproval, if any. Note that not all disapproval
    * reasons may be categorized, so it is possible for the creative to have a
    * status of DISAPPROVED with an empty list for disapproval_reasons. In this
    * case, please reach out to your TAM to help debug the issue. Read-only.
    * This field should not be set in requests.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Details]] = js.native
  
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
    * If nativeAd is set, HTMLSnippet and videoURL should not be set.
    */
  var nativeAd: js.UndefOr[Advertiser] = js.native
  
  /**
    * Detected product categories, if any. Read-only. This field should not be
    * set in requests.
    */
  var productCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * All restricted categories for the ads that may be shown from this
    * snippet.
    */
  var restrictedCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Detected sensitive categories, if any. Read-only. This field should not
    * be set in requests.
    */
  var sensitiveCategories: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Creative serving status. Read-only. This field should not be set in
    * requests.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * All vendor types for the ads that may be shown from this snippet.
    */
  var vendorType: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The version for this creative. Read-only. This field should not be set in
    * requests.
    */
  var version: js.UndefOr[Double] = js.native
  
  /**
    * The URL to fetch a video ad. If set, HTMLSnippet and the nativeAd should
    * not be set.
    */
  var videoURL: js.UndefOr[String] = js.native
  
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
    def setCorrectionsVarargs(value: Details*): Self = this.set("corrections", js.Array(value :_*))
    
    @scala.inline
    def setCorrections(value: js.Array[Details]): Self = this.set("corrections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCorrections: Self = this.set("corrections", js.undefined)
    
    @scala.inline
    def setDisapprovalReasonsVarargs(value: Details*): Self = this.set("disapprovalReasons", js.Array(value :_*))
    
    @scala.inline
    def setDisapprovalReasons(value: js.Array[Details]): Self = this.set("disapprovalReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisapprovalReasons: Self = this.set("disapprovalReasons", js.undefined)
    
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
    def setNativeAd(value: Advertiser): Self = this.set("nativeAd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNativeAd: Self = this.set("nativeAd", js.undefined)
    
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
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
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
