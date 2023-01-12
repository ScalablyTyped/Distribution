package typings.libp2p

import typings.libp2p.distSrcMetricsStatsMod.DefaultStats
import typings.libp2p.libp2pStrings.in
import typings.libp2p.libp2pStrings.out
import typings.libp2pInterfaceMetrics.mod.ComponentMetricsUpdate
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfaceMetrics.mod.Stats
import typings.libp2pInterfaceMetrics.mod.TrackStreamOptions
import typings.libp2pInterfaceMetrics.mod.TrackedMetric
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricsMod {
  
  @JSImport("libp2p/dist/src/metrics", "DefaultMetrics")
  @js.native
  open class DefaultMetrics protected ()
    extends StObject
       with Metrics
       with Startable {
    def this(init: MetricsInit) = this()
    
    /**
      * Takes the metadata for a message and tracks it in the
      * appropriate categories. If the protocol is present, protocol
      * stats will also be tracked.
      */
    def _onMessage(opts: OnMessageOptions): Unit = js.native
    
    /* private */ val enabled: Any = js.native
    
    /**
      * Returns the `Stats` object for the given `PeerId` whether it
      * is a live peer, or in the disconnected peer LRU cache.
      */
    /* CompleteClass */
    override def forPeer(peerId: PeerId): js.UndefOr[Stats] = js.native
    
    /**
      * Returns the `Stats` object for the given `protocol`
      */
    /* CompleteClass */
    override def forProtocol(protocol: String): js.UndefOr[Stats] = js.native
    
    /**
      * Returns tracked metrics key by system, component, metric, value
      */
    /* CompleteClass */
    override def getComponentMetrics(): Map[String, Map[String, Map[String, TrackedMetric]]] = js.native
    
    /**
      * Returns the global `Stats` object
      */
    /* CompleteClass */
    override def getGlobal(): Stats = js.native
    
    /**
      * Returns a list of `PeerId` strings currently being tracked
      */
    /* CompleteClass */
    override def getPeers(): js.Array[String] = js.native
    
    /**
      * Returns a list of all protocol strings currently being tracked.
      */
    /* CompleteClass */
    override def getProtocols(): js.Array[String] = js.native
    
    var globalStats: DefaultStats = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val oldPeers: Any = js.native
    
    /**
      * Should be called when all connections to a given peer
      * have closed. The `Stats` collection for the peer will
      * be stopped and moved to an LRU for temporary retention.
      */
    /* CompleteClass */
    override def onPeerDisconnected(peerId: PeerId): Unit = js.native
    
    /* private */ val peerStats: Any = js.native
    
    /* private */ val protocolStats: Any = js.native
    
    /* private */ var running: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val statsInit: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val systems: Any = js.native
    
    /**
      * Tracks data running through a given Duplex Iterable `stream`. If
      * the `peerId` is not provided, a placeholder string will be created and
      * returned. This allows lazy tracking of a peer when the peer is not yet known.
      * When the `PeerId` is known, `Metrics.updatePlaceholder` should be called
      * with the placeholder string returned from here, and the known `PeerId`.
      */
    /* CompleteClass */
    override def trackStream(data: TrackStreamOptions): Unit = js.native
    
    /**
      * Update the stored metric value for the given system and component
      */
    /* CompleteClass */
    override def updateComponentMetric(data: ComponentMetricsUpdate): Unit = js.native
    
    /**
      * Replaces the `PeerId` string with the given `peerId`.
      * If stats are already being tracked for the given `peerId`, the
      * placeholder stats will be merged with the existing stats.
      */
    /* CompleteClass */
    override def updatePlaceholder(placeholder: PeerId, peerId: PeerId): Unit = js.native
  }
  
  trait MetricsInit extends StObject {
    
    var computeThrottleMaxQueueSize: Double
    
    var computeThrottleTimeout: Double
    
    var enabled: Boolean
    
    var maxOldPeersRetention: Double
    
    var movingAverageIntervals: js.Array[Double]
  }
  object MetricsInit {
    
    inline def apply(
      computeThrottleMaxQueueSize: Double,
      computeThrottleTimeout: Double,
      enabled: Boolean,
      maxOldPeersRetention: Double,
      movingAverageIntervals: js.Array[Double]
    ): MetricsInit = {
      val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], maxOldPeersRetention = maxOldPeersRetention.asInstanceOf[js.Any], movingAverageIntervals = movingAverageIntervals.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetricsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MetricsInit] (val x: Self) extends AnyVal {
      
      inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMaxOldPeersRetention(value: Double): Self = StObject.set(x, "maxOldPeersRetention", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervals(value: js.Array[Double]): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalsVarargs(value: Double*): Self = StObject.set(x, "movingAverageIntervals", js.Array(value*))
    }
  }
  
  trait OnMessageOptions extends StObject {
    
    var dataLength: Double
    
    var direction: in | out
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var remotePeer: PeerId
  }
  object OnMessageOptions {
    
    inline def apply(dataLength: Double, direction: in | out, remotePeer: PeerId): OnMessageOptions = {
      val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], remotePeer = remotePeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnMessageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnMessageOptions] (val x: Self) extends AnyVal {
      
      inline def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: in | out): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRemotePeer(value: PeerId): Self = StObject.set(x, "remotePeer", value.asInstanceOf[js.Any])
    }
  }
}
