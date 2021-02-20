package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunQueryRequest extends StObject {
  
  /** The GQL query to run. */
  var gqlQuery: js.UndefOr[GqlQuery] = js.native
  
  /**
    * Entities are partitioned into subsets, identified by a partition ID. Queries are scoped to a single partition. This partition ID is normalized with the standard default context
    * partition ID.
    */
  var partitionId: js.UndefOr[PartitionId] = js.native
  
  /** The query to run. */
  var query: js.UndefOr[Query] = js.native
  
  /** The options for this query. */
  var readOptions: js.UndefOr[ReadOptions] = js.native
}
object RunQueryRequest {
  
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  @scala.inline
  implicit class RunQueryRequestMutableBuilder[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGqlQuery(value: GqlQuery): Self = StObject.set(x, "gqlQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGqlQueryUndefined: Self = StObject.set(x, "gqlQuery", js.undefined)
    
    @scala.inline
    def setPartitionId(value: PartitionId): Self = StObject.set(x, "partitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIdUndefined: Self = StObject.set(x, "partitionId", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setReadOptions(value: ReadOptions): Self = StObject.set(x, "readOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOptionsUndefined: Self = StObject.set(x, "readOptions", js.undefined)
  }
}
