package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the zoom control. */
trait ZoomControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
  
  var style: js.UndefOr[ZoomControlStyle] = js.undefined
}
object ZoomControlOptions {
  
  @scala.inline
  def apply(): ZoomControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomControlOptions]
  }
  
  @scala.inline
  implicit class ZoomControlOptionsMutableBuilder[Self <: ZoomControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setStyle(value: ZoomControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
