package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SLUDecomposition
  extends StObject
     with LUDecomposition {
  
  var q: js.Array[Double]
}
object SLUDecomposition {
  
  inline def apply(L: MathCollection, U: MathCollection, p: js.Array[Double], q: js.Array[Double]): SLUDecomposition = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[SLUDecomposition]
  }
  
  extension [Self <: SLUDecomposition](x: Self) {
    
    inline def setQ(value: js.Array[Double]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQVarargs(value: Double*): Self = StObject.set(x, "q", js.Array(value*))
  }
}
