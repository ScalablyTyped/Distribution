package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitResponse extends js.Object {
  
  /** The number of index entries updated during the commit, or zero if none were updated. */
  var indexUpdates: js.UndefOr[Double] = js.native
  
  /** The result of performing the mutations. The i-th mutation result corresponds to the i-th mutation in the request. */
  var mutationResults: js.UndefOr[js.Array[MutationResult]] = js.native
}
object CommitResponse {
  
  @scala.inline
  def apply(): CommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitResponse]
  }
  
  @scala.inline
  implicit class CommitResponseOps[Self <: CommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexUpdates(value: Double): Self = this.set("indexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexUpdates: Self = this.set("indexUpdates", js.undefined)
    
    @scala.inline
    def setMutationResultsVarargs(value: MutationResult*): Self = this.set("mutationResults", js.Array(value :_*))
    
    @scala.inline
    def setMutationResults(value: js.Array[MutationResult]): Self = this.set("mutationResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutationResults: Self = this.set("mutationResults", js.undefined)
  }
}
