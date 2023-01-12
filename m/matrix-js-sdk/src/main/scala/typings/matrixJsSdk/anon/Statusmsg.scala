package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statusmsg extends StObject {
  
  var presence: String
  
  // One of "online", "offline" or "unavailable"
  var status_msg: String
}
object Statusmsg {
  
  inline def apply(presence: String, status_msg: String): Statusmsg = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any], status_msg = status_msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statusmsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statusmsg] (val x: Self) extends AnyVal {
    
    inline def setPresence(value: String): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setStatus_msg(value: String): Self = StObject.set(x, "status_msg", value.asInstanceOf[js.Any])
  }
}
