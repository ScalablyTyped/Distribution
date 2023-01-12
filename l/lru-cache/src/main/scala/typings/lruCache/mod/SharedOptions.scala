package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// options shared by all three of the limiting scenarios
trait SharedOptions[K, V] extends StObject {
  
  /**
    * Function that is called on items when they are dropped from the cache.
    * This can be handy if you want to close file descriptors or do other
    * cleanup tasks when items are no longer accessible. Called with `key,
    * value`.  It's called before actually removing the item from the
    * internal cache, so it is *NOT* safe to re-add them.
    * Use `disposeAfter` if you wish to dispose items after they have been
    * full removed, when it is safe to add them back to the cache.
    */
  var dispose: js.UndefOr[Disposer[K, V]] = js.undefined
  
  /**
    * The same as dispose, but called *after* the entry is completely
    * removed and the cache is once again in a clean state.  It is safe to
    * add an item right back into the cache at this point.
    * However, note that it is *very* easy to inadvertently create infinite
    * recursion this way.
    *
    * @since 7.3.0
    */
  var disposeAfter: js.UndefOr[Disposer[K, V]] = js.undefined
  
  /**
    * Set to any value in the constructor or fetch() options to
    * pass arbitrary data to the fetch() method in the options.context
    * field.
    *
    * @since 7.12.0
    */
  var fetchContext: js.UndefOr[Any] = js.undefined
  
  /**
    * `fetchMethod` Function that is used to make background asynchronous
    * fetches.  Called with `fetchMethod(key, staleValue)`.  May return a
    * Promise.
    *
    * If `fetchMethod` is not provided, then `cache.fetch(key)` is
    * equivalent to `Promise.resolve(cache.get(key))`.
    *
    * @since 7.6.0
    */
  var fetchMethod: js.UndefOr[Fetcher[K, V]] = js.undefined
  
  /**
    * Set to true to suppress the deletion of stale data when a
    * `fetchMethod` throws an error or returns a rejected promise
    *
    * @default false
    * @since 7.10.0
    */
  var noDeleteOnFetchRejection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to suppress calling the dispose() function if the entry
    * key is still accessible within the cache.
    * This may be overridden by passing an options object to cache.set().
    *
    * @default false
    */
  var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
}
object SharedOptions {
  
  inline def apply[K, V](): SharedOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedOptions[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedOptions[?, ?], K, V] (val x: Self & (SharedOptions[K, V])) extends AnyVal {
    
    inline def setDispose(value: (V, K, /* reason */ DisposeReason) => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction3(value))
    
    inline def setDisposeAfter(value: (V, K, /* reason */ DisposeReason) => Unit): Self = StObject.set(x, "disposeAfter", js.Any.fromFunction3(value))
    
    inline def setDisposeAfterUndefined: Self = StObject.set(x, "disposeAfter", js.undefined)
    
    inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    
    inline def setFetchContext(value: Any): Self = StObject.set(x, "fetchContext", value.asInstanceOf[js.Any])
    
    inline def setFetchContextUndefined: Self = StObject.set(x, "fetchContext", js.undefined)
    
    inline def setFetchMethod(
      value: (K, V, /* options */ FetcherOptions[K, V]) => js.UndefOr[(js.Promise[js.UndefOr[V | Unit]]) | V | Unit]
    ): Self = StObject.set(x, "fetchMethod", js.Any.fromFunction3(value))
    
    inline def setFetchMethodUndefined: Self = StObject.set(x, "fetchMethod", js.undefined)
    
    inline def setNoDeleteOnFetchRejection(value: Boolean): Self = StObject.set(x, "noDeleteOnFetchRejection", value.asInstanceOf[js.Any])
    
    inline def setNoDeleteOnFetchRejectionUndefined: Self = StObject.set(x, "noDeleteOnFetchRejection", js.undefined)
    
    inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
    
    inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
  }
}
