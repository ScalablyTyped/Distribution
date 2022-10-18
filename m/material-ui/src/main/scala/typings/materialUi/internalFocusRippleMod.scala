package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalFocusRippleMod {
  
  @JSImport("material-ui/internal/FocusRipple", JSImport.Default)
  @js.native
  open class default ()
    extends Component[FocusRippleProps, js.Object, Any]
  
  type FocusRipple = Component[FocusRippleProps, js.Object, Any]
  
  trait FocusRippleProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var innerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[FocusRipple]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FocusRippleProps {
    
    inline def apply(): FocusRippleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FocusRippleProps]
    }
    
    extension [Self <: FocusRippleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInnerStyle(value: CSSProperties): Self = StObject.set(x, "innerStyle", value.asInstanceOf[js.Any])
      
      inline def setInnerStyleUndefined: Self = StObject.set(x, "innerStyle", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRef(value: LegacyRef[FocusRipple]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ FocusRipple | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
