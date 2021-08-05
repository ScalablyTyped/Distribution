package typings.libp2pInterfaces

import typings.multiaddr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CanRelayMessage extends StObject {
    
    var canRelayMessage: js.UndefOr[Boolean] = js.undefined
    
    var debugName: String
    
    var emitSelf: js.UndefOr[Boolean] = js.undefined
    
    var globalSignaturePolicy: js.UndefOr[js.Any] = js.undefined
    
    var libp2p: js.Any
    
    var multicodecs: String | js.Array[String]
  }
  object CanRelayMessage {
    
    inline def apply(debugName: String, libp2p: js.Any, multicodecs: String | js.Array[String]): CanRelayMessage = {
      val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], libp2p = libp2p.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanRelayMessage]
    }
    
    extension [Self <: CanRelayMessage](x: Self) {
      
      inline def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
      
      inline def setCanRelayMessageUndefined: Self = StObject.set(x, "canRelayMessage", js.undefined)
      
      inline def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
      
      inline def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
      
      inline def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
      
      inline def setGlobalSignaturePolicy(value: js.Any): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
      
      inline def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
      
      inline def setLibp2p(value: js.Any): Self = StObject.set(x, "libp2p", value.asInstanceOf[js.Any])
      
      inline def setMulticodecs(value: String | js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
      
      inline def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value :_*))
    }
  }
  
  trait Close extends StObject {
    
    var close: js.Function
    
    def getStreams(): js.Array[js.Any]
    
    var localAddr: js.UndefOr[^] = js.undefined
    
    var localPeer: typings.peerId.mod.^
    
    var newStream: js.Function
    
    var remoteAddr: js.UndefOr[^] = js.undefined
    
    var remotePeer: typings.peerId.mod.^
    
    var stat: Direction
  }
  object Close {
    
    inline def apply(
      close: js.Function,
      getStreams: () => js.Array[js.Any],
      localPeer: typings.peerId.mod.^,
      newStream: js.Function,
      remotePeer: typings.peerId.mod.^,
      stat: Direction
    ): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], getStreams = js.Any.fromFunction0(getStreams), localPeer = localPeer.asInstanceOf[js.Any], newStream = newStream.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setGetStreams(value: () => js.Array[js.Any]): Self = StObject.set(x, "getStreams", js.Any.fromFunction0(value))
      
      inline def setLocalAddr(value: ^): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      inline def setLocalAddrUndefined: Self = StObject.set(x, "localAddr", js.undefined)
      
      inline def setLocalPeer(value: typings.peerId.mod.^): Self = StObject.set(x, "localPeer", value.asInstanceOf[js.Any])
      
      inline def setNewStream(value: js.Function): Self = StObject.set(x, "newStream", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddr(value: ^): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddrUndefined: Self = StObject.set(x, "remoteAddr", js.undefined)
      
      inline def setRemotePeer(value: typings.peerId.mod.^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      inline def setStat(value: Direction): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  trait Connection extends StObject {
    
    var connection: js.Any
    
    var protocol: String
    
    var stream: js.Any
  }
  object Connection {
    
    inline def apply(connection: js.Any, protocol: String, stream: js.Any): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Direction extends StObject {
    
    var direction: String
    
    var encryption: js.UndefOr[String] = js.undefined
    
    var multiplexer: js.UndefOr[String] = js.undefined
    
    var timeline: Open
  }
  object Direction {
    
    inline def apply(direction: String, timeline: Open): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    extension [Self <: Direction](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      inline def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      inline def setTimeline(value: Open): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encryption extends StObject {
    
    var direction: String
    
    var encryption: js.UndefOr[String] = js.undefined
    
    var multiplexer: js.UndefOr[String] = js.undefined
    
    var status: String
    
    var timeline: Open
  }
  object Encryption {
    
    inline def apply(direction: String, status: String, timeline: Open): Encryption = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryption]
    }
    
    extension [Self <: Encryption](x: Self) {
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      inline def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      inline def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: Open): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: typings.peerId.mod.^
    
    var protocol: String
  }
  object Id {
    
    inline def apply(id: typings.peerId.mod.^, protocol: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: typings.peerId.mod.^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Metadata extends StObject {
    
    var metadata: js.Any
    
    var protocol: String
  }
  object Metadata {
    
    inline def apply(metadata: js.Any, protocol: String): Metadata = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    extension [Self <: Metadata](x: Self) {
      
      inline def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Multiaddrs extends StObject {
    
    var id: js.Any
    
    var multiaddrs: js.Array[js.Any]
    
    var protocols: js.Array[String]
  }
  object Multiaddrs {
    
    inline def apply(id: js.Any, multiaddrs: js.Array[js.Any], protocols: js.Array[String]): Multiaddrs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Multiaddrs]
    }
    
    extension [Self <: Multiaddrs](x: Self) {
      
      inline def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[js.Any]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: js.Any*): Self = StObject.set(x, "multiaddrs", js.Array(value :_*))
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  trait Open extends StObject {
    
    var open: String
    
    var upgraded: String
  }
  object Open {
    
    inline def apply(open: String, upgraded: String): Open = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], upgraded = upgraded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Open]
    }
    
    extension [Self <: Open](x: Self) {
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setUpgraded(value: String): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerId extends StObject {
    
    var peerId: js.Any
    
    var protocols: js.Array[String]
  }
  object PeerId {
    
    inline def apply(peerId: js.Any, protocols: js.Array[String]): PeerId = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerId]
    }
    
    extension [Self <: PeerId](x: Self) {
      
      inline def setPeerId(value: js.Any): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  trait Protocol extends StObject {
    
    var protocol: String
    
    var stream: js.Any
  }
  object Protocol {
    
    inline def apply(protocol: String, stream: js.Any): Protocol = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    extension [Self <: Protocol](x: Self) {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
