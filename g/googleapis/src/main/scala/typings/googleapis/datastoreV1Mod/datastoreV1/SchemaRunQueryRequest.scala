package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for Datastore.RunQuery.
  */
trait SchemaRunQueryRequest extends StObject {
  
  /**
    * The GQL query to run.
    */
  var gqlQuery: js.UndefOr[SchemaGqlQuery] = js.undefined
  
  /**
    * Entities are partitioned into subsets, identified by a partition ID.
    * Queries are scoped to a single partition. This partition ID is normalized
    * with the standard default context partition ID.
    */
  var partitionId: js.UndefOr[SchemaPartitionId] = js.undefined
  
  /**
    * The query to run.
    */
  var query: js.UndefOr[SchemaQuery] = js.undefined
  
  /**
    * The options for this query.
    */
  var readOptions: js.UndefOr[SchemaReadOptions] = js.undefined
}
object SchemaRunQueryRequest {
  
  inline def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  
  extension [Self <: SchemaRunQueryRequest](x: Self) {
    
    inline def setGqlQuery(value: SchemaGqlQuery): Self = StObject.set(x, "gqlQuery", value.asInstanceOf[js.Any])
    
    inline def setGqlQueryUndefined: Self = StObject.set(x, "gqlQuery", js.undefined)
    
    inline def setPartitionId(value: SchemaPartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    inline def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    inline def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReadOptions(value: SchemaReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    inline def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
