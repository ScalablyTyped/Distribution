package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'scrollZoom'> */
trait PickMapOptionsscrollZoom extends StObject {
  
  var scrollZoom: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsscrollZoom {
  
  inline def apply(): PickMapOptionsscrollZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsscrollZoom]
  }
  
  extension [Self <: PickMapOptionsscrollZoom](x: Self) {
    
    inline def setScrollZoom(value: Boolean): Self = StObject.set(x, "scrollZoom", value.asInstanceOf[js.Any])
    
    inline def setScrollZoomUndefined: Self = StObject.set(x, "scrollZoom", js.undefined)
  }
}
