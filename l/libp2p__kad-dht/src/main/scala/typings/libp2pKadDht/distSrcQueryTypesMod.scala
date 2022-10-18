package typings.libp2pKadDht

import typings.libp2pInterfaceDht.mod.QueryEvent
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.AbortSignal
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryTypesMod {
  
  trait QueryContext extends StObject {
    
    var key: js.typedarray.Uint8Array
    
    var numPaths: Double
    
    var pathIndex: Double
    
    var peer: PeerId
    
    var signal: AbortSignal
  }
  object QueryContext {
    
    inline def apply(
      key: js.typedarray.Uint8Array,
      numPaths: Double,
      pathIndex: Double,
      peer: PeerId,
      signal: AbortSignal
    ): QueryContext = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], numPaths = numPaths.asInstanceOf[js.Any], pathIndex = pathIndex.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryContext]
    }
    
    extension [Self <: QueryContext](x: Self) {
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
      
      inline def setPathIndex(value: Double): Self = StObject.set(x, "pathIndex", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  type QueryFunc = js.Function1[/* context */ QueryContext, AsyncIterable[QueryEvent]]
}
