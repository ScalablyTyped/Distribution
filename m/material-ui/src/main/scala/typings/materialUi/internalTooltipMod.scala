package typings.materialUi

import typings.materialUi.MaterialUI.propTypes.tooltipHorizontal
import typings.materialUi.MaterialUI.propTypes.vertical
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalTooltipMod {
  
  @JSImport("material-ui/internal/Tooltip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TooltipProps, js.Object, Any]
  
  type Tooltip = Component[TooltipProps, js.Object, Any]
  
  trait TooltipProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var horizontalPosition: js.UndefOr[tooltipHorizontal] = js.undefined
    
    var label: Any
    
    var ref: js.UndefOr[LegacyRef[Tooltip]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var touch: js.UndefOr[Boolean] = js.undefined
    
    var verticalPosition: js.UndefOr[vertical] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(label: Any): TooltipProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHorizontalPosition(value: tooltipHorizontal): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
      
      inline def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
      
      inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setRef(value: LegacyRef[Tooltip]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ Tooltip | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTouch(value: Boolean): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setVerticalPosition(value: vertical): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
      
      inline def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
    }
  }
}
