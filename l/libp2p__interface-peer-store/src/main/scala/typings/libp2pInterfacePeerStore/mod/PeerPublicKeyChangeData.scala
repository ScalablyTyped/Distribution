package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerPublicKeyChangeData extends StObject {
  
  var oldPublicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  
  var peerId: PeerId
  
  var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
}
object PeerPublicKeyChangeData {
  
  inline def apply(peerId: PeerId): PeerPublicKeyChangeData = {
    val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerPublicKeyChangeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerPublicKeyChangeData] (val x: Self) extends AnyVal {
    
    inline def setOldPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "oldPublicKey", value.asInstanceOf[js.Any])
    
    inline def setOldPublicKeyUndefined: Self = StObject.set(x, "oldPublicKey", js.undefined)
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
