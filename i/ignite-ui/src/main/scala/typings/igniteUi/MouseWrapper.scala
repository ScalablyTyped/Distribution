package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseWrapper
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  var cancel: js.UndefOr[String] = js.undefined
  
  var capture: js.UndefOr[CaptureEvent] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var distance: js.UndefOr[Double] = js.undefined
  
  var drag: js.UndefOr[DragEvent] = js.undefined
  
  var start: js.UndefOr[StartEvent] = js.undefined
  
  var stop: js.UndefOr[StopEvent] = js.undefined
}
object MouseWrapper {
  
  inline def apply(): MouseWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MouseWrapper] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCapture(value: (/* event */ Event, /* ui */ CaptureEventUIParam) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
