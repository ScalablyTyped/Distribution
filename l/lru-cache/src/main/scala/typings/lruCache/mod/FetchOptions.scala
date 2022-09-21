package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options which override the options set in the LRUCache constructor
  * when making `cache.fetch()` calls.
  * This is the union of GetOptions and SetOptions, plus
  * `noDeleteOnFetchRejection`, `forceRefresh`, and `fetchContext`
  */
trait FetchOptions[K, V]
  extends StObject
     with FetcherFetchOptions[K, V] {
  
  var fetchContext: js.UndefOr[Any] = js.undefined
  
  var forceRefresh: js.UndefOr[Boolean] = js.undefined
}
object FetchOptions {
  
  inline def apply[K, V](): FetchOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchOptions[K, V]]
  }
  
  extension [Self <: FetchOptions[?, ?], K, V](x: Self & (FetchOptions[K, V])) {
    
    inline def setFetchContext(value: Any): Self = StObject.set(x, "fetchContext", value.asInstanceOf[js.Any])
    
    inline def setFetchContextUndefined: Self = StObject.set(x, "fetchContext", js.undefined)
    
    inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
    
    inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
  }
}
