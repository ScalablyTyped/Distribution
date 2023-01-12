package typings.libp2p

import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerLatencyMonitorMod {
  
  @JSImport("libp2p/dist/src/connection-manager/latency-monitor", "LatencyMonitor")
  @js.native
  open class LatencyMonitor () extends EventEmitter[LatencyMonitorEvents] {
    def this(init: LatencyMonitorInit) = this()
    
    /**
      * Emit summary only if there were events. It might not have any events if it was forced via a page hidden/show
      *
      * @private
      */
    def _emitSummary(): Unit = js.native
    
    /**
      * Start internal timers
      *
      * @private
      */
    def _startTimers(): Unit = js.native
    
    /**
      * Stop internal timers
      *
      * @private
      */
    def _stopTimers(): Unit = js.native
    
    /* private */ val asyncTestFn: Any = js.native
    
    /**
      * Randomly calls an async fn every roughly latencyCheckIntervalMs (plus some randomness). If no async fn is found,
      * it will simply report on event loop latency.
      */
    def checkLatency(): Unit = js.native
    
    /* private */ var checkLatencyID: Any = js.native
    
    /* private */ val dataEmitIntervalMs: Any = js.native
    
    /* private */ var emitIntervalID: Any = js.native
    
    /* private */ val getDeltaMS: Any = js.native
    
    /**
      * Calling this function will end the collection period. If a timing event was already fired and somewhere in the queue,
      * it will not count for this time period
      */
    def getSummary(): SummaryObject = js.native
    
    def initLatencyData(): LatencyData = js.native
    
    /* private */ val latencyCheckIntervalMs: Any = js.native
    
    /* private */ val latencyCheckMultiply: Any = js.native
    
    /* private */ val latencyCheckSubtract: Any = js.native
    
    /* private */ var latencyData: Any = js.native
    
    /* private */ val latencyRandomPercentage: Any = js.native
    
    /* private */ val now: Any = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    /* private */ var visibilityChangeEmitter: Any = js.native
  }
  
  trait LatencyData extends StObject {
    
    var events: Double
    
    var maxMs: Double
    
    var minMs: Double
    
    var startTime: Double
    
    var totalMs: Double
  }
  object LatencyData {
    
    inline def apply(events: Double, maxMs: Double, minMs: Double, startTime: Double, totalMs: Double): LatencyData = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], maxMs = maxMs.asInstanceOf[js.Any], minMs = minMs.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMs = totalMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatencyData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatencyData] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: Double): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMaxMs(value: Double): Self = StObject.set(x, "maxMs", value.asInstanceOf[js.Any])
      
      inline def setMinMs(value: Double): Self = StObject.set(x, "minMs", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTotalMs(value: Double): Self = StObject.set(x, "totalMs", value.asInstanceOf[js.Any])
    }
  }
  
  trait LatencyMonitorEvents extends StObject {
    
    var data: CustomEvent[SummaryObject]
  }
  object LatencyMonitorEvents {
    
    inline def apply(data: CustomEvent[SummaryObject]): LatencyMonitorEvents = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[LatencyMonitorEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatencyMonitorEvents] (val x: Self) extends AnyVal {
      
      inline def setData(value: CustomEvent[SummaryObject]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait LatencyMonitorInit extends StObject {
    
    /**
      * What cb-style async function to use
      */
    var asyncTestFn: js.UndefOr[js.Function1[/* cb */ js.Function0[Unit], Unit]] = js.undefined
    
    /**
      * How often to summarize latency check events. null or 0 disables event firing
      */
    var dataEmitIntervalMs: js.UndefOr[Double] = js.undefined
    
    /**
      * How often to add a latency check event (ms)
      */
    var latencyCheckIntervalMs: js.UndefOr[Double] = js.undefined
    
    /**
      * What percent (+/-) of latencyCheckIntervalMs should we randomly use? This helps avoid alignment to other events.
      */
    var latencyRandomPercentage: js.UndefOr[Double] = js.undefined
  }
  object LatencyMonitorInit {
    
    inline def apply(): LatencyMonitorInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LatencyMonitorInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LatencyMonitorInit] (val x: Self) extends AnyVal {
      
      inline def setAsyncTestFn(value: /* cb */ js.Function0[Unit] => Unit): Self = StObject.set(x, "asyncTestFn", js.Any.fromFunction1(value))
      
      inline def setAsyncTestFnUndefined: Self = StObject.set(x, "asyncTestFn", js.undefined)
      
      inline def setDataEmitIntervalMs(value: Double): Self = StObject.set(x, "dataEmitIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setDataEmitIntervalMsUndefined: Self = StObject.set(x, "dataEmitIntervalMs", js.undefined)
      
      inline def setLatencyCheckIntervalMs(value: Double): Self = StObject.set(x, "latencyCheckIntervalMs", value.asInstanceOf[js.Any])
      
      inline def setLatencyCheckIntervalMsUndefined: Self = StObject.set(x, "latencyCheckIntervalMs", js.undefined)
      
      inline def setLatencyRandomPercentage(value: Double): Self = StObject.set(x, "latencyRandomPercentage", value.asInstanceOf[js.Any])
      
      inline def setLatencyRandomPercentageUndefined: Self = StObject.set(x, "latencyRandomPercentage", js.undefined)
    }
  }
  
  trait SummaryObject extends StObject {
    
    /**
      * What was the average time for a cb to be called
      */
    var avgMs: Double
    
    /**
      * How many events were called
      */
    var events: Double
    
    /**
      * How long this interval was in ms
      */
    var lengthMs: Double
    
    /**
      * What was the max time for a cb to be called
      */
    var maxMs: Double
    
    /**
      * What was the min time for a cb to be called
      */
    var minMs: Double
  }
  object SummaryObject {
    
    inline def apply(avgMs: Double, events: Double, lengthMs: Double, maxMs: Double, minMs: Double): SummaryObject = {
      val __obj = js.Dynamic.literal(avgMs = avgMs.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], lengthMs = lengthMs.asInstanceOf[js.Any], maxMs = maxMs.asInstanceOf[js.Any], minMs = minMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SummaryObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SummaryObject] (val x: Self) extends AnyVal {
      
      inline def setAvgMs(value: Double): Self = StObject.set(x, "avgMs", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Double): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setLengthMs(value: Double): Self = StObject.set(x, "lengthMs", value.asInstanceOf[js.Any])
      
      inline def setMaxMs(value: Double): Self = StObject.set(x, "maxMs", value.asInstanceOf[js.Any])
      
      inline def setMinMs(value: Double): Self = StObject.set(x, "minMs", value.asInstanceOf[js.Any])
    }
  }
}
