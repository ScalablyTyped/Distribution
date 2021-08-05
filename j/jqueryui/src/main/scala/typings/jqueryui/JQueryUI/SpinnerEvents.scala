package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerEvents extends StObject {
  
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.undefined
  
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
  
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
}
object SpinnerEvents {
  
  inline def apply(): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerEvents]
  }
  
  extension [Self <: SpinnerEvents](x: Self) {
    
    inline def setChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction2(value))
    
    inline def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    
    inline def setStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    inline def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
