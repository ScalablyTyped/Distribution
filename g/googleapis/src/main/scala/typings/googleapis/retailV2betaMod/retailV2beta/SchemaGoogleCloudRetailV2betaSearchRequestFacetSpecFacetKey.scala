package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaSearchRequestFacetSpecFacetKey extends StObject {
  
  /**
    * True to make facet keys case insensitive when getting faceting values with prefixes or contains; false otherwise.
    */
  var caseInsensitive: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Only get facet values that contains the given strings. For example, suppose "categories" has three values "Women \> Shoe", "Women \> Dress" and "Men \> Shoe". If set "contains" to "Shoe", the "categories" facet will give only "Women \> Shoe" and "Men \> Shoe". Only supported on textual fields. Maximum is 10.
    */
  var contains: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Set only if values should be bucketized into intervals. Must be set for facets with numerical values. Must not be set for facet with text values. Maximum number of intervals is 30.
    */
  var intervals: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaInterval]] = js.undefined
  
  /**
    * Required. Supported textual and numerical facet keys in Product object, over which the facet values are computed. Facet key is case-sensitive. Allowed facet keys when FacetKey.query is not specified: * textual_field = * "brands" * "categories" * "genders" * "ageGroups" * "availability" * "colorFamilies" * "colors" * "sizes" * "materials" * "patterns" * "conditions" * "attributes.key" * "pickupInStore" * "shipToStore" * "sameDayDelivery" * "nextDayDelivery" * "customFulfillment1" * "customFulfillment2" * "customFulfillment3" * "customFulfillment4" * "customFulfillment5" * "inventory(place_id,attributes.key)" * numerical_field = * "price" * "discount" * "rating" * "ratingCount" * "attributes.key" * "inventory(place_id,price)" * "inventory(place_id,original_price)" * "inventory(place_id,attributes.key)"
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The order in which SearchResponse.Facet.values are returned. Allowed values are: * "count desc", which means order by SearchResponse.Facet.values.count descending. * "value desc", which means order by SearchResponse.Facet.values.value descending. Only applies to textual facets. If not set, textual values are sorted in [natural order](https://en.wikipedia.org/wiki/Natural_sort_order); numerical intervals are sorted in the order given by FacetSpec.FacetKey.intervals; FulfillmentInfo.place_ids are sorted in the order given by FacetSpec.FacetKey.restricted_values.
    */
  var orderBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only get facet values that start with the given string prefix. For example, suppose "categories" has three values "Women \> Shoe", "Women \> Dress" and "Men \> Shoe". If set "prefixes" to "Women", the "categories" facet will give only "Women \> Shoe" and "Women \> Dress". Only supported on textual fields. Maximum is 10.
    */
  var prefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The query that is used to compute facet for the given facet key. When provided, it will override the default behavior of facet computation. The query syntax is the same as a filter expression. See SearchRequest.filter for detail syntax and limitations. Notice that there is no limitation on FacetKey.key when query is specified. In the response, SearchResponse.Facet.values.value will be always "1" and SearchResponse.Facet.values.count will be the number of results that match the query. For example, you can set a customized facet for "shipToStore", where FacetKey.key is "customizedShipToStore", and FacetKey.query is "availability: ANY(\"IN_STOCK\") AND shipToStore: ANY(\"123\")". Then the facet will count the products that are both in stock and ship to store "123".
    */
  var query: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only get facet for the given restricted values. For example, when using "pickupInStore" as key and set restricted values to ["store123", "store456"], only facets for "store123" and "store456" are returned. Only supported on predefined textual fields, custom textual attributes and fulfillments. Maximum is 20. Must be set for the fulfillment facet keys: * pickupInStore * shipToStore * sameDayDelivery * nextDayDelivery * customFulfillment1 * customFulfillment2 * customFulfillment3 * customFulfillment4 * customFulfillment5
    */
  var restrictedValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Returns the min and max value for each numerical facet intervals. Ignored for textual facets.
    */
  var returnMinMax: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaSearchRequestFacetSpecFacetKey {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaSearchRequestFacetSpecFacetKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaSearchRequestFacetSpecFacetKey]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaSearchRequestFacetSpecFacetKey](x: Self) {
    
    inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseInsensitiveNull: Self = StObject.set(x, "caseInsensitive", null)
    
    inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
    
    inline def setContains(value: js.Array[String]): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
    
    inline def setContainsNull: Self = StObject.set(x, "contains", null)
    
    inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
    
    inline def setContainsVarargs(value: String*): Self = StObject.set(x, "contains", js.Array(value*))
    
    inline def setIntervals(value: js.Array[SchemaGoogleCloudRetailV2betaInterval]): Self = StObject.set(x, "intervals", value.asInstanceOf[js.Any])
    
    inline def setIntervalsUndefined: Self = StObject.set(x, "intervals", js.undefined)
    
    inline def setIntervalsVarargs(value: SchemaGoogleCloudRetailV2betaInterval*): Self = StObject.set(x, "intervals", js.Array(value*))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByNull: Self = StObject.set(x, "orderBy", null)
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPrefixes(value: js.Array[String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setPrefixesNull: Self = StObject.set(x, "prefixes", null)
    
    inline def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    
    inline def setPrefixesVarargs(value: String*): Self = StObject.set(x, "prefixes", js.Array(value*))
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRestrictedValues(value: js.Array[String]): Self = StObject.set(x, "restrictedValues", value.asInstanceOf[js.Any])
    
    inline def setRestrictedValuesNull: Self = StObject.set(x, "restrictedValues", null)
    
    inline def setRestrictedValuesUndefined: Self = StObject.set(x, "restrictedValues", js.undefined)
    
    inline def setRestrictedValuesVarargs(value: String*): Self = StObject.set(x, "restrictedValues", js.Array(value*))
    
    inline def setReturnMinMax(value: Boolean): Self = StObject.set(x, "returnMinMax", value.asInstanceOf[js.Any])
    
    inline def setReturnMinMaxNull: Self = StObject.set(x, "returnMinMax", null)
    
    inline def setReturnMinMaxUndefined: Self = StObject.set(x, "returnMinMax", js.undefined)
  }
}
