package typings.listr2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var count: Double
  
  var withError: js.UndefOr[Any] = js.undefined
}
object Count {
  
  inline def apply(count: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setWithError(value: Any): Self = StObject.set(x, "withError", value.asInstanceOf[js.Any])
    
    inline def setWithErrorUndefined: Self = StObject.set(x, "withError", js.undefined)
  }
}
