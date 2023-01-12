package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options which override the options set in the LRUCAche constructor
  * when making `cache.has()` calls.
  */
trait HasOptions extends StObject {
  
  var updateAgeOnHas: js.UndefOr[Boolean] = js.undefined
}
object HasOptions {
  
  inline def apply(): HasOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasOptions] (val x: Self) extends AnyVal {
    
    inline def setUpdateAgeOnHas(value: Boolean): Self = StObject.set(x, "updateAgeOnHas", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeOnHasUndefined: Self = StObject.set(x, "updateAgeOnHas", js.undefined)
  }
}
