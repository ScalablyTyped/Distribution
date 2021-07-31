package typings.intercomClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<intercom-client.intercom-client/Event.Event> */
trait PartialEvent extends StObject {
  
  var created_at: js.UndefOr[Double] = js.undefined
  
  var email: js.UndefOr[String] = js.undefined
  
  var event_name: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var intercom_user_id: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[js.Any] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
}
object PartialEvent {
  
  @scala.inline
  def apply(): PartialEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEvent]
  }
  
  @scala.inline
  implicit class PartialEventMutableBuilder[Self <: PartialEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_nameUndefined: Self = StObject.set(x, "event_name", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIntercom_user_id(value: String): Self = StObject.set(x, "intercom_user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntercom_user_idUndefined: Self = StObject.set(x, "intercom_user_id", js.undefined)
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
