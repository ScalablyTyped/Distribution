package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for the rendering of the pan control. */
trait PanControlOptions extends StObject {
  
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object PanControlOptions {
  
  inline def apply(): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanControlOptions]
  }
  
  extension [Self <: PanControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
