package typings.libp2pWebrtcStar

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaceTransport.mod.CreateListenerOptions
import typings.libp2pInterfaceTransport.mod.DialOptions
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaceTransport.mod.Transport
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pWebrtcPeer.mod.WRTC
import typings.libp2pWebrtcPeer.mod.WebRTCInitiator
import typings.libp2pWebrtcPeer.mod.WebRTCInitiatorInit
import typings.libp2pWebrtcPeer.mod.WebRTCReceiver
import typings.libp2pWebrtcPeer.mod.WebRTCReceiverInit
import typings.libp2pWebrtcStarProtocol.mod.HandshakeSignal
import typings.libp2pWebrtcStarProtocol.mod.WebRTCStarSocket
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTransportMod {
  
  @JSImport("@libp2p/webrtc-star/dist/src/transport", "WebRTCStar")
  @js.native
  open class WebRTCStar ()
    extends StObject
       with Transport {
    def this(init: WebRTCStarInit) = this()
    
    def _connect(ma: Multiaddr_, options: WebRTCStarDialOptions): js.Promise[WebRTCInitiator] = js.native
    
    /* private */ val _discovery: Any = js.native
    
    /**
      * Creates a WebrtcStar listener. The provided `handler` function will be called
      * anytime a new incoming Connection has been successfully upgraded via
      * `upgrader.upgradeInbound`.
      */
    def createListener(options: WebRTCStarListenerOptions): Listener = js.native
    
    def dial(ma: Multiaddr_, options: WebRTCStarDialOptions): js.Promise[Connection] = js.native
    
    def discovery(): PeerDiscovery & Startable = js.native
    
    var get: Any = js.native
    
    def peerDiscovered(maStr: String): Unit = js.native
    
    var peerId: js.UndefOr[PeerId] = js.native
    
    var sigServers: Map[String, SignalServer] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_WebRTCStar: js.Function0[String] = js.native
    
    var wrtc: js.UndefOr[WRTC] = js.native
  }
  
  @JSImport("@libp2p/webrtc-star/dist/src/transport", "WebRTCStarDiscovery")
  @js.native
  open class WebRTCStarDiscovery ()
    extends PeerDiscovery
       with Startable {
    
    def dispatchEvent(event: CustomEvent[Any]): Boolean = js.native
    
    var get: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_WebRTCStarDiscovery: js.Function0[String] = js.native
  }
  
  @js.native
  trait SignalServer extends EventEmitter[SignalServerServerEvents] {
    
    var channels: Map[String, WebRTCReceiver] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var connections: js.Array[MultiaddrConnection] = js.native
    
    var pendingSignals: Map[String, js.Array[HandshakeSignal]] = js.native
    
    var signallingAddr: Multiaddr_ = js.native
    
    var socket: WebRTCStarSocket = js.native
  }
  
  trait SignalServerServerEvents extends StObject {
    
    var connection: CustomEvent[Connection]
    
    var disconnect: CustomEvent[Any]
    
    var error: CustomEvent[js.Error]
    
    var listening: CustomEvent[Any]
    
    var peer: CustomEvent[String]
    
    var reconnect: CustomEvent[Any]
  }
  object SignalServerServerEvents {
    
    inline def apply(
      connection: CustomEvent[Connection],
      disconnect: CustomEvent[Any],
      error: CustomEvent[js.Error],
      listening: CustomEvent[Any],
      peer: CustomEvent[String],
      reconnect: CustomEvent[Any]
    ): SignalServerServerEvents = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], disconnect = disconnect.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listening = listening.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], reconnect = reconnect.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignalServerServerEvents]
    }
    
    extension [Self <: SignalServerServerEvents](x: Self) {
      
      inline def setConnection(value: CustomEvent[Connection]): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setDisconnect(value: CustomEvent[Any]): Self = StObject.set(x, "disconnect", value.asInstanceOf[js.Any])
      
      inline def setError(value: CustomEvent[js.Error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setListening(value: CustomEvent[Any]): Self = StObject.set(x, "listening", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: CustomEvent[String]): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: CustomEvent[Any]): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebRTCStarComponents extends StObject {
    
    var peerId: PeerId
  }
  object WebRTCStarComponents {
    
    inline def apply(peerId: PeerId): WebRTCStarComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCStarComponents]
    }
    
    extension [Self <: WebRTCStarComponents](x: Self) {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebRTCStarDialOptions
    extends StObject
       with DialOptions {
    
    var channelOptions: js.UndefOr[WebRTCInitiatorInit] = js.undefined
  }
  object WebRTCStarDialOptions {
    
    inline def apply(upgrader: Upgrader): WebRTCStarDialOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCStarDialOptions]
    }
    
    extension [Self <: WebRTCStarDialOptions](x: Self) {
      
      inline def setChannelOptions(value: WebRTCInitiatorInit): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
    }
  }
  
  trait WebRTCStarInit extends StObject {
    
    var wrtc: js.UndefOr[WRTC] = js.undefined
  }
  object WebRTCStarInit {
    
    inline def apply(): WebRTCStarInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebRTCStarInit]
    }
    
    extension [Self <: WebRTCStarInit](x: Self) {
      
      inline def setWrtc(value: WRTC): Self = StObject.set(x, "wrtc", value.asInstanceOf[js.Any])
      
      inline def setWrtcUndefined: Self = StObject.set(x, "wrtc", js.undefined)
    }
  }
  
  trait WebRTCStarListenerOptions
    extends StObject
       with CreateListenerOptions
       with WebRTCInitiatorInit {
    
    var channelOptions: js.UndefOr[WebRTCReceiverInit] = js.undefined
  }
  object WebRTCStarListenerOptions {
    
    inline def apply(upgrader: Upgrader): WebRTCStarListenerOptions = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebRTCStarListenerOptions]
    }
    
    extension [Self <: WebRTCStarListenerOptions](x: Self) {
      
      inline def setChannelOptions(value: WebRTCReceiverInit): Self = StObject.set(x, "channelOptions", value.asInstanceOf[js.Any])
      
      inline def setChannelOptionsUndefined: Self = StObject.set(x, "channelOptions", js.undefined)
    }
  }
}
