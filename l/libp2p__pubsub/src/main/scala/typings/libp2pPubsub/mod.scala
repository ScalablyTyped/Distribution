package typings.libp2pPubsub

import org.scalablytyped.runtime.StringDictionary
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePubsub.mod.Message
import typings.libp2pInterfacePubsub.mod.PeerStreams
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubInit
import typings.libp2pInterfacePubsub.mod.PubSubRPC
import typings.libp2pInterfacePubsub.mod.PubSubRPCMessage
import typings.libp2pInterfacePubsub.mod.PubSubRPCSubscription
import typings.libp2pInterfacePubsub.mod.PublishResult
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pPeerCollections.mod.PeerMap
import typings.libp2pPeerCollections.mod.PeerSet
import typings.libp2pPubsub.anon.Data
import typings.libp2pPubsub.anon.Messages
import typings.multiformats.distTypesSrcHashesHasherMod.Await
import typings.std.AsyncIterable
import typings.std.Map
import typings.std.Set
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("@libp2p/pubsub", "PubSubBaseProtocol")
  @js.native
  open class PubSubBaseProtocol[Events /* <: StringDictionary[Any] */] protected () extends PubSub[Events] {
    def this(components: PubSubComponents, props: PubSubInit) = this()
    
    /**
      * On an inbound stream opened
      */
    /* protected */ def _onIncomingStream(data: IncomingStreamData): Unit = js.native
    
    /**
      * Registrar notifies an established connection with pubsub protocol
      */
    /* protected */ def _onPeerConnected(peerId: PeerId, conn: Connection): Unit = js.native
    
    /**
      * Registrar notifies a closing connection with pubsub protocol
      */
    /* protected */ def _onPeerDisconnected(peerId: PeerId): Unit = js.native
    /* protected */ def _onPeerDisconnected(peerId: PeerId, conn: Connection): Unit = js.native
    
    /* private */ var _registrarTopologyIds: Any = js.native
    
    /**
      * Notifies the router that a peer has been disconnected
      */
    /* protected */ def _removePeer(peerId: PeerId): js.UndefOr[PeerStreams] = js.native
    
    /**
      * Whether to accept a message from a peer
      * Override to create a graylist
      */
    def acceptFrom(id: PeerId): Boolean = js.native
    
    /**
      * Notifies the router that a peer has been connected
      */
    def addPeer(peerId: PeerId, protocol: String): PeerStreams = js.native
    
    /**
      * Normalizes the message and signs it, if signing is enabled.
      * Should be used by the routers to create the message to send.
      */
    def buildMessage(message: Data): js.Promise[Message] = js.native
    
    /**
      * If router can relay received messages, even if not subscribed
      */
    var canRelayMessage: Boolean = js.native
    
    var components: PubSubComponents = js.native
    
    /**
      * Decode Uint8Array into an RPC object.
      * This can be override to use a custom router protobuf.
      */
    def decodeRpc(bytes: js.typedarray.Uint8Array): PubSubRPC = js.native
    def decodeRpc(bytes: Uint8ArrayList): PubSubRPC = js.native
    
    /**
      * if publish should emit to self, if subscribed
      */
    var emitSelf: Boolean = js.native
    
    /* protected */ var enabled: Boolean = js.native
    
    /**
      * Encode RPC object into a Uint8Array.
      * This can be override to use a custom router protobuf.
      */
    def encodeMessage(rpc: PubSubRPCMessage): js.typedarray.Uint8Array = js.native
    
    /**
      * Encode RPC object into a Uint8Array.
      * This can be override to use a custom router protobuf.
      */
    def encodeRpc(rpc: PubSubRPC): js.typedarray.Uint8Array = js.native
    
    /**
      * The default msgID implementation
      * Child class can override this.
      */
    def getMsgId(msg: Message): Await[js.typedarray.Uint8Array] = js.native
    
    def isStarted(): Boolean = js.native
    
    /* private */ val maxInboundStreams: Any = js.native
    
    /* private */ val maxOutboundStreams: Any = js.native
    
    /**
      * Map of peer streams
      */
    var peers: PeerMap[PeerStreams] = js.native
    
    /**
      * Handles a message from a peer
      */
    def processMessage(from: PeerId, msg: Message): js.Promise[Unit] = js.native
    
    /**
      * Responsible for processing each RPC message received by other peers.
      */
    def processMessages(peerId: PeerId, stream: AsyncIterable[Uint8ArrayList], peerStreams: PeerStreams): js.Promise[Unit] = js.native
    
    /**
      * Handles an rpc request from a peer
      */
    def processRpc(from: PeerId, peerStreams: PeerStreams, rpc: PubSubRPC): js.Promise[Boolean] = js.native
    
    /**
      * Handles a subscription change from a peer
      */
    def processRpcSubOpt(id: PeerId, subOpt: PubSubRPCSubscription): Unit = js.native
    
    /**
      * Publishes messages to all subscribed peers
      */
    def publish(topic: String): js.Promise[PublishResult] = js.native
    
    /**
      * Overriding the implementation of publish should handle the appropriate algorithms for the publish/subscriber implementation.
      * For example, a Floodsub implementation might simply publish each message to each topic for every peer.
      *
      * `sender` might be this peer, or we might be forwarding a message on behalf of another peer, in which case sender
      * is the peer we received the message from, which may not be the peer the message was created by.
      */
    def publishMessage(sender: PeerId, message: Message): js.Promise[PublishResult] = js.native
    
    var queue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Queue */ Any = js.native
    
    /**
      * Send an rpc object to a peer
      */
    def send(peer: PeerId, data: Messages): Unit = js.native
    
    /**
      * Send an rpc object to a peer
      */
    def sendRpc(peer: PeerId, rpc: PubSubRPC): Unit = js.native
    
    /**
      * Register the pubsub protocol onto the libp2p node.
      *
      * @returns {void}
      */
    def start(): js.Promise[Unit] = js.native
    
    var started: Boolean = js.native
    
    /**
      * Unregister the pubsub protocol and the streams with other peers will be closed.
      */
    def stop(): js.Promise[Unit] = js.native
    
    /**
      * List of our subscriptions
      */
    var subscriptions: Set[String] = js.native
    
    /**
      * Map of topics to which peers are subscribed to
      */
    var topics: Map[String, PeerSet] = js.native
    
    /**
      * Validates the given message. The signature will be checked for authenticity.
      * Throws an error on invalid messages
      */
    def validate(from: PeerId, message: Message): js.Promise[Unit] = js.native
  }
  
  trait PubSubComponents extends StObject {
    
    var peerId: PeerId
    
    var registrar: Registrar
  }
  object PubSubComponents {
    
    inline def apply(peerId: PeerId, registrar: Registrar): PubSubComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[PubSubComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PubSubComponents] (val x: Self) extends AnyVal {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
}
