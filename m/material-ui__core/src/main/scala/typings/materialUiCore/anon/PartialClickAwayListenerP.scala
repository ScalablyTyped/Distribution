package typings.materialUiCore.anon

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.onClick
import typings.materialUiCore.materialUiCoreStrings.onMouseDown
import typings.materialUiCore.materialUiCoreStrings.onMouseUp
import typings.materialUiCore.materialUiCoreStrings.onTouchEnd
import typings.materialUiCore.materialUiCoreStrings.onTouchStart
import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
@js.native
trait PartialClickAwayListenerP extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
  
  var onClickAway: js.UndefOr[js.Function1[/* event */ ChangeEvent[js.Object], Unit]] = js.native
  
  var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
}
object PartialClickAwayListenerP {
  
  @scala.inline
  def apply(): PartialClickAwayListenerP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerP]
  }
  
  @scala.inline
  implicit class PartialClickAwayListenerPMutableBuilder[Self <: PartialClickAwayListenerP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
    
    @scala.inline
    def setOnClickAway(value: /* event */ ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    
    @scala.inline
    def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
  }
}
