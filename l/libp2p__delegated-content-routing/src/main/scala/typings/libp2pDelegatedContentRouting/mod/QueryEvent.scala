package typings.libp2pDelegatedContentRouting.mod

import typings.libp2pDelegatedContentRouting.mod.EventTypes.ADDING_PEER
import typings.libp2pDelegatedContentRouting.mod.EventTypes.DIALING_PEER
import typings.libp2pDelegatedContentRouting.mod.EventTypes.FINAL_PEER
import typings.libp2pDelegatedContentRouting.mod.EventTypes.PEER_RESPONSE
import typings.libp2pDelegatedContentRouting.mod.EventTypes.PROVIDER
import typings.libp2pDelegatedContentRouting.mod.EventTypes.QUERY_ERROR
import typings.libp2pDelegatedContentRouting.mod.EventTypes.SENDING_QUERY
import typings.libp2pDelegatedContentRouting.mod.EventTypes.VALUE
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.libp2pDelegatedContentRouting.mod.SendingQueryEvent
  - typings.libp2pDelegatedContentRouting.mod.PeerResponseEvent
  - typings.libp2pDelegatedContentRouting.mod.FinalPeerEvent
  - typings.libp2pDelegatedContentRouting.mod.QueryErrorEvent
  - typings.libp2pDelegatedContentRouting.mod.ProviderEvent
  - typings.libp2pDelegatedContentRouting.mod.ValueEvent
  - typings.libp2pDelegatedContentRouting.mod.AddingPeerEvent
  - typings.libp2pDelegatedContentRouting.mod.DialingPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddingPeerEvent(peer: PeerId, `type`: ADDING_PEER): typings.libp2pDelegatedContentRouting.mod.AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.AddingPeerEvent]
  }
  
  inline def DialingPeerEvent(peer: PeerId, `type`: DIALING_PEER): typings.libp2pDelegatedContentRouting.mod.DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.DialingPeerEvent]
  }
  
  inline def FinalPeerEvent(peer: PeerInfo, `type`: FINAL_PEER): typings.libp2pDelegatedContentRouting.mod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: MessageName,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typings.libp2pDelegatedContentRouting.mod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(providers: js.Array[PeerInfo], `type`: PROVIDER): typings.libp2pDelegatedContentRouting.mod.ProviderEvent = {
    val __obj = js.Dynamic.literal(name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, `type`: QUERY_ERROR): typings.libp2pDelegatedContentRouting.mod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.QueryErrorEvent]
  }
  
  inline def SendingQueryEvent(`type`: SENDING_QUERY): typings.libp2pDelegatedContentRouting.mod.SendingQueryEvent = {
    val __obj = js.Dynamic.literal(name = "SENDING_QUERY")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.SendingQueryEvent]
  }
  
  inline def ValueEvent(`type`: VALUE, value: js.typedarray.Uint8Array): typings.libp2pDelegatedContentRouting.mod.ValueEvent = {
    val __obj = js.Dynamic.literal(name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.libp2pDelegatedContentRouting.mod.ValueEvent]
  }
}
