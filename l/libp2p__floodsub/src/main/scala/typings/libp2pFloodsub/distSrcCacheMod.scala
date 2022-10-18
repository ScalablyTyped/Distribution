package typings.libp2pFloodsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCacheMod {
  
  @JSImport("@libp2p/floodsub/dist/src/cache", "SimpleTimeCache")
  @js.native
  open class SimpleTimeCache[T] protected () extends StObject {
    def this(options: SimpleTimeCacheOpts) = this()
    
    def clear(): Unit = js.native
    
    /* private */ var entries: Any = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    def has(key: String): Boolean = js.native
    
    /* private */ var lastPruneTime: Any = js.native
    
    def prune(): Unit = js.native
    
    def put(key: String, value: T): Unit = js.native
    
    /* private */ val validityMs: Any = js.native
  }
  
  trait SimpleTimeCacheOpts extends StObject {
    
    var validityMs: Double
  }
  object SimpleTimeCacheOpts {
    
    inline def apply(validityMs: Double): SimpleTimeCacheOpts = {
      val __obj = js.Dynamic.literal(validityMs = validityMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleTimeCacheOpts]
    }
    
    extension [Self <: SimpleTimeCacheOpts](x: Self) {
      
      inline def setValidityMs(value: Double): Self = StObject.set(x, "validityMs", value.asInstanceOf[js.Any])
    }
  }
}
