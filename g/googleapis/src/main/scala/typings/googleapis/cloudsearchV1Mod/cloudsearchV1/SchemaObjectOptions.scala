package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectOptions extends StObject {
  
  /**
    * The options that determine how the object is displayed in the Cloud Search results page.
    */
  var displayOptions: js.UndefOr[SchemaObjectDisplayOptions] = js.undefined
  
  /**
    * The freshness options for an object.
    */
  var freshnessOptions: js.UndefOr[SchemaFreshnessOptions] = js.undefined
  
  /**
    * Operators that can be used to filter suggestions. For Suggest API, only operators mentioned here will be honored in the FilterOptions. Only TEXT and ENUM operators are supported. NOTE: "objecttype", "type" and "mimetype" are already supported. This property is to configure schema specific operators. Even though this is an array, only one operator can be specified. This is an array for future extensibility. Operators mapping to multiple properties within the same object are not supported. If the operator spans across different object types, this option has to be set once for each object definition.
    */
  var suggestionFilteringOperators: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaObjectOptions {
  
  inline def apply(): SchemaObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectOptions]
  }
  
  extension [Self <: SchemaObjectOptions](x: Self) {
    
    inline def setDisplayOptions(value: SchemaObjectDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    inline def setFreshnessOptions(value: SchemaFreshnessOptions): Self = StObject.set(x, "freshnessOptions", value.asInstanceOf[js.Any])
    
    inline def setFreshnessOptionsUndefined: Self = StObject.set(x, "freshnessOptions", js.undefined)
    
    inline def setSuggestionFilteringOperators(value: js.Array[String]): Self = StObject.set(x, "suggestionFilteringOperators", value.asInstanceOf[js.Any])
    
    inline def setSuggestionFilteringOperatorsNull: Self = StObject.set(x, "suggestionFilteringOperators", null)
    
    inline def setSuggestionFilteringOperatorsUndefined: Self = StObject.set(x, "suggestionFilteringOperators", js.undefined)
    
    inline def setSuggestionFilteringOperatorsVarargs(value: String*): Self = StObject.set(x, "suggestionFilteringOperators", js.Array(value*))
  }
}
