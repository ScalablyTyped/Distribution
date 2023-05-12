package typings.libp2p.anon

import typings.libp2p.distSrcCircuitRelayPbMod.Limit
import typings.libp2p.distSrcCircuitRelayPbMod.Peer
import typings.libp2p.distSrcCircuitRelayPbMod.Status
import typings.libp2p.distSrcCircuitRelayPbMod.StopMessage.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p.libp2p/dist/src/circuit-relay/pb.StopMessage> */
trait PartialStopMessage extends StObject {
  
  var limit: js.UndefOr[Limit] = js.undefined
  
  var peer: js.UndefOr[Peer] = js.undefined
  
  var status: js.UndefOr[Status] = js.undefined
  
  var `type`: js.UndefOr[Type] = js.undefined
}
object PartialStopMessage {
  
  inline def apply(): PartialStopMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStopMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialStopMessage] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setPeer(value: Peer): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
