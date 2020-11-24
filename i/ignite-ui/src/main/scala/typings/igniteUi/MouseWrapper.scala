package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
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
  implicit class MouseWrapperOps[Self <: MouseWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setCapture(value: (/* event */ Event, /* ui */ CaptureEventUIParam) => Unit): Self = this.set("capture", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCapture: Self = this.set("capture", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    
    @scala.inline
    def setDrag(value: (/* event */ Event, /* ui */ DragEventUIParam) => Unit): Self = this.set("drag", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ Event, /* ui */ StartEventUIParam) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ Event, /* ui */ StopEventUIParam) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
  }
}
