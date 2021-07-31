package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShippingsettingsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ShippingsettingsCustomBatchRequestEntry]] = js.undefined
}
object ShippingsettingsCustomBatchRequest {
  
  @scala.inline
  def apply(): ShippingsettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShippingsettingsCustomBatchRequest]
  }
  
  @scala.inline
  implicit class ShippingsettingsCustomBatchRequestMutableBuilder[Self <: ShippingsettingsCustomBatchRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: js.Array[ShippingsettingsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: ShippingsettingsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
