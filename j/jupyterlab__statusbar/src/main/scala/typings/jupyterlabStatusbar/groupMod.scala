package typings.jupyterlabStatusbar

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  object GroupItem {
    
    @JSImport("@jupyterlab/statusbar/lib/components/group", "GroupItem")
    @js.native
    def apply(props: IProps with HTMLAttributes[HTMLDivElement]): ReactElement = js.native
    
    /**
      * Props for the GroupItem.
      */
    @js.native
    trait IProps extends StObject {
      
      /**
        * The items to arrange in a group.
        */
      var children: js.Array[Element] = js.native
      
      /**
        * The spacing, in px, between the items in the goup.
        */
      var spacing: Double = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(children: js.Array[Element], spacing: Double): IProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value :_*))
        
        @scala.inline
        def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      }
    }
  }
}
