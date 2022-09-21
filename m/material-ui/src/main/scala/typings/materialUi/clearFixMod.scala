package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearFixMod {
  
  @JSImport("material-ui/internal/ClearFix", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ClearFixProps, js.Object, Any]
  
  type ClearFix = Component[ClearFixProps, js.Object, Any]
  
  trait ClearFixProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var ref: js.UndefOr[LegacyRef[ClearFix]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ClearFixProps {
    
    inline def apply(): ClearFixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearFixProps]
    }
    
    extension [Self <: ClearFixProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRef(value: LegacyRef[ClearFix]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ ClearFix | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
