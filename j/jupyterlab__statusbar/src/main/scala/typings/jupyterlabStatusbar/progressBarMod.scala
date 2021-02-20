package typings.jupyterlabStatusbar

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod {
  
  object ProgressBar {
    
    @JSImport("@jupyterlab/statusbar/lib/components/progressBar", "ProgressBar")
    @js.native
    def apply(props: IProps): Element = js.native
    
    /**
      * Props for the ProgressBar.
      */
    @js.native
    trait IProps extends StObject {
      
      /**
        * The current progress percentage, from 0 to 100
        */
      var percentage: Double = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(percentage: Double): IProps = {
        val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      }
    }
  }
}
