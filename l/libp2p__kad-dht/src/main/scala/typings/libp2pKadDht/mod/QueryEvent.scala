package typings.libp2pKadDht.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pKadDht.mod.EventTypes.ADD_PEER
import typings.libp2pKadDht.mod.EventTypes.DIAL_PEER
import typings.libp2pKadDht.mod.EventTypes.FINAL_PEER
import typings.libp2pKadDht.mod.EventTypes.PEER_RESPONSE
import typings.libp2pKadDht.mod.EventTypes.PROVIDER
import typings.libp2pKadDht.mod.EventTypes.QUERY_ERROR
import typings.libp2pKadDht.mod.EventTypes.SEND_QUERY
import typings.libp2pKadDht.mod.EventTypes.VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pKadDht.mod.SendQueryEvent
  - typings.libp2pKadDht.mod.PeerResponseEvent
  - typings.libp2pKadDht.mod.FinalPeerEvent
  - typings.libp2pKadDht.mod.QueryErrorEvent
  - typings.libp2pKadDht.mod.ProviderEvent
  - typings.libp2pKadDht.mod.ValueEvent
  - typings.libp2pKadDht.mod.AddPeerEvent
  - typings.libp2pKadDht.mod.DialPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddPeerEvent(peer: PeerId, `type`: ADD_PEER): typings.libp2pKadDht.mod.AddPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADD_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.AddPeerEvent]
  }
  
  inline def DialPeerEvent(peer: PeerId, `type`: DIAL_PEER): typings.libp2pKadDht.mod.DialPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.DialPeerEvent]
  }
  
  inline def FinalPeerEvent(from: PeerId, peer: PeerInfo, `type`: FINAL_PEER): typings.libp2pKadDht.mod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typings.libp2pKadDht.mod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(from: PeerId, providers: js.Array[PeerInfo], `type`: PROVIDER): typings.libp2pKadDht.mod.ProviderEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, from: PeerId, `type`: QUERY_ERROR): typings.libp2pKadDht.mod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.QueryErrorEvent]
  }
  
  inline def SendQueryEvent(
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    to: PeerId,
    `type`: SEND_QUERY
  ): typings.libp2pKadDht.mod.SendQueryEvent = {
    val __obj = js.Dynamic.literal(messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "SEND_QUERY", to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.SendQueryEvent]
  }
  
  inline def ValueEvent(from: PeerId, `type`: VALUE, value: js.typedarray.Uint8Array): typings.libp2pKadDht.mod.ValueEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pKadDht.mod.ValueEvent]
  }
}
