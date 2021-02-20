package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitRequest extends StObject {
  
  /** The type of commit to perform. Defaults to `TRANSACTIONAL`. */
  var mode: js.UndefOr[String] = js.native
  
  /**
    * The mutations to perform. When mode is `TRANSACTIONAL`, mutations affecting a single entity are applied in order. The following sequences of mutations affecting a single entity are
    * not permitted in a single `Commit` request: - `insert` followed by `insert` - `update` followed by `insert` - `upsert` followed by `insert` - `delete` followed by `update` When mode
    * is `NON_TRANSACTIONAL`, no two mutations may affect a single entity.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.native
  
  /** The identifier of the transaction associated with the commit. A transaction identifier is returned by a call to Datastore.BeginTransaction. */
  var transaction: js.UndefOr[String] = js.native
}
object CommitRequest {
  
  @scala.inline
  def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  
  @scala.inline
  implicit class CommitRequestMutableBuilder[Self <: CommitRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMutations(value: js.Array[Mutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    @scala.inline
    def setMutationsVarargs(value: Mutation*): Self = StObject.set(x, "mutations", js.Array(value :_*))
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
