package typings.jitsiMeet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvatarChangedEvent extends StObject {
  
  var avatarURL: String
  
  var id: String
}
object AvatarChangedEvent {
  
  inline def apply(avatarURL: String, id: String): AvatarChangedEvent = {
    val __obj = js.Dynamic.literal(avatarURL = avatarURL.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarChangedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvatarChangedEvent] (val x: Self) extends AnyVal {
    
    inline def setAvatarURL(value: String): Self = StObject.set(x, "avatarURL", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
