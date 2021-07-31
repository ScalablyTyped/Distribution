package typings.googleapis.v1beta3Mod.datastoreV1beta3

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
  
  @scala.inline
  def apply(): SchemaRunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunQueryRequest]
  }
  
  @scala.inline
  implicit class SchemaRunQueryRequestMutableBuilder[Self <: SchemaRunQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGqlQuery(value: SchemaGqlQuery): Self = StObject.set(x, "gqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGqlQueryUndefined: Self = StObject.set(x, "gqlQuery", js.undefined)
    
    @scala.inline
    def setPartitionId(value: SchemaPartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    @scala.inline
    def setQuery(value: SchemaQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReadOptions(value: SchemaReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
