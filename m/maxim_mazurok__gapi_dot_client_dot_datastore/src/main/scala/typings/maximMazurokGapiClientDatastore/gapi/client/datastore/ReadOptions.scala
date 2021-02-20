package typings.maximMazurokGapiClientDatastore.gapi.client.datastore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadOptions extends StObject {
  
  /** The non-transactional read consistency to use. Cannot be set to `STRONG` for global queries. */
  var readConsistency: js.UndefOr[String] = js.native
  
  /** The identifier of the transaction in which to read. A transaction identifier is returned by a call to Datastore.BeginTransaction. */
  var transaction: js.UndefOr[String] = js.native
}
object ReadOptions {
  
  @scala.inline
  def apply(): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadOptions]
  }
  
  @scala.inline
  implicit class ReadOptionsMutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadConsistency(value: String): Self = StObject.set(x, "readConsistency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadConsistencyUndefined: Self = StObject.set(x, "readConsistency", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
