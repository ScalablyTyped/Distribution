package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'dragRotate'> */
trait PickMapOptionsdragRotate extends StObject {
  
  var dragRotate: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsdragRotate {
  
  inline def apply(): PickMapOptionsdragRotate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsdragRotate]
  }
  
  extension [Self <: PickMapOptionsdragRotate](x: Self) {
    
    inline def setDragRotate(value: Boolean): Self = StObject.set(x, "dragRotate", value.asInstanceOf[js.Any])
    
    inline def setDragRotateUndefined: Self = StObject.set(x, "dragRotate", js.undefined)
  }
}
