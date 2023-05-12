package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0203`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskNumber
  extends StObject
     with StencilTestGL {
  
  var func: `0x0203`
  
  var mask: Double
}
object MaskNumber {
  
  inline def apply(mask: Double): MaskNumber = {
    val __obj = js.Dynamic.literal(func = 0x0203, mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskNumber] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0203`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
