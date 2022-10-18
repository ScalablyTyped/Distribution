package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingStreamTimeout extends StObject {
  
  var hashLoader: js.UndefOr[MultihashHasherLoader] = js.undefined
  
  var incomingStreamTimeout: js.UndefOr[Double] = js.undefined
  
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  
  var statsComputeThrottleMaxQueueSize: Double & js.UndefOr[Double]
  
  var statsComputeThrottleTimeout: Double & js.UndefOr[Double]
  
  var statsEnabled: Boolean & js.UndefOr[Boolean]
}
object IncomingStreamTimeout {
  
  inline def apply(
    statsComputeThrottleMaxQueueSize: Double & js.UndefOr[Double],
    statsComputeThrottleTimeout: Double & js.UndefOr[Double],
    statsEnabled: Boolean & js.UndefOr[Boolean]
  ): IncomingStreamTimeout = {
    val __obj = js.Dynamic.literal(statsComputeThrottleMaxQueueSize = statsComputeThrottleMaxQueueSize.asInstanceOf[js.Any], statsComputeThrottleTimeout = statsComputeThrottleTimeout.asInstanceOf[js.Any], statsEnabled = statsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingStreamTimeout]
  }
  
  extension [Self <: IncomingStreamTimeout](x: Self) {
    
    inline def setHashLoader(value: MultihashHasherLoader): Self = StObject.set(x, "hashLoader", value.asInstanceOf[js.Any])
    
    inline def setHashLoaderUndefined: Self = StObject.set(x, "hashLoader", js.undefined)
    
    inline def setIncomingStreamTimeout(value: Double): Self = StObject.set(x, "incomingStreamTimeout", value.asInstanceOf[js.Any])
    
    inline def setIncomingStreamTimeoutUndefined: Self = StObject.set(x, "incomingStreamTimeout", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    
    inline def setStatsComputeThrottleMaxQueueSize(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "statsComputeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setStatsComputeThrottleTimeout(value: Double & js.UndefOr[Double]): Self = StObject.set(x, "statsComputeThrottleTimeout", value.asInstanceOf[js.Any])
    
    inline def setStatsEnabled(value: Boolean & js.UndefOr[Boolean]): Self = StObject.set(x, "statsEnabled", value.asInstanceOf[js.Any])
  }
}
