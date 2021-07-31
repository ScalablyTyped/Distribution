package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductstatusesCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ProductstatusesCustomBatchRequestEntry]] = js.undefined
}
object ProductstatusesCustomBatchRequest {
  
  @scala.inline
  def apply(): ProductstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductstatusesCustomBatchRequest]
  }
  
  @scala.inline
  implicit class ProductstatusesCustomBatchRequestMutableBuilder[Self <: ProductstatusesCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ProductstatusesCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ProductstatusesCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
