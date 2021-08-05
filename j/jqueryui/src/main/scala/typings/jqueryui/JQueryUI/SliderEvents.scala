package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderEvents extends StObject {
  
  var change: js.UndefOr[SliderEvent] = js.undefined
  
  var create: js.UndefOr[SliderEvent] = js.undefined
  
  var slide: js.UndefOr[SliderEvent] = js.undefined
  
  var start: js.UndefOr[SliderEvent] = js.undefined
  
  var stop: js.UndefOr[SliderEvent] = js.undefined
}
object SliderEvents {
  
  inline def apply(): SliderEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderEvents]
  }
  
  extension [Self <: SliderEvents](x: Self) {
    
    inline def setChange(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setSlide(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
    
    inline def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
