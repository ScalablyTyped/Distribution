package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountsCustomBatchResponse extends StObject {
  
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[AccountsCustomBatchResponseEntry]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#accountsCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object AccountsCustomBatchResponse {
  
  @scala.inline
  def apply(): AccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountsCustomBatchResponse]
  }
  
  @scala.inline
  implicit class AccountsCustomBatchResponseMutableBuilder[Self <: AccountsCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[AccountsCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: AccountsCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
