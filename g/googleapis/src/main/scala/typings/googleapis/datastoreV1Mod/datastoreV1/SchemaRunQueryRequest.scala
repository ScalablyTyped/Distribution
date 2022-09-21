package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunQueryRequest extends StObject {
  
  /**
    * The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database.
    */
  var databaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The GQL query to run. This query must be a non-aggregation query.
    */
  var gqlQuery: js.UndefOr[SchemaGqlQuery] = js.undefined
  
  /**
    * Entities are partitioned into subsets, identified by a partition ID. Queries are scoped to a single partition. This partition ID is normalized with the standard default context partition ID.
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
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdNull: Self = StObject.set(x, "databaseId", null)
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
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
