package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunQueryResponse extends StObject {
  
  /** A batch of query results (always present). */
  var batch: js.UndefOr[QueryResultBatch] = js.native
  
  /** The parsed form of the `GqlQuery` from the request, if it was set. */
  var query: js.UndefOr[Query] = js.native
}
object RunQueryResponse {
  
  @scala.inline
  def apply(): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryResponse]
  }
  
  @scala.inline
  implicit class RunQueryResponseMutableBuilder[Self <: RunQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatch(value: QueryResultBatch): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchUndefined: Self = StObject.set(x, "batch", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
