package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.ipfsBitswap.anon.ComputeThrottleTimeout
import typings.node.timersMod.global.NodeJS.Timeout
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsStatMod {
  
  @JSImport("ipfs-bitswap/dist/src/stats/stat", "Stat")
  @js.native
  open class Stat protected () extends EventEmitter {
    /**
      *
      * @param {string[]} initialCounters
      * @param {object} options
      * @param {boolean} options.enabled
      * @param {number} options.computeThrottleTimeout
      * @param {number} options.computeThrottleMaxQueueSize
      * @param {import('.').AverageIntervals} options.movingAverageIntervals
      */
    def this(initialCounters: js.Array[String], options: ComputeThrottleTimeout) = this()
    
    /**
      * @private
      * @param {Op} op
      */
    /* private */ var _applyOp: Any = js.native
    
    var _disabled: js.UndefOr[Boolean] = js.native
    
    var _enabled: Boolean = js.native
    
    /** @type {Record<string, number>} */
    var _frequencyAccumulators: Record[String, Double] = js.native
    
    var _frequencyLastTime: Double = js.native
    
    /** @type {Record<string, Record<number, IMovingAverage>>} */
    var _movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    /**
      * @private
      * @returns {number}
      */
    /* private */ var _nextTimeout: Any = js.native
    
    var _options: ComputeThrottleTimeout = js.native
    
    /** @type {Op[]} */
    var _queue: js.Array[Op] = js.native
    
    /**
      * @private
      */
    /* private */ var _resetComputeTimeout: Any = js.native
    
    /** @type {Record<string, bigint>} */
    var _stats: Record[String, js.BigInt] = js.native
    
    var _timeout: js.UndefOr[Timeout | Null] = js.native
    
    /**
      * @private
      */
    /* private */ var _update: Any = js.native
    
    /**
      * @private
      * @param {number} latestTime
      */
    /* private */ var _updateFrequency: Any = js.native
    
    /**
      * @private
      * @param {string} key
      * @param {number} timeDiffMS
      * @param {number} latestTime
      * @returns {void}
      */
    /* private */ var _updateFrequencyFor: Any = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    def movingAverages: Record[String, Record[Double, typings.vascosantosMovingAverage.mod.IMovingAverage]] = js.native
    
    /**
      * @param {string} counter
      * @param {number} inc
      */
    def push(counter: String, inc: Double): Unit = js.native
    
    def snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  type IMovingAverage = typings.vascosantosMovingAverage.mod.IMovingAverage
  
  type Op = js.Tuple3[String, Double, Double]
}
