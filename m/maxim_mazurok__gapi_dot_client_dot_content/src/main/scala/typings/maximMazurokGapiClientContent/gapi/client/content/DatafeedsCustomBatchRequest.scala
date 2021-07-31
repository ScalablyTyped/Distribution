package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatafeedsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[DatafeedsCustomBatchRequestEntry]] = js.undefined
}
object DatafeedsCustomBatchRequest {
  
  @scala.inline
  def apply(): DatafeedsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchRequest]
  }
  
  @scala.inline
  implicit class DatafeedsCustomBatchRequestMutableBuilder[Self <: DatafeedsCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[DatafeedsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: DatafeedsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
