package typings.maplibreGl.anon

import typings.maplibreGl.mod.DragPanOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'dragPan'> */
trait PickMapOptionsdragPan extends StObject {
  
  var dragPan: js.UndefOr[DragPanOptions | Boolean] = js.undefined
}
object PickMapOptionsdragPan {
  
  inline def apply(): PickMapOptionsdragPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsdragPan]
  }
  
  extension [Self <: PickMapOptionsdragPan](x: Self) {
    
    inline def setDragPan(value: DragPanOptions | Boolean): Self = StObject.set(x, "dragPan", value.asInstanceOf[js.Any])
    
    inline def setDragPanUndefined: Self = StObject.set(x, "dragPan", js.undefined)
  }
}
