package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.enterFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMEnterFrameEvent extends StObject {
  
  /** The current time in frames. */
  var currentTime: Double
  
  var direction: Double
  
  /** The total number of frames. */
  var totalTime: Double
  
  var `type`: enterFrame
}
object BMEnterFrameEvent {
  
  inline def apply(currentTime: Double, direction: Double, totalTime: Double): BMEnterFrameEvent = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("enterFrame")
    __obj.asInstanceOf[BMEnterFrameEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BMEnterFrameEvent] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: enterFrame): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
