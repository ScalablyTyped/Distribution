package typings.mapbox.mod.global.L.mapbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//////////////////////////////////////////////////////////////////////
//////////////////////////////// CONTROLS ////////////////////////////
//////////////////////////////////////////////////////////////////////
@js.native
trait ControlOptions
  extends typings.leaflet.mod.ControlOptions {
  
  var sanitizer: js.UndefOr[js.Function1[/* template */ String, String]] = js.native
}
object ControlOptions {
  
  @scala.inline
  def apply(): ControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlOptions]
  }
  
  @scala.inline
  implicit class ControlOptionsMutableBuilder[Self <: ControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSanitizer(value: /* template */ String => String): Self = StObject.set(x, "sanitizer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSanitizerUndefined: Self = StObject.set(x, "sanitizer", js.undefined)
  }
}
