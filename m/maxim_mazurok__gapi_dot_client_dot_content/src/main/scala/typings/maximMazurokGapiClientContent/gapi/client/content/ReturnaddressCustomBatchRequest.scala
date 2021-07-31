package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnaddressCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ReturnaddressCustomBatchRequestEntry]] = js.undefined
}
object ReturnaddressCustomBatchRequest {
  
  @scala.inline
  def apply(): ReturnaddressCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnaddressCustomBatchRequest]
  }
  
  @scala.inline
  implicit class ReturnaddressCustomBatchRequestMutableBuilder[Self <: ReturnaddressCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ReturnaddressCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ReturnaddressCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
