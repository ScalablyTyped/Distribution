package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2Product extends StObject {
  
  /**
    * Highly encouraged. Extra product attributes to be included. For example, for products, this could include the store name, vendor, style, color, etc. These are very strong signals for recommendation model, thus we highly recommend providing the attributes here. Features that can take on one of a limited number of possible values. Two types of features can be set are: Textual features. some examples would be the brand/maker of a product, or country of a customer. Numerical features. Some examples would be the height/weight of a product, or age of a customer. For example: `{ "vendor": {"text": ["vendor123", "vendor456"]\}, "lengths_cm": {"numbers":[2.3, 15.4]\}, "heights_cm": {"numbers":[8.1, 6.4]\} \}`. This field needs to pass all below criteria, otherwise an INVALID_ARGUMENT error is returned: * Max entries count: 200. * The key must be a UTF-8 encoded string with a length limit of 128 characters. * For indexable attribute, the key must match the pattern: `a-zA-Z0-9*`. For example, `key0LikeThis` or `KEY_1_LIKE_THIS`. * For text attributes, at most 400 values are allowed. Empty values are not allowed. Each value must be a non-empty UTF-8 encoded string with a length limit of 256 characters. * For number attributes, at most 400 values are allowed.
    */
  var attributes: js.UndefOr[StringDictionary[SchemaGoogleCloudRetailV2CustomAttribute] | Null] = js.undefined
  
  /**
    * The target group associated with a given audience (e.g. male, veterans, car owners, musicians, etc.) of the product.
    */
  var audience: js.UndefOr[SchemaGoogleCloudRetailV2Audience] = js.undefined
  
  /**
    * The online availability of the Product. Default to Availability.IN_STOCK. Corresponding properties: Google Merchant Center property [availability](https://support.google.com/merchants/answer/6324448). Schema.org property [Offer.availability](https://schema.org/availability).
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The available quantity of the item.
    */
  var availableQuantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The timestamp when this Product becomes available for SearchService.Search.
    */
  var availableTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The brands of the product. A maximum of 30 brands are allowed. Each brand must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [brand](https://support.google.com/merchants/answer/6324351). Schema.org property [Product.brand](https://schema.org/brand).
    */
  var brands: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Product categories. This field is repeated for supporting one product belonging to several parallel categories. Strongly recommended using the full path for better search / recommendation quality. To represent full path of category, use '\>' sign to separate different hierarchies. If '\>' is part of the category name, please replace it with other character(s). For example, if a shoes product belongs to both ["Shoes & Accessories" -\> "Shoes"] and ["Sports & Fitness" -\> "Athletic Clothing" -\> "Shoes"], it could be represented as: "categories": [ "Shoes & Accessories \> Shoes", "Sports & Fitness \> Athletic Clothing \> Shoes" ] Must be set for Type.PRIMARY Product otherwise an INVALID_ARGUMENT error is returned. At most 250 values are allowed per Product. Empty values are not allowed. Each value must be a UTF-8 encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property google_product_category. Schema.org property [Product.category] (https://schema.org/category). [mc_google_product_category]: https://support.google.com/merchants/answer/6324436
    */
  var categories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The id of the collection members when type is Type.COLLECTION. Non-existent product ids are allowed. The type of the members must be either Type.PRIMARY or Type.VARIANT otherwise an INVALID_ARGUMENT error is thrown. Should not set it for other types. A maximum of 1000 values are allowed. Otherwise, an INVALID_ARGUMENT error is return.
    */
  var collectionMemberIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The color of the product. Corresponding properties: Google Merchant Center property [color](https://support.google.com/merchants/answer/6324487). Schema.org property [Product.color](https://schema.org/color).
    */
  var colorInfo: js.UndefOr[SchemaGoogleCloudRetailV2ColorInfo] = js.undefined
  
  /**
    * The condition of the product. Strongly encouraged to use the standard values: "new", "refurbished", "used". A maximum of 1 value is allowed per Product. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [condition](https://support.google.com/merchants/answer/6324469). Schema.org property [Offer.itemCondition](https://schema.org/itemCondition).
    */
  var conditions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Product description. This field must be a UTF-8 encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [description](https://support.google.com/merchants/answer/6324468). Schema.org property [Product.description](https://schema.org/description).
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when this product becomes unavailable for SearchService.Search. If it is set, the Product is not available for SearchService.Search after expire_time. However, the product can still be retrieved by ProductService.GetProduct and ProductService.ListProducts. expire_time must be later than available_time and publish_time, otherwise an INVALID_ARGUMENT error is thrown. Corresponding properties: Google Merchant Center property [expiration_date](https://support.google.com/merchants/answer/6324499).
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Fulfillment information, such as the store IDs for in-store pickup or region IDs for different shipping methods. All the elements must have distinct FulfillmentInfo.type. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var fulfillmentInfo: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2FulfillmentInfo]] = js.undefined
  
  /**
    * The Global Trade Item Number (GTIN) of the product. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. This field must be a Unigram. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [gtin](https://support.google.com/merchants/answer/6324461). Schema.org property [Product.isbn](https://schema.org/isbn), [Product.gtin8](https://schema.org/gtin8), [Product.gtin12](https://schema.org/gtin12), [Product.gtin13](https://schema.org/gtin13), or [Product.gtin14](https://schema.org/gtin14). If the value is not a valid GTIN, an INVALID_ARGUMENT error is returned.
    */
  var gtin: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. Product identifier, which is the final component of name. For example, this field is "id_1", if name is `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/id_1`. This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [id](https://support.google.com/merchants/answer/6324405). Schema.org property [Product.sku](https://schema.org/sku).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product images for the product. We highly recommend putting the main image first. A maximum of 300 images are allowed. Corresponding properties: Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
    */
  var images: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Image]] = js.undefined
  
  /**
    * Language of the title/description and other string attributes. Use language tags defined by [BCP 47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). For product prediction, this field is ignored and the model automatically detects the text language. The Product can include text in different languages, but duplicating Products to provide text in multiple languages can result in degraded model performance. For product search this field is in use. It defaults to "en-US" if unset.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The material of the product. For example, "leather", "wooden". A maximum of 20 values are allowed. Each value must be a UTF-8 encoded string with a length limit of 200 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [material](https://support.google.com/merchants/answer/6324410). Schema.org property [Product.material](https://schema.org/material).
    */
  var materials: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. Full resource name of the product, such as `projects/x/locations/global/catalogs/default_catalog/branches/default_branch/products/product_id`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pattern or graphic print of the product. For example, "striped", "polka dot", "paisley". A maximum of 20 values are allowed per Product. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [pattern](https://support.google.com/merchants/answer/6324483). Schema.org property [Product.pattern](https://schema.org/pattern).
    */
  var patterns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Product price and cost information. Corresponding properties: Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371).
    */
  var priceInfo: js.UndefOr[SchemaGoogleCloudRetailV2PriceInfo] = js.undefined
  
  /**
    * Variant group identifier. Must be an id, with the same parent branch with this product. Otherwise, an error is thrown. For Type.PRIMARY Products, this field can only be empty or set to the same value as id. For VARIANT Products, this field cannot be empty. A maximum of 2,000 products are allowed to share the same Type.PRIMARY Product. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [item_group_id](https://support.google.com/merchants/answer/6324507). Schema.org property [Product.inProductGroupWithID](https://schema.org/inProductGroupWithID).
    */
  var primaryProductId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The promotions applied to the product. A maximum of 10 values are allowed per Product. Only Promotion.promotion_id will be used, other fields will be ignored if set.
    */
  var promotions: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Promotion]] = js.undefined
  
  /**
    * The timestamp when the product is published by the retailer for the first time, which indicates the freshness of the products. Note that this field is different from available_time, given it purely describes product freshness regardless of when it is available on search and recommendation.
    */
  var publishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rating of this product.
    */
  var rating: js.UndefOr[SchemaGoogleCloudRetailV2Rating] = js.undefined
  
  /**
    * Indicates which fields in the Products are returned in SearchResponse. Supported fields for all types: * audience * availability * brands * color_info * conditions * gtin * materials * name * patterns * price_info * rating * sizes * title * uri Supported fields only for Type.PRIMARY and Type.COLLECTION: * categories * description * images Supported fields only for Type.VARIANT: * Only the first image in images To mark attributes as retrievable, include paths of the form "attributes.key" where "key" is the key of a custom attribute, as specified in attributes. For Type.PRIMARY and Type.COLLECTION, the following fields are always returned in SearchResponse by default: * name For Type.VARIANT, the following fields are always returned in by default: * name * color_info The maximum number of paths is 30. Otherwise, an INVALID_ARGUMENT error is returned. Note: Returning more fields in SearchResponse can increase response payload size and serving latency.
    */
  var retrievableFields: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the product. To represent different size systems or size types, consider using this format: [[[size_system:]size_type:]size_value]. For example, in "US:MENS:M", "US" represents size system; "MENS" represents size type; "M" represents size value. In "GIRLS:27", size system is empty; "GIRLS" represents size type; "27" represents size value. In "32 inches", both size system and size type are empty, while size value is "32 inches". A maximum of 20 values are allowed per Product. Each value must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [size](https://support.google.com/merchants/answer/6324492), [size_type](https://support.google.com/merchants/answer/6324497), and [size_system](https://support.google.com/merchants/answer/6324502). Schema.org property [Product.size](https://schema.org/size).
    */
  var sizes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Custom tags associated with the product. At most 250 values are allowed per Product. This value must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. This tag can be used for filtering recommendation results by passing the tag as part of the PredictRequest.filter. Corresponding properties: Google Merchant Center property [custom_label_0–4](https://support.google.com/merchants/answer/6324473).
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. Product title. This field must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [title](https://support.google.com/merchants/answer/6324415). Schema.org property [Product.name](https://schema.org/name).
    */
  var title: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The TTL (time to live) of the product. If it is set, it must be a non-negative value, and expire_time is set as current timestamp plus ttl. The derived expire_time is returned in the output and ttl is left blank when retrieving the Product. If it is set, the product is not available for SearchService.Search after current timestamp plus ttl. However, the product can still be retrieved by ProductService.GetProduct and ProductService.ListProducts.
    */
  var ttl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The type of the product. Default to Catalog.product_level_config.ingestion_product_type if unset.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Canonical URL directly linking to the product detail page. It is strongly recommended to provide a valid uri for the product, otherwise the service performance could be significantly degraded. This field must be a UTF-8 encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Corresponding properties: Google Merchant Center property [link](https://support.google.com/merchants/answer/6324416). Schema.org property [Offer.url](https://schema.org/url).
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Product variants grouped together on primary product which share similar product attributes. It's automatically grouped by primary_product_id for all the product variants. Only populated for Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
    */
  var variants: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Product]] = js.undefined
}
object SchemaGoogleCloudRetailV2Product {
  
  inline def apply(): SchemaGoogleCloudRetailV2Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2Product]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2Product](x: Self) {
    
    inline def setAttributes(value: StringDictionary[SchemaGoogleCloudRetailV2CustomAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAudience(value: SchemaGoogleCloudRetailV2Audience): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
    
    inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setAvailableQuantity(value: Double): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    inline def setAvailableQuantityNull: Self = StObject.set(x, "availableQuantity", null)
    
    inline def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    inline def setAvailableTime(value: String): Self = StObject.set(x, "availableTime", value.asInstanceOf[js.Any])
    
    inline def setAvailableTimeNull: Self = StObject.set(x, "availableTime", null)
    
    inline def setAvailableTimeUndefined: Self = StObject.set(x, "availableTime", js.undefined)
    
    inline def setBrands(value: js.Array[String]): Self = StObject.set(x, "brands", value.asInstanceOf[js.Any])
    
    inline def setBrandsNull: Self = StObject.set(x, "brands", null)
    
    inline def setBrandsUndefined: Self = StObject.set(x, "brands", js.undefined)
    
    inline def setBrandsVarargs(value: String*): Self = StObject.set(x, "brands", js.Array(value*))
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesNull: Self = StObject.set(x, "categories", null)
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setCollectionMemberIds(value: js.Array[String]): Self = StObject.set(x, "collectionMemberIds", value.asInstanceOf[js.Any])
    
    inline def setCollectionMemberIdsNull: Self = StObject.set(x, "collectionMemberIds", null)
    
    inline def setCollectionMemberIdsUndefined: Self = StObject.set(x, "collectionMemberIds", js.undefined)
    
    inline def setCollectionMemberIdsVarargs(value: String*): Self = StObject.set(x, "collectionMemberIds", js.Array(value*))
    
    inline def setColorInfo(value: SchemaGoogleCloudRetailV2ColorInfo): Self = StObject.set(x, "colorInfo", value.asInstanceOf[js.Any])
    
    inline def setColorInfoUndefined: Self = StObject.set(x, "colorInfo", js.undefined)
    
    inline def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsNull: Self = StObject.set(x, "conditions", null)
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setFulfillmentInfo(value: js.Array[SchemaGoogleCloudRetailV2FulfillmentInfo]): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    inline def setFulfillmentInfoVarargs(value: SchemaGoogleCloudRetailV2FulfillmentInfo*): Self = StObject.set(x, "fulfillmentInfo", js.Array(value*))
    
    inline def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinNull: Self = StObject.set(x, "gtin", null)
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImages(value: js.Array[SchemaGoogleCloudRetailV2Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: SchemaGoogleCloudRetailV2Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMaterials(value: js.Array[String]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsNull: Self = StObject.set(x, "materials", null)
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: String*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsNull: Self = StObject.set(x, "patterns", null)
    
    inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setPriceInfo(value: SchemaGoogleCloudRetailV2PriceInfo): Self = StObject.set(x, "priceInfo", value.asInstanceOf[js.Any])
    
    inline def setPriceInfoUndefined: Self = StObject.set(x, "priceInfo", js.undefined)
    
    inline def setPrimaryProductId(value: String): Self = StObject.set(x, "primaryProductId", value.asInstanceOf[js.Any])
    
    inline def setPrimaryProductIdNull: Self = StObject.set(x, "primaryProductId", null)
    
    inline def setPrimaryProductIdUndefined: Self = StObject.set(x, "primaryProductId", js.undefined)
    
    inline def setPromotions(value: js.Array[SchemaGoogleCloudRetailV2Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: SchemaGoogleCloudRetailV2Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
    
    inline def setRating(value: SchemaGoogleCloudRetailV2Rating): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "rating", js.undefined)
    
    inline def setRetrievableFields(value: String): Self = StObject.set(x, "retrievableFields", value.asInstanceOf[js.Any])
    
    inline def setRetrievableFieldsNull: Self = StObject.set(x, "retrievableFields", null)
    
    inline def setRetrievableFieldsUndefined: Self = StObject.set(x, "retrievableFields", js.undefined)
    
    inline def setSizes(value: js.Array[String]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesNull: Self = StObject.set(x, "sizes", null)
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: String*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTtl(value: String): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlNull: Self = StObject.set(x, "ttl", null)
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVariants(value: js.Array[SchemaGoogleCloudRetailV2Product]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
    
    inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
    
    inline def setVariantsVarargs(value: SchemaGoogleCloudRetailV2Product*): Self = StObject.set(x, "variants", js.Array(value*))
  }
}
