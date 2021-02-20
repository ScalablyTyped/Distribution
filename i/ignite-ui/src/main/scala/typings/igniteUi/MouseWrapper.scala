package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseWrapper
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var cancel: js.UndefOr[String] = js.native
  
  var capture: js.UndefOr[CaptureEvent] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var distance: js.UndefOr[Double] = js.native
  
  var drag: js.UndefOr[DragEvent] = js.native
  
  var start: js.UndefOr[StartEvent] = js.native
  
  var stop: js.UndefOr[StopEvent] = js.native
}
object MouseWrapper {
  
  @scala.inline
  def apply(): MouseWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseWrapper]
  }
  
  @scala.inline
  implicit class MouseWrapperMutableBuilder[Self <: MouseWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setCapture(value: (/* event */ Event, /* ui */ CaptureEventUIParam) => Unit): Self = StObject.set(x, "capture", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
