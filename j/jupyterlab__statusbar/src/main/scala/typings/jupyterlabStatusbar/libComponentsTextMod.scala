package typings.jupyterlabStatusbar

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextMod {
  
  object TextItem {
    
    inline def apply(props: IProps & HTMLAttributes[HTMLSpanElement]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@jupyterlab/statusbar/lib/components/text", "TextItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Props for a TextItem.
      */
    trait IProps extends StObject {
      
      /**
        * The content of the text item.
        */
      var source: String | Double
      
      /**
        * Hover text to give to the node.
        */
      var title: js.UndefOr[String] = js.undefined
    }
    object IProps {
      
      inline def apply(source: String | Double): IProps = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setSource(value: String | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
