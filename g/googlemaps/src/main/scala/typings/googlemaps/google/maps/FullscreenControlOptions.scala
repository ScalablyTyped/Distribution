package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the fullscreen control. */
trait FullscreenControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is RIGHT_TOP.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object FullscreenControlOptions {
  
  @scala.inline
  def apply(): FullscreenControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenControlOptions]
  }
  
  @scala.inline
  implicit class FullscreenControlOptionsMutableBuilder[Self <: FullscreenControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
