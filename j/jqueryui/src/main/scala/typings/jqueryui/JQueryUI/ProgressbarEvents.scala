package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressbarEvents extends StObject {
  
  var change: js.UndefOr[ProgressbarEvent] = js.undefined
  
  var complete: js.UndefOr[ProgressbarEvent] = js.undefined
  
  var create: js.UndefOr[ProgressbarEvent] = js.undefined
}
object ProgressbarEvents {
  
  @scala.inline
  def apply(): ProgressbarEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressbarEvents]
  }
  
  @scala.inline
  implicit class ProgressbarEventsMutableBuilder[Self <: ProgressbarEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ ProgressbarUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
