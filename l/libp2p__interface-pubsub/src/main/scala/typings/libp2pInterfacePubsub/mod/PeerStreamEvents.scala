package typings.libp2pInterfacePubsub.mod

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStreamEvents extends StObject {
  
  var close: CustomEvent[scala.Nothing]
  
  @JSName("stream:inbound")
  var streamColoninbound: CustomEvent[scala.Nothing]
  
  @JSName("stream:outbound")
  var streamColonoutbound: CustomEvent[scala.Nothing]
}
object PeerStreamEvents {
  
  inline def apply(
    close: CustomEvent[scala.Nothing],
    streamColoninbound: CustomEvent[scala.Nothing],
    streamColonoutbound: CustomEvent[scala.Nothing]
  ): PeerStreamEvents = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.updateDynamic("stream:inbound")(streamColoninbound.asInstanceOf[js.Any])
    __obj.updateDynamic("stream:outbound")(streamColonoutbound.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStreamEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerStreamEvents] (val x: Self) extends AnyVal {
    
    inline def setClose(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setStreamColoninbound(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "stream:inbound", value.asInstanceOf[js.Any])
    
    inline def setStreamColonoutbound(value: CustomEvent[scala.Nothing]): Self = StObject.set(x, "stream:outbound", value.asInstanceOf[js.Any])
  }
}
