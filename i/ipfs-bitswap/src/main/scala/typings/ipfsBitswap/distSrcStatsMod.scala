package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.ipfsBitswap.distSrcStatsStatMod.Stat
import typings.libp2pInterfaceLibp2p.mod.Libp2p
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.Record
import typings.vascosantosMovingAverage.mod.IMovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsMod {
  
  @JSImport("ipfs-bitswap/dist/src/stats", "Stats")
  @js.native
  open class Stats protected () extends EventEmitter {
    def this(libp2p: Libp2p[Record[String, Any]]) = this()
    def this(libp2p: Libp2p[Record[String, Any]], initialCounters: js.Array[String]) = this()
    def this(libp2p: Libp2p[Record[String, Any]], initialCounters: js.Array[String], _options: StatsOptions) = this()
    def this(libp2p: Libp2p[Record[String, Any]], initialCounters: Unit, _options: StatsOptions) = this()
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ val _global: Any = js.native
    
    /* private */ val _initialCounters: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ val _peers: Any = js.native
    
    def disable(): Unit = js.native
    
    def disconnected(peer: PeerId): Unit = js.native
    
    def enable(): Unit = js.native
    
    def forPeer(peerId: String): js.UndefOr[Stat] = js.native
    def forPeer(peerId: PeerId): js.UndefOr[Stat] = js.native
    
    def movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    def push(peer: String, counter: String, inc: Double): Unit = js.native
    def push(peer: Unit, counter: String, inc: Double): Unit = js.native
    
    def snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  trait StatsOptions extends StObject {
    
    var computeThrottleMaxQueueSize: js.UndefOr[Double] = js.undefined
    
    var computeThrottleTimeout: js.UndefOr[Double] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var movingAverageIntervals: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object StatsOptions {
    
    inline def apply(): StatsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsOptions] (val x: Self) extends AnyVal {
      
      inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleMaxQueueSizeUndefined: Self = StObject.set(x, "computeThrottleMaxQueueSize", js.undefined)
      
      inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleTimeoutUndefined: Self = StObject.set(x, "computeThrottleTimeout", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setMovingAverageIntervals(value: js.Array[Double]): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalsUndefined: Self = StObject.set(x, "movingAverageIntervals", js.undefined)
      
      inline def setMovingAverageIntervalsVarargs(value: Double*): Self = StObject.set(x, "movingAverageIntervals", js.Array(value*))
    }
  }
}
