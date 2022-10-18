package typings.jupyterlabShortcutsExtension

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShortcutTitleItemMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutTitleItem", "ShortcutTitleItem")
  @js.native
  open class ShortcutTitleItem protected ()
    extends Component[IShortcutTitleItemProps, js.Object, Any] {
    def this(props: IShortcutTitleItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IShortcutTitleItemProps, context: Any) = this()
  }
  
  trait IShortcutTitleItemProps extends StObject {
    
    var active: String
    
    var title: String
    
    var updateSort: js.Function
  }
  object IShortcutTitleItemProps {
    
    inline def apply(active: String, title: String, updateSort: js.Function): IShortcutTitleItemProps = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updateSort = updateSort.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutTitleItemProps]
    }
    
    extension [Self <: IShortcutTitleItemProps](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpdateSort(value: js.Function): Self = StObject.set(x, "updateSort", value.asInstanceOf[js.Any])
    }
  }
}
