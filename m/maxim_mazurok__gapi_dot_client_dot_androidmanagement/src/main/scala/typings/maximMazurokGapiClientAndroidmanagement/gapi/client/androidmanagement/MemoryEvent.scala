package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryEvent extends StObject {
  
  /** The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in bytes of the storage medium. */
  var byteCount: js.UndefOr[String] = js.undefined
  
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Event type. */
  var eventType: js.UndefOr[String] = js.undefined
}
object MemoryEvent {
  
  inline def apply(): MemoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryEvent] (val x: Self) extends AnyVal {
    
    inline def setByteCount(value: String): Self = StObject.set(x, "byteCount", value.asInstanceOf[js.Any])
    
    inline def setByteCountUndefined: Self = StObject.set(x, "byteCount", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
