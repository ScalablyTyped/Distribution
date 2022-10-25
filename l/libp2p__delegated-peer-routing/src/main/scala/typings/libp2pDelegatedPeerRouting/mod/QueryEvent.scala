package typings.libp2pDelegatedPeerRouting.mod

import typings.libp2pDelegatedPeerRouting.mod.EventTypes.ADDING_PEER
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.DIALING_PEER
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.FINAL_PEER
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.PEER_RESPONSE
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.PROVIDER
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.QUERY_ERROR
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.SENDING_QUERY
import typings.libp2pDelegatedPeerRouting.mod.EventTypes.VALUE
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pDelegatedPeerRouting.mod.SendingQueryEvent
  - typings.libp2pDelegatedPeerRouting.mod.PeerResponseEvent
  - typings.libp2pDelegatedPeerRouting.mod.FinalPeerEvent
  - typings.libp2pDelegatedPeerRouting.mod.QueryErrorEvent
  - typings.libp2pDelegatedPeerRouting.mod.ProviderEvent
  - typings.libp2pDelegatedPeerRouting.mod.ValueEvent
  - typings.libp2pDelegatedPeerRouting.mod.AddingPeerEvent
  - typings.libp2pDelegatedPeerRouting.mod.DialingPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddingPeerEvent(peer: PeerId, `type`: ADDING_PEER): typings.libp2pDelegatedPeerRouting.mod.AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.AddingPeerEvent]
  }
  
  inline def DialingPeerEvent(peer: PeerId, `type`: DIALING_PEER): typings.libp2pDelegatedPeerRouting.mod.DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.DialingPeerEvent]
  }
  
  inline def FinalPeerEvent(peer: PeerInfo, `type`: FINAL_PEER): typings.libp2pDelegatedPeerRouting.mod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: MessageName,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typings.libp2pDelegatedPeerRouting.mod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(providers: js.Array[PeerInfo], `type`: PROVIDER): typings.libp2pDelegatedPeerRouting.mod.ProviderEvent = {
    val __obj = js.Dynamic.literal(name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, `type`: QUERY_ERROR): typings.libp2pDelegatedPeerRouting.mod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.QueryErrorEvent]
  }
  
  inline def SendingQueryEvent(`type`: SENDING_QUERY): typings.libp2pDelegatedPeerRouting.mod.SendingQueryEvent = {
    val __obj = js.Dynamic.literal(name = "SENDING_QUERY")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.SendingQueryEvent]
  }
  
  inline def ValueEvent(`type`: VALUE, value: js.typedarray.Uint8Array): typings.libp2pDelegatedPeerRouting.mod.ValueEvent = {
    val __obj = js.Dynamic.literal(name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedPeerRouting.mod.ValueEvent]
  }
}
