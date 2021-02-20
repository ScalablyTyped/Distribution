package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnpolicyCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ReturnpolicyCustomBatchRequestEntry]] = js.native
}
object ReturnpolicyCustomBatchRequest {
  
  @scala.inline
  def apply(): ReturnpolicyCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnpolicyCustomBatchRequest]
  }
  
  @scala.inline
  implicit class ReturnpolicyCustomBatchRequestMutableBuilder[Self <: ReturnpolicyCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ReturnpolicyCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ReturnpolicyCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
