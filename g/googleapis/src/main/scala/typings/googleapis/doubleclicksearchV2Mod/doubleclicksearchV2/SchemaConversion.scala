package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConversion extends StObject {
  
  /**
    * DS ad group ID.
    */
  var adGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS ad ID.
    */
  var adId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS advertiser ID.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS agency ID.
    */
  var agencyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Available to advertisers only after contacting DoubleClick Search customer support.
    */
  var attributionModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS campaign ID.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sales channel for the product. Acceptable values are: - "`local`": a physical store - "`online`": an online store
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS click ID for the conversion.
    */
  var clickId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For offline conversions, advertisers provide this ID. Advertisers can specify any ID that is meaningful to them. Each conversion in a request must specify a unique ID, and the combination of ID and timestamp must be unique amongst all conversions within the advertiser. For online conversions, DS copies the `dsConversionId` or `floodlightOrderId` into this property depending on the advertiser's Floodlight instructions.
    */
  var conversionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the conversion was last modified, in epoch millis UTC.
    */
  var conversionModifiedTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time at which the conversion took place, in epoch millis UTC.
    */
  var conversionTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Available to advertisers only after contacting DoubleClick Search customer support.
    */
  var countMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS criterion (keyword) ID.
    */
  var criterionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency code for the conversion's revenue. Should be in ISO 4217 alphabetic (3-char) format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom dimensions for the conversion, which can be used to filter data in a report.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.undefined
  
  /**
    * Custom metrics for the conversion.
    */
  var customMetric: js.UndefOr[js.Array[SchemaCustomMetric]] = js.undefined
  
  /**
    * The type of device on which the conversion occurred.
    */
  var deviceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID that DoubleClick Search generates for each conversion.
    */
  var dsConversionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS engine account ID.
    */
  var engineAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Floodlight order ID provided by the advertiser for the conversion.
    */
  var floodlightOrderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID that DS generates and uses to uniquely identify the inventory account that contains the product.
    */
  var inventoryAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The country registered for the Merchant Center feed that contains the product. Use an ISO 3166 code to specify a country.
    */
  var productCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * DS product group ID.
    */
  var productGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The product ID (SKU).
    */
  var productId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The language registered for the Merchant Center feed that contains the product. Use an ISO 639 code to specify a language.
    */
  var productLanguage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The quantity of this conversion, in millis.
    */
  var quantityMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The revenue amount of this `TRANSACTION` conversion, in micros (value multiplied by 1000000, no decimal). For example, to specify a revenue value of "10" enter "10000000" (10 million) in your request.
    */
  var revenueMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
    */
  var segmentationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity name).
    */
  var segmentationName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The segmentation type of this conversion (for example, `FLOODLIGHT`).
    */
  var segmentationType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The state of the conversion, that is, either `ACTIVE` or `REMOVED`. Note: state DELETED is deprecated.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the local store for which the product was advertised. Applicable only when the channel is "`local`".
    */
  var storeId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the conversion, that is, either `ACTION` or `TRANSACTION`. An `ACTION` conversion is an action by the user that has no monetarily quantifiable value, while a `TRANSACTION` conversion is an action that does have a monetarily quantifiable value. Examples are email list signups (`ACTION`) versus ecommerce purchases (`TRANSACTION`).
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaConversion {
  
  inline def apply(): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversion]
  }
  
  extension [Self <: SchemaConversion](x: Self) {
    
    inline def setAdGroupId(value: String): Self = StObject.set(x, "adGroupId", value.asInstanceOf[js.Any])
    
    inline def setAdGroupIdNull: Self = StObject.set(x, "adGroupId", null)
    
    inline def setAdGroupIdUndefined: Self = StObject.set(x, "adGroupId", js.undefined)
    
    inline def setAdId(value: String): Self = StObject.set(x, "adId", value.asInstanceOf[js.Any])
    
    inline def setAdIdNull: Self = StObject.set(x, "adId", null)
    
    inline def setAdIdUndefined: Self = StObject.set(x, "adId", js.undefined)
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAgencyId(value: String): Self = StObject.set(x, "agencyId", value.asInstanceOf[js.Any])
    
    inline def setAgencyIdNull: Self = StObject.set(x, "agencyId", null)
    
    inline def setAgencyIdUndefined: Self = StObject.set(x, "agencyId", js.undefined)
    
    inline def setAttributionModel(value: String): Self = StObject.set(x, "attributionModel", value.asInstanceOf[js.Any])
    
    inline def setAttributionModelNull: Self = StObject.set(x, "attributionModel", null)
    
    inline def setAttributionModelUndefined: Self = StObject.set(x, "attributionModel", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setClickId(value: String): Self = StObject.set(x, "clickId", value.asInstanceOf[js.Any])
    
    inline def setClickIdNull: Self = StObject.set(x, "clickId", null)
    
    inline def setClickIdUndefined: Self = StObject.set(x, "clickId", js.undefined)
    
    inline def setConversionId(value: String): Self = StObject.set(x, "conversionId", value.asInstanceOf[js.Any])
    
    inline def setConversionIdNull: Self = StObject.set(x, "conversionId", null)
    
    inline def setConversionIdUndefined: Self = StObject.set(x, "conversionId", js.undefined)
    
    inline def setConversionModifiedTimestamp(value: String): Self = StObject.set(x, "conversionModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConversionModifiedTimestampNull: Self = StObject.set(x, "conversionModifiedTimestamp", null)
    
    inline def setConversionModifiedTimestampUndefined: Self = StObject.set(x, "conversionModifiedTimestamp", js.undefined)
    
    inline def setConversionTimestamp(value: String): Self = StObject.set(x, "conversionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConversionTimestampNull: Self = StObject.set(x, "conversionTimestamp", null)
    
    inline def setConversionTimestampUndefined: Self = StObject.set(x, "conversionTimestamp", js.undefined)
    
    inline def setCountMillis(value: String): Self = StObject.set(x, "countMillis", value.asInstanceOf[js.Any])
    
    inline def setCountMillisNull: Self = StObject.set(x, "countMillis", null)
    
    inline def setCountMillisUndefined: Self = StObject.set(x, "countMillis", js.undefined)
    
    inline def setCriterionId(value: String): Self = StObject.set(x, "criterionId", value.asInstanceOf[js.Any])
    
    inline def setCriterionIdNull: Self = StObject.set(x, "criterionId", null)
    
    inline def setCriterionIdUndefined: Self = StObject.set(x, "criterionId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCustomDimension(value: js.Array[SchemaCustomDimension]): Self = StObject.set(x, "customDimension", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensionUndefined: Self = StObject.set(x, "customDimension", js.undefined)
    
    inline def setCustomDimensionVarargs(value: SchemaCustomDimension*): Self = StObject.set(x, "customDimension", js.Array(value*))
    
    inline def setCustomMetric(value: js.Array[SchemaCustomMetric]): Self = StObject.set(x, "customMetric", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricUndefined: Self = StObject.set(x, "customMetric", js.undefined)
    
    inline def setCustomMetricVarargs(value: SchemaCustomMetric*): Self = StObject.set(x, "customMetric", js.Array(value*))
    
    inline def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeNull: Self = StObject.set(x, "deviceType", null)
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "deviceType", js.undefined)
    
    inline def setDsConversionId(value: String): Self = StObject.set(x, "dsConversionId", value.asInstanceOf[js.Any])
    
    inline def setDsConversionIdNull: Self = StObject.set(x, "dsConversionId", null)
    
    inline def setDsConversionIdUndefined: Self = StObject.set(x, "dsConversionId", js.undefined)
    
    inline def setEngineAccountId(value: String): Self = StObject.set(x, "engineAccountId", value.asInstanceOf[js.Any])
    
    inline def setEngineAccountIdNull: Self = StObject.set(x, "engineAccountId", null)
    
    inline def setEngineAccountIdUndefined: Self = StObject.set(x, "engineAccountId", js.undefined)
    
    inline def setFloodlightOrderId(value: String): Self = StObject.set(x, "floodlightOrderId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightOrderIdNull: Self = StObject.set(x, "floodlightOrderId", null)
    
    inline def setFloodlightOrderIdUndefined: Self = StObject.set(x, "floodlightOrderId", js.undefined)
    
    inline def setInventoryAccountId(value: String): Self = StObject.set(x, "inventoryAccountId", value.asInstanceOf[js.Any])
    
    inline def setInventoryAccountIdNull: Self = StObject.set(x, "inventoryAccountId", null)
    
    inline def setInventoryAccountIdUndefined: Self = StObject.set(x, "inventoryAccountId", js.undefined)
    
    inline def setProductCountry(value: String): Self = StObject.set(x, "productCountry", value.asInstanceOf[js.Any])
    
    inline def setProductCountryNull: Self = StObject.set(x, "productCountry", null)
    
    inline def setProductCountryUndefined: Self = StObject.set(x, "productCountry", js.undefined)
    
    inline def setProductGroupId(value: String): Self = StObject.set(x, "productGroupId", value.asInstanceOf[js.Any])
    
    inline def setProductGroupIdNull: Self = StObject.set(x, "productGroupId", null)
    
    inline def setProductGroupIdUndefined: Self = StObject.set(x, "productGroupId", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setProductLanguage(value: String): Self = StObject.set(x, "productLanguage", value.asInstanceOf[js.Any])
    
    inline def setProductLanguageNull: Self = StObject.set(x, "productLanguage", null)
    
    inline def setProductLanguageUndefined: Self = StObject.set(x, "productLanguage", js.undefined)
    
    inline def setQuantityMillis(value: String): Self = StObject.set(x, "quantityMillis", value.asInstanceOf[js.Any])
    
    inline def setQuantityMillisNull: Self = StObject.set(x, "quantityMillis", null)
    
    inline def setQuantityMillisUndefined: Self = StObject.set(x, "quantityMillis", js.undefined)
    
    inline def setRevenueMicros(value: String): Self = StObject.set(x, "revenueMicros", value.asInstanceOf[js.Any])
    
    inline def setRevenueMicrosNull: Self = StObject.set(x, "revenueMicros", null)
    
    inline def setRevenueMicrosUndefined: Self = StObject.set(x, "revenueMicros", js.undefined)
    
    inline def setSegmentationId(value: String): Self = StObject.set(x, "segmentationId", value.asInstanceOf[js.Any])
    
    inline def setSegmentationIdNull: Self = StObject.set(x, "segmentationId", null)
    
    inline def setSegmentationIdUndefined: Self = StObject.set(x, "segmentationId", js.undefined)
    
    inline def setSegmentationName(value: String): Self = StObject.set(x, "segmentationName", value.asInstanceOf[js.Any])
    
    inline def setSegmentationNameNull: Self = StObject.set(x, "segmentationName", null)
    
    inline def setSegmentationNameUndefined: Self = StObject.set(x, "segmentationName", js.undefined)
    
    inline def setSegmentationType(value: String): Self = StObject.set(x, "segmentationType", value.asInstanceOf[js.Any])
    
    inline def setSegmentationTypeNull: Self = StObject.set(x, "segmentationType", null)
    
    inline def setSegmentationTypeUndefined: Self = StObject.set(x, "segmentationType", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
    
    inline def setStoreIdNull: Self = StObject.set(x, "storeId", null)
    
    inline def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
