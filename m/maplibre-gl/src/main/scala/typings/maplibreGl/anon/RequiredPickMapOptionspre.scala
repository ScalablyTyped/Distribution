package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'preserveDrawingBuffer'>> */
trait RequiredPickMapOptionspre extends StObject {
  
  var preserveDrawingBuffer: Boolean
}
object RequiredPickMapOptionspre {
  
  inline def apply(preserveDrawingBuffer: Boolean): RequiredPickMapOptionspre = {
    val __obj = js.Dynamic.literal(preserveDrawingBuffer = preserveDrawingBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredPickMapOptionspre]
  }
  
  extension [Self <: RequiredPickMapOptionspre](x: Self) {
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
  }
}
