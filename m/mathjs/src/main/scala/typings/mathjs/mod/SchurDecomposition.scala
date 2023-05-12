package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchurDecomposition extends StObject {
  
  var T: MathCollection
  
  var U: MathCollection
}
object SchurDecomposition {
  
  inline def apply(T: MathCollection, U: MathCollection): SchurDecomposition = {
    val __obj = js.Dynamic.literal(T = T.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchurDecomposition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchurDecomposition] (val x: Self) extends AnyVal {
    
    inline def setT(value: MathCollection): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "T", js.Array(value*))
    
    inline def setU(value: MathCollection): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
    
    inline def setUVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "U", js.Array(value*))
  }
}
