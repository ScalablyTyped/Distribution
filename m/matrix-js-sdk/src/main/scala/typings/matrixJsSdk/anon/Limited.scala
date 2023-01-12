package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Limited extends StObject {
  
  var limited: js.UndefOr[Boolean] = js.undefined
  
  var results: js.Array[Userid]
}
object Limited {
  
  inline def apply(results: js.Array[Userid]): Limited = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limited]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Limited] (val x: Self) extends AnyVal {
    
    inline def setLimited(value: Boolean): Self = StObject.set(x, "limited", value.asInstanceOf[js.Any])
    
    inline def setLimitedUndefined: Self = StObject.set(x, "limited", js.undefined)
    
    inline def setResults(value: js.Array[Userid]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsVarargs(value: Userid*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
