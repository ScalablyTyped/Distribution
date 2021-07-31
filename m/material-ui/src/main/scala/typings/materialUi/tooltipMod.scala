package typings.materialUi

import typings.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typings.materialUi.MaterialUI.propTypes.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  @js.native
  trait Tooltip
    extends Component[TooltipProps, js.Object, js.Any]
  
  trait TooltipProps
    extends StObject
       with Props[Tooltip] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var horizontalPosition: js.UndefOr[tooltipHorizontal] = js.undefined
    
    var label: js.Any
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var verticalPosition: js.UndefOr[vertical] = js.undefined
  }
  object TooltipProps {
    
    @scala.inline
    def apply(label: js.Any): TooltipProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHorizontalPosition(value: tooltipHorizontal): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      @scala.inline
      def setVerticalPosition(value: vertical): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
    }
  }
}
