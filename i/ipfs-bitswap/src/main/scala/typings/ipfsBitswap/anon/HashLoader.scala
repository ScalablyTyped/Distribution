package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashLoader extends StObject {
  
  var hashLoader: js.UndefOr[MultihashHasherLoader] = js.undefined
  
  var incomingStreamTimeout: js.UndefOr[Double] = js.undefined
  
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  
  var statsComputeThrottleMaxQueueSize: js.UndefOr[Double] = js.undefined
  
  var statsComputeThrottleTimeout: js.UndefOr[Double] = js.undefined
  
  var statsEnabled: js.UndefOr[Boolean] = js.undefined
}
object HashLoader {
  
  inline def apply(): HashLoader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashLoader]
  }
  
  extension [Self <: HashLoader](x: Self) {
    
    inline def setHashLoader(value: MultihashHasherLoader): Self = StObject.set(x, "hashLoader", value.asInstanceOf[js.Any])
    
    inline def setHashLoaderUndefined: Self = StObject.set(x, "hashLoader", js.undefined)
    
    inline def setIncomingStreamTimeout(value: Double): Self = StObject.set(x, "incomingStreamTimeout", value.asInstanceOf[js.Any])
    
    inline def setIncomingStreamTimeoutUndefined: Self = StObject.set(x, "incomingStreamTimeout", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    
    inline def setStatsComputeThrottleMaxQueueSize(value: Double): Self = StObject.set(x, "statsComputeThrottleMaxQueueSize", value.asInstanceOf[js.Any])
    
    inline def setStatsComputeThrottleMaxQueueSizeUndefined: Self = StObject.set(x, "statsComputeThrottleMaxQueueSize", js.undefined)
    
    inline def setStatsComputeThrottleTimeout(value: Double): Self = StObject.set(x, "statsComputeThrottleTimeout", value.asInstanceOf[js.Any])
    
    inline def setStatsComputeThrottleTimeoutUndefined: Self = StObject.set(x, "statsComputeThrottleTimeout", js.undefined)
    
    inline def setStatsEnabled(value: Boolean): Self = StObject.set(x, "statsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatsEnabledUndefined: Self = StObject.set(x, "statsEnabled", js.undefined)
  }
}
