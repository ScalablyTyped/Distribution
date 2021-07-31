package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeSliderSlideEvent
  extends StObject
     with RangeSliderEvent {
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object RangeSliderSlideEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: RangeSlider): RangeSliderSlideEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSliderSlideEvent]
  }
  
  @scala.inline
  implicit class RangeSliderSlideEventMutableBuilder[Self <: RangeSliderSlideEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
