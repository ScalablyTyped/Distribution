package typings.googleapis.doubleclicksearchV2Mod.doubleclicksearchV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A conversion containing data relevant to DoubleClick Search.
  */
@js.native
trait SchemaConversion extends js.Object {
  /**
    * DS ad group ID.
    */
  var adGroupId: js.UndefOr[String] = js.native
  /**
    * DS ad ID.
    */
  var adId: js.UndefOr[String] = js.native
  /**
    * DS advertiser ID.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * DS agency ID.
    */
  var agencyId: js.UndefOr[String] = js.native
  /**
    * Available to advertisers only after contacting DoubleClick Search
    * customer support.
    */
  var attributionModel: js.UndefOr[String] = js.native
  /**
    * DS campaign ID.
    */
  var campaignId: js.UndefOr[String] = js.native
  /**
    * Sales channel for the product. Acceptable values are:   -
    * &quot;local&quot;: a physical store  - &quot;online&quot;: an online
    * store
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * DS click ID for the conversion.
    */
  var clickId: js.UndefOr[String] = js.native
  /**
    * For offline conversions, advertisers provide this ID. Advertisers can
    * specify any ID that is meaningful to them. Each conversion in a request
    * must specify a unique ID, and the combination of ID and timestamp must be
    * unique amongst all conversions within the advertiser. For online
    * conversions, DS copies the dsConversionId or floodlightOrderId into this
    * property depending on the advertiser&#39;s Floodlight instructions.
    */
  var conversionId: js.UndefOr[String] = js.native
  /**
    * The time at which the conversion was last modified, in epoch millis UTC.
    */
  var conversionModifiedTimestamp: js.UndefOr[String] = js.native
  /**
    * The time at which the conversion took place, in epoch millis UTC.
    */
  var conversionTimestamp: js.UndefOr[String] = js.native
  /**
    * Available to advertisers only after contacting DoubleClick Search
    * customer support.
    */
  var countMillis: js.UndefOr[String] = js.native
  /**
    * DS criterion (keyword) ID.
    */
  var criterionId: js.UndefOr[String] = js.native
  /**
    * The currency code for the conversion&#39;s revenue. Should be in ISO 4217
    * alphabetic (3-char) format.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Custom dimensions for the conversion, which can be used to filter data in
    * a report.
    */
  var customDimension: js.UndefOr[js.Array[SchemaCustomDimension]] = js.native
  /**
    * Custom metrics for the conversion.
    */
  var customMetric: js.UndefOr[js.Array[SchemaCustomMetric]] = js.native
  /**
    * The type of device on which the conversion occurred.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * ID that DoubleClick Search generates for each conversion.
    */
  var dsConversionId: js.UndefOr[String] = js.native
  /**
    * DS engine account ID.
    */
  var engineAccountId: js.UndefOr[String] = js.native
  /**
    * The Floodlight order ID provided by the advertiser for the conversion.
    */
  var floodlightOrderId: js.UndefOr[String] = js.native
  /**
    * ID that DS generates and uses to uniquely identify the inventory account
    * that contains the product.
    */
  var inventoryAccountId: js.UndefOr[String] = js.native
  /**
    * The country registered for the Merchant Center feed that contains the
    * product. Use an ISO 3166 code to specify a country.
    */
  var productCountry: js.UndefOr[String] = js.native
  /**
    * DS product group ID.
    */
  var productGroupId: js.UndefOr[String] = js.native
  /**
    * The product ID (SKU).
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The language registered for the Merchant Center feed that contains the
    * product. Use an ISO 639 code to specify a language.
    */
  var productLanguage: js.UndefOr[String] = js.native
  /**
    * The quantity of this conversion, in millis.
    */
  var quantityMillis: js.UndefOr[String] = js.native
  /**
    * The revenue amount of this TRANSACTION conversion, in micros (value
    * multiplied by 1000000, no decimal). For example, to specify a revenue
    * value of &quot;10&quot; enter &quot;10000000&quot; (10 million) in your
    * request.
    */
  var revenueMicros: js.UndefOr[String] = js.native
  /**
    * The numeric segmentation identifier (for example, DoubleClick Search
    * Floodlight activity ID).
    */
  var segmentationId: js.UndefOr[String] = js.native
  /**
    * The friendly segmentation identifier (for example, DoubleClick Search
    * Floodlight activity name).
    */
  var segmentationName: js.UndefOr[String] = js.native
  /**
    * The segmentation type of this conversion (for example, FLOODLIGHT).
    */
  var segmentationType: js.UndefOr[String] = js.native
  /**
    * The state of the conversion, that is, either ACTIVE or REMOVED. Note:
    * state DELETED is deprecated.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * The ID of the local store for which the product was advertised.
    * Applicable only when the channel is &quot;local&quot;.
    */
  var storeId: js.UndefOr[String] = js.native
  /**
    * The type of the conversion, that is, either ACTION or TRANSACTION. An
    * ACTION conversion is an action by the user that has no monetarily
    * quantifiable value, while a TRANSACTION conversion is an action that does
    * have a monetarily quantifiable value. Examples are email list signups
    * (ACTION) versus ecommerce purchases (TRANSACTION).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaConversion {
  @scala.inline
  def apply(
    adGroupId: String = null,
    adId: String = null,
    advertiserId: String = null,
    agencyId: String = null,
    attributionModel: String = null,
    campaignId: String = null,
    channel: String = null,
    clickId: String = null,
    conversionId: String = null,
    conversionModifiedTimestamp: String = null,
    conversionTimestamp: String = null,
    countMillis: String = null,
    criterionId: String = null,
    currencyCode: String = null,
    customDimension: js.Array[SchemaCustomDimension] = null,
    customMetric: js.Array[SchemaCustomMetric] = null,
    deviceType: String = null,
    dsConversionId: String = null,
    engineAccountId: String = null,
    floodlightOrderId: String = null,
    inventoryAccountId: String = null,
    productCountry: String = null,
    productGroupId: String = null,
    productId: String = null,
    productLanguage: String = null,
    quantityMillis: String = null,
    revenueMicros: String = null,
    segmentationId: String = null,
    segmentationName: String = null,
    segmentationType: String = null,
    state: String = null,
    storeId: String = null,
    `type`: String = null
  ): SchemaConversion = {
    val __obj = js.Dynamic.literal()
    if (adGroupId != null) __obj.updateDynamic("adGroupId")(adGroupId.asInstanceOf[js.Any])
    if (adId != null) __obj.updateDynamic("adId")(adId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (agencyId != null) __obj.updateDynamic("agencyId")(agencyId.asInstanceOf[js.Any])
    if (attributionModel != null) __obj.updateDynamic("attributionModel")(attributionModel.asInstanceOf[js.Any])
    if (campaignId != null) __obj.updateDynamic("campaignId")(campaignId.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (clickId != null) __obj.updateDynamic("clickId")(clickId.asInstanceOf[js.Any])
    if (conversionId != null) __obj.updateDynamic("conversionId")(conversionId.asInstanceOf[js.Any])
    if (conversionModifiedTimestamp != null) __obj.updateDynamic("conversionModifiedTimestamp")(conversionModifiedTimestamp.asInstanceOf[js.Any])
    if (conversionTimestamp != null) __obj.updateDynamic("conversionTimestamp")(conversionTimestamp.asInstanceOf[js.Any])
    if (countMillis != null) __obj.updateDynamic("countMillis")(countMillis.asInstanceOf[js.Any])
    if (criterionId != null) __obj.updateDynamic("criterionId")(criterionId.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (customDimension != null) __obj.updateDynamic("customDimension")(customDimension.asInstanceOf[js.Any])
    if (customMetric != null) __obj.updateDynamic("customMetric")(customMetric.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (dsConversionId != null) __obj.updateDynamic("dsConversionId")(dsConversionId.asInstanceOf[js.Any])
    if (engineAccountId != null) __obj.updateDynamic("engineAccountId")(engineAccountId.asInstanceOf[js.Any])
    if (floodlightOrderId != null) __obj.updateDynamic("floodlightOrderId")(floodlightOrderId.asInstanceOf[js.Any])
    if (inventoryAccountId != null) __obj.updateDynamic("inventoryAccountId")(inventoryAccountId.asInstanceOf[js.Any])
    if (productCountry != null) __obj.updateDynamic("productCountry")(productCountry.asInstanceOf[js.Any])
    if (productGroupId != null) __obj.updateDynamic("productGroupId")(productGroupId.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (productLanguage != null) __obj.updateDynamic("productLanguage")(productLanguage.asInstanceOf[js.Any])
    if (quantityMillis != null) __obj.updateDynamic("quantityMillis")(quantityMillis.asInstanceOf[js.Any])
    if (revenueMicros != null) __obj.updateDynamic("revenueMicros")(revenueMicros.asInstanceOf[js.Any])
    if (segmentationId != null) __obj.updateDynamic("segmentationId")(segmentationId.asInstanceOf[js.Any])
    if (segmentationName != null) __obj.updateDynamic("segmentationName")(segmentationName.asInstanceOf[js.Any])
    if (segmentationType != null) __obj.updateDynamic("segmentationType")(segmentationType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (storeId != null) __obj.updateDynamic("storeId")(storeId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConversion]
  }
}

