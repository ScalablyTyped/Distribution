package typings.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ARRAYCONSTRAIN extends StObject {
  
  var ARRAYFORMULA: ArrayFunction
  
  var ARRAY_CONSTRAIN: ArraySizeMethod
  
  var FILTER: Parameters
}
object ARRAYCONSTRAIN {
  
  inline def apply(ARRAYFORMULA: ArrayFunction, ARRAY_CONSTRAIN: ArraySizeMethod, FILTER: Parameters): ARRAYCONSTRAIN = {
    val __obj = js.Dynamic.literal(ARRAYFORMULA = ARRAYFORMULA.asInstanceOf[js.Any], ARRAY_CONSTRAIN = ARRAY_CONSTRAIN.asInstanceOf[js.Any], FILTER = FILTER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARRAYCONSTRAIN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ARRAYCONSTRAIN] (val x: Self) extends AnyVal {
    
    inline def setARRAYFORMULA(value: ArrayFunction): Self = StObject.set(x, "ARRAYFORMULA", value.asInstanceOf[js.Any])
    
    inline def setARRAY_CONSTRAIN(value: ArraySizeMethod): Self = StObject.set(x, "ARRAY_CONSTRAIN", value.asInstanceOf[js.Any])
    
    inline def setFILTER(value: Parameters): Self = StObject.set(x, "FILTER", value.asInstanceOf[js.Any])
  }
}
