package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleLayerOptions
  extends typings.leaflet.mod.TileLayerOptions {
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}
object StyleLayerOptions {
  
  @scala.inline
  def apply(): StyleLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleLayerOptions]
  }
  
  @scala.inline
  implicit class StyleLayerOptionsMutableBuilder[Self <: StyleLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSanitizer(value: /* template */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
  }
}
