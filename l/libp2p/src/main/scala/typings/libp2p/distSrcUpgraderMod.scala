package typings.libp2p

import typings.itStreamTypes.mod.Duplex
import typings.itStreamTypes.mod.Source
import typings.libp2p.anon.MuxerFactory
import typings.libp2p.libp2pStrings.inbound
import typings.libp2p.libp2pStrings.outbound
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnection.mod.MultiaddrConnection
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import typings.libp2pInterfaceConnectionEncrypter.mod.SecuredConnection
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerFactory
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.AsyncGenerator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUpgraderMod {
  
  @JSImport("libp2p/dist/src/upgrader", "DefaultUpgrader")
  @js.native
  open class DefaultUpgrader protected ()
    extends StObject
       with Upgrader {
    def this(components: DefaultUpgraderComponents, init: UpgraderInit) = this()
    
    /**
      * A convenience method for generating a new `Connection`
      */
    def _createConnection(opts: CreateConnectionOptions): Connection = js.native
    
    /**
      * Attempts to encrypt the incoming `connection` with the provided `cryptos`
      */
    def _encryptInbound(
      connection: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          Any
        ]
    ): js.Promise[CryptoResult] = js.native
    
    /**
      * Attempts to encrypt the given `connection` with the provided connection encrypters.
      * The first `ConnectionEncrypter` module to succeed will be used
      */
    def _encryptOutbound(connection: MultiaddrConnection): js.Promise[CryptoResult] = js.native
    def _encryptOutbound(connection: MultiaddrConnection, remotePeerId: PeerId): js.Promise[CryptoResult] = js.native
    
    /**
      * Registers support for one of the given muxers via multistream-select. The
      * selected muxer will be used for all future streams on the connection.
      */
    def _multiplexInbound(connection: MultiaddrConnection, muxers: Map[String, StreamMuxerFactory]): js.Promise[MuxerFactory] = js.native
    
    /**
      * Selects one of the given muxers via multistream-select. That
      * muxer will be used for all future streams on the connection.
      */
    def _multiplexOutbound(connection: MultiaddrConnection, muxers: Map[String, StreamMuxerFactory]): js.Promise[MuxerFactory] = js.native
    
    /**
      * Routes incoming streams to the correct handler
      */
    def _onStream(opts: OnStreamOptions): Unit = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val connectionEncryption: Any = js.native
    
    /* private */ val events: Any = js.native
    
    /* private */ val inboundUpgradeTimeout: Any = js.native
    
    /* private */ val muxers: Any = js.native
    
    def shouldBlockConnection(remotePeer: PeerId, maConn: MultiaddrConnection, connectionType: ConnectionDeniedType): js.Promise[Unit] = js.native
  }
  
  /* Inlined keyof std.Pick<@libp2p/interface-connection-gater.@libp2p/interface-connection-gater.ConnectionGater, 'denyOutboundConnection' | 'denyInboundEncryptedConnection' | 'denyOutboundEncryptedConnection' | 'denyInboundUpgradedConnection' | 'denyOutboundUpgradedConnection'> */
  /* Rewritten from type alias, can be one of: 
    - typings.libp2p.libp2pStrings.denyOutboundConnection
    - typings.libp2p.libp2pStrings.denyOutboundEncryptedConnection
    - typings.libp2p.libp2pStrings.denyOutboundUpgradedConnection
    - typings.libp2p.libp2pStrings.denyInboundEncryptedConnection
    - typings.libp2p.libp2pStrings.denyInboundUpgradedConnection
  */
  trait ConnectionDeniedType extends StObject
  object ConnectionDeniedType {
    
    inline def denyInboundEncryptedConnection: typings.libp2p.libp2pStrings.denyInboundEncryptedConnection = "denyInboundEncryptedConnection".asInstanceOf[typings.libp2p.libp2pStrings.denyInboundEncryptedConnection]
    
    inline def denyInboundUpgradedConnection: typings.libp2p.libp2pStrings.denyInboundUpgradedConnection = "denyInboundUpgradedConnection".asInstanceOf[typings.libp2p.libp2pStrings.denyInboundUpgradedConnection]
    
    inline def denyOutboundConnection: typings.libp2p.libp2pStrings.denyOutboundConnection = "denyOutboundConnection".asInstanceOf[typings.libp2p.libp2pStrings.denyOutboundConnection]
    
    inline def denyOutboundEncryptedConnection: typings.libp2p.libp2pStrings.denyOutboundEncryptedConnection = "denyOutboundEncryptedConnection".asInstanceOf[typings.libp2p.libp2pStrings.denyOutboundEncryptedConnection]
    
    inline def denyOutboundUpgradedConnection: typings.libp2p.libp2pStrings.denyOutboundUpgradedConnection = "denyOutboundUpgradedConnection".asInstanceOf[typings.libp2p.libp2pStrings.denyOutboundUpgradedConnection]
  }
  
  trait CreateConnectionOptions extends StObject {
    
    var cryptoProtocol: String
    
    var direction: inbound | outbound
    
    var maConn: MultiaddrConnection
    
    var muxerFactory: js.UndefOr[StreamMuxerFactory] = js.undefined
    
    var remotePeer: PeerId
    
    var upgradedConn: Duplex[
        AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
        Source[js.typedarray.Uint8Array], 
        js.Promise[Unit]
      ]
  }
  object CreateConnectionOptions {
    
    inline def apply(
      cryptoProtocol: String,
      direction: inbound | outbound,
      maConn: MultiaddrConnection,
      remotePeer: PeerId,
      upgradedConn: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ]
    ): CreateConnectionOptions = {
      val __obj = js.Dynamic.literal(cryptoProtocol = cryptoProtocol.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], maConn = maConn.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any], upgradedConn = upgradedConn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setCryptoProtocol(value: String): Self = StObject.set(x, "cryptoProtocol", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: inbound | outbound): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setMaConn(value: MultiaddrConnection): Self = StObject.set(x, "maConn", value.asInstanceOf[js.Any])
      
      inline def setMuxerFactory(value: StreamMuxerFactory): Self = StObject.set(x, "muxerFactory", value.asInstanceOf[js.Any])
      
      inline def setMuxerFactoryUndefined: Self = StObject.set(x, "muxerFactory", js.undefined)
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
      
      inline def setUpgradedConn(
        value: Duplex[
              AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
              Source[js.typedarray.Uint8Array], 
              js.Promise[Unit]
            ]
      ): Self = StObject.set(x, "upgradedConn", value.asInstanceOf[js.Any])
    }
  }
  
  trait CryptoResult
    extends StObject
       with SecuredConnection[Any] {
    
    var protocol: String
  }
  object CryptoResult {
    
    inline def apply(
      conn: Duplex[
          AsyncGenerator[js.typedarray.Uint8Array, Any, Any], 
          Source[js.typedarray.Uint8Array], 
          js.Promise[Unit]
        ],
      protocol: String,
      remotePeer: PeerId
    ): CryptoResult = {
      val __obj = js.Dynamic.literal(conn = conn.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[CryptoResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CryptoResult] (val x: Self) extends AnyVal {
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultUpgraderComponents extends StObject {
    
    var connectionGater: ConnectionGater
    
    var connectionManager: ConnectionManager
    
    var connectionProtector: js.UndefOr[ConnectionProtector] = js.undefined
    
    var events: EventEmitter[Libp2pEvents]
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var registrar: Registrar
  }
  object DefaultUpgraderComponents {
    
    inline def apply(
      connectionGater: ConnectionGater,
      connectionManager: ConnectionManager,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      registrar: Registrar
    ): DefaultUpgraderComponents = {
      val __obj = js.Dynamic.literal(connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultUpgraderComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultUpgraderComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtector(value: ConnectionProtector): Self = StObject.set(x, "connectionProtector", value.asInstanceOf[js.Any])
      
      inline def setConnectionProtectorUndefined: Self = StObject.set(x, "connectionProtector", js.undefined)
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnStreamOptions extends StObject {
    
    var connection: Connection
    
    var protocol: String
    
    var stream: Stream
  }
  object OnStreamOptions {
    
    inline def apply(connection: Connection, protocol: String, stream: Stream): OnStreamOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpgraderInit extends StObject {
    
    var connectionEncryption: js.Array[ConnectionEncrypter[Any]]
    
    /**
      * An amount of ms by which an inbound connection upgrade
      * must complete
      */
    var inboundUpgradeTimeout: js.UndefOr[Double] = js.undefined
    
    var muxers: js.Array[StreamMuxerFactory]
  }
  object UpgraderInit {
    
    inline def apply(connectionEncryption: js.Array[ConnectionEncrypter[Any]], muxers: js.Array[StreamMuxerFactory]): UpgraderInit = {
      val __obj = js.Dynamic.literal(connectionEncryption = connectionEncryption.asInstanceOf[js.Any], muxers = muxers.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpgraderInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpgraderInit] (val x: Self) extends AnyVal {
      
      inline def setConnectionEncryption(value: js.Array[ConnectionEncrypter[Any]]): Self = StObject.set(x, "connectionEncryption", value.asInstanceOf[js.Any])
      
      inline def setConnectionEncryptionVarargs(value: ConnectionEncrypter[Any]*): Self = StObject.set(x, "connectionEncryption", js.Array(value*))
      
      inline def setInboundUpgradeTimeout(value: Double): Self = StObject.set(x, "inboundUpgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setInboundUpgradeTimeoutUndefined: Self = StObject.set(x, "inboundUpgradeTimeout", js.undefined)
      
      inline def setMuxers(value: js.Array[StreamMuxerFactory]): Self = StObject.set(x, "muxers", value.asInstanceOf[js.Any])
      
      inline def setMuxersVarargs(value: StreamMuxerFactory*): Self = StObject.set(x, "muxers", js.Array(value*))
    }
  }
}
