package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcBitswapMod.Stats
import typings.ipfsCoreTypes.distSrcRepoMod.StatResult
import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStatsMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def bitswap(): js.Promise[Stats] = js.native
    def bitswap(options: AbortOptions & OptionExtension): js.Promise[Stats] = js.native
    @JSName("bitswap")
    var bitswap_Original: js.Function1[/* options */ js.UndefOr[AbortOptions & OptionExtension], js.Promise[Stats]] = js.native
    
    /**
      * Return bandwith usage stats
      */
    def bw(): AsyncIterable[BWResult] = js.native
    def bw(options: BWOptions & OptionExtension): AsyncIterable[BWResult] = js.native
    
    def repo(): js.Promise[StatResult] = js.native
    def repo(options: AbortOptions & OptionExtension): js.Promise[StatResult] = js.native
    @JSName("repo")
    var repo_Original: js.Function1[/* options */ js.UndefOr[AbortOptions & OptionExtension], js.Promise[StatResult]] = js.native
  }
  
  trait BWOptions
    extends StObject
       with AbortOptions {
    
    /**
      * The time interval to wait between updating output, if `poll` is `true`.
      */
    var interval: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Specifies a peer to print bandwidth for
      */
    var peer: js.UndefOr[PeerId] = js.undefined
    
    /**
      * Is used to yield bandwidth info at an interval
      */
    var poll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a protocol to print bandwidth for
      */
    var proto: js.UndefOr[String] = js.undefined
  }
  object BWOptions {
    
    inline def apply(): BWOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BWOptions]
    }
    
    extension [Self <: BWOptions](x: Self) {
      
      inline def setInterval(value: Double | String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPeerUndefined: Self = StObject.set(x, "peer", js.undefined)
      
      inline def setPoll(value: Boolean): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
      
      inline def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
      
      inline def setProto(value: String): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
      
      inline def setProtoUndefined: Self = StObject.set(x, "proto", js.undefined)
    }
  }
  
  trait BWResult extends StObject {
    
    var rateIn: Double
    
    var rateOut: Double
    
    var totalIn: js.BigInt
    
    var totalOut: js.BigInt
  }
  object BWResult {
    
    inline def apply(rateIn: Double, rateOut: Double, totalIn: js.BigInt, totalOut: js.BigInt): BWResult = {
      val __obj = js.Dynamic.literal(rateIn = rateIn.asInstanceOf[js.Any], rateOut = rateOut.asInstanceOf[js.Any], totalIn = totalIn.asInstanceOf[js.Any], totalOut = totalOut.asInstanceOf[js.Any])
      __obj.asInstanceOf[BWResult]
    }
    
    extension [Self <: BWResult](x: Self) {
      
      inline def setRateIn(value: Double): Self = StObject.set(x, "rateIn", value.asInstanceOf[js.Any])
      
      inline def setRateOut(value: Double): Self = StObject.set(x, "rateOut", value.asInstanceOf[js.Any])
      
      inline def setTotalIn(value: js.BigInt): Self = StObject.set(x, "totalIn", value.asInstanceOf[js.Any])
      
      inline def setTotalOut(value: js.BigInt): Self = StObject.set(x, "totalOut", value.asInstanceOf[js.Any])
    }
  }
}
