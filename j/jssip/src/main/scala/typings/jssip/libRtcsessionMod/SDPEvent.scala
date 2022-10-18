package typings.jssip.libRtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPEvent extends StObject {
  
  var originator: Originator
  
  var sdp: String
  
  var `type`: String
}
object SDPEvent {
  
  inline def apply(originator: Originator, sdp: String, `type`: String): SDPEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any], sdp = sdp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPEvent]
  }
  
  extension [Self <: SDPEvent](x: Self) {
    
    inline def setOriginator(value: Originator): Self = StObject.set(x, "originator", value.asInstanceOf[js.Any])
    
    inline def setSdp(value: String): Self = StObject.set(x, "sdp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
