package typings.libp2p

import typings.libp2p.libp2pStrings.dataReceived
import typings.libp2p.libp2pStrings.dataSent
import typings.libp2pInterfaceMetrics.mod.MovingAverages
import typings.libp2pInterfaceMetrics.mod.Stats
import typings.libp2pInterfaceMetrics.mod.TransferStats
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetricsStatsMod {
  
  @JSImport("libp2p/dist/src/metrics/stats", "DefaultStats")
  @js.native
  open class DefaultStats protected ()
    extends EventEmitter[StatsEvents]
       with Stats {
    /**
      * A queue based manager for stat processing
      */
    def this(init: StatsInit) = this()
    
    /**
      * For the given operation, `op`, the stats and `frequencyAccumulator`
      * will be updated or initialized if they don't already exist.
      */
    def _applyOp(op: js.Tuple3[String, Double, Double]): Unit = js.native
    
    /**
      * Calculates and returns the timeout for the next update based on
      * the urgency of the update.
      */
    def _nextTimeout(): Double = js.native
    
    /**
      * Resets the timeout for triggering updates.
      */
    def _resetComputeTimeout(): Unit = js.native
    
    /**
      * If there are items in the queue, they will will be processed and
      * the frequency for all items will be updated based on the Timestamp
      * of the last item in the queue. The `update` event will also be emitted
      * with the latest stats.
      *
      * If there are no items in the queue, no action is taken.
      */
    def _update(): Unit = js.native
    
    /**
      * For each key in the stats, the frequency and moving averages
      * will be updated via Stats._updateFrequencyFor based on the time
      * difference between calls to this method.
      */
    def _updateFrequency(latestTime: Double): Unit = js.native
    
    /**
      * Updates the `movingAverages` for the given `key` and also
      * resets the `frequencyAccumulator` for the `key`.
      */
    def _updateFrequencyFor(key: dataReceived | dataSent, timeDiffMS: Double, latestTime: Double): Unit = js.native
    
    /* private */ val computeThrottleMaxQueueSize: Any = js.native
    
    /* private */ val computeThrottleTimeout: Any = js.native
    
    /* private */ val enabled: Any = js.native
    
    /* private */ var frequencyAccumulators: Any = js.native
    
    /* private */ var frequencyLastTime: Any = js.native
    
    /**
      * Returns a clone of the internal movingAverages
      */
    /* CompleteClass */
    override def getMovingAverages(): MovingAverages = js.native
    
    /**
      * Returns a clone of the current stats.
      */
    /* CompleteClass */
    override def getSnapshot(): TransferStats = js.native
    
    /* private */ val movingAverageIntervals: Any = js.native
    
    /* private */ var movingAverages: Any = js.native
    
    /**
      * Pushes the given operation data to the queue, along with the
      * current Timestamp, then resets the update timer.
      */
    /* CompleteClass */
    override def push(counter: String, inc: Double): Unit = js.native
    
    var queue: js.Array[js.Tuple3[String, Double, Double]] = js.native
    
    /**
      * Initializes the internal timer if there are items in the queue. This
      * should only need to be called if `Stats.stop` was previously called, as
      * `Stats.push` will also start the processing
      */
    def start(): Unit = js.native
    
    /* private */ var stats: Any = js.native
    
    /**
      * Stops processing and computing of stats by clearing the internal
      * timer
      */
    def stop(): Unit = js.native
    
    /* private */ var timeout: Any = js.native
  }
  
  trait StatsEvents extends StObject {
    
    var update: CustomEvent[TransferStats]
  }
  object StatsEvents {
    
    inline def apply(update: CustomEvent[TransferStats]): StatsEvents = {
      val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsEvents] (val x: Self) extends AnyVal {
      
      inline def setUpdate(value: CustomEvent[TransferStats]): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait StatsInit extends StObject {
    
    var computeThrottleMaxQueueSize: Double
    
    var computeThrottleTimeout: Double
    
    var enabled: Boolean
    
    var initialCounters: js.Tuple2[dataReceived, dataSent]
    
    var movingAverageIntervals: js.Array[Double]
  }
  object StatsInit {
    
    inline def apply(
      computeThrottleMaxQueueSize: Double,
      computeThrottleTimeout: Double,
      enabled: Boolean,
      initialCounters: js.Tuple2[dataReceived, dataSent],
      movingAverageIntervals: js.Array[Double]
    ): StatsInit = {
      val __obj = js.Dynamic.literal(computeThrottleMaxQueueSize = computeThrottleMaxQueueSize.asInstanceOf[js.Any], computeThrottleTimeout = computeThrottleTimeout.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], initialCounters = initialCounters.asInstanceOf[js.Any], movingAverageIntervals = movingAverageIntervals.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatsInit] (val x: Self) extends AnyVal {
      
      inline def setComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "computeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
      
      inline def setComputeThrottleTimeout(value: Double): Self = StObject.set(x, "computeThrottleTimeout", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setInitialCounters(value: js.Tuple2[dataReceived, dataSent]): Self = StObject.set(x, "initialCounters", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervals(value: js.Array[Double]): Self = StObject.set(x, "movingAverageIntervals", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalsVarargs(value: Double*): Self = StObject.set(x, "movingAverageIntervals", js.Array(value*))
    }
  }
}
