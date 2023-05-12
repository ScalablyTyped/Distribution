package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0206`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with StencilTestGL {
  
  var func: `0x0206`
  
  var mask: Double
}
object `1` {
  
  inline def apply(mask: Double): `1` = {
    val __obj = js.Dynamic.literal(func = 0x0206, mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0206`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: Double): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
