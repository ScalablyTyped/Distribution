package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationEvent extends StObject {
  
  /** The creation time of the event. */
  var createTime: js.UndefOr[String] = js.native
  
  /** App event type. */
  var eventType: js.UndefOr[String] = js.native
}
object ApplicationEvent {
  
  @scala.inline
  def apply(): ApplicationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationEvent]
  }
  
  @scala.inline
  implicit class ApplicationEventMutableBuilder[Self <: ApplicationEvent] (val x: Self) extends AnyVal {
    
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
