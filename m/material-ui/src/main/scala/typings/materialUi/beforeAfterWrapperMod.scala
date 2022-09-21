package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beforeAfterWrapperMod {
  
  @JSImport("material-ui/internal/BeforeAfterWrapper", JSImport.Default)
  @js.native
  open class default ()
    extends Component[BeforeAfterWrapperProps, js.Object, Any]
  
  type BeforeAfterWrapper = Component[BeforeAfterWrapperProps, js.Object, Any]
  
  trait BeforeAfterWrapperProps extends StObject {
    
    var afterElementType: js.UndefOr[String] = js.undefined
    
    var afterStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var beforeElementType: js.UndefOr[String] = js.undefined
    
    var beforeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var elementType: js.UndefOr[String] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[BeforeAfterWrapper]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object BeforeAfterWrapperProps {
    
    inline def apply(): BeforeAfterWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeAfterWrapperProps]
    }
    
    extension [Self <: BeforeAfterWrapperProps](x: Self) {
      
      inline def setAfterElementType(value: String): Self = StObject.set(x, "afterElementType", value.asInstanceOf[js.Any])
      
      inline def setAfterElementTypeUndefined: Self = StObject.set(x, "afterElementType", js.undefined)
      
      inline def setAfterStyle(value: CSSProperties): Self = StObject.set(x, "afterStyle", value.asInstanceOf[js.Any])
      
      inline def setAfterStyleUndefined: Self = StObject.set(x, "afterStyle", js.undefined)
      
      inline def setBeforeElementType(value: String): Self = StObject.set(x, "beforeElementType", value.asInstanceOf[js.Any])
      
      inline def setBeforeElementTypeUndefined: Self = StObject.set(x, "beforeElementType", js.undefined)
      
      inline def setBeforeStyle(value: CSSProperties): Self = StObject.set(x, "beforeStyle", value.asInstanceOf[js.Any])
      
      inline def setBeforeStyleUndefined: Self = StObject.set(x, "beforeStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setElementType(value: String): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
      
      inline def setElementTypeUndefined: Self = StObject.set(x, "elementType", js.undefined)
      
      inline def setRef(value: LegacyRef[BeforeAfterWrapper]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ BeforeAfterWrapper | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
