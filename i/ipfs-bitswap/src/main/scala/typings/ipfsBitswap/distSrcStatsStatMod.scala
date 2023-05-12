package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.std.Record
import typings.vascosantosMovingAverage.mod.IMovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsStatMod {
  
  @JSImport("ipfs-bitswap/dist/src/stats/stat", "Stat")
  @js.native
  open class Stat protected () extends EventEmitter {
    def this(initialCounters: js.Array[String], options: StatOptions) = this()
    
    def _applyOp(op: Op): Unit = js.native
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _frequencyAccumulators: Any = js.native
    
    /* private */ var _frequencyLastTime: Any = js.native
    
    /* private */ var _movingAverages: Any = js.native
    
    def _nextTimeout(): Double = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ val _queue: Any = js.native
    
    def _resetComputeTimeout(): Unit = js.native
    
    /* private */ var _stats: Any = js.native
    
    /* private */ var _timeout: Any = js.native
    
    def _update(): Unit = js.native
    
    def _updateFrequency(latestTime: Double): Unit = js.native
    
    def _updateFrequencyFor(key: String, timeDiffMS: Double, latestTime: Double): Unit = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    def push(counter: String, inc: Double): Unit = js.native
    
    def snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  type Op = js.Tuple3[String, Double, Double]
  
  trait StatOptions extends StObject {
    
    var computeThrottleMaxQueueSize: Double
    
    var computeThrottleTimeout: Double
    
    var enabled: Boolean
    
    var movingAverageIntervals: js.Array[Double]
  }
  object StatOptions {
    
    inline def apply(
      computeThrottleMaxQueueSize: Double,
      computeThrottleTimeout: Double,
      enabled: Boolean,
      movingAverageIntervals: js.Array[Double]
    ): StatOptions = {
      val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], movingAverageIntervals = movingAverageIntervals.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatOptions] (val x: Self) extends AnyVal {
      
      inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervals(value: js.Array[Double]): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalsVarargs(value: Double*): Self = StObject.set(x, "movingAverageIntervals", js.Array(value*))
    }
  }
}
