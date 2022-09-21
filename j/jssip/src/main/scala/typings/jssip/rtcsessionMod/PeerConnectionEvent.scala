package typings.jssip.rtcsessionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerConnectionEvent extends StObject {
  
  var peerconnection: RTCPeerConnectionDeprecated
}
object PeerConnectionEvent {
  
  inline def apply(peerconnection: RTCPeerConnectionDeprecated): PeerConnectionEvent = {
    val __obj = js.Dynamic.literal(peerconnection = peerconnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerConnectionEvent]
  }
  
  extension [Self <: PeerConnectionEvent](x: Self) {
    
    inline def setPeerconnection(value: RTCPeerConnectionDeprecated): Self = StObject.set(x, "peerconnection", value.asInstanceOf[js.Any])
  }
}
