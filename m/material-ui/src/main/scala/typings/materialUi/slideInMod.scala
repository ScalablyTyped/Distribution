package typings.materialUi

import typings.materialUi.MaterialUI.propTypes.direction
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideInMod {
  
  @JSImport("material-ui/internal/SlideIn", JSImport.Default)
  @js.native
  class default ()
    extends Component[SlideInProps, js.Object, js.Any]
  
  @js.native
  trait SlideIn
    extends Component[SlideInProps, js.Object, js.Any]
  
  @js.native
  trait SlideInProps extends Props[SlideIn] {
    
    var childStyle: js.UndefOr[CSSProperties] = js.native
    
    var direction: js.UndefOr[typings.materialUi.MaterialUI.propTypes.direction] = js.native
    
    var enterDelay: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SlideInProps {
    
    @scala.inline
    def apply(): SlideInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideInProps]
    }
    
    @scala.inline
    implicit class SlideInPropsMutableBuilder[Self <: SlideInProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
      @scala.inline
      def setDirection(value: direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
