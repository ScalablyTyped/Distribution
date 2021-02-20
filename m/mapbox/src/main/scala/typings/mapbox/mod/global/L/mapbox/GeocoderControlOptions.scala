package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeocoderControlOptions
  extends typings.leaflet.mod.ControlOptions {
  
  var keepOpen: js.UndefOr[Boolean] = js.native
}
object GeocoderControlOptions {
  
  @scala.inline
  def apply(): GeocoderControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderControlOptions]
  }
  
  @scala.inline
  implicit class GeocoderControlOptionsMutableBuilder[Self <: GeocoderControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeepOpen(value: Boolean): Self = StObject.set(x, "keepOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepOpenUndefined: Self = StObject.set(x, "keepOpen", js.undefined)
  }
}
