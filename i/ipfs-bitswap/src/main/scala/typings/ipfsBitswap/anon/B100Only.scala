package typings.ipfsBitswap.anon

import typings.ipfsBitswap.distSrcTypesMod.MultihashHasherLoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B100Only extends StObject {
  
  var b100Only: js.UndefOr[Boolean] = js.undefined
  
  var hashLoader: js.UndefOr[MultihashHasherLoader] = js.undefined
  
  var incomingStreamTimeout: js.UndefOr[Double] = js.undefined
  
  var maxInboundStreams: js.UndefOr[Double] = js.undefined
  
  var maxOutboundStreams: js.UndefOr[Double] = js.undefined
}
object B100Only {
  
  inline def apply(): B100Only = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[B100Only]
  }
  
  extension [Self <: B100Only](x: Self) {
    
    inline def setB100Only(value: Boolean): Self = StObject.set(x, "b100Only", value.asInstanceOf[js.Any])
    
    inline def setB100OnlyUndefined: Self = StObject.set(x, "b100Only", js.undefined)
    
    inline def setHashLoader(value: MultihashHasherLoader): Self = StObject.set(x, "hashLoader", value.asInstanceOf[js.Any])
    
    inline def setHashLoaderUndefined: Self = StObject.set(x, "hashLoader", js.undefined)
    
    inline def setIncomingStreamTimeout(value: Double): Self = StObject.set(x, "incomingStreamTimeout", value.asInstanceOf[js.Any])
    
    inline def setIncomingStreamTimeoutUndefined: Self = StObject.set(x, "incomingStreamTimeout", js.undefined)
    
    inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
    
    inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
    
    inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
  }
}
