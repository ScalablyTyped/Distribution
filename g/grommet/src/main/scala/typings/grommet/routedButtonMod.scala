package typings.grommet

import typings.grommet.buttonMod.ButtonProps
import typings.grommet.grommetStrings.push
import typings.grommet.grommetStrings.replace
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routedButtonMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RoutedButton", "RoutedButton")
  @js.native
  class RoutedButton protected ()
    extends Component[RoutedButtonProps with ButtonProps, ComponentState, js.Any] {
    def this(props: RoutedButtonProps with ButtonProps) = this()
    def this(props: RoutedButtonProps with ButtonProps, context: js.Any) = this()
  }
  @JSImport("grommet/components/RoutedButton", "RoutedButton")
  @js.native
  val RoutedButton: ComponentClass[RoutedButtonProps with ButtonProps, ComponentState] = js.native
  
  @js.native
  trait RoutedButtonProps extends StObject {
    
    var method: js.UndefOr[push | replace] = js.native
    
    var path: String = js.native
  }
  object RoutedButtonProps {
    
    @scala.inline
    def apply(path: String): RoutedButtonProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutedButtonProps]
    }
    
    @scala.inline
    implicit class RoutedButtonPropsMutableBuilder[Self <: RoutedButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: push | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
