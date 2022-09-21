package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2SearchRequest extends StObject {
  
  /**
    * Boost specification to boost certain products. See more details at this [user guide](https://cloud.google.com/retail/docs/boosting). Notice that if both ServingConfig.boost_control_ids and SearchRequest.boost_spec are set, the boost conditions from both places are evaluated. If a search request matches multiple boost conditions, the final boost score is equal to the sum of the boost scores from all matched boost conditions.
    */
  var boostSpec: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequestBoostSpec] = js.undefined
  
  /**
    * The branch resource name, such as `projects/x/locations/global/catalogs/default_catalog/branches/0`. Use "default_branch" as the branch ID or leave this field empty, to search products under the default branch.
    */
  var branch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The default filter that is applied when a user performs a search without checking any filters on the search page. The filter applied to every search request when quality improvement such as query expansion is needed. For example, if a query does not have enough results, an expanded query with SearchRequest.canonical_filter will be returned as a supplement of the original query. This field is strongly recommended to achieve high search quality. See SearchRequest.filter for more details about filter syntax.
    */
  var canonicalFilter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deprecated. Refer to https://cloud.google.com/retail/docs/configs#dynamic to enable dynamic facets. Do not set this field. The specification for dynamically generated facets. Notice that only textual facets can be dynamically generated.
    */
  var dynamicFacetSpec: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec] = js.undefined
  
  /**
    * Facet specifications for faceted search. If empty, no facets are returned. A maximum of 100 values are allowed. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var facetSpecs: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2SearchRequestFacetSpec]] = js.undefined
  
  /**
    * The filter syntax consists of an expression language for constructing a predicate from one or more fields of the products being filtered. Filter expression is case-sensitive. See more details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#filter). If this field is unrecognizable, an INVALID_ARGUMENT is returned.
    */
  var filter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The labels applied to a resource must meet the following requirements: * Each resource can have multiple labels, up to a maximum of 64. * Each label must be a key-value pair. * Keys have a minimum length of 1 character and a maximum length of 63 characters and cannot be empty. Values can be empty and have a maximum length of 63 characters. * Keys and values can contain only lowercase letters, numeric characters, underscores, and dashes. All characters must use UTF-8 encoding, and international characters are allowed. * The key portion of a label must be unique. However, you can use the same key with multiple resources. * Keys must start with a lowercase letter or international character. See [Google Cloud Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements) for more details.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * A 0-indexed integer that specifies the current offset (that is, starting result location, amongst the Products deemed by the API as relevant) in search results. This field is only considered if page_token is unset. If this field is negative, an INVALID_ARGUMENT is returned.
    */
  var offset: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The order in which products are returned. Products can be ordered by a field in an Product object. Leave it unset if ordered by relevance. OrderBy expression is case-sensitive. See more details at this [user guide](https://cloud.google.com/retail/docs/filter-and-order#order). If this field is unrecognizable, an INVALID_ARGUMENT is returned.
    */
  var orderBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The categories associated with a category page. Required for category navigation queries to achieve good search quality. The format should be the same as UserEvent.page_categories; To represent full path of category, use '\>' sign to separate different hierarchies. If '\>' is part of the category name, please replace it with other character(s). Category pages include special pages such as sales or promotions. For instance, a special sale page may have the category hierarchy: "pageCategories" : ["Sales \> 2017 Black Friday Deals"].
    */
  var pageCategories: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Maximum number of Products to return. If unspecified, defaults to a reasonable value. The maximum allowed value is 120. Values above 120 will be coerced to 120. If this field is negative, an INVALID_ARGUMENT is returned.
    */
  var pageSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A page token SearchResponse.next_page_token, received from a previous SearchService.Search call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to SearchService.Search must match the call that provided the page token. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var pageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specification for personalization.
    */
  var personalizationSpec: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec] = js.undefined
  
  /**
    * Raw search query. If this field is empty, the request is considered a category browsing request and returned results are based on filter and page_categories.
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The query expansion specification that specifies the conditions under which query expansion will occur. See more details at this [user guide](https://cloud.google.com/retail/docs/result-size#query_expansion).
    */
  var queryExpansionSpec: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec] = js.undefined
  
  /**
    * The search mode of the search request. If not specified, a single search request triggers both product search and faceted search.
    */
  var searchMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The spell correction specification that specifies the mode under which spell correction will take effect.
    */
  var spellCorrectionSpec: js.UndefOr[SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec] = js.undefined
  
  /**
    * User information.
    */
  var userInfo: js.UndefOr[SchemaGoogleCloudRetailV2UserInfo] = js.undefined
  
  /**
    * The keys to fetch and rollup the matching variant Products attributes, FulfillmentInfo or LocalInventorys attributes. The attributes from all the matching variant Products or LocalInventorys are merged and de-duplicated. Notice that rollup attributes will lead to extra query latency. Maximum number of keys is 30. For FulfillmentInfo, a fulfillment type and a fulfillment ID must be provided in the format of "fulfillmentType.fulfillmentId". E.g., in "pickupInStore.store123", "pickupInStore" is fulfillment type and "store123" is the store ID. Supported keys are: * colorFamilies * price * originalPrice * discount * variantId * inventory(place_id,price) * inventory(place_id,original_price) * inventory(place_id,attributes.key), where key is any key in the Product.local_inventories.attributes map. * attributes.key, where key is any key in the Product.attributes map. * pickupInStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "pickup-in-store". * shipToStore.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "ship-to-store". * sameDayDelivery.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "same-day-delivery". * nextDayDelivery.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "next-day-delivery". * customFulfillment1.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-1". * customFulfillment2.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-2". * customFulfillment3.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-3". * customFulfillment4.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-4". * customFulfillment5.id, where id is any FulfillmentInfo.place_ids for FulfillmentInfo.type "custom-type-5". If this field is set to an invalid value other than these, an INVALID_ARGUMENT error is returned.
    */
  var variantRollupKeys: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Required. A unique identifier for tracking visitors. For example, this could be implemented with an HTTP cookie, which should be able to uniquely identify a visitor on a single device. This unique identifier should not change if the visitor logs in or out of the website. This should be the same identifier as UserEvent.visitor_id. The field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an INVALID_ARGUMENT error is returned.
    */
  var visitorId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2SearchRequest {
  
  inline def apply(): SchemaGoogleCloudRetailV2SearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2SearchRequest]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2SearchRequest](x: Self) {
    
    inline def setBoostSpec(value: SchemaGoogleCloudRetailV2SearchRequestBoostSpec): Self = StObject.set(x, "boostSpec", value.asInstanceOf[js.Any])
    
    inline def setBoostSpecUndefined: Self = StObject.set(x, "boostSpec", js.undefined)
    
    inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    inline def setBranchNull: Self = StObject.set(x, "branch", null)
    
    inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    inline def setCanonicalFilter(value: String): Self = StObject.set(x, "canonicalFilter", value.asInstanceOf[js.Any])
    
    inline def setCanonicalFilterNull: Self = StObject.set(x, "canonicalFilter", null)
    
    inline def setCanonicalFilterUndefined: Self = StObject.set(x, "canonicalFilter", js.undefined)
    
    inline def setDynamicFacetSpec(value: SchemaGoogleCloudRetailV2SearchRequestDynamicFacetSpec): Self = StObject.set(x, "dynamicFacetSpec", value.asInstanceOf[js.Any])
    
    inline def setDynamicFacetSpecUndefined: Self = StObject.set(x, "dynamicFacetSpec", js.undefined)
    
    inline def setFacetSpecs(value: js.Array[SchemaGoogleCloudRetailV2SearchRequestFacetSpec]): Self = StObject.set(x, "facetSpecs", value.asInstanceOf[js.Any])
    
    inline def setFacetSpecsUndefined: Self = StObject.set(x, "facetSpecs", js.undefined)
    
    inline def setFacetSpecsVarargs(value: SchemaGoogleCloudRetailV2SearchRequestFacetSpec*): Self = StObject.set(x, "facetSpecs", js.Array(value*))
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterNull: Self = StObject.set(x, "filter", null)
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageCategories(value: js.Array[String]): Self = StObject.set(x, "pageCategories", value.asInstanceOf[js.Any])
    
    inline def setPageCategoriesNull: Self = StObject.set(x, "pageCategories", null)
    
    inline def setPageCategoriesUndefined: Self = StObject.set(x, "pageCategories", js.undefined)
    
    inline def setPageCategoriesVarargs(value: String*): Self = StObject.set(x, "pageCategories", js.Array(value*))
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeNull: Self = StObject.set(x, "pageSize", null)
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenNull: Self = StObject.set(x, "pageToken", null)
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setPersonalizationSpec(value: SchemaGoogleCloudRetailV2SearchRequestPersonalizationSpec): Self = StObject.set(x, "personalizationSpec", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationSpecUndefined: Self = StObject.set(x, "personalizationSpec", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryExpansionSpec(value: SchemaGoogleCloudRetailV2SearchRequestQueryExpansionSpec): Self = StObject.set(x, "queryExpansionSpec", value.asInstanceOf[js.Any])
    
    inline def setQueryExpansionSpecUndefined: Self = StObject.set(x, "queryExpansionSpec", js.undefined)
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSearchMode(value: String): Self = StObject.set(x, "searchMode", value.asInstanceOf[js.Any])
    
    inline def setSearchModeNull: Self = StObject.set(x, "searchMode", null)
    
    inline def setSearchModeUndefined: Self = StObject.set(x, "searchMode", js.undefined)
    
    inline def setSpellCorrectionSpec(value: SchemaGoogleCloudRetailV2SearchRequestSpellCorrectionSpec): Self = StObject.set(x, "spellCorrectionSpec", value.asInstanceOf[js.Any])
    
    inline def setSpellCorrectionSpecUndefined: Self = StObject.set(x, "spellCorrectionSpec", js.undefined)
    
    inline def setUserInfo(value: SchemaGoogleCloudRetailV2UserInfo): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
    
    inline def setVariantRollupKeys(value: js.Array[String]): Self = StObject.set(x, "variantRollupKeys", value.asInstanceOf[js.Any])
    
    inline def setVariantRollupKeysNull: Self = StObject.set(x, "variantRollupKeys", null)
    
    inline def setVariantRollupKeysUndefined: Self = StObject.set(x, "variantRollupKeys", js.undefined)
    
    inline def setVariantRollupKeysVarargs(value: String*): Self = StObject.set(x, "variantRollupKeys", js.Array(value*))
    
    inline def setVisitorId(value: String): Self = StObject.set(x, "visitorId", value.asInstanceOf[js.Any])
    
    inline def setVisitorIdNull: Self = StObject.set(x, "visitorId", null)
    
    inline def setVisitorIdUndefined: Self = StObject.set(x, "visitorId", js.undefined)
  }
}
