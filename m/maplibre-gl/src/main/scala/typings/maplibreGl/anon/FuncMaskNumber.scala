package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0204`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FuncMaskNumber
  extends StObject
     with StencilTestGL {
  
  var func: `0x0204`
  
  var mask: Double
}
object FuncMaskNumber {
  
  inline def apply(mask: Double): FuncMaskNumber = {
    val __obj = js.Dynamic.literal(func = 0x0204, mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[FuncMaskNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FuncMaskNumber] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0204`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
