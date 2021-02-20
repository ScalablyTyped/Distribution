package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the scale control. */
@js.native
trait ScaleControlOptions extends StObject {
  
  /** Style id. Used to select what style of scale control to display. */
  var style: js.UndefOr[ScaleControlStyle] = js.native
}
object ScaleControlOptions {
  
  @scala.inline
  def apply(): ScaleControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleControlOptions]
  }
  
  @scala.inline
  implicit class ScaleControlOptionsMutableBuilder[Self <: ScaleControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: ScaleControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
