package typings.jupyterlabStatusbar

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsGroupMod {
  
  object GroupItem {
    
    inline def apply(props: IProps & HTMLAttributes[HTMLDivElement]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@jupyterlab/statusbar/lib/components/group", "GroupItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Props for the GroupItem.
      */
    trait IProps extends StObject {
      
      /**
        * The items to arrange in a group.
        */
      var children: js.Array[Element]
      
      /**
        * The spacing, in px, between the items in the group.
        */
      var spacing: Double
    }
    object IProps {
      
      inline def apply(children: js.Array[Element], spacing: Double): IProps = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
        
        inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      }
    }
  }
}
