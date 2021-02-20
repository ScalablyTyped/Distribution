package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MotionTrackingControlOptions extends StObject {
  
  var position: js.UndefOr[ControlPosition] = js.native
}
object MotionTrackingControlOptions {
  
  @scala.inline
  def apply(): MotionTrackingControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionTrackingControlOptions]
  }
  
  @scala.inline
  implicit class MotionTrackingControlOptionsMutableBuilder[Self <: MotionTrackingControlOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
