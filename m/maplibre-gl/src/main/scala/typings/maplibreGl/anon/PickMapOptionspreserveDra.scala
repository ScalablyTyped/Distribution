package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'preserveDrawingBuffer'> */
trait PickMapOptionspreserveDra extends StObject {
  
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionspreserveDra {
  
  inline def apply(): PickMapOptionspreserveDra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionspreserveDra]
  }
  
  extension [Self <: PickMapOptionspreserveDra](x: Self) {
    
    inline def setPreserveDrawingBuffer(value: Boolean): Self = StObject.set(x, "preserveDrawingBuffer", value.asInstanceOf[js.Any])
    
    inline def setPreserveDrawingBufferUndefined: Self = StObject.set(x, "preserveDrawingBuffer", js.undefined)
  }
}
