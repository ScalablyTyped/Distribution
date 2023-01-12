package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StencilFuncType extends StObject {
  
  var func: CompareFuncType
  
  var mask: Double
  
  var ref: Double
}
object StencilFuncType {
  
  inline def apply(func: CompareFuncType, mask: Double, ref: Double): StencilFuncType = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[StencilFuncType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StencilFuncType] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: CompareFuncType): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
