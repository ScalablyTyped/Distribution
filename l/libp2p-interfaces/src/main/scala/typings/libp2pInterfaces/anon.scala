package typings.libp2pInterfaces

import typings.multiaddr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CanRelayMessage extends StObject {
    
    var canRelayMessage: js.UndefOr[Boolean] = js.native
    
    var debugName: String = js.native
    
    var emitSelf: js.UndefOr[Boolean] = js.native
    
    var globalSignaturePolicy: js.UndefOr[js.Any] = js.native
    
    var libp2p: js.Any = js.native
    
    var multicodecs: String | js.Array[String] = js.native
  }
  object CanRelayMessage {
    
    @scala.inline
    def apply(debugName: String, libp2p: js.Any, multicodecs: String | js.Array[String]): CanRelayMessage = {
      val __obj = js.Dynamic.literal(debugName = debugName.asInstanceOf[js.Any], libp2p = libp2p.asInstanceOf[js.Any], multicodecs = multicodecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanRelayMessage]
    }
    
    @scala.inline
    implicit class CanRelayMessageMutableBuilder[Self <: CanRelayMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanRelayMessage(value: Boolean): Self = StObject.set(x, "canRelayMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanRelayMessageUndefined: Self = StObject.set(x, "canRelayMessage", js.undefined)
      
      @scala.inline
      def setDebugName(value: String): Self = StObject.set(x, "debugName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitSelf(value: Boolean): Self = StObject.set(x, "emitSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitSelfUndefined: Self = StObject.set(x, "emitSelf", js.undefined)
      
      @scala.inline
      def setGlobalSignaturePolicy(value: js.Any): Self = StObject.set(x, "globalSignaturePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalSignaturePolicyUndefined: Self = StObject.set(x, "globalSignaturePolicy", js.undefined)
      
      @scala.inline
      def setLibp2p(value: js.Any): Self = StObject.set(x, "libp2p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticodecs(value: String | js.Array[String]): Self = StObject.set(x, "multicodecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMulticodecsVarargs(value: String*): Self = StObject.set(x, "multicodecs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Close extends StObject {
    
    var close: js.Function = js.native
    
    def getStreams(): js.Array[_] = js.native
    
    var localAddr: js.UndefOr[^] = js.native
    
    var localPeer: typings.peerId.mod.^ = js.native
    
    var newStream: js.Function = js.native
    
    var remoteAddr: js.UndefOr[^] = js.native
    
    var remotePeer: typings.peerId.mod.^ = js.native
    
    var stat: Direction = js.native
  }
  object Close {
    
    @scala.inline
    def apply(
      close: js.Function,
      getStreams: () => js.Array[_],
      localPeer: typings.peerId.mod.^,
      newStream: js.Function,
      remotePeer: typings.peerId.mod.^,
      stat: Direction
    ): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], getStreams = js.Any.fromFunction0(getStreams), localPeer = localPeer.asInstanceOf[js.Any], newStream = newStream.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    @scala.inline
    implicit class CloseMutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetStreams(value: () => js.Array[_]): Self = StObject.set(x, "getStreams", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLocalAddr(value: ^): Self = StObject.set(x, "localAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddrUndefined: Self = StObject.set(x, "localAddr", js.undefined)
      
      @scala.inline
      def setLocalPeer(value: typings.peerId.mod.^): Self = StObject.set(x, "localPeer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewStream(value: js.Function): Self = StObject.set(x, "newStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddr(value: ^): Self = StObject.set(x, "remoteAddr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteAddrUndefined: Self = StObject.set(x, "remoteAddr", js.undefined)
      
      @scala.inline
      def setRemotePeer(value: typings.peerId.mod.^): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStat(value: Direction): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var connection: js.Any = js.native
    
    var protocol: String = js.native
    
    var stream: js.Any = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connection: js.Any, protocol: String, stream: js.Any): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Direction extends StObject {
    
    var direction: String = js.native
    
    var encryption: js.UndefOr[String] = js.native
    
    var multiplexer: js.UndefOr[String] = js.native
    
    var timeline: Open = js.native
  }
  object Direction {
    
    @scala.inline
    def apply(direction: String, timeline: Open): Direction = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Direction]
    }
    
    @scala.inline
    implicit class DirectionMutableBuilder[Self <: Direction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      @scala.inline
      def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      @scala.inline
      def setTimeline(value: Open): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encryption extends StObject {
    
    var direction: String = js.native
    
    var encryption: js.UndefOr[String] = js.native
    
    var multiplexer: js.UndefOr[String] = js.native
    
    var status: String = js.native
    
    var timeline: Open = js.native
  }
  object Encryption {
    
    @scala.inline
    def apply(direction: String, status: String, timeline: Open): Encryption = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encryption]
    }
    
    @scala.inline
    implicit class EncryptionMutableBuilder[Self <: Encryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
      
      @scala.inline
      def setMultiplexer(value: String): Self = StObject.set(x, "multiplexer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplexerUndefined: Self = StObject.set(x, "multiplexer", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeline(value: Open): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: typings.peerId.mod.^ = js.native
    
    var protocol: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: typings.peerId.mod.^, protocol: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: typings.peerId.mod.^): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Metadata extends StObject {
    
    var metadata: js.Any = js.native
    
    var protocol: String = js.native
  }
  object Metadata {
    
    @scala.inline
    def apply(metadata: js.Any, protocol: String): Metadata = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metadata]
    }
    
    @scala.inline
    implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Multiaddrs extends StObject {
    
    var id: js.Any = js.native
    
    var multiaddrs: js.Array[_] = js.native
    
    var protocols: js.Array[String] = js.native
  }
  object Multiaddrs {
    
    @scala.inline
    def apply(id: js.Any, multiaddrs: js.Array[_], protocols: js.Array[String]): Multiaddrs = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[Multiaddrs]
    }
    
    @scala.inline
    implicit class MultiaddrsMutableBuilder[Self <: Multiaddrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiaddrs(value: js.Array[_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiaddrsVarargs(value: js.Any*): Self = StObject.set(x, "multiaddrs", js.Array(value :_*))
      
      @scala.inline
      def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Open extends StObject {
    
    var open: String = js.native
    
    var upgraded: String = js.native
  }
  object Open {
    
    @scala.inline
    def apply(open: String, upgraded: String): Open = {
      val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], upgraded = upgraded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Open]
    }
    
    @scala.inline
    implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgraded(value: String): Self = StObject.set(x, "upgraded", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PeerId extends StObject {
    
    var peerId: js.Any = js.native
    
    var protocols: js.Array[String] = js.native
  }
  object PeerId {
    
    @scala.inline
    def apply(peerId: js.Any, protocols: js.Array[String]): PeerId = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerId]
    }
    
    @scala.inline
    implicit class PeerIdMutableBuilder[Self <: PeerId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeerId(value: js.Any): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Protocol extends StObject {
    
    var protocol: String = js.native
    
    var stream: js.Any = js.native
  }
  object Protocol {
    
    @scala.inline
    def apply(protocol: String, stream: js.Any): Protocol = {
      val __obj = js.Dynamic.literal(protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[Protocol]
    }
    
    @scala.inline
    implicit class ProtocolMutableBuilder[Self <: Protocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream(value: js.Any): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
