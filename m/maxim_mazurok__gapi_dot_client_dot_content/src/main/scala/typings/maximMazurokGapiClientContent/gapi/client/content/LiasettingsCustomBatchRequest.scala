package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiasettingsCustomBatchRequest extends StObject {
  
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[LiasettingsCustomBatchRequestEntry]] = js.undefined
}
object LiasettingsCustomBatchRequest {
  
  inline def apply(): LiasettingsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsCustomBatchRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiasettingsCustomBatchRequest] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[LiasettingsCustomBatchRequestEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: LiasettingsCustomBatchRequestEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
