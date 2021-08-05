package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitResponse extends StObject {
  
  /** The number of index entries updated during the commit, or zero if none were updated. */
  var indexUpdates: js.UndefOr[Double] = js.undefined
  
  /** The result of performing the mutations. The i-th mutation result corresponds to the i-th mutation in the request. */
  var mutationResults: js.UndefOr[js.Array[MutationResult]] = js.undefined
}
object CommitResponse {
  
  inline def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  extension [Self <: CommitResponse](x: Self) {
    
    inline def setIndexUpdates(value: Double): Self = StObject.set(x, "indexUpdates", value.asInstanceOf[js.Any])
    
    inline def setIndexUpdatesUndefined: Self = StObject.set(x, "indexUpdates", js.undefined)
    
    inline def setMutationResults(value: js.Array[MutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
    
    inline def setMutationResultsUndefined: Self = StObject.set(x, "mutationResults", js.undefined)
    
    inline def setMutationResultsVarargs(value: MutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value :_*))
  }
}
