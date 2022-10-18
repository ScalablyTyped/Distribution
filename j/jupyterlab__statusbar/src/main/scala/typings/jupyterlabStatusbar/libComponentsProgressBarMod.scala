package typings.jupyterlabStatusbar

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressBarMod {
  
  object ProgressBar {
    
    inline def apply(props: IProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@jupyterlab/statusbar/lib/components/progressBar", "ProgressBar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Props for the ProgressBar.
      */
    trait IProps extends StObject {
      
      /**
        * Text to show inside progress bar.
        */
      var content: js.UndefOr[String] = js.undefined
      
      /**
        * The current progress percentage, from 0 to 100
        */
      var percentage: Double
      
      /**
        * Width of progress bar in pixel.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object IProps {
      
      inline def apply(percentage: Double): IProps = {
        val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
}
