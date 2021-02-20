package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerEvents extends StObject {
  
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.native
  
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.native
}
object SpinnerEvents {
  
  @scala.inline
  def apply(): SpinnerEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerEvents]
  }
  
  @scala.inline
  implicit class SpinnerEventsMutableBuilder[Self <: SpinnerEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    @scala.inline
    def setSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
  }
}
