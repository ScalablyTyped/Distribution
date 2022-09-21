package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'dragRotate'>> */
trait RequiredPickMapOptionsdra extends StObject {
  
  var dragRotate: Boolean
}
object RequiredPickMapOptionsdra {
  
  inline def apply(dragRotate: Boolean): RequiredPickMapOptionsdra = {
    val __obj = js.Dynamic.literal(dragRotate = dragRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsdra]
  }
  
  extension [Self <: RequiredPickMapOptionsdra](x: Self) {
    
    inline def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
  }
}
