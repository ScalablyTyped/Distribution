package typings.materialUi

import typings.materialUi.MaterialUI.Switches.CommonEnhancedSwitchProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enhancedSwitchMod {
  
  @JSImport("material-ui/internal/EnhancedSwitch", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EnhancedSwitchProps, js.Object, Any]
  
  type EnhancedSwitch = Component[EnhancedSwitchProps, js.Object, Any]
  
  trait EnhancedSwitchProps
    extends StObject
       with CommonEnhancedSwitchProps[EnhancedSwitch]
  object EnhancedSwitchProps {
    
    inline def apply(): EnhancedSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancedSwitchProps]
    }
  }
}
