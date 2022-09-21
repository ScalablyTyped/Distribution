package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteSqlQueryResponse extends StObject {
  
  /**
    * In the case of successful execution of the query the response contains results returned by the external system. For example, the result rows of the query are contained in the 'results' Struct list - "results": [ { "field1": "val1", "field2": "val2",.. \},.. ] Each Struct row can contain fields any type of like nested Structs or lists.
    */
  var results: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaExecuteSqlQueryResponse {
  
  inline def apply(): SchemaExecuteSqlQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteSqlQueryResponse]
  }
  
  extension [Self <: SchemaExecuteSqlQueryResponse](x: Self) {
    
    inline def setResults(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsNull: Self = StObject.set(x, "results", null)
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
