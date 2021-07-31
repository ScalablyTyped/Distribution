package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaShippingsettingsCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaShippingsettingsCustomBatchRequestEntry]] = js.undefined
}
object SchemaShippingsettingsCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaShippingsettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaShippingsettingsCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaShippingsettingsCustomBatchRequestMutableBuilder[Self <: SchemaShippingsettingsCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaShippingsettingsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaShippingsettingsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
