package typings.libp2pKadDht

import typings.libp2pInterfaceDht.mod.AddingPeerEvent
import typings.libp2pInterfaceDht.mod.DialingPeerEvent
import typings.libp2pInterfaceDht.mod.FinalPeerEvent
import typings.libp2pInterfaceDht.mod.PeerResponseEvent
import typings.libp2pInterfaceDht.mod.ProviderEvent
import typings.libp2pInterfaceDht.mod.QueryErrorEvent
import typings.libp2pInterfaceDht.mod.SendingQueryEvent
import typings.libp2pInterfaceDht.mod.ValueEvent
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType
import typings.libp2pRecord.mod.Libp2pRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryEventsMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addingPeerEvent(fields: PeerEventFields): AddingPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("addingPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[AddingPeerEvent]
  
  inline def dialingPeerEvent(fields: DialingPeerEventFields): DialingPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("dialingPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[DialingPeerEvent]
  
  inline def finalPeerEvent(fields: FinalPeerEventFields): FinalPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("finalPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[FinalPeerEvent]
  
  inline def peerResponseEvent(fields: PeerResponseEventField): PeerResponseEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("peerResponseEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[PeerResponseEvent]
  
  inline def providerEvent(fields: ProviderEventFields): ProviderEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("providerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[ProviderEvent]
  
  inline def queryErrorEvent(fields: ErrorEventFields): QueryErrorEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("queryErrorEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[QueryErrorEvent]
  
  inline def sendingQueryEvent(fields: QueryEventFields): SendingQueryEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("sendingQueryEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[SendingQueryEvent]
  
  inline def valueEvent(fields: ValueEventFields): ValueEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("valueEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[ValueEvent]
  
  trait DialingPeerEventFields extends StObject {
    
    var peer: PeerId
  }
  object DialingPeerEventFields {
    
    inline def apply(peer: PeerId): DialingPeerEventFields = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialingPeerEventFields]
    }
    
    extension [Self <: DialingPeerEventFields](x: Self) {
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ErrorEventFields extends StObject {
    
    var error: js.Error
    
    var from: PeerId
  }
  object ErrorEventFields {
    
    inline def apply(error: js.Error, from: PeerId): ErrorEventFields = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorEventFields]
    }
    
    extension [Self <: ErrorEventFields](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait FinalPeerEventFields extends StObject {
    
    var from: PeerId
    
    var peer: PeerInfo
  }
  object FinalPeerEventFields {
    
    inline def apply(from: PeerId, peer: PeerInfo): FinalPeerEventFields = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[FinalPeerEventFields]
    }
    
    extension [Self <: FinalPeerEventFields](x: Self) {
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerInfo): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerEventFields extends StObject {
    
    var peer: PeerId
  }
  object PeerEventFields {
    
    inline def apply(peer: PeerId): PeerEventFields = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerEventFields]
    }
    
    extension [Self <: PeerEventFields](x: Self) {
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerResponseEventField extends StObject {
    
    var closer: js.UndefOr[js.Array[PeerInfo]] = js.undefined
    
    var from: PeerId
    
    var messageType: MessageType
    
    var providers: js.UndefOr[js.Array[PeerInfo]] = js.undefined
    
    var record: js.UndefOr[Libp2pRecord] = js.undefined
  }
  object PeerResponseEventField {
    
    inline def apply(from: PeerId, messageType: MessageType): PeerResponseEventField = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerResponseEventField]
    }
    
    extension [Self <: PeerResponseEventField](x: Self) {
      
      inline def setCloser(value: js.Array[PeerInfo]): Self = StObject.set(x, "closer", value.asInstanceOf[js.Any])
      
      inline def setCloserUndefined: Self = StObject.set(x, "closer", js.undefined)
      
      inline def setCloserVarargs(value: PeerInfo*): Self = StObject.set(x, "closer", js.Array(value*))
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: MessageType): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: js.Array[PeerInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersUndefined: Self = StObject.set(x, "providers", js.undefined)
      
      inline def setProvidersVarargs(value: PeerInfo*): Self = StObject.set(x, "providers", js.Array(value*))
      
      inline def setRecord(value: Libp2pRecord): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
      
      inline def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    }
  }
  
  trait ProviderEventFields extends StObject {
    
    var from: PeerId
    
    var providers: js.Array[PeerInfo]
  }
  object ProviderEventFields {
    
    inline def apply(from: PeerId, providers: js.Array[PeerInfo]): ProviderEventFields = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProviderEventFields]
    }
    
    extension [Self <: ProviderEventFields](x: Self) {
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: js.Array[PeerInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setProvidersVarargs(value: PeerInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    }
  }
  
  trait QueryEventFields extends StObject {
    
    var to: PeerId
    
    var `type`: MessageType
  }
  object QueryEventFields {
    
    inline def apply(to: PeerId, `type`: MessageType): QueryEventFields = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryEventFields]
    }
    
    extension [Self <: QueryEventFields](x: Self) {
      
      inline def setTo(value: PeerId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueEventFields extends StObject {
    
    var from: PeerId
    
    var value: js.typedarray.Uint8Array
  }
  object ValueEventFields {
    
    inline def apply(from: PeerId, value: js.typedarray.Uint8Array): ValueEventFields = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueEventFields]
    }
    
    extension [Self <: ValueEventFields](x: Self) {
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
