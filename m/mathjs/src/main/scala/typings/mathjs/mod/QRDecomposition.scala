package typings.mathjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QRDecomposition extends StObject {
  
  var Q: MathCollection
  
  var R: MathCollection
}
object QRDecomposition {
  
  inline def apply(Q: MathCollection, R: MathCollection): QRDecomposition = {
    val __obj = js.Dynamic.literal(Q = Q.asInstanceOf[js.Any], R = R.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRDecomposition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QRDecomposition] (val x: Self) extends AnyVal {
    
    inline def setQ(value: MathCollection): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    inline def setQVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "Q", js.Array(value*))
    
    inline def setR(value: MathCollection): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
    
    inline def setRVarargs(value: (js.Array[MathNumericType] | MathNumericType)*): Self = StObject.set(x, "R", js.Array(value*))
  }
}
