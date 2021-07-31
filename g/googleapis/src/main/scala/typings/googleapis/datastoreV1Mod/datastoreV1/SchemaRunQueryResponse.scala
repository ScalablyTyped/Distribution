package typings.googleapis.datastoreV1Mod.datastoreV1

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
  
  @scala.inline
  def apply(): SchemaRunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryResponse]
  }
  
  @scala.inline
  implicit class SchemaRunQueryResponseMutableBuilder[Self <: SchemaRunQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: SchemaQueryResultBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
