package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'doubleClickZoom'> */
trait PickMapOptionsdoubleClick extends StObject {
  
  var doubleClickZoom: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsdoubleClick {
  
  inline def apply(): PickMapOptionsdoubleClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsdoubleClick]
  }
  
  extension [Self <: PickMapOptionsdoubleClick](x: Self) {
    
    inline def setDoubleClickZoom(value: Boolean): Self = StObject.set(x, "doubleClickZoom", value.asInstanceOf[js.Any])
    
    inline def setDoubleClickZoomUndefined: Self = StObject.set(x, "doubleClickZoom", js.undefined)
  }
}
