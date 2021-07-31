package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountsCustomBatchResponse extends StObject {
  
  /**
    * The result of the execution of the batch requests.
    */
  var entries: js.UndefOr[js.Array[SchemaAccountsCustomBatchResponseEntry]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#accountsCustomBatchResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAccountsCustomBatchResponse {
  
  @scala.inline
  def apply(): SchemaAccountsCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountsCustomBatchResponse]
  }
  
  @scala.inline
  implicit class SchemaAccountsCustomBatchResponseMutableBuilder[Self <: SchemaAccountsCustomBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaAccountsCustomBatchResponseEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaAccountsCustomBatchResponseEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
