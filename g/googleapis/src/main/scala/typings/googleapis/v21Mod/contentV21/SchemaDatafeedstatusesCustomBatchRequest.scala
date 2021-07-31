package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDatafeedstatusesCustomBatchRequest extends StObject {
  
  /**
    * The request entries to be processed in the batch.
    */
  var entries: js.UndefOr[js.Array[SchemaDatafeedstatusesCustomBatchRequestEntry]] = js.undefined
}
object SchemaDatafeedstatusesCustomBatchRequest {
  
  @scala.inline
  def apply(): SchemaDatafeedstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatafeedstatusesCustomBatchRequest]
  }
  
  @scala.inline
  implicit class SchemaDatafeedstatusesCustomBatchRequestMutableBuilder[Self <: SchemaDatafeedstatusesCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[SchemaDatafeedstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: SchemaDatafeedstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
