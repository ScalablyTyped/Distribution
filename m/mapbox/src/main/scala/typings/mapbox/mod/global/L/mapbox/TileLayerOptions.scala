package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileLayerOptions
  extends typings.leaflet.mod.TileLayerOptions {
  
  var retinaVersion: js.UndefOr[String] = js.native
}
object TileLayerOptions {
  
  @scala.inline
  def apply(): TileLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileLayerOptions]
  }
  
  @scala.inline
  implicit class TileLayerOptionsMutableBuilder[Self <: TileLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetinaVersion(value: String): Self = StObject.set(x, "retinaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetinaVersionUndefined: Self = StObject.set(x, "retinaVersion", js.undefined)
  }
}
