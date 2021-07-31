package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccounttaxCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaAccounttaxCustomBatchRequestEntry]] = js.undefined
}
object SchemaAccounttaxCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaAccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccounttaxCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaAccounttaxCustomBatchRequestMutableBuilder[Self <: SchemaAccounttaxCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaAccounttaxCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaAccounttaxCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
