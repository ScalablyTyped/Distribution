package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sender extends StObject {
  
  var content: Replacementroom
  
  var room_id: String
  
  var sender: String
}
object Sender {
  
  inline def apply(content: Replacementroom, room_id: String, sender: String): Sender = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], room_id = room_id.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sender]
  }
  
  extension [Self <: Sender](x: Self) {
    
    inline def setContent(value: Replacementroom): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setRoom_id(value: String): Self = StObject.set(x, "room_id", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
