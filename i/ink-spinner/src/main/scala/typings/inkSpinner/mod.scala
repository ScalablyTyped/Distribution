package typings.inkSpinner

import typings.cliSpinners.mod.SpinnerName
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-spinner", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[SpinnerProps, js.Object, js.Any]
  
  type Spinner = Component[SpinnerProps, js.Object, js.Any]
  
  @js.native
  trait SpinnerProps extends StObject {
    
    /**
      * Type of a spinner to use. See https://github.com/sindresorhus/cli-spinners for available spinners.
      *
      * @default 'dot'
      */
    var `type`: js.UndefOr[SpinnerName] = js.native
  }
  object SpinnerProps {
    
    @scala.inline
    def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: SpinnerName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
