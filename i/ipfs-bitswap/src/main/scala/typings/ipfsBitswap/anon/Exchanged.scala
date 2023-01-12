package typings.ipfsBitswap.anon

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exchanged extends StObject {
  
  var exchanged: Double
  
  var peer: PeerId
  
  var recv: Double
  
  var sent: Double
  
  var value: Double
}
object Exchanged {
  
  inline def apply(exchanged: Double, peer: PeerId, recv: Double, sent: Double, value: Double): Exchanged = {
    val __obj = js.Dynamic.literal(exchanged = exchanged.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], recv = recv.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exchanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exchanged] (val x: Self) extends AnyVal {
    
    inline def setExchanged(value: Double): Self = StObject.set(x, "exchanged", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    
    inline def setRecv(value: Double): Self = StObject.set(x, "recv", value.asInstanceOf[js.Any])
    
    inline def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
