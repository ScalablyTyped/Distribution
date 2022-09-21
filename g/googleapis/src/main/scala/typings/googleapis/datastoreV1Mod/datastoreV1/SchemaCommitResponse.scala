package typings.googleapis.datastoreV1Mod.datastoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitResponse extends StObject {
  
  /**
    * The transaction commit timestamp. Not set for non-transactional commits.
    */
  var commitTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of index entries updated during the commit, or zero if none were updated.
    */
  var indexUpdates: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The result of performing the mutations. The i-th mutation result corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[SchemaMutationResult]] = js.undefined
}
object SchemaCommitResponse {
  
  inline def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  extension [Self <: SchemaCommitResponse](x: Self) {
    
    inline def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeNull: Self = StObject.set(x, "commitTime", null)
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setIndexUpdates(value: Double): Self = StObject.set(x, "indexUpdates", value.asInstanceOf[js.Any])
    
    inline def setIndexUpdatesNull: Self = StObject.set(x, "indexUpdates", null)
    
    inline def setIndexUpdatesUndefined: Self = StObject.set(x, "indexUpdates", js.undefined)
    
    inline def setMutationResults(value: js.Array[SchemaMutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
    
    inline def setMutationResultsUndefined: Self = StObject.set(x, "mutationResults", js.undefined)
    
    inline def setMutationResultsVarargs(value: SchemaMutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value*))
  }
}
