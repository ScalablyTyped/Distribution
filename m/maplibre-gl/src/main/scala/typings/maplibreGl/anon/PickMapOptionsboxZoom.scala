package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'boxZoom'> */
trait PickMapOptionsboxZoom extends StObject {
  
  var boxZoom: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsboxZoom {
  
  inline def apply(): PickMapOptionsboxZoom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsboxZoom]
  }
  
  extension [Self <: PickMapOptionsboxZoom](x: Self) {
    
    inline def setBoxZoom(value: Boolean): Self = StObject.set(x, "boxZoom", value.asInstanceOf[js.Any])
    
    inline def setBoxZoomUndefined: Self = StObject.set(x, "boxZoom", js.undefined)
  }
}
