package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0200`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Func
  extends StObject
     with StencilTestGL {
  
  var func: `0x0200`
  
  var mask: typings.maplibreGl.maplibreGlInts.`0`
}
object Func {
  
  inline def apply(): Func = {
    val __obj = js.Dynamic.literal(func = 0x0200, mask = 0)
    __obj.asInstanceOf[Func]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Func] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0200`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: typings.maplibreGl.maplibreGlInts.`0`): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
