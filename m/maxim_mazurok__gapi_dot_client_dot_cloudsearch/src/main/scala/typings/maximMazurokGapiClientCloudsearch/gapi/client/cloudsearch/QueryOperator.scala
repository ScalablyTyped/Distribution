package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOperator extends StObject {
  
  /** Display name of the operator */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Potential list of values for the opeatror field. This field is only filled when we can safely enumerate all the possible values of this operator. */
  var enumValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates the operator name that can be used to isolate the property using the greater-than operator. */
  var greaterThanOperatorName: js.UndefOr[String] = js.undefined
  
  /** Can this operator be used to get facets. */
  var isFacetable: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates if multiple values can be set for this property. */
  var isRepeatable: js.UndefOr[Boolean] = js.undefined
  
  /** Will the property associated with this facet be returned as part of search results. */
  var isReturnable: js.UndefOr[Boolean] = js.undefined
  
  /** Can this operator be used to sort results. */
  var isSortable: js.UndefOr[Boolean] = js.undefined
  
  /** Can get suggestions for this field. */
  var isSuggestable: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates the operator name that can be used to isolate the property using the less-than operator. */
  var lessThanOperatorName: js.UndefOr[String] = js.undefined
  
  /** Name of the object corresponding to the operator. This field is only filled for schema-specific operators, and is unset for common operators. */
  var objectType: js.UndefOr[String] = js.undefined
  
  /** The name of the operator. */
  var operatorName: js.UndefOr[String] = js.undefined
  
  /** Type of the operator. */
  var `type`: js.UndefOr[String] = js.undefined
}
object QueryOperator {
  
  inline def apply(): QueryOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOperator]
  }
  
  extension [Self <: QueryOperator](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnumValues(value: js.Array[String]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    inline def setEnumValuesVarargs(value: String*): Self = StObject.set(x, "enumValues", js.Array(value :_*))
    
    inline def setGreaterThanOperatorName(value: String): Self = StObject.set(x, "greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOperatorNameUndefined: Self = StObject.set(x, "greaterThanOperatorName", js.undefined)
    
    inline def setIsFacetable(value: Boolean): Self = StObject.set(x, "isFacetable", value.asInstanceOf[js.Any])
    
    inline def setIsFacetableUndefined: Self = StObject.set(x, "isFacetable", js.undefined)
    
    inline def setIsRepeatable(value: Boolean): Self = StObject.set(x, "isRepeatable", value.asInstanceOf[js.Any])
    
    inline def setIsRepeatableUndefined: Self = StObject.set(x, "isRepeatable", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsSuggestable(value: Boolean): Self = StObject.set(x, "isSuggestable", value.asInstanceOf[js.Any])
    
    inline def setIsSuggestableUndefined: Self = StObject.set(x, "isSuggestable", js.undefined)
    
    inline def setLessThanOperatorName(value: String): Self = StObject.set(x, "lessThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setLessThanOperatorNameUndefined: Self = StObject.set(x, "lessThanOperatorName", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
