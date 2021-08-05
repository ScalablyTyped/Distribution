package typings.materialUi

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearFixMod {
  
  @JSImport("material-ui/internal/ClearFix", JSImport.Default)
  @js.native
  class default ()
    extends Component[ClearFixProps, js.Object, js.Any]
  
  @js.native
  trait ClearFix
    extends Component[ClearFixProps, js.Object, js.Any]
  
  trait ClearFixProps
    extends StObject
       with Props[ClearFix] {
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ClearFixProps {
    
    inline def apply(): ClearFixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearFixProps]
    }
    
    extension [Self <: ClearFixProps](x: Self) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
