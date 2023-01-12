package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loader[T /* <: LoaderContext */] extends StObject {
  
  def abort(): Unit
  
  var context: T
  
  def destroy(): Unit
  
  /**
    * `getCacheAge()` is called by hls.js to get the duration that a given object
    * has been sitting in a cache proxy when playing live.  If implemented,
    * this should return a value in seconds.
    *
    * For HTTP based loaders, this should return the contents of the "age" header.
    *
    * @returns time object being lodaded
    */
  var getCacheAge: js.UndefOr[js.Function0[Double | Null]] = js.undefined
  
  def load(context: LoaderContext, config: LoaderConfiguration, callbacks: LoaderCallbacks[T]): Unit
  
  var stats: LoaderStats
}
object Loader {
  
  inline def apply[T /* <: LoaderContext */](
    abort: () => Unit,
    context: T,
    destroy: () => Unit,
    load: (LoaderContext, LoaderConfiguration, LoaderCallbacks[T]) => Unit,
    stats: LoaderStats
  ): Loader[T] = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction3(load), stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loader[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loader[?], T /* <: LoaderContext */] (val x: Self & Loader[T]) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setContext(value: T): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetCacheAge(value: () => Double | Null): Self = StObject.set(x, "getCacheAge", js.Any.fromFunction0(value))
    
    inline def setGetCacheAgeUndefined: Self = StObject.set(x, "getCacheAge", js.undefined)
    
    inline def setLoad(value: (LoaderContext, LoaderConfiguration, LoaderCallbacks[T]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
    
    inline def setStats(value: LoaderStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
