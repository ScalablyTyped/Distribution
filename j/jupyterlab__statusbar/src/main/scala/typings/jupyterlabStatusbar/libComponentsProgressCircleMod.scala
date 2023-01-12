package typings.jupyterlabStatusbar

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressCircleMod {
  
  object ProgressCircle {
    
    inline def apply(props: IProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@jupyterlab/statusbar/lib/components/progressCircle", "ProgressCircle")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Props for the ProgressBar.
      */
    trait IProps extends StObject {
      
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * The current progress percentage, from 0 to 100
        */
      var progress: Double
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object IProps {
      
      inline def apply(progress: Double): IProps = {
        val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
  }
}
