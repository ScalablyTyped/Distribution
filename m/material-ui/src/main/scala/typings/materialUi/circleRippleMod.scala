package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object circleRippleMod {
  
  @JSImport("material-ui/internal/CircleRipple", JSImport.Default)
  @js.native
  class default ()
    extends Component[CircleRippleProps, js.Object, js.Any]
  
  @js.native
  trait CircleRipple
    extends Component[CircleRippleProps, js.Object, js.Any]
  
  @js.native
  trait CircleRippleProps extends Props[CircleRipple] {
    
    var aborted: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CircleRippleProps {
    
    @scala.inline
    def apply(): CircleRippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleRippleProps]
    }
    
    @scala.inline
    implicit class CircleRipplePropsMutableBuilder[Self <: CircleRippleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbortedUndefined: Self = StObject.set(x, "aborted", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
