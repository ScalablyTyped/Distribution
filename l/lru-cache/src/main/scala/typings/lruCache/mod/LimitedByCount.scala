package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitedByCount
  extends StObject
     with SafetyBounds[Any, Any] {
  
  /**
    * The number of most recently used items to keep.
    * Note that we may store fewer items than this if maxSize is hit.
    */
  var max: Double
}
object LimitedByCount {
  
  inline def apply(max: Double): LimitedByCount = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedByCount]
  }
  
  extension [Self <: LimitedByCount](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
