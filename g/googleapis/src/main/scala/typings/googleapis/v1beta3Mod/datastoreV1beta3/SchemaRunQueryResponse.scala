package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Datastore.RunQuery.
  */
trait SchemaRunQueryResponse extends StObject {
  
  /**
    * A batch of query results (always present).
    */
  var batch: js.UndefOr[SchemaQueryResultBatch] = js.undefined
  
  /**
    * The parsed form of the `GqlQuery` from the request, if it was set.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
}
object SchemaRunQueryResponse {
  
  inline def apply(): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
  
  extension [Self <: SchemaRunQueryResponse](x: Self) {
    
    inline def setBatch(value: SchemaQueryResultBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    inline def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
