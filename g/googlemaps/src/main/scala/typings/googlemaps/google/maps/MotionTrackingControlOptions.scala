package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionTrackingControlOptions extends StObject {
  
  var position: js.UndefOr[ControlPosition] = js.undefined
}
object MotionTrackingControlOptions {
  
  inline def apply(): MotionTrackingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionTrackingControlOptions]
  }
  
  extension [Self <: MotionTrackingControlOptions](x: Self) {
    
    inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
