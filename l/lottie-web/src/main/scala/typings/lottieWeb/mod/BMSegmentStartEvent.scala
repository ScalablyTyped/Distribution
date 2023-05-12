package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.segmentStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMSegmentStartEvent extends StObject {
  
  var firstFrame: Double
  
  var totalFrames: Double
  
  var `type`: segmentStart
}
object BMSegmentStartEvent {
  
  inline def apply(firstFrame: Double, totalFrames: Double): BMSegmentStartEvent = {
    val __obj = js.Dynamic.literal(firstFrame = firstFrame.asInstanceOf[js.Any], totalFrames = totalFrames.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("segmentStart")
    __obj.asInstanceOf[BMSegmentStartEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BMSegmentStartEvent] (val x: Self) extends AnyVal {
    
    inline def setFirstFrame(value: Double): Self = StObject.set(x, "firstFrame", value.asInstanceOf[js.Any])
    
    inline def setTotalFrames(value: Double): Self = StObject.set(x, "totalFrames", value.asInstanceOf[js.Any])
    
    inline def setType(value: segmentStart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
