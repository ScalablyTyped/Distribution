package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Product extends js.Object {
  
  /** Additional URLs of images of the item. */
  var additionalImageLinks: js.UndefOr[js.Array[String]] = js.native
  
  /** Used to group items in an arbitrary way. Only for CPA%, discouraged otherwise. */
  var adsGrouping: js.UndefOr[String] = js.native
  
  /** Similar to ads_grouping, but only works on CPC. */
  var adsLabels: js.UndefOr[js.Array[String]] = js.native
  
  /** Allows advertisers to override the item URL when the product is shown within the context of Product Ads. */
  var adsRedirect: js.UndefOr[String] = js.native
  
  /** Should be set to true if the item is targeted towards adults. */
  var adult: js.UndefOr[Boolean] = js.native
  
  /** Target age group of the item. */
  var ageGroup: js.UndefOr[String] = js.native
  
  /** Availability status of the item. */
  var availability: js.UndefOr[String] = js.native
  
  /** The day a pre-ordered product becomes available for delivery, in ISO 8601 format. */
  var availabilityDate: js.UndefOr[String] = js.native
  
  /** Brand of the item. */
  var brand: js.UndefOr[String] = js.native
  
  /** URL for the canonical version of your item's landing page. */
  var canonicalLink: js.UndefOr[String] = js.native
  
  /** Required. The item's channel (online or local). Acceptable values are: - "`local`" - "`online`" */
  var channel: js.UndefOr[String] = js.native
  
  /** Color of the item. */
  var color: js.UndefOr[String] = js.native
  
  /** Condition or state of the item. */
  var condition: js.UndefOr[String] = js.native
  
  /** Required. The two-letter ISO 639-1 language code for the item. */
  var contentLanguage: js.UndefOr[String] = js.native
  
  /** Cost of goods sold. Used for gross profit reporting. */
  var costOfGoodsSold: js.UndefOr[Price] = js.native
  
  /**
    * A list of custom (merchant-provided) attributes. It can also be used for submitting any attribute of the feed specification in its generic form (e.g., `{ "name": "size type",
    * "value": "regular" }`). This is useful for submitting attributes not explicitly exposed by the API, such as additional attributes used for Buy on Google (formerly known as Shopping
    * Actions).
    */
  var customAttributes: js.UndefOr[js.Array[CustomAttribute]] = js.native
  
  /** Custom label 0 for custom grouping of items in a Shopping campaign. */
  var customLabel0: js.UndefOr[String] = js.native
  
  /** Custom label 1 for custom grouping of items in a Shopping campaign. */
  var customLabel1: js.UndefOr[String] = js.native
  
  /** Custom label 2 for custom grouping of items in a Shopping campaign. */
  var customLabel2: js.UndefOr[String] = js.native
  
  /** Custom label 3 for custom grouping of items in a Shopping campaign. */
  var customLabel3: js.UndefOr[String] = js.native
  
  /** Custom label 4 for custom grouping of items in a Shopping campaign. */
  var customLabel4: js.UndefOr[String] = js.native
  
  /** Description of the item. */
  var description: js.UndefOr[String] = js.native
  
  /** An identifier for an item for dynamic remarketing campaigns. */
  var displayAdsId: js.UndefOr[String] = js.native
  
  /** URL directly to your item's landing page for dynamic remarketing campaigns. */
  var displayAdsLink: js.UndefOr[String] = js.native
  
  /** Advertiser-specified recommendations. */
  var displayAdsSimilarIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Title of an item for dynamic remarketing campaigns. */
  var displayAdsTitle: js.UndefOr[String] = js.native
  
  /** Offer margin for dynamic remarketing campaigns. */
  var displayAdsValue: js.UndefOr[Double] = js.native
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var energyEfficiencyClass: js.UndefOr[String] = js.native
  
  /** The list of destinations to exclude for this target (corresponds to unchecked check boxes in Merchant Center). */
  var excludedDestinations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Date on which the item should expire, as specified upon insertion, in ISO 8601 format. The actual expiration date in Google Shopping is exposed in `productstatuses` as
    * `googleExpirationDate` and might be earlier if `expirationDate` is too far in the future.
    */
  var expirationDate: js.UndefOr[String] = js.native
  
  /** Target gender of the item. */
  var gender: js.UndefOr[String] = js.native
  
  /** Google's category of the item (see Google product taxonomy). */
  var googleProductCategory: js.UndefOr[String] = js.native
  
  /** Global Trade Item Number (GTIN) of the item. */
  var gtin: js.UndefOr[String] = js.native
  
  /**
    * The REST ID of the product. Content API methods that operate on products take this as their `productId` parameter. The REST ID for a product is of the form channel:contentLanguage:
    * targetCountry: offerId.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * False when the item does not have unique product identifiers appropriate to its category, such as GTIN, MPN, and brand. Required according to the Unique Product Identifier Rules for
    * all target countries except for Canada.
    */
  var identifierExists: js.UndefOr[Boolean] = js.native
  
  /** URL of an image of the item. */
  var imageLink: js.UndefOr[String] = js.native
  
  /**
    * The list of destinations to include for this target (corresponds to checked check boxes in Merchant Center). Default destinations are always included unless provided in
    * `excludedDestinations`.
    */
  var includedDestinations: js.UndefOr[js.Array[String]] = js.native
  
  /** Number and amount of installments to pay for an item. */
  var installment: js.UndefOr[Installment] = js.native
  
  /** Whether the item is a merchant-defined bundle. A bundle is a custom grouping of different products sold by a merchant for a single price. */
  var isBundle: js.UndefOr[Boolean] = js.native
  
  /** Shared identifier for all variants of the same product. */
  var itemGroupId: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#product`" */
  var kind: js.UndefOr[String] = js.native
  
  /** URL directly linking to your item's page on your website. */
  var link: js.UndefOr[String] = js.native
  
  /** Loyalty points that users receive after purchasing the item. Japan only. */
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.native
  
  /** The material of which the item is made. */
  var material: js.UndefOr[String] = js.native
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var maxEnergyEfficiencyClass: js.UndefOr[String] = js.native
  
  /** Maximal product handling time (in business days). */
  var maxHandlingTime: js.UndefOr[String] = js.native
  
  /** The energy efficiency class as defined in EU directive 2010/30/EU. */
  var minEnergyEfficiencyClass: js.UndefOr[String] = js.native
  
  /** Minimal product handling time (in business days). */
  var minHandlingTime: js.UndefOr[String] = js.native
  
  /** URL for the mobile-optimized version of your item's landing page. */
  var mobileLink: js.UndefOr[String] = js.native
  
  /** Manufacturer Part Number (MPN) of the item. */
  var mpn: js.UndefOr[String] = js.native
  
  /** The number of identical products in a merchant-defined multipack. */
  var multipack: js.UndefOr[String] = js.native
  
  /**
    * Required. A unique identifier for the item. Leading and trailing whitespaces are stripped and multiple whitespaces are replaced by a single whitespace upon submission. Only valid
    * unicode characters are accepted. See the products feed specification for details. *Note:* Content API methods that operate on products take the REST ID of the product, *not* this
    * identifier.
    */
  var offerId: js.UndefOr[String] = js.native
  
  /** The item's pattern (e.g. polka dots). */
  var pattern: js.UndefOr[String] = js.native
  
  /** Price of the item. */
  var price: js.UndefOr[Price] = js.native
  
  /** Technical specification or additional product details. */
  var productDetails: js.UndefOr[js.Array[ProductProductDetail]] = js.native
  
  /** Bullet points describing the most relevant highlights of a product. */
  var productHighlights: js.UndefOr[js.Array[String]] = js.native
  
  /** Categories of the item (formatted as in products data specification). */
  var productTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** The unique ID of a promotion. */
  var promotionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** Advertised sale price of the item. */
  var salePrice: js.UndefOr[Price] = js.native
  
  /** Date range during which the item is on sale (see products data specification ). */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  
  /** The quantity of the product that is available for selling on Google. Supported only for online products. */
  var sellOnGoogleQuantity: js.UndefOr[String] = js.native
  
  /** Shipping rules. */
  var shipping: js.UndefOr[js.Array[ProductShipping]] = js.native
  
  /** Height of the item for shipping. */
  var shippingHeight: js.UndefOr[ProductShippingDimension] = js.native
  
  /** The shipping label of the product, used to group product in account-level shipping rules. */
  var shippingLabel: js.UndefOr[String] = js.native
  
  /** Length of the item for shipping. */
  var shippingLength: js.UndefOr[ProductShippingDimension] = js.native
  
  /** Weight of the item for shipping. */
  var shippingWeight: js.UndefOr[ProductShippingWeight] = js.native
  
  /** Width of the item for shipping. */
  var shippingWidth: js.UndefOr[ProductShippingDimension] = js.native
  
  /** List of country codes (ISO 3166-1 alpha-2) to exclude the offer from Shopping Ads destination. Countries from this list are removed from countries configured in MC feed settings. */
  var shoppingAdsExcludedCountries: js.UndefOr[js.Array[String]] = js.native
  
  /** System in which the size is specified. Recommended for apparel items. */
  var sizeSystem: js.UndefOr[String] = js.native
  
  /** The cut of the item. Recommended for apparel items. */
  var sizeType: js.UndefOr[String] = js.native
  
  /** Size of the item. Only one value is allowed. For variants with different sizes, insert a separate product for each size with the same `itemGroupId` value (see size definition). */
  var sizes: js.UndefOr[js.Array[String]] = js.native
  
  /** The source of the offer, i.e., how the offer was created. Acceptable values are: - "`api`" - "`crawl`" - "`feed`" */
  var source: js.UndefOr[String] = js.native
  
  /** Number of periods (months or years) and amount of payment per period for an item with an associated subscription contract. */
  var subscriptionCost: js.UndefOr[ProductSubscriptionCost] = js.native
  
  /** Required. The CLDR territory code for the item. */
  var targetCountry: js.UndefOr[String] = js.native
  
  /** The tax category of the product, used to configure detailed tax nexus in account-level tax settings. */
  var taxCategory: js.UndefOr[String] = js.native
  
  /** Tax information. */
  var taxes: js.UndefOr[js.Array[ProductTax]] = js.native
  
  /** Title of the item. */
  var title: js.UndefOr[String] = js.native
  
  /** The transit time label of the product, used to group product in account-level transit time tables. */
  var transitTimeLabel: js.UndefOr[String] = js.native
  
  /** The preference of the denominator of the unit price. */
  var unitPricingBaseMeasure: js.UndefOr[ProductUnitPricingBaseMeasure] = js.native
  
  /** The measure and dimension of an item. */
  var unitPricingMeasure: js.UndefOr[ProductUnitPricingMeasure] = js.native
}
object Product {
  
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
    
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
    def setAdditionalImageLinksVarargs(value: String*): Self = this.set("additionalImageLinks", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalImageLinks(value: js.Array[String]): Self = this.set("additionalImageLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalImageLinks: Self = this.set("additionalImageLinks", js.undefined)
    
    @scala.inline
    def setAdsGrouping(value: String): Self = this.set("adsGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsGrouping: Self = this.set("adsGrouping", js.undefined)
    
    @scala.inline
    def setAdsLabelsVarargs(value: String*): Self = this.set("adsLabels", js.Array(value :_*))
    
    @scala.inline
    def setAdsLabels(value: js.Array[String]): Self = this.set("adsLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsLabels: Self = this.set("adsLabels", js.undefined)
    
    @scala.inline
    def setAdsRedirect(value: String): Self = this.set("adsRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdsRedirect: Self = this.set("adsRedirect", js.undefined)
    
    @scala.inline
    def setAdult(value: Boolean): Self = this.set("adult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdult: Self = this.set("adult", js.undefined)
    
    @scala.inline
    def setAgeGroup(value: String): Self = this.set("ageGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgeGroup: Self = this.set("ageGroup", js.undefined)
    
    @scala.inline
    def setAvailability(value: String): Self = this.set("availability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailability: Self = this.set("availability", js.undefined)
    
    @scala.inline
    def setAvailabilityDate(value: String): Self = this.set("availabilityDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityDate: Self = this.set("availabilityDate", js.undefined)
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    
    @scala.inline
    def setCanonicalLink(value: String): Self = this.set("canonicalLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalLink: Self = this.set("canonicalLink", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    
    @scala.inline
    def setCostOfGoodsSold(value: Price): Self = this.set("costOfGoodsSold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostOfGoodsSold: Self = this.set("costOfGoodsSold", js.undefined)
    
    @scala.inline
    def setCustomAttributesVarargs(value: CustomAttribute*): Self = this.set("customAttributes", js.Array(value :_*))
    
    @scala.inline
    def setCustomAttributes(value: js.Array[CustomAttribute]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setCustomLabel0(value: String): Self = this.set("customLabel0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel0: Self = this.set("customLabel0", js.undefined)
    
    @scala.inline
    def setCustomLabel1(value: String): Self = this.set("customLabel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel1: Self = this.set("customLabel1", js.undefined)
    
    @scala.inline
    def setCustomLabel2(value: String): Self = this.set("customLabel2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel2: Self = this.set("customLabel2", js.undefined)
    
    @scala.inline
    def setCustomLabel3(value: String): Self = this.set("customLabel3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel3: Self = this.set("customLabel3", js.undefined)
    
    @scala.inline
    def setCustomLabel4(value: String): Self = this.set("customLabel4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomLabel4: Self = this.set("customLabel4", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayAdsId(value: String): Self = this.set("displayAdsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAdsId: Self = this.set("displayAdsId", js.undefined)
    
    @scala.inline
    def setDisplayAdsLink(value: String): Self = this.set("displayAdsLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAdsLink: Self = this.set("displayAdsLink", js.undefined)
    
    @scala.inline
    def setDisplayAdsSimilarIdsVarargs(value: String*): Self = this.set("displayAdsSimilarIds", js.Array(value :_*))
    
    @scala.inline
    def setDisplayAdsSimilarIds(value: js.Array[String]): Self = this.set("displayAdsSimilarIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAdsSimilarIds: Self = this.set("displayAdsSimilarIds", js.undefined)
    
    @scala.inline
    def setDisplayAdsTitle(value: String): Self = this.set("displayAdsTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAdsTitle: Self = this.set("displayAdsTitle", js.undefined)
    
    @scala.inline
    def setDisplayAdsValue(value: Double): Self = this.set("displayAdsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayAdsValue: Self = this.set("displayAdsValue", js.undefined)
    
    @scala.inline
    def setEnergyEfficiencyClass(value: String): Self = this.set("energyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnergyEfficiencyClass: Self = this.set("energyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setExcludedDestinationsVarargs(value: String*): Self = this.set("excludedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setExcludedDestinations(value: js.Array[String]): Self = this.set("excludedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedDestinations: Self = this.set("excludedDestinations", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setGoogleProductCategory(value: String): Self = this.set("googleProductCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleProductCategory: Self = this.set("googleProductCategory", js.undefined)
    
    @scala.inline
    def setGtin(value: String): Self = this.set("gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGtin: Self = this.set("gtin", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdentifierExists(value: Boolean): Self = this.set("identifierExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifierExists: Self = this.set("identifierExists", js.undefined)
    
    @scala.inline
    def setImageLink(value: String): Self = this.set("imageLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLink: Self = this.set("imageLink", js.undefined)
    
    @scala.inline
    def setIncludedDestinationsVarargs(value: String*): Self = this.set("includedDestinations", js.Array(value :_*))
    
    @scala.inline
    def setIncludedDestinations(value: js.Array[String]): Self = this.set("includedDestinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedDestinations: Self = this.set("includedDestinations", js.undefined)
    
    @scala.inline
    def setInstallment(value: Installment): Self = this.set("installment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallment: Self = this.set("installment", js.undefined)
    
    @scala.inline
    def setIsBundle(value: Boolean): Self = this.set("isBundle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBundle: Self = this.set("isBundle", js.undefined)
    
    @scala.inline
    def setItemGroupId(value: String): Self = this.set("itemGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemGroupId: Self = this.set("itemGroupId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setLoyaltyPoints(value: LoyaltyPoints): Self = this.set("loyaltyPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoyaltyPoints: Self = this.set("loyaltyPoints", js.undefined)
    
    @scala.inline
    def setMaterial(value: String): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    
    @scala.inline
    def setMaxEnergyEfficiencyClass(value: String): Self = this.set("maxEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEnergyEfficiencyClass: Self = this.set("maxEnergyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setMaxHandlingTime(value: String): Self = this.set("maxHandlingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHandlingTime: Self = this.set("maxHandlingTime", js.undefined)
    
    @scala.inline
    def setMinEnergyEfficiencyClass(value: String): Self = this.set("minEnergyEfficiencyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinEnergyEfficiencyClass: Self = this.set("minEnergyEfficiencyClass", js.undefined)
    
    @scala.inline
    def setMinHandlingTime(value: String): Self = this.set("minHandlingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHandlingTime: Self = this.set("minHandlingTime", js.undefined)
    
    @scala.inline
    def setMobileLink(value: String): Self = this.set("mobileLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileLink: Self = this.set("mobileLink", js.undefined)
    
    @scala.inline
    def setMpn(value: String): Self = this.set("mpn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMpn: Self = this.set("mpn", js.undefined)
    
    @scala.inline
    def setMultipack(value: String): Self = this.set("multipack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipack: Self = this.set("multipack", js.undefined)
    
    @scala.inline
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferId: Self = this.set("offerId", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setPrice(value: Price): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrice: Self = this.set("price", js.undefined)
    
    @scala.inline
    def setProductDetailsVarargs(value: ProductProductDetail*): Self = this.set("productDetails", js.Array(value :_*))
    
    @scala.inline
    def setProductDetails(value: js.Array[ProductProductDetail]): Self = this.set("productDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductDetails: Self = this.set("productDetails", js.undefined)
    
    @scala.inline
    def setProductHighlightsVarargs(value: String*): Self = this.set("productHighlights", js.Array(value :_*))
    
    @scala.inline
    def setProductHighlights(value: js.Array[String]): Self = this.set("productHighlights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductHighlights: Self = this.set("productHighlights", js.undefined)
    
    @scala.inline
    def setProductTypesVarargs(value: String*): Self = this.set("productTypes", js.Array(value :_*))
    
    @scala.inline
    def setProductTypes(value: js.Array[String]): Self = this.set("productTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductTypes: Self = this.set("productTypes", js.undefined)
    
    @scala.inline
    def setPromotionIdsVarargs(value: String*): Self = this.set("promotionIds", js.Array(value :_*))
    
    @scala.inline
    def setPromotionIds(value: js.Array[String]): Self = this.set("promotionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionIds: Self = this.set("promotionIds", js.undefined)
    
    @scala.inline
    def setSalePrice(value: Price): Self = this.set("salePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePrice: Self = this.set("salePrice", js.undefined)
    
    @scala.inline
    def setSalePriceEffectiveDate(value: String): Self = this.set("salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalePriceEffectiveDate: Self = this.set("salePriceEffectiveDate", js.undefined)
    
    @scala.inline
    def setSellOnGoogleQuantity(value: String): Self = this.set("sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSellOnGoogleQuantity: Self = this.set("sellOnGoogleQuantity", js.undefined)
    
    @scala.inline
    def setShippingVarargs(value: ProductShipping*): Self = this.set("shipping", js.Array(value :_*))
    
    @scala.inline
    def setShipping(value: js.Array[ProductShipping]): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
    
    @scala.inline
    def setShippingHeight(value: ProductShippingDimension): Self = this.set("shippingHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingHeight: Self = this.set("shippingHeight", js.undefined)
    
    @scala.inline
    def setShippingLabel(value: String): Self = this.set("shippingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingLabel: Self = this.set("shippingLabel", js.undefined)
    
    @scala.inline
    def setShippingLength(value: ProductShippingDimension): Self = this.set("shippingLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingLength: Self = this.set("shippingLength", js.undefined)
    
    @scala.inline
    def setShippingWeight(value: ProductShippingWeight): Self = this.set("shippingWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingWeight: Self = this.set("shippingWeight", js.undefined)
    
    @scala.inline
    def setShippingWidth(value: ProductShippingDimension): Self = this.set("shippingWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingWidth: Self = this.set("shippingWidth", js.undefined)
    
    @scala.inline
    def setShoppingAdsExcludedCountriesVarargs(value: String*): Self = this.set("shoppingAdsExcludedCountries", js.Array(value :_*))
    
    @scala.inline
    def setShoppingAdsExcludedCountries(value: js.Array[String]): Self = this.set("shoppingAdsExcludedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShoppingAdsExcludedCountries: Self = this.set("shoppingAdsExcludedCountries", js.undefined)
    
    @scala.inline
    def setSizeSystem(value: String): Self = this.set("sizeSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSystem: Self = this.set("sizeSystem", js.undefined)
    
    @scala.inline
    def setSizeType(value: String): Self = this.set("sizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeType: Self = this.set("sizeType", js.undefined)
    
    @scala.inline
    def setSizesVarargs(value: String*): Self = this.set("sizes", js.Array(value :_*))
    
    @scala.inline
    def setSizes(value: js.Array[String]): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizes: Self = this.set("sizes", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSubscriptionCost(value: ProductSubscriptionCost): Self = this.set("subscriptionCost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionCost: Self = this.set("subscriptionCost", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
    
    @scala.inline
    def setTaxCategory(value: String): Self = this.set("taxCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxCategory: Self = this.set("taxCategory", js.undefined)
    
    @scala.inline
    def setTaxesVarargs(value: ProductTax*): Self = this.set("taxes", js.Array(value :_*))
    
    @scala.inline
    def setTaxes(value: js.Array[ProductTax]): Self = this.set("taxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxes: Self = this.set("taxes", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTransitTimeLabel(value: String): Self = this.set("transitTimeLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitTimeLabel: Self = this.set("transitTimeLabel", js.undefined)
    
    @scala.inline
    def setUnitPricingBaseMeasure(value: ProductUnitPricingBaseMeasure): Self = this.set("unitPricingBaseMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPricingBaseMeasure: Self = this.set("unitPricingBaseMeasure", js.undefined)
    
    @scala.inline
    def setUnitPricingMeasure(value: ProductUnitPricingMeasure): Self = this.set("unitPricingMeasure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPricingMeasure: Self = this.set("unitPricingMeasure", js.undefined)
  }
}
