package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pKadDht.distSrcMessageDhtMod.Message.MessageType
import typings.libp2pKadDht.mod.AddPeerEvent
import typings.libp2pKadDht.mod.DialPeerEvent
import typings.libp2pKadDht.mod.FinalPeerEvent
import typings.libp2pKadDht.mod.PeerResponseEvent
import typings.libp2pKadDht.mod.ProviderEvent
import typings.libp2pKadDht.mod.QueryErrorEvent
import typings.libp2pKadDht.mod.QueryOptions
import typings.libp2pKadDht.mod.SendQueryEvent
import typings.libp2pKadDht.mod.ValueEvent
import typings.libp2pRecord.mod.Libp2pRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryEventsMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addPeerEvent(fields: PeerEventFields): AddPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("addPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[AddPeerEvent]
  inline def addPeerEvent(fields: PeerEventFields, options: QueryOptions): AddPeerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("addPeerEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AddPeerEvent]
  
  inline def dialPeerEvent(fields: DialPeerEventFields): DialPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("dialPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[DialPeerEvent]
  inline def dialPeerEvent(fields: DialPeerEventFields, options: QueryOptions): DialPeerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("dialPeerEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DialPeerEvent]
  
  inline def finalPeerEvent(fields: FinalPeerEventFields): FinalPeerEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("finalPeerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[FinalPeerEvent]
  inline def finalPeerEvent(fields: FinalPeerEventFields, options: QueryOptions): FinalPeerEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("finalPeerEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FinalPeerEvent]
  
  inline def peerResponseEvent(fields: PeerResponseEventField): PeerResponseEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("peerResponseEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[PeerResponseEvent]
  inline def peerResponseEvent(fields: PeerResponseEventField, options: QueryOptions): PeerResponseEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("peerResponseEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PeerResponseEvent]
  
  inline def providerEvent(fields: ProviderEventFields): ProviderEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("providerEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[ProviderEvent]
  inline def providerEvent(fields: ProviderEventFields, options: QueryOptions): ProviderEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("providerEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ProviderEvent]
  
  inline def queryErrorEvent(fields: ErrorEventFields): QueryErrorEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("queryErrorEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[QueryErrorEvent]
  inline def queryErrorEvent(fields: ErrorEventFields, options: QueryOptions): QueryErrorEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("queryErrorEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[QueryErrorEvent]
  
  inline def sendQueryEvent(fields: QueryEventFields): SendQueryEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("sendQueryEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[SendQueryEvent]
  inline def sendQueryEvent(fields: QueryEventFields, options: QueryOptions): SendQueryEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("sendQueryEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SendQueryEvent]
  
  inline def valueEvent(fields: ValueEventFields): ValueEvent = ^.asInstanceOf[js.Dynamic].applyDynamic("valueEvent")(fields.asInstanceOf[js.Any]).asInstanceOf[ValueEvent]
  inline def valueEvent(fields: ValueEventFields, options: QueryOptions): ValueEvent = (^.asInstanceOf[js.Dynamic].applyDynamic("valueEvent")(fields.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ValueEvent]
  
  trait DialPeerEventFields extends StObject {
    
    var peer: PeerId
  }
  object DialPeerEventFields {
    
    inline def apply(peer: PeerId): DialPeerEventFields = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialPeerEventFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialPeerEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FinalPeerEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerResponseEventField] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProviderEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryEventFields] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValueEventFields] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
