package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TileLayerOptions
  extends StObject
     with typings.leaflet.mod.TileLayerOptions {
  
  var retinaVersion: js.UndefOr[String] = js.undefined
}
object TileLayerOptions {
  
  inline def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  extension [Self <: TileLayerOptions](x: Self) {
    
    inline def setRetinaVersion(value: String): Self = StObject.set(x, "retinaVersion", value.asInstanceOf[js.Any])
    
    inline def setRetinaVersionUndefined: Self = StObject.set(x, "retinaVersion", js.undefined)
  }
}
