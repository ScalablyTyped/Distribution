package typings.materialUiCore

import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.onClick
import typings.materialUiCore.materialUiCoreStrings.onMouseDown
import typings.materialUiCore.materialUiCoreStrings.onMouseUp
import typings.materialUiCore.materialUiCoreStrings.onTouchEnd
import typings.materialUiCore.materialUiCoreStrings.onTouchStart
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod {
  
  @JSImport("@material-ui/core/ClickAwayListener/ClickAwayListener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: ClickAwayListenerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ClickAwayListenerProps extends StObject {
    
    /**
      * The wrapped element.
      */
    var children: ReactNode
    
    /**
      * If `true`, the React tree is ignored and only the DOM tree is considered.
      * This prop changes how portaled elements are handled.
      */
    var disableReactTree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The mouse event to listen to. You can disable the listener by providing `false`.
      */
    var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
    
    /**
      * Callback fired when a "click away" event is detected.
      */
    def onClickAway(event: MouseEvent[Document, NativeMouseEvent]): Unit
    
    /**
      * The touch event to listen to. You can disable the listener by providing `false`.
      */
    var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
  }
  object ClickAwayListenerProps {
    
    inline def apply(onClickAway: MouseEvent[Document, NativeMouseEvent] => Unit): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableReactTree(value: Boolean): Self = StObject.set(x, "disableReactTree", value.asInstanceOf[js.Any])
      
      inline def setDisableReactTreeUndefined: Self = StObject.set(x, "disableReactTree", js.undefined)
      
      inline def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      inline def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      inline def setOnClickAway(value: MouseEvent[Document, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1(value))
      
      inline def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      inline def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
    }
  }
}
