package typings.iitc.hooksMod.global

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventNicknameClicked extends StObject {
  
  var event: MouseEvent
  
  var nickname: String
}
object EventNicknameClicked {
  
  inline def apply(event: MouseEvent, nickname: String): EventNicknameClicked = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventNicknameClicked]
  }
  
  extension [Self <: EventNicknameClicked](x: Self) {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
  }
}
