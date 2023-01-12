package typings.libp2pInterfacePeerStore.mod

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStoreEvents extends StObject {
  
  @JSName("change:metadata")
  var changeColonmetadata: CustomEvent[PeerMetadataChangeData]
  
  @JSName("change:multiaddrs")
  var changeColonmultiaddrs: CustomEvent[PeerMultiaddrsChangeData]
  
  @JSName("change:protocols")
  var changeColonprotocols: CustomEvent[PeerProtocolsChangeData]
  
  @JSName("change:pubkey")
  var changeColonpubkey: CustomEvent[PeerPublicKeyChangeData]
  
  var peer: CustomEvent[PeerInfo]
}
object PeerStoreEvents {
  
  inline def apply(
    changeColonmetadata: CustomEvent[PeerMetadataChangeData],
    changeColonmultiaddrs: CustomEvent[PeerMultiaddrsChangeData],
    changeColonprotocols: CustomEvent[PeerProtocolsChangeData],
    changeColonpubkey: CustomEvent[PeerPublicKeyChangeData],
    peer: CustomEvent[PeerInfo]
  ): PeerStoreEvents = {
    val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("change:metadata")(changeColonmetadata.asInstanceOf[js.Any])
    __obj.updateDynamic("change:multiaddrs")(changeColonmultiaddrs.asInstanceOf[js.Any])
    __obj.updateDynamic("change:protocols")(changeColonprotocols.asInstanceOf[js.Any])
    __obj.updateDynamic("change:pubkey")(changeColonpubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStoreEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerStoreEvents] (val x: Self) extends AnyVal {
    
    inline def setChangeColonmetadata(value: CustomEvent[PeerMetadataChangeData]): Self = StObject.set(x, "change:metadata", value.asInstanceOf[js.Any])
    
    inline def setChangeColonmultiaddrs(value: CustomEvent[PeerMultiaddrsChangeData]): Self = StObject.set(x, "change:multiaddrs", value.asInstanceOf[js.Any])
    
    inline def setChangeColonprotocols(value: CustomEvent[PeerProtocolsChangeData]): Self = StObject.set(x, "change:protocols", value.asInstanceOf[js.Any])
    
    inline def setChangeColonpubkey(value: CustomEvent[PeerPublicKeyChangeData]): Self = StObject.set(x, "change:pubkey", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: CustomEvent[PeerInfo]): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}
