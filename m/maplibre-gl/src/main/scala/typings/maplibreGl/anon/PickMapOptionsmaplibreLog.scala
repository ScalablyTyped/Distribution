package typings.maplibreGl.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<maplibre-gl.maplibre-gl.MapOptions, 'maplibreLogo'> */
trait PickMapOptionsmaplibreLog extends StObject {
  
  var maplibreLogo: js.UndefOr[Boolean] = js.undefined
}
object PickMapOptionsmaplibreLog {
  
  inline def apply(): PickMapOptionsmaplibreLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickMapOptionsmaplibreLog]
  }
  
  extension [Self <: PickMapOptionsmaplibreLog](x: Self) {
    
    inline def setMaplibreLogo(value: Boolean): Self = StObject.set(x, "maplibreLogo", value.asInstanceOf[js.Any])
    
    inline def setMaplibreLogoUndefined: Self = StObject.set(x, "maplibreLogo", js.undefined)
  }
}
