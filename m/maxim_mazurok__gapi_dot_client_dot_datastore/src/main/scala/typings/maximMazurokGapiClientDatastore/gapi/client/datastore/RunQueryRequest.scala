package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryRequest extends StObject {
  
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.undefined
  
  /**
    * Entities are partitioned into subsets, identified by a partition ID. Queries are scoped to a single partition. This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.undefined
  
  /** The query to run. */
  var query: js.UndefOr[Query] = js.undefined
  
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.undefined
}
object RunQueryRequest {
  
  inline def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  extension [Self <: RunQueryRequest](x: Self) {
    
    inline def setGqlQuery(value: GqlQuery): Self = StObject.set(x, "gqlQuery", value.asInstanceOf[js.Any])
    
    inline def setGqlQueryUndefined: Self = StObject.set(x, "gqlQuery", js.undefined)
    
    inline def setPartitionId(value: PartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadOptions(value: ReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    inline def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
