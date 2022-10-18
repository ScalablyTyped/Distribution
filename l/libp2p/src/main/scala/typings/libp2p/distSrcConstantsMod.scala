package typings.libp2p

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConstantsMod {
  
  @JSImport("libp2p/dist/src/constants", "DIAL_TIMEOUT")
  @js.native
  val DIAL_TIMEOUT: /* 30000 */ Double = js.native
  
  @JSImport("libp2p/dist/src/constants", "INBOUND_UPGRADE_TIMEOUT")
  @js.native
  val INBOUND_UPGRADE_TIMEOUT: /* 30000 */ Double = js.native
  
  @JSImport("libp2p/dist/src/constants", "MAX_ADDRS_TO_DIAL")
  @js.native
  val MAX_ADDRS_TO_DIAL: /* 25 */ Double = js.native
  
  @JSImport("libp2p/dist/src/constants", "MAX_PARALLEL_DIALS")
  @js.native
  val MAX_PARALLEL_DIALS: /* 100 */ Double = js.native
  
  @JSImport("libp2p/dist/src/constants", "MAX_PER_PEER_DIALS")
  @js.native
  val MAX_PER_PEER_DIALS: /* 4 */ Double = js.native
  
  object METRICS {
    
    @JSImport("libp2p/dist/src/constants", "METRICS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/dist/src/constants", "METRICS.computeThrottleMaxQueueSize")
    @js.native
    def computeThrottleMaxQueueSize: Double = js.native
    inline def computeThrottleMaxQueueSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computeThrottleMaxQueueSize")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/dist/src/constants", "METRICS.computeThrottleTimeout")
    @js.native
    def computeThrottleTimeout: Double = js.native
    inline def computeThrottleTimeout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computeThrottleTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/dist/src/constants", "METRICS.maxOldPeersRetention")
    @js.native
    def maxOldPeersRetention: Double = js.native
    inline def maxOldPeersRetention_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxOldPeersRetention")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/dist/src/constants", "METRICS.movingAverageIntervals")
    @js.native
    def movingAverageIntervals: js.Array[Double] = js.native
    inline def movingAverageIntervals_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("movingAverageIntervals")(x.asInstanceOf[js.Any])
  }
}
