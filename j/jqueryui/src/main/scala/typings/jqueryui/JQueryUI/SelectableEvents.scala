package typings.jqueryui.JQueryUI

import typings.jquery.JQueryEventObject
import typings.jqueryui.anon.Selected
import typings.jqueryui.anon.Selecting
import typings.jqueryui.anon.Unselected
import typings.jqueryui.anon.Unselecting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectableEvents extends StObject {
  
  var selected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selected, Unit]] = js.native
  
  var selecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Selecting, Unit]] = js.native
  
  var start: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  
  var stop: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ js.Any, Unit]] = js.native
  
  var unselected: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselected, Unit]] = js.native
  
  var unselecting: js.UndefOr[js.Function2[/* event */ JQueryEventObject, /* ui */ Unselecting, Unit]] = js.native
}
object SelectableEvents {
  
  @scala.inline
  def apply(): SelectableEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectableEvents]
  }
  
  @scala.inline
  implicit class SelectableEventsMutableBuilder[Self <: SelectableEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: (/* event */ JQueryEventObject, /* ui */ Selected) => Unit): Self = StObject.set(x, "selected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelecting(value: (/* event */ JQueryEventObject, /* ui */ Selecting) => Unit): Self = StObject.set(x, "selecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSelectingUndefined: Self = StObject.set(x, "selecting", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ js.Any) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setUnselected(value: (/* event */ JQueryEventObject, /* ui */ Unselected) => Unit): Self = StObject.set(x, "unselected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnselectedUndefined: Self = StObject.set(x, "unselected", js.undefined)
    
    @scala.inline
    def setUnselecting(value: (/* event */ JQueryEventObject, /* ui */ Unselecting) => Unit): Self = StObject.set(x, "unselecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnselectingUndefined: Self = StObject.set(x, "unselecting", js.undefined)
  }
}
