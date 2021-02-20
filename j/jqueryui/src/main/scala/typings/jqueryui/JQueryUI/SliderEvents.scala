package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderEvents extends StObject {
  
  var change: js.UndefOr[SliderEvent] = js.native
  
  var create: js.UndefOr[SliderEvent] = js.native
  
  var slide: js.UndefOr[SliderEvent] = js.native
  
  var start: js.UndefOr[SliderEvent] = js.native
  
  var stop: js.UndefOr[SliderEvent] = js.native
}
object SliderEvents {
  
  @scala.inline
  def apply(): SliderEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEvents]
  }
  
  @scala.inline
  implicit class SliderEventsMutableBuilder[Self <: SliderEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setSlide(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
