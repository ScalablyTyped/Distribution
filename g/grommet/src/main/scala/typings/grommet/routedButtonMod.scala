package typings.grommet

import typings.grommet.buttonMod.ButtonProps
import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routedButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RoutedButton", "RoutedButton")
  @js.native
  open class RoutedButton protected () extends Component[RoutedButtonProps & ButtonProps, ComponentState, Any] {
    def this(props: RoutedButtonProps & ButtonProps) = this()
    def this(props: RoutedButtonProps & ButtonProps, context: Any) = this()
  }
  @JSImport("grommet/components/RoutedButton", "RoutedButton")
  @js.native
  val RoutedButton: ComponentClass[RoutedButtonProps & ButtonProps, ComponentState] = js.native
  
  trait RoutedButtonProps extends StObject {
    
    var method: js.UndefOr[push | replace] = js.undefined
    
    var path: String
  }
  object RoutedButtonProps {
    
    inline def apply(path: String): RoutedButtonProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutedButtonProps]
    }
    
    extension [Self <: RoutedButtonProps](x: Self) {
      
      inline def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
