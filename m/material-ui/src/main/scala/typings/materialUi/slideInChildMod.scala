package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideInChildMod {
  
  @JSImport("material-ui/internal/SlideInChild", JSImport.Default)
  @js.native
  class default ()
    extends Component[SlideInChildProps, js.Object, js.Any]
  
  @js.native
  trait SlideInChild
    extends Component[SlideInChildProps, js.Object, js.Any]
  
  @js.native
  trait SlideInChildProps extends Props[SlideInChild] {
    
    var direction: js.UndefOr[String] = js.native
    
    var enterDelay: js.UndefOr[Double] = js.native
    
    var getLeaveDirection: js.Function = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object SlideInChildProps {
    
    @scala.inline
    def apply(getLeaveDirection: js.Function): SlideInChildProps = {
      val __obj = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SlideInChildProps]
    }
    
    @scala.inline
    implicit class SlideInChildPropsMutableBuilder[Self <: SlideInChildProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setGetLeaveDirection(value: js.Function): Self = StObject.set(x, "getLeaveDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
