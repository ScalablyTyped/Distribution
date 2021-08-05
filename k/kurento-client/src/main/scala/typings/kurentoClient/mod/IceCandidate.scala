package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IceCandidate extends StObject {
  
  var candidate: String
  
  var sdpMLineIndex: Double
  
  var sdpMid: String
}
object IceCandidate {
  
  inline def apply(candidate: String, sdpMLineIndex: Double, sdpMid: String): IceCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any], sdpMLineIndex = sdpMLineIndex.asInstanceOf[js.Any], sdpMid = sdpMid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IceCandidate]
  }
  
  extension [Self <: IceCandidate](x: Self) {
    
    inline def setCandidate(value: String): Self = StObject.set(x, "candidate", value.asInstanceOf[js.Any])
    
    inline def setSdpMLineIndex(value: Double): Self = StObject.set(x, "sdpMLineIndex", value.asInstanceOf[js.Any])
    
    inline def setSdpMid(value: String): Self = StObject.set(x, "sdpMid", value.asInstanceOf[js.Any])
  }
}
