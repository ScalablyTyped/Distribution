package typings.matrixBotSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sessions extends StObject {
  
  var sessions: js.Array[Connections]
}
object Sessions {
  
  inline def apply(sessions: js.Array[Connections]): Sessions = {
    val __obj = js.Dynamic.literal(sessions = sessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sessions]
  }
  
  extension [Self <: Sessions](x: Self) {
    
    inline def setSessions(value: js.Array[Connections]): Self = StObject.set(x, "sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsVarargs(value: Connections*): Self = StObject.set(x, "sessions", js.Array(value*))
  }
}
