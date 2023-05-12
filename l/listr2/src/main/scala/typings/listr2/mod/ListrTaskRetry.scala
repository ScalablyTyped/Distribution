package typings.listr2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tasks can retry themselves when defined.
  *
  * - This holds the value of the current error and the current retry attempt.
  */
trait ListrTaskRetry extends StObject {
  
  var count: Double
  
  var error: js.UndefOr[js.Error] = js.undefined
}
object ListrTaskRetry {
  
  inline def apply(count: Double): ListrTaskRetry = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListrTaskRetry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListrTaskRetry] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
