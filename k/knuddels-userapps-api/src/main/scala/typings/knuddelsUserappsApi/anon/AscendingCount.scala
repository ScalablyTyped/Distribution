package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AscendingCount extends StObject {
  
  var ascending: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Double] = js.undefined
}
object AscendingCount {
  
  inline def apply(): AscendingCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingCount]
  }
  
  extension [Self <: AscendingCount](x: Self) {
    
    inline def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    inline def setAscendingUndefined: Self = StObject.set(x, "ascending", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
