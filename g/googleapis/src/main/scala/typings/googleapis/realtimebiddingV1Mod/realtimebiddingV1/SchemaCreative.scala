package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreative extends StObject {
  
  /**
    * Output only. ID of the buyer account that this creative is owned by. Can be used to filter the response of the creatives.list method with equality and inequality check.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link to AdChoices destination page. This is only supported for native ads.
    */
  var adChoicesDestinationUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the company being advertised in the creative. Can be used to filter the response of the creatives.list method.
    */
  var advertiserName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The agency ID for this creative.
    */
  var agencyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The last update timestamp of the creative via API.
    */
  var apiUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The format of this creative. Can be used to filter the response of the creatives.list method.
    */
  var creativeFormat: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Buyer-specific creative ID that references this creative in bid responses. This field is Ignored in update operations. Can be used to filter the response of the creatives.list method. The maximum length of the creative ID is 128 bytes.
    */
  var creativeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Top level status and detected attributes of a creative (for example domain, language, advertiser, product category, etc.) that affect whether (status) and where (context) a creative will be allowed to serve.
    */
  var creativeServingDecision: js.UndefOr[SchemaCreativeServingDecision] = js.undefined
  
  /**
    * Output only. IDs of all of the deals with which this creative has been used in bidding. Can be used to filter the response of the creatives.list method.
    */
  var dealIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * All declared attributes for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method. If the `excluded_attribute` field of a [bid request](https://developers.google.com/authorized-buyers/rtb/downloads/realtime-bidding-proto") contains one of the attributes that were declared or detected for a given creative, and a bid is submitted with that creative, the bid will be filtered before the auction.
    */
  var declaredAttributes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The set of declared destination URLs for the creative. Can be used to filter the response of the creatives.list method.
    */
  var declaredClickThroughUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * All declared restricted categories for the ads that may be shown from this creative. Can be used to filter the response of the creatives.list method.
    */
  var declaredRestrictedCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IDs for the declared ad technology vendors that may be used by this creative. See https://storage.googleapis.com/adx-rtb-dictionaries/vendors.txt for possible values. Can be used to filter the response of the creatives.list method.
    */
  var declaredVendorIds: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * An HTML creative.
    */
  var html: js.UndefOr[SchemaHtmlContent] = js.undefined
  
  /**
    * The set of URLs to be called to record an impression.
    */
  var impressionTrackingUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. Name of the creative. Follows the pattern `buyers/{buyer\}/creatives/{creative\}`, where `{buyer\}` represents the account ID of the buyer who owns the creative, and `{creative\}` is the buyer-specific creative ID that references this creative in the bid response.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A native creative.
    */
  var native: js.UndefOr[SchemaNativeContent] = js.undefined
  
  /**
    * All restricted categories for the ads that may be shown from this creative.
    */
  var restrictedCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Output only. The version of the creative. Version for a new creative is 1 and it increments during subsequent creative updates.
    */
  var version: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A video creative.
    */
  var video: js.UndefOr[SchemaVideoContent] = js.undefined
}
object SchemaCreative {
  
  inline def apply(): SchemaCreative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreative]
  }
  
  extension [Self <: SchemaCreative](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdChoicesDestinationUrl(value: String): Self = StObject.set(x, "adChoicesDestinationUrl", value.asInstanceOf[js.Any])
    
    inline def setAdChoicesDestinationUrlNull: Self = StObject.set(x, "adChoicesDestinationUrl", null)
    
    inline def setAdChoicesDestinationUrlUndefined: Self = StObject.set(x, "adChoicesDestinationUrl", js.undefined)
    
    inline def setAdvertiserName(value: String): Self = StObject.set(x, "advertiserName", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserNameNull: Self = StObject.set(x, "advertiserName", null)
    
    inline def setAdvertiserNameUndefined: Self = StObject.set(x, "advertiserName", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdNull: Self = StObject.set(x, "agencyId", null)
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setApiUpdateTime(value: String): Self = StObject.set(x, "apiUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setApiUpdateTimeNull: Self = StObject.set(x, "apiUpdateTime", null)
    
    inline def setApiUpdateTimeUndefined: Self = StObject.set(x, "apiUpdateTime", js.undefined)
    
    inline def setCreativeFormat(value: String): Self = StObject.set(x, "creativeFormat", value.asInstanceOf[js.Any])
    
    inline def setCreativeFormatNull: Self = StObject.set(x, "creativeFormat", null)
    
    inline def setCreativeFormatUndefined: Self = StObject.set(x, "creativeFormat", js.undefined)
    
    inline def setCreativeId(value: String): Self = StObject.set(x, "creativeId", value.asInstanceOf[js.Any])
    
    inline def setCreativeIdNull: Self = StObject.set(x, "creativeId", null)
    
    inline def setCreativeIdUndefined: Self = StObject.set(x, "creativeId", js.undefined)
    
    inline def setCreativeServingDecision(value: SchemaCreativeServingDecision): Self = StObject.set(x, "creativeServingDecision", value.asInstanceOf[js.Any])
    
    inline def setCreativeServingDecisionUndefined: Self = StObject.set(x, "creativeServingDecision", js.undefined)
    
    inline def setDealIds(value: js.Array[String]): Self = StObject.set(x, "dealIds", value.asInstanceOf[js.Any])
    
    inline def setDealIdsNull: Self = StObject.set(x, "dealIds", null)
    
    inline def setDealIdsUndefined: Self = StObject.set(x, "dealIds", js.undefined)
    
    inline def setDealIdsVarargs(value: String*): Self = StObject.set(x, "dealIds", js.Array(value*))
    
    inline def setDeclaredAttributes(value: js.Array[String]): Self = StObject.set(x, "declaredAttributes", value.asInstanceOf[js.Any])
    
    inline def setDeclaredAttributesNull: Self = StObject.set(x, "declaredAttributes", null)
    
    inline def setDeclaredAttributesUndefined: Self = StObject.set(x, "declaredAttributes", js.undefined)
    
    inline def setDeclaredAttributesVarargs(value: String*): Self = StObject.set(x, "declaredAttributes", js.Array(value*))
    
    inline def setDeclaredClickThroughUrls(value: js.Array[String]): Self = StObject.set(x, "declaredClickThroughUrls", value.asInstanceOf[js.Any])
    
    inline def setDeclaredClickThroughUrlsNull: Self = StObject.set(x, "declaredClickThroughUrls", null)
    
    inline def setDeclaredClickThroughUrlsUndefined: Self = StObject.set(x, "declaredClickThroughUrls", js.undefined)
    
    inline def setDeclaredClickThroughUrlsVarargs(value: String*): Self = StObject.set(x, "declaredClickThroughUrls", js.Array(value*))
    
    inline def setDeclaredRestrictedCategories(value: js.Array[String]): Self = StObject.set(x, "declaredRestrictedCategories", value.asInstanceOf[js.Any])
    
    inline def setDeclaredRestrictedCategoriesNull: Self = StObject.set(x, "declaredRestrictedCategories", null)
    
    inline def setDeclaredRestrictedCategoriesUndefined: Self = StObject.set(x, "declaredRestrictedCategories", js.undefined)
    
    inline def setDeclaredRestrictedCategoriesVarargs(value: String*): Self = StObject.set(x, "declaredRestrictedCategories", js.Array(value*))
    
    inline def setDeclaredVendorIds(value: js.Array[Double]): Self = StObject.set(x, "declaredVendorIds", value.asInstanceOf[js.Any])
    
    inline def setDeclaredVendorIdsNull: Self = StObject.set(x, "declaredVendorIds", null)
    
    inline def setDeclaredVendorIdsUndefined: Self = StObject.set(x, "declaredVendorIds", js.undefined)
    
    inline def setDeclaredVendorIdsVarargs(value: Double*): Self = StObject.set(x, "declaredVendorIds", js.Array(value*))
    
    inline def setHtml(value: SchemaHtmlContent): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setImpressionTrackingUrls(value: js.Array[String]): Self = StObject.set(x, "impressionTrackingUrls", value.asInstanceOf[js.Any])
    
    inline def setImpressionTrackingUrlsNull: Self = StObject.set(x, "impressionTrackingUrls", null)
    
    inline def setImpressionTrackingUrlsUndefined: Self = StObject.set(x, "impressionTrackingUrls", js.undefined)
    
    inline def setImpressionTrackingUrlsVarargs(value: String*): Self = StObject.set(x, "impressionTrackingUrls", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNative(value: SchemaNativeContent): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    inline def setRestrictedCategories(value: js.Array[String]): Self = StObject.set(x, "restrictedCategories", value.asInstanceOf[js.Any])
    
    inline def setRestrictedCategoriesNull: Self = StObject.set(x, "restrictedCategories", null)
    
    inline def setRestrictedCategoriesUndefined: Self = StObject.set(x, "restrictedCategories", js.undefined)
    
    inline def setRestrictedCategoriesVarargs(value: String*): Self = StObject.set(x, "restrictedCategories", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVideo(value: SchemaVideoContent): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
