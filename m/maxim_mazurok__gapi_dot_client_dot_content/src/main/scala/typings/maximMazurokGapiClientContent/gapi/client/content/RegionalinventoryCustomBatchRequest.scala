package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalinventoryCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[RegionalinventoryCustomBatchRequestEntry]] = js.undefined
}
object RegionalinventoryCustomBatchRequest {
  
  @scala.inline
  def apply(): RegionalinventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalinventoryCustomBatchRequest]
  }
  
  @scala.inline
  implicit class RegionalinventoryCustomBatchRequestMutableBuilder[Self <: RegionalinventoryCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[RegionalinventoryCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: RegionalinventoryCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
