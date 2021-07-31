package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedstatusesCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[DatafeedstatusesCustomBatchRequestEntry]] = js.undefined
}
object DatafeedstatusesCustomBatchRequest {
  
  @scala.inline
  def apply(): DatafeedstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedstatusesCustomBatchRequest]
  }
  
  @scala.inline
  implicit class DatafeedstatusesCustomBatchRequestMutableBuilder[Self <: DatafeedstatusesCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[DatafeedstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: DatafeedstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
