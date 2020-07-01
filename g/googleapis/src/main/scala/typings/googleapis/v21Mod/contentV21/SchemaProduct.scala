package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Product data. After inserting, updating, or deleting a product, it may take
  * several minutes before changes take effect.
  */
@js.native
trait SchemaProduct extends js.Object {
  /**
    * Additional URLs of images of the item.
    */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Used to group items in an arbitrary way. Only for CPA%, discouraged
    * otherwise.
    */
  var adsGrouping: js.UndefOr[String] = js.native
  /**
    * Similar to ads_grouping, but only works on CPC.
    */
  var adsLabels: js.UndefOr[js.Array[String]] = js.native
  /**
    * Allows advertisers to override the item URL when the product is shown
    * within the context of Product Ads.
    */
  var adsRedirect: js.UndefOr[String] = js.native
  /**
    * Set to true if the item is targeted towards adults.
    */
  var adult: js.UndefOr[Boolean] = js.native
  /**
    * Target age group of the item.
    */
  var ageGroup: js.UndefOr[String] = js.native
  /**
    * Availability status of the item.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * The day a pre-ordered product becomes available for delivery, in ISO 8601
    * format.
    */
  var availabilityDate: js.UndefOr[String] = js.native
  /**
    * Brand of the item.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The item&#39;s channel (online or local).
    */
  var channel: js.UndefOr[String] = js.native
  /**
    * Color of the item.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Condition or state of the item.
    */
  var condition: js.UndefOr[String] = js.native
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Cost of goods sold. Used for gross profit reporting.
    */
  var costOfGoodsSold: js.UndefOr[SchemaPrice] = js.native
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for
    * submitting any attribute of the feed specification in its generic form
    * (e.g., { &quot;name&quot;: &quot;size type&quot;, &quot;value&quot;:
    * &quot;regular&quot; }). This is useful for submitting attributes not
    * explicitly exposed by the API.
    */
  var customAttributes: js.UndefOr[js.Array[SchemaCustomAttribute]] = js.native
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign.
    */
  var customLabel0: js.UndefOr[String] = js.native
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign.
    */
  var customLabel1: js.UndefOr[String] = js.native
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign.
    */
  var customLabel2: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign.
    */
  var customLabel3: js.UndefOr[String] = js.native
  /**
    * Custom label 4 for custom grouping of items in a Shopping campaign.
    */
  var customLabel4: js.UndefOr[String] = js.native
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An identifier for an item for dynamic remarketing campaigns.
    */
  var displayAdsId: js.UndefOr[String] = js.native
  /**
    * URL directly to your item&#39;s landing page for dynamic remarketing
    * campaigns.
    */
  var displayAdsLink: js.UndefOr[String] = js.native
  /**
    * Advertiser-specified recommendations.
    */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Title of an item for dynamic remarketing campaigns.
    */
  var displayAdsTitle: js.UndefOr[String] = js.native
  /**
    * Offer margin for dynamic remarketing campaigns.
    */
  var displayAdsValue: js.UndefOr[Double] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var energyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * The list of destinations to exclude for this target (corresponds to
    * unchecked check boxes in Merchant Center).
    */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO
    * 8601 format. The actual expiration date in Google Shopping is exposed in
    * productstatuses as googleExpirationDate and might be earlier if
    * expirationDate is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.native
  /**
    * Target gender of the item.
    */
  var gender: js.UndefOr[String] = js.native
  /**
    * Google&#39;s category of the item (see Google product taxonomy).
    */
  var googleProductCategory: js.UndefOr[String] = js.native
  /**
    * Global Trade Item Number (GTIN) of the item.
    */
  var gtin: js.UndefOr[String] = js.native
  /**
    * The REST ID of the product. Content API methods that operate on products
    * take this as their productId parameter. The REST ID for a product is of
    * the form channel:contentLanguage:targetCountry:offerId.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * False when the item does not have unique product identifiers appropriate
    * to its category, such as GTIN, MPN, and brand. Required according to the
    * Unique Product Identifier Rules for all target countries except for
    * Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.native
  /**
    * URL of an image of the item.
    */
  var imageLink: js.UndefOr[String] = js.native
  /**
    * The list of destinations to include for this target (corresponds to
    * checked check boxes in Merchant Center). Default destinations are always
    * included unless provided in the excluded_destination field.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.native
  /**
    * Whether the item is a merchant-defined bundle. A bundle is a custom
    * grouping of different products sold by a merchant for a single price.
    */
  var isBundle: js.UndefOr[Boolean] = js.native
  /**
    * Shared identifier for all variants of the same product.
    */
  var itemGroupId: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#product&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * URL directly linking to your item&#39;s page on your website.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.native
  /**
    * The material of which the item is made.
    */
  var material: js.UndefOr[String] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var maxEnergyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * Maximal product handling time (in business days).
    */
  var maxHandlingTime: js.UndefOr[String] = js.native
  /**
    * The energy efficiency class as defined in EU directive 2010/30/EU.
    */
  var minEnergyEfficiencyClass: js.UndefOr[String] = js.native
  /**
    * Minimal product handling time (in business days).
    */
  var minHandlingTime: js.UndefOr[String] = js.native
  /**
    * Link to a mobile-optimized version of the landing page.
    */
  var mobileLink: js.UndefOr[String] = js.native
  /**
    * Manufacturer Part Number (MPN) of the item.
    */
  var mpn: js.UndefOr[String] = js.native
  /**
    * The number of identical products in a merchant-defined multipack.
    */
  var multipack: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the item. Leading and trailing whitespaces are
    * stripped and multiple whitespaces are replaced by a single whitespace
    * upon submission. Only valid unicode characters are accepted. See the
    * products feed specification for details. Note: Content API methods that
    * operate on products take the REST ID of the product, not this identifier.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * The item&#39;s pattern (e.g. polka dots).
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * Price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * Categories of the item (formatted as in products feed specification).
    */
  var productTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The unique ID of a promotion.
    */
  var promotionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Advertised sale price of the item.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * Date range during which the item is on sale (see products feed
    * specification).
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.native
  /**
    * Shipping rules.
    */
  var shipping: js.UndefOr[js.Array[SchemaProductShipping]] = js.native
  /**
    * Height of the item for shipping.
    */
  var shippingHeight: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * The shipping label of the product, used to group product in account-level
    * shipping rules.
    */
  var shippingLabel: js.UndefOr[String] = js.native
  /**
    * Length of the item for shipping.
    */
  var shippingLength: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * Weight of the item for shipping.
    */
  var shippingWeight: js.UndefOr[SchemaProductShippingWeight] = js.native
  /**
    * Width of the item for shipping.
    */
  var shippingWidth: js.UndefOr[SchemaProductShippingDimension] = js.native
  /**
    * System in which the size is specified. Recommended for apparel items.
    */
  var sizeSystem: js.UndefOr[String] = js.native
  /**
    * The cut of the item. Recommended for apparel items.
    */
  var sizeType: js.UndefOr[String] = js.native
  /**
    * Size of the item.
    */
  var sizes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The source of the offer, i.e., how the offer was created.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The CLDR territory code for the item.
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * Tax information.
    */
  var taxes: js.UndefOr[js.Array[SchemaProductTax]] = js.native
  /**
    * Title of the item.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The preference of the denominator of the unit price.
    */
  var unitPricingBaseMeasure: js.UndefOr[SchemaProductUnitPricingBaseMeasure] = js.native
  /**
    * The measure and dimension of an item.
    */
  var unitPricingMeasure: js.UndefOr[SchemaProductUnitPricingMeasure] = js.native
}

object SchemaProduct {
  @scala.inline
  def apply(
    additionalImageLinks: js.Array[String] = null,
    adsGrouping: String = null,
    adsLabels: js.Array[String] = null,
    adsRedirect: String = null,
    adult: js.UndefOr[Boolean] = js.undefined,
    ageGroup: String = null,
    availability: String = null,
    availabilityDate: String = null,
    brand: String = null,
    channel: String = null,
    color: String = null,
    condition: String = null,
    contentLanguage: String = null,
    costOfGoodsSold: SchemaPrice = null,
    customAttributes: js.Array[SchemaCustomAttribute] = null,
    customLabel0: String = null,
    customLabel1: String = null,
    customLabel2: String = null,
    customLabel3: String = null,
    customLabel4: String = null,
    description: String = null,
    displayAdsId: String = null,
    displayAdsLink: String = null,
    displayAdsSimilarIds: js.Array[String] = null,
    displayAdsTitle: String = null,
    displayAdsValue: js.UndefOr[Double] = js.undefined,
    energyEfficiencyClass: String = null,
    excludedDestinations: js.Array[String] = null,
    expirationDate: String = null,
    gender: String = null,
    googleProductCategory: String = null,
    gtin: String = null,
    id: String = null,
    identifierExists: js.UndefOr[Boolean] = js.undefined,
    imageLink: String = null,
    includedDestinations: js.Array[String] = null,
    installment: SchemaInstallment = null,
    isBundle: js.UndefOr[Boolean] = js.undefined,
    itemGroupId: String = null,
    kind: String = null,
    link: String = null,
    loyaltyPoints: SchemaLoyaltyPoints = null,
    material: String = null,
    maxEnergyEfficiencyClass: String = null,
    maxHandlingTime: String = null,
    minEnergyEfficiencyClass: String = null,
    minHandlingTime: String = null,
    mobileLink: String = null,
    mpn: String = null,
    multipack: String = null,
    offerId: String = null,
    pattern: String = null,
    price: SchemaPrice = null,
    productTypes: js.Array[String] = null,
    promotionIds: js.Array[String] = null,
    salePrice: SchemaPrice = null,
    salePriceEffectiveDate: String = null,
    sellOnGoogleQuantity: String = null,
    shipping: js.Array[SchemaProductShipping] = null,
    shippingHeight: SchemaProductShippingDimension = null,
    shippingLabel: String = null,
    shippingLength: SchemaProductShippingDimension = null,
    shippingWeight: SchemaProductShippingWeight = null,
    shippingWidth: SchemaProductShippingDimension = null,
    sizeSystem: String = null,
    sizeType: String = null,
    sizes: js.Array[String] = null,
    source: String = null,
    targetCountry: String = null,
    taxes: js.Array[SchemaProductTax] = null,
    title: String = null,
    unitPricingBaseMeasure: SchemaProductUnitPricingBaseMeasure = null,
    unitPricingMeasure: SchemaProductUnitPricingMeasure = null
  ): SchemaProduct = {
    val __obj = js.Dynamic.literal()
    if (additionalImageLinks != null) __obj.updateDynamic("additionalImageLinks")(additionalImageLinks.asInstanceOf[js.Any])
    if (adsGrouping != null) __obj.updateDynamic("adsGrouping")(adsGrouping.asInstanceOf[js.Any])
    if (adsLabels != null) __obj.updateDynamic("adsLabels")(adsLabels.asInstanceOf[js.Any])
    if (adsRedirect != null) __obj.updateDynamic("adsRedirect")(adsRedirect.asInstanceOf[js.Any])
    if (!js.isUndefined(adult)) __obj.updateDynamic("adult")(adult.get.asInstanceOf[js.Any])
    if (ageGroup != null) __obj.updateDynamic("ageGroup")(ageGroup.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (availabilityDate != null) __obj.updateDynamic("availabilityDate")(availabilityDate.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (contentLanguage != null) __obj.updateDynamic("contentLanguage")(contentLanguage.asInstanceOf[js.Any])
    if (costOfGoodsSold != null) __obj.updateDynamic("costOfGoodsSold")(costOfGoodsSold.asInstanceOf[js.Any])
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (customLabel0 != null) __obj.updateDynamic("customLabel0")(customLabel0.asInstanceOf[js.Any])
    if (customLabel1 != null) __obj.updateDynamic("customLabel1")(customLabel1.asInstanceOf[js.Any])
    if (customLabel2 != null) __obj.updateDynamic("customLabel2")(customLabel2.asInstanceOf[js.Any])
    if (customLabel3 != null) __obj.updateDynamic("customLabel3")(customLabel3.asInstanceOf[js.Any])
    if (customLabel4 != null) __obj.updateDynamic("customLabel4")(customLabel4.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (displayAdsId != null) __obj.updateDynamic("displayAdsId")(displayAdsId.asInstanceOf[js.Any])
    if (displayAdsLink != null) __obj.updateDynamic("displayAdsLink")(displayAdsLink.asInstanceOf[js.Any])
    if (displayAdsSimilarIds != null) __obj.updateDynamic("displayAdsSimilarIds")(displayAdsSimilarIds.asInstanceOf[js.Any])
    if (displayAdsTitle != null) __obj.updateDynamic("displayAdsTitle")(displayAdsTitle.asInstanceOf[js.Any])
    if (!js.isUndefined(displayAdsValue)) __obj.updateDynamic("displayAdsValue")(displayAdsValue.get.asInstanceOf[js.Any])
    if (energyEfficiencyClass != null) __obj.updateDynamic("energyEfficiencyClass")(energyEfficiencyClass.asInstanceOf[js.Any])
    if (excludedDestinations != null) __obj.updateDynamic("excludedDestinations")(excludedDestinations.asInstanceOf[js.Any])
    if (expirationDate != null) __obj.updateDynamic("expirationDate")(expirationDate.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (googleProductCategory != null) __obj.updateDynamic("googleProductCategory")(googleProductCategory.asInstanceOf[js.Any])
    if (gtin != null) __obj.updateDynamic("gtin")(gtin.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(identifierExists)) __obj.updateDynamic("identifierExists")(identifierExists.get.asInstanceOf[js.Any])
    if (imageLink != null) __obj.updateDynamic("imageLink")(imageLink.asInstanceOf[js.Any])
    if (includedDestinations != null) __obj.updateDynamic("includedDestinations")(includedDestinations.asInstanceOf[js.Any])
    if (installment != null) __obj.updateDynamic("installment")(installment.asInstanceOf[js.Any])
    if (!js.isUndefined(isBundle)) __obj.updateDynamic("isBundle")(isBundle.get.asInstanceOf[js.Any])
    if (itemGroupId != null) __obj.updateDynamic("itemGroupId")(itemGroupId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (loyaltyPoints != null) __obj.updateDynamic("loyaltyPoints")(loyaltyPoints.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (maxEnergyEfficiencyClass != null) __obj.updateDynamic("maxEnergyEfficiencyClass")(maxEnergyEfficiencyClass.asInstanceOf[js.Any])
    if (maxHandlingTime != null) __obj.updateDynamic("maxHandlingTime")(maxHandlingTime.asInstanceOf[js.Any])
    if (minEnergyEfficiencyClass != null) __obj.updateDynamic("minEnergyEfficiencyClass")(minEnergyEfficiencyClass.asInstanceOf[js.Any])
    if (minHandlingTime != null) __obj.updateDynamic("minHandlingTime")(minHandlingTime.asInstanceOf[js.Any])
    if (mobileLink != null) __obj.updateDynamic("mobileLink")(mobileLink.asInstanceOf[js.Any])
    if (mpn != null) __obj.updateDynamic("mpn")(mpn.asInstanceOf[js.Any])
    if (multipack != null) __obj.updateDynamic("multipack")(multipack.asInstanceOf[js.Any])
    if (offerId != null) __obj.updateDynamic("offerId")(offerId.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (productTypes != null) __obj.updateDynamic("productTypes")(productTypes.asInstanceOf[js.Any])
    if (promotionIds != null) __obj.updateDynamic("promotionIds")(promotionIds.asInstanceOf[js.Any])
    if (salePrice != null) __obj.updateDynamic("salePrice")(salePrice.asInstanceOf[js.Any])
    if (salePriceEffectiveDate != null) __obj.updateDynamic("salePriceEffectiveDate")(salePriceEffectiveDate.asInstanceOf[js.Any])
    if (sellOnGoogleQuantity != null) __obj.updateDynamic("sellOnGoogleQuantity")(sellOnGoogleQuantity.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (shippingHeight != null) __obj.updateDynamic("shippingHeight")(shippingHeight.asInstanceOf[js.Any])
    if (shippingLabel != null) __obj.updateDynamic("shippingLabel")(shippingLabel.asInstanceOf[js.Any])
    if (shippingLength != null) __obj.updateDynamic("shippingLength")(shippingLength.asInstanceOf[js.Any])
    if (shippingWeight != null) __obj.updateDynamic("shippingWeight")(shippingWeight.asInstanceOf[js.Any])
    if (shippingWidth != null) __obj.updateDynamic("shippingWidth")(shippingWidth.asInstanceOf[js.Any])
    if (sizeSystem != null) __obj.updateDynamic("sizeSystem")(sizeSystem.asInstanceOf[js.Any])
    if (sizeType != null) __obj.updateDynamic("sizeType")(sizeType.asInstanceOf[js.Any])
    if (sizes != null) __obj.updateDynamic("sizes")(sizes.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (targetCountry != null) __obj.updateDynamic("targetCountry")(targetCountry.asInstanceOf[js.Any])
    if (taxes != null) __obj.updateDynamic("taxes")(taxes.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (unitPricingBaseMeasure != null) __obj.updateDynamic("unitPricingBaseMeasure")(unitPricingBaseMeasure.asInstanceOf[js.Any])
    if (unitPricingMeasure != null) __obj.updateDynamic("unitPricingMeasure")(unitPricingMeasure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProduct]
  }
}

