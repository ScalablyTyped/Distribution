package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[PosCustomBatchRequestEntry]] = js.undefined
}
object PosCustomBatchRequest {
  
  inline def apply(): PosCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosCustomBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosCustomBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[PosCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: PosCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
