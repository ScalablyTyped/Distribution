package typings.maplibreGl.anon

import typings.maplibreGl.mod.DragPanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'dragPan'>> */
trait RequiredPickMapOptionsdraDragPan extends StObject {
  
  var dragPan: DragPanOptions | Boolean
}
object RequiredPickMapOptionsdraDragPan {
  
  inline def apply(dragPan: DragPanOptions | Boolean): RequiredPickMapOptionsdraDragPan = {
    val __obj = js.Dynamic.literal(dragPan = dragPan.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionsdraDragPan]
  }
  
  extension [Self <: RequiredPickMapOptionsdraDragPan](x: Self) {
    
    inline def setDragPan(value: DragPanOptions | Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
  }
}
