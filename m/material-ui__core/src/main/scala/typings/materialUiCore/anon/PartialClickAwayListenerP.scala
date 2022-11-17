package typings.materialUiCore.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ClickAwayListener.ClickAwayListenerProps> */
trait PartialClickAwayListenerP extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disableReactTree: js.UndefOr[Boolean] = js.undefined
  
  var mouseEvent: js.UndefOr["onClick" | "onMouseDown" | "onMouseUp" | false] = js.undefined
  
  var onClickAway: js.UndefOr[js.Function1[/* event */ MouseEvent[Document, NativeMouseEvent], Unit]] = js.undefined
  
  var touchEvent: js.UndefOr["onTouchStart" | "onTouchEnd" | false] = js.undefined
}
object PartialClickAwayListenerP {
  
  inline def apply(): PartialClickAwayListenerP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClickAwayListenerP]
  }
  
  extension [Self <: PartialClickAwayListenerP](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
    
    inline def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
    
    inline def setMouseEvent(value: "onClick" | "onMouseDown" | "onMouseUp" | false): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
    
    inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
    
    inline def setOnClickAway(value: /* event */ MouseEvent[Document, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1(value))
    
    inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
    
    inline def setTouchEvent(value: "onTouchStart" | "onTouchEnd" | false): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
    
    inline def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
  }
}
