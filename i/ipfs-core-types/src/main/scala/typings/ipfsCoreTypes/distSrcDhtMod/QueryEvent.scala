package typings.ipfsCoreTypes.distSrcDhtMod

import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.ADDING_PEER
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.DIALING_PEER
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.FINAL_PEER
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.PEER_RESPONSE
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.PROVIDER
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.QUERY_ERROR
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.SENDING_QUERY
import typings.ipfsCoreTypes.distSrcDhtMod.EventTypes.VALUE
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.ProviderEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.ValueEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent
  - typings.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent
*/
trait QueryEvent extends StObject
object QueryEvent {
  
  inline def AddingPeerEvent(peer: PeerId, `type`: ADDING_PEER): typings.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "ADDING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.AddingPeerEvent]
  }
  
  inline def DialingPeerEvent(peer: PeerId, `type`: DIALING_PEER): typings.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent = {
    val __obj = js.Dynamic.literal(name = "DIALING_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.DialingPeerEvent]
  }
  
  inline def FinalPeerEvent(peer: PeerInfo, `type`: FINAL_PEER): typings.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent = {
    val __obj = js.Dynamic.literal(name = "FINAL_PEER", peer = peer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.FinalPeerEvent]
  }
  
  inline def PeerResponseEvent(
    closer: js.Array[PeerInfo],
    from: PeerId,
    messageName: MessageName,
    messageType: MessageType,
    providers: js.Array[PeerInfo],
    `type`: PEER_RESPONSE
  ): typings.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent = {
    val __obj = js.Dynamic.literal(closer = closer.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], messageName = messageName.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], name = "PEER_RESPONSE", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.PeerResponseEvent]
  }
  
  inline def ProviderEvent(providers: js.Array[PeerInfo], `type`: PROVIDER): typings.ipfsCoreTypes.distSrcDhtMod.ProviderEvent = {
    val __obj = js.Dynamic.literal(name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.ProviderEvent]
  }
  
  inline def QueryErrorEvent(error: js.Error, `type`: QUERY_ERROR): typings.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], name = "QUERY_ERROR")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.QueryErrorEvent]
  }
  
  inline def SendingQueryEvent(`type`: SENDING_QUERY): typings.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent = {
    val __obj = js.Dynamic.literal(name = "SENDING_QUERY")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.SendingQueryEvent]
  }
  
  inline def ValueEvent(`type`: VALUE, value: js.typedarray.Uint8Array): typings.ipfsCoreTypes.distSrcDhtMod.ValueEvent = {
    val __obj = js.Dynamic.literal(name = "VALUE", value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ipfsCoreTypes.distSrcDhtMod.ValueEvent]
  }
}
