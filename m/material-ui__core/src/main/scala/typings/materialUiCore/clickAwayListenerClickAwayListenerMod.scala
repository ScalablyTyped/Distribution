package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.materialUiCoreBooleans.`false`
import typings.materialUiCore.materialUiCoreStrings.onClick
import typings.materialUiCore.materialUiCoreStrings.onMouseDown
import typings.materialUiCore.materialUiCoreStrings.onMouseUp
import typings.materialUiCore.materialUiCoreStrings.onTouchEnd
import typings.materialUiCore.materialUiCoreStrings.onTouchStart
import typings.react.mod.ChangeEvent
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod extends Shortcut {
  
  @JSImport("@material-ui/core/ClickAwayListener/ClickAwayListener", JSImport.Default)
  @js.native
  val default: ComponentType[ClickAwayListenerProps] = js.native
  
  trait ClickAwayListenerProps extends StObject {
    
    var children: ReactNode
    
    var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.undefined
    
    def onClickAway(event: ChangeEvent[js.Object]): Unit
    
    var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.undefined
  }
  object ClickAwayListenerProps {
    
    @scala.inline
    def apply(onClickAway: ChangeEvent[js.Object] => Unit): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    @scala.inline
    implicit class ClickAwayListenerPropsMutableBuilder[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      @scala.inline
      def setOnClickAway(value: ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
    }
  }
  
  type _To = ComponentType[ClickAwayListenerProps]
  
  /* This means you don't have to write `default`, but can instead just say `clickAwayListenerClickAwayListenerMod.foo` */
  override def _to: ComponentType[ClickAwayListenerProps] = default
}
