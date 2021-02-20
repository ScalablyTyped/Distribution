package typings.googleapis.v1beta3Mod.datastoreV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Datastore.Commit.
  */
@js.native
trait SchemaCommitResponse extends StObject {
  
  /**
    * The number of index entries updated during the commit, or zero if none
    * were updated.
    */
  var indexUpdates: js.UndefOr[Double] = js.native
  
  /**
    * The result of performing the mutations. The i-th mutation result
    * corresponds to the i-th mutation in the request.
    */
  var mutationResults: js.UndefOr[js.Array[SchemaMutationResult]] = js.native
}
object SchemaCommitResponse {
  
  @scala.inline
  def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  @scala.inline
  implicit class SchemaCommitResponseMutableBuilder[Self <: SchemaCommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexUpdates(value: Double): Self = StObject.set(x, "indexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUpdatesUndefined: Self = StObject.set(x, "indexUpdates", js.undefined)
    
    @scala.inline
    def setMutationResults(value: js.Array[SchemaMutationResult]): Self = StObject.set(x, "mutationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationResultsUndefined: Self = StObject.set(x, "mutationResults", js.undefined)
    
    @scala.inline
    def setMutationResultsVarargs(value: SchemaMutationResult*): Self = StObject.set(x, "mutationResults", js.Array(value :_*))
  }
}
