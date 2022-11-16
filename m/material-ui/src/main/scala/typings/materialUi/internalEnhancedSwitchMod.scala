package typings.materialUi

import typings.materialUi.MaterialUI.Switches.CommonEnhancedSwitchProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalEnhancedSwitchMod {
  
  @JSImport("material-ui/internal/EnhancedSwitch", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EnhancedSwitchProps, js.Object, Any]
  
  type EnhancedSwitch = Component[EnhancedSwitchProps, js.Object, Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type EnhancedSwitchProps = material-ui.__MaterialUI.Switches.CommonEnhancedSwitchProps<material-ui.material-ui/internal/EnhancedSwitch.EnhancedSwitch>
  }}}
  to avoid circular code involving: 
  - material-ui.material-ui/internal/EnhancedSwitch.EnhancedSwitch
  - material-ui.material-ui/internal/EnhancedSwitch.EnhancedSwitchProps
  */
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
