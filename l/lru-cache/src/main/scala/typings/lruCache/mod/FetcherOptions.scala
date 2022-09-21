package typings.lruCache.mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetcherOptions[K, V] extends StObject {
  
  var context: Any
  
  var options: FetcherFetchOptions[K, V]
  
  var signal: AbortSignal
}
object FetcherOptions {
  
  inline def apply[K, V](context: Any, options: FetcherFetchOptions[K, V], signal: AbortSignal): FetcherOptions[K, V] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetcherOptions[K, V]]
  }
  
  extension [Self <: FetcherOptions[?, ?], K, V](x: Self & (FetcherOptions[K, V])) {
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: FetcherFetchOptions[K, V]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
