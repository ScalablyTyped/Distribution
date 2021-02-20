package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusRippleMod {
  
  @JSImport("material-ui/internal/FocusRipple", JSImport.Default)
  @js.native
  class default ()
    extends Component[FocusRippleProps, js.Object, js.Any]
  
  @js.native
  trait FocusRipple
    extends Component[FocusRippleProps, js.Object, js.Any]
  
  @js.native
  trait FocusRippleProps extends Props[FocusRipple] {
    
    var color: js.UndefOr[String] = js.native
    
    var innerStyle: js.UndefOr[CSSProperties] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var show: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object FocusRippleProps {
    
    @scala.inline
    def apply(): FocusRippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusRippleProps]
    }
    
    @scala.inline
    implicit class FocusRipplePropsMutableBuilder[Self <: FocusRippleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
