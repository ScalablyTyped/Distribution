package typings.ipfsBitswap

import typings.events.mod.EventEmitter
import typings.ipfsBitswap.anon.ComputeThrottleMaxQueueSize
import typings.ipfsBitswap.anon.ComputeThrottleTimeout
import typings.ipfsBitswap.distSrcStatsStatMod.Stat
import typings.libp2p.mod.Libp2p
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.std.Map
import typings.std.Record
import typings.vascosantosMovingAverage.mod.IMovingAverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsMod {
  
  @JSImport("ipfs-bitswap/dist/src/stats", "Stats")
  @js.native
  open class Stats protected () extends EventEmitter {
    /**
      * @param {import('libp2p').Libp2p} libp2p
      * @param {string[]} [initialCounters]
      * @param {object} _options
      * @param {boolean} _options.enabled
      * @param {number} _options.computeThrottleTimeout
      * @param {number} _options.computeThrottleMaxQueueSize
      */
    def this(libp2p: Libp2p) = this()
    def this(libp2p: Libp2p, initialCounters: js.Array[String]) = this()
    def this(libp2p: Libp2p, initialCounters: js.Array[String], _options: ComputeThrottleMaxQueueSize) = this()
    def this(libp2p: Libp2p, initialCounters: Unit, _options: ComputeThrottleMaxQueueSize) = this()
    
    var _enabled: Boolean = js.native
    
    var _global: Stat = js.native
    
    var _initialCounters: js.Array[String] = js.native
    
    var _options: ComputeThrottleTimeout = js.native
    
    /** @type {Map<string, Stat>} */
    var _peers: Map[String, Stat] = js.native
    
    def disable(): Unit = js.native
    
    /**
      * @param {PeerId} peer
      */
    def disconnected(peer: PeerId): Unit = js.native
    
    def enable(): Unit = js.native
    
    def forPeer(peerId: String): js.UndefOr[Stat] = js.native
    /**
      * @param {PeerId|string} peerId
      * @returns {Stat|undefined}
      */
    def forPeer(peerId: PeerId): js.UndefOr[Stat] = js.native
    
    def movingAverages: Record[String, Record[Double, IMovingAverage]] = js.native
    
    /**
      *
      * @param {string|null} peer
      * @param {string} counter
      * @param {number} inc
      */
    def push(peer: String, counter: String, inc: Double): Unit = js.native
    def push(peer: Null, counter: String, inc: Double): Unit = js.native
    
    def snapshot: Record[String, js.BigInt] = js.native
    
    def stop(): Unit = js.native
  }
  
  type AverageIntervals = js.Tuple3[Double, Double, Double]
  
  type CID = typings.multiformats.mod.CID[Any, Double, Double, Version]
  
  type PeerId = typings.libp2pInterfacePeerId.mod.PeerId
}
