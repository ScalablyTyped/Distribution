package typings.libp2pInterfaceDht.mod

import typings.libp2pInterfaceDht.mod.EventTypes.ADDING_PEER
import typings.libp2pInterfaceDht.mod.EventTypes.DIALING_PEER
import typings.libp2pInterfaceDht.mod.EventTypes.FINAL_PEER
import typings.libp2pInterfaceDht.mod.EventTypes.PEER_RESPONSE
import typings.libp2pInterfaceDht.mod.EventTypes.PROVIDER
import typings.libp2pInterfaceDht.mod.EventTypes.QUERY_ERROR
import typings.libp2pInterfaceDht.mod.EventTypes.SENDING_QUERY
import typings.libp2pInterfaceDht.mod.EventTypes.VALUE
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pInterfaceDht.mod.SendingQueryEvent
  - typings.libp2pInterfaceDht.mod.PeerResponseEvent
  - typings.libp2pInterfaceDht.mod.FinalPeerEvent
  - typings.libp2pInterfaceDht.mod.QueryErrorEvent
  - typings.libp2pInterfaceDht.mod.ProviderEvent
  - typings.libp2pInterfaceDht.mod.ValueEvent
  - typings.libp2pInterfaceDht.mod.AddingPeerEvent
  - typings.libp2pInterfaceDht.mod.DialingPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddingPeerEvent(peer: PeerId, `type`: ADDING_PEER): typings.libp2pInterfaceDht.mod.AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.AddingPeerEvent]
  }
  
  inline def DialingPeerEvent(peer: PeerId, `type`: DIALING_PEER): typings.libp2pInterfaceDht.mod.DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.DialingPeerEvent]
  }
  
  inline def FinalPeerEvent(from: PeerId, peer: PeerInfo, `type`: FINAL_PEER): typings.libp2pInterfaceDht.mod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typings.libp2pInterfaceDht.mod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(from: PeerId, providers: js.Array[PeerInfo], `type`: PROVIDER): typings.libp2pInterfaceDht.mod.ProviderEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, from: PeerId, `type`: QUERY_ERROR): typings.libp2pInterfaceDht.mod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.QueryErrorEvent]
  }
  
  inline def SendingQueryEvent(
    messageName: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageType * / any */ String,
    messageType: MessageType,
    to: PeerId,
    `type`: SENDING_QUERY
  ): typings.libp2pInterfaceDht.mod.SendingQueryEvent = {
    val __obj = js.Dynamic.literal(messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "SENDING_QUERY", to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.SendingQueryEvent]
  }
  
  inline def ValueEvent(from: PeerId, `type`: VALUE, value: js.typedarray.Uint8Array): typings.libp2pInterfaceDht.mod.ValueEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pInterfaceDht.mod.ValueEvent]
  }
}
