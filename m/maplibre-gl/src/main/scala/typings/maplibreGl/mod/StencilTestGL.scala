package typings.maplibreGl.mod

import typings.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreGl.anon.Func
  - typings.maplibreGl.anon.Mask
*/
trait StencilTestGL extends StObject
object StencilTestGL {
  
  inline def Func(func: GLenum): typings.maplibreGl.anon.Func = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = 0)
    __obj.asInstanceOf[typings.maplibreGl.anon.Func]
  }
  
  inline def Mask(func: GLenum, mask: Double): typings.maplibreGl.anon.Mask = {
    val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreGl.anon.Mask]
  }
}
