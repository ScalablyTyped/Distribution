package typings.materialUi

import typings.materialUi.MaterialUI.SharedEnhancedButtonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enhancedButtonMod {
  
  @JSImport("material-ui/internal/EnhancedButton", JSImport.Default)
  @js.native
  class default ()
    extends Component[EnhancedButtonProps, js.Object, js.Any]
  
  @js.native
  trait EnhancedButton
    extends Component[EnhancedButtonProps, js.Object, js.Any]
  
  trait EnhancedButtonProps
    extends StObject
       with SharedEnhancedButtonProps[EnhancedButton]
  object EnhancedButtonProps {
    
    inline def apply(): EnhancedButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancedButtonProps]
    }
  }
}
