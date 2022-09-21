package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteActionResponse extends StObject {
  
  /**
    * In the case of successful invocation of the specified action, the results Struct contains values based on the response of the action invoked. 1. If the action execution produces any entities as a result, they are returned as an array of Structs with the 'key' being the field name and the 'value' being the value of that field in each result row. { 'results': [{'key': 'value'\}, ...] \}
    */
  var results: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaExecuteActionResponse {
  
  inline def apply(): SchemaExecuteActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteActionResponse]
  }
  
  extension [Self <: SchemaExecuteActionResponse](x: Self) {
    
    inline def setResults(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
