package typings.maplibreGl.anon

import typings.maplibreGl.mod.StencilTestGL
import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mask
  extends StObject
     with StencilTestGL {
  
  var func: GLenum
  
  var mask: Double
}
object Mask {
  
  inline def apply(func: GLenum, mask: Double): Mask = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mask]
  }
  
  extension [Self <: Mask](x: Self) {
    
    inline def setFunc(value: GLenum): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
