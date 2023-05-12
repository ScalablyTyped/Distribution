package typings.lottieWeb.mod

import typings.lottieWeb.lottieWebStrings.loopComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BMCompleteLoopEvent extends StObject {
  
  var currentLoop: Double
  
  var direction: Double
  
  var totalLoops: Double
  
  var `type`: loopComplete
}
object BMCompleteLoopEvent {
  
  inline def apply(currentLoop: Double, direction: Double, totalLoops: Double): BMCompleteLoopEvent = {
    val __obj = js.Dynamic.literal(currentLoop = currentLoop.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], totalLoops = totalLoops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("loopComplete")
    __obj.asInstanceOf[BMCompleteLoopEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BMCompleteLoopEvent] (val x: Self) extends AnyVal {
    
    inline def setCurrentLoop(value: Double): Self = StObject.set(x, "currentLoop", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setTotalLoops(value: Double): Self = StObject.set(x, "totalLoops", value.asInstanceOf[js.Any])
    
    inline def setType(value: loopComplete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
