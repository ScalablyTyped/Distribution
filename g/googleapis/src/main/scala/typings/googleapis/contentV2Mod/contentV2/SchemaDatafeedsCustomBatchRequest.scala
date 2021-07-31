package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedsCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaDatafeedsCustomBatchRequestEntry]] = js.undefined
}
object SchemaDatafeedsCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaDatafeedsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedsCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaDatafeedsCustomBatchRequestMutableBuilder[Self <: SchemaDatafeedsCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaDatafeedsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaDatafeedsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
