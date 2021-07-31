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
    
    @scala.inline
    def apply(): ClearFixProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearFixProps]
    }
    
    @scala.inline
    implicit class ClearFixPropsMutableBuilder[Self <: ClearFixProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
