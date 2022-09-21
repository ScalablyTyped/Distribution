package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListExecutionsResponse extends StObject {
  
  /**
    * Executions. Always set.
    */
  var executions: js.UndefOr[js.Array[SchemaExecution]] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item. Will only be set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListExecutionsResponse {
  
  inline def apply(): SchemaListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListExecutionsResponse]
  }
  
  extension [Self <: SchemaListExecutionsResponse](x: Self) {
    
    inline def setExecutions(value: js.Array[SchemaExecution]): Self = StObject.set(x, "executions", value.asInstanceOf[js.Any])
    
    inline def setExecutionsUndefined: Self = StObject.set(x, "executions", js.undefined)
    
    inline def setExecutionsVarargs(value: SchemaExecution*): Self = StObject.set(x, "executions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
