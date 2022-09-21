package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options which override the options set in the LRUCache constructor
  * when making `cache.peek()` calls.
  */
trait PeekOptions extends StObject {
  
  var allowStale: js.UndefOr[Boolean] = js.undefined
}
object PeekOptions {
  
  inline def apply(): PeekOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeekOptions]
  }
  
  extension [Self <: PeekOptions](x: Self) {
    
    inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
    
    inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
  }
}
