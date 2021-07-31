package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("material-ui/internal/Overlay", JSImport.Default)
  @js.native
  class default ()
    extends Component[OverlayProps, js.Object, js.Any]
  
  @js.native
  trait Overlay
    extends Component[OverlayProps, js.Object, js.Any]
  
  trait OverlayProps
    extends StObject
       with Props[Overlay] {
    
    var autoLockScrolling: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    var show: Boolean
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object OverlayProps {
    
    @scala.inline
    def apply(show: Boolean): OverlayProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayProps]
    }
    
    @scala.inline
    implicit class OverlayPropsMutableBuilder[Self <: OverlayProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoLockScrolling(value: Boolean): Self = StObject.set(x, "autoLockScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoLockScrollingUndefined: Self = StObject.set(x, "autoLockScrolling", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
    }
  }
}
