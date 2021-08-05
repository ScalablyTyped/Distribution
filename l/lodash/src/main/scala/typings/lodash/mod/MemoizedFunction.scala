package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoizedFunction extends StObject {
  
  /**
    * @see _.cache
    */
  var cache: MapCache
}
object MemoizedFunction {
  
  inline def apply(cache: MapCache): MemoizedFunction = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoizedFunction]
  }
  
  extension [Self <: MemoizedFunction](x: Self) {
    
    inline def setCache(value: MapCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
