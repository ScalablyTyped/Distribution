package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemoryEvent extends StObject {
  
  /** The number of free bytes in the medium, or for EXTERNAL_STORAGE_DETECTED, the total capacity in bytes of the storage medium. */
  var byteCount: js.UndefOr[String] = js.native
  
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Event type. */
  var eventType: js.UndefOr[String] = js.native
}
object MemoryEvent {
  
  @scala.inline
  def apply(): MemoryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryEvent]
  }
  
  @scala.inline
  implicit class MemoryEventMutableBuilder[Self <: MemoryEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteCount(value: String): Self = StObject.set(x, "byteCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteCountUndefined: Self = StObject.set(x, "byteCount", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
  }
}
