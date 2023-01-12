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
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var user_id: js.UndefOr[String] = js.undefined
}
object PartialEvent {
  
  inline def apply(): PartialEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialEvent] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEvent_name(value: String): Self = StObject.set(x, "event_name", value.asInstanceOf[js.Any])
    
    inline def setEvent_nameUndefined: Self = StObject.set(x, "event_name", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIntercom_user_id(value: String): Self = StObject.set(x, "intercom_user_id", value.asInstanceOf[js.Any])
    
    inline def setIntercom_user_idUndefined: Self = StObject.set(x, "intercom_user_id", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
    
    inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
  }
}
