package typings.jwplayer.jwplayer

import typings.jwplayer.jwplayerStrings.complete
import typings.jwplayer.jwplayerStrings.error
import typings.jwplayer.jwplayerStrings.loading
import typings.jwplayer.jwplayerStrings.stalled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferParam extends StObject {
  
  var newstate: String
  
  var oldstate: String
  
  var reason: loading | complete | stalled | error
}
object BufferParam {
  
  inline def apply(newstate: String, oldstate: String, reason: loading | complete | stalled | error): BufferParam = {
    val __obj = js.Dynamic.literal(newstate = newstate.asInstanceOf[js.Any], oldstate = oldstate.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferParam]
  }
  
  extension [Self <: BufferParam](x: Self) {
    
    inline def setNewstate(value: String): Self = StObject.set(x, "newstate", value.asInstanceOf[js.Any])
    
    inline def setOldstate(value: String): Self = StObject.set(x, "oldstate", value.asInstanceOf[js.Any])
    
    inline def setReason(value: loading | complete | stalled | error): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
