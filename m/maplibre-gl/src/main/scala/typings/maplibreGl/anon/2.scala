package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlInts.`0x0207`
import typings.maplibreGl.mod.StencilTestGL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with StencilTestGL {
  
  var func: `0x0207`
  
  var mask: typings.maplibreGl.maplibreGlInts.`0`
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal(func = 0x0207, mask = 0)
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setFunc(value: `0x0207`): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    
    inline def setMask(value: typings.maplibreGl.maplibreGlInts.`0`): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
  }
}
