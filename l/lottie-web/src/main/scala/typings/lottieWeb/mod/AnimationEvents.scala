package typings.lottieWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationEvents extends StObject {
  
  var DOMLoaded: Unit
  
  var complete: BMCompleteEvent
  
  var config_ready: Unit
  
  var data_failed: Unit
  
  var data_ready: Unit
  
  var destroy: BMDestroyEvent
  
  var drawnFrame: BMEnterFrameEvent
  
  var enterFrame: BMEnterFrameEvent
  
  var error: Unit
  
  var loaded_images: Unit
  
  var loopComplete: BMCompleteLoopEvent
  
  var segmentStart: BMSegmentStartEvent
}
object AnimationEvents {
  
  inline def apply(
    DOMLoaded: Unit,
    complete: BMCompleteEvent,
    config_ready: Unit,
    data_failed: Unit,
    data_ready: Unit,
    destroy: BMDestroyEvent,
    drawnFrame: BMEnterFrameEvent,
    enterFrame: BMEnterFrameEvent,
    error: Unit,
    loaded_images: Unit,
    loopComplete: BMCompleteLoopEvent,
    segmentStart: BMSegmentStartEvent
  ): AnimationEvents = {
    val __obj = js.Dynamic.literal(DOMLoaded = DOMLoaded.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config_ready = config_ready.asInstanceOf[js.Any], data_failed = data_failed.asInstanceOf[js.Any], data_ready = data_ready.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], drawnFrame = drawnFrame.asInstanceOf[js.Any], enterFrame = enterFrame.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], loaded_images = loaded_images.asInstanceOf[js.Any], loopComplete = loopComplete.asInstanceOf[js.Any], segmentStart = segmentStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationEvents] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: BMCompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setConfig_ready(value: Unit): Self = StObject.set(x, "config_ready", value.asInstanceOf[js.Any])
    
    inline def setDOMLoaded(value: Unit): Self = StObject.set(x, "DOMLoaded", value.asInstanceOf[js.Any])
    
    inline def setData_failed(value: Unit): Self = StObject.set(x, "data_failed", value.asInstanceOf[js.Any])
    
    inline def setData_ready(value: Unit): Self = StObject.set(x, "data_ready", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: BMDestroyEvent): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDrawnFrame(value: BMEnterFrameEvent): Self = StObject.set(x, "drawnFrame", value.asInstanceOf[js.Any])
    
    inline def setEnterFrame(value: BMEnterFrameEvent): Self = StObject.set(x, "enterFrame", value.asInstanceOf[js.Any])
    
    inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setLoaded_images(value: Unit): Self = StObject.set(x, "loaded_images", value.asInstanceOf[js.Any])
    
    inline def setLoopComplete(value: BMCompleteLoopEvent): Self = StObject.set(x, "loopComplete", value.asInstanceOf[js.Any])
    
    inline def setSegmentStart(value: BMSegmentStartEvent): Self = StObject.set(x, "segmentStart", value.asInstanceOf[js.Any])
  }
}
