package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LUDecomposition extends StObject {
  
  var L: MathCollection
  
  var U: MathCollection
  
  var p: js.Array[Double]
}
object LUDecomposition {
  
  inline def apply(L: MathCollection, U: MathCollection, p: js.Array[Double]): LUDecomposition = {
    val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[LUDecomposition]
  }
  
  extension [Self <: LUDecomposition](x: Self) {
    
    inline def setL(value: MathCollection): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
    
    inline def setLVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "L", js.Array(value*))
    
    inline def setP(value: js.Array[Double]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setPVarargs(value: Double*): Self = StObject.set(x, "p", js.Array(value*))
    
    inline def setU(value: MathCollection): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
    
    inline def setUVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "U", js.Array(value*))
  }
}
