package typings.jupyterlabStatusbar

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod {
  
  object TextItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components/text", "TextItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLSpanElement]): ReactElement = js.native
    
    /**
      * Props for a TextItem.
      */
    @js.native
    trait IProps extends StObject {
      
      /**
        * The content of the text item.
        */
      var source: String | Double = js.native
      
      /**
        * Hover text to give to the node.
        */
      var title: js.UndefOr[String] = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(source: String | Double): IProps = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSource(value: String | Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
  }
}
