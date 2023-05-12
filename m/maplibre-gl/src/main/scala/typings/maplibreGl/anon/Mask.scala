package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0201`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask
  extends StObject
     with StencilTestGL {
  
  var func: `0x0201`
  
  var mask: Double
}
object Mask {
  
  inline def apply(mask: Double): Mask = {
    val __obj = js.Dynamic.literal(func = 0x0201, mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mask] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0201`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
