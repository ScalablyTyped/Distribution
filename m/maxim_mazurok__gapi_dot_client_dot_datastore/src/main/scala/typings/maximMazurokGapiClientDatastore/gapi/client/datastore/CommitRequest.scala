package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitRequest extends StObject {
  
  /** The ID of the database against which to make the request. '(default)' is not allowed; please use empty string '' to refer the default database. */
  var databaseId: js.UndefOr[String] = js.undefined
  
  /** The type of commit to perform. Defaults to `TRANSACTIONAL`. */
  var mode: js.UndefOr[String] = js.undefined
  
  /**
    * The mutations to perform. When mode is `TRANSACTIONAL`, mutations affecting a single entity are applied in order. The following sequences of mutations affecting a single entity are
    * not permitted in a single `Commit` request: - `insert` followed by `insert` - `update` followed by `insert` - `upsert` followed by `insert` - `delete` followed by `update` When mode
    * is `NON_TRANSACTIONAL`, no two mutations may affect a single entity.
    */
  var mutations: js.UndefOr[js.Array[Mutation]] = js.undefined
  
  /** The identifier of the transaction associated with the commit. A transaction identifier is returned by a call to Datastore.BeginTransaction. */
  var transaction: js.UndefOr[String] = js.undefined
}
object CommitRequest {
  
  inline def apply(): CommitRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitRequest]
  }
  
  extension [Self <: CommitRequest](x: Self) {
    
    inline def setDatabaseId(value: String): Self = StObject.set(x, "databaseId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseIdUndefined: Self = StObject.set(x, "databaseId", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMutations(value: js.Array[Mutation]): Self = StObject.set(x, "mutations", value.asInstanceOf[js.Any])
    
    inline def setMutationsUndefined: Self = StObject.set(x, "mutations", js.undefined)
    
    inline def setMutationsVarargs(value: Mutation*): Self = StObject.set(x, "mutations", js.Array(value*))
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
