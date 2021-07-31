package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the Street View pegman control on the map. */
trait StreetViewControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map. The
    * default position is embedded within the navigation (zoom and pan)
    * controls. If this position is empty or the same as that specified in the
    * zoomControlOptions or panControlOptions, the Street View control will be
    * displayed as part of the navigation controls. Otherwise, it will be
    * displayed separately.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object StreetViewControlOptions {
  
  @scala.inline
  def apply(): StreetViewControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreetViewControlOptions]
  }
  
  @scala.inline
  implicit class StreetViewControlOptionsMutableBuilder[Self <: StreetViewControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
