package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaQueryOperator extends StObject {
  
  /**
    * Display name of the operator
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Potential list of values for the opeatror field. This field is only filled when we can safely enumerate all the possible values of this operator.
    */
  var enumValues: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Indicates the operator name that can be used to isolate the property using the greater-than operator.
    */
  var greaterThanOperatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Can this operator be used to get facets.
    */
  var isFacetable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates if multiple values can be set for this property.
    */
  var isRepeatable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Will the property associated with this facet be returned as part of search results.
    */
  var isReturnable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Can this operator be used to sort results.
    */
  var isSortable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Can get suggestions for this field.
    */
  var isSuggestable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates the operator name that can be used to isolate the property using the less-than operator.
    */
  var lessThanOperatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the object corresponding to the operator. This field is only filled for schema-specific operators, and is unset for common operators.
    */
  var objectType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the operator.
    */
  var operatorName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of the operator.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaQueryOperator {
  
  inline def apply(): SchemaQueryOperator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryOperator]
  }
  
  extension [Self <: SchemaQueryOperator](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnumValues(value: js.Array[String]): Self = StObject.set(x, "enumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesNull: Self = StObject.set(x, "enumValues", null)
    
    inline def setEnumValuesUndefined: Self = StObject.set(x, "enumValues", js.undefined)
    
    inline def setEnumValuesVarargs(value: String*): Self = StObject.set(x, "enumValues", js.Array(value*))
    
    inline def setGreaterThanOperatorName(value: String): Self = StObject.set(x, "greaterThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanOperatorNameNull: Self = StObject.set(x, "greaterThanOperatorName", null)
    
    inline def setGreaterThanOperatorNameUndefined: Self = StObject.set(x, "greaterThanOperatorName", js.undefined)
    
    inline def setIsFacetable(value: Boolean): Self = StObject.set(x, "isFacetable", value.asInstanceOf[js.Any])
    
    inline def setIsFacetableNull: Self = StObject.set(x, "isFacetable", null)
    
    inline def setIsFacetableUndefined: Self = StObject.set(x, "isFacetable", js.undefined)
    
    inline def setIsRepeatable(value: Boolean): Self = StObject.set(x, "isRepeatable", value.asInstanceOf[js.Any])
    
    inline def setIsRepeatableNull: Self = StObject.set(x, "isRepeatable", null)
    
    inline def setIsRepeatableUndefined: Self = StObject.set(x, "isRepeatable", js.undefined)
    
    inline def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    inline def setIsReturnableNull: Self = StObject.set(x, "isReturnable", null)
    
    inline def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    inline def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    inline def setIsSortableNull: Self = StObject.set(x, "isSortable", null)
    
    inline def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    inline def setIsSuggestable(value: Boolean): Self = StObject.set(x, "isSuggestable", value.asInstanceOf[js.Any])
    
    inline def setIsSuggestableNull: Self = StObject.set(x, "isSuggestable", null)
    
    inline def setIsSuggestableUndefined: Self = StObject.set(x, "isSuggestable", js.undefined)
    
    inline def setLessThanOperatorName(value: String): Self = StObject.set(x, "lessThanOperatorName", value.asInstanceOf[js.Any])
    
    inline def setLessThanOperatorNameNull: Self = StObject.set(x, "lessThanOperatorName", null)
    
    inline def setLessThanOperatorNameUndefined: Self = StObject.set(x, "lessThanOperatorName", js.undefined)
    
    inline def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeNull: Self = StObject.set(x, "objectType", null)
    
    inline def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
    
    inline def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    inline def setOperatorNameNull: Self = StObject.set(x, "operatorName", null)
    
    inline def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
