package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.ShortcutObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.TakenByObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutUIMod.UISize
import typings.jupyterlabShortcutsExtension.libComponentsTopNavMod.IShortcutUIexternal
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShortcutListMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutList", "ShortcutList")
  @js.native
  open class ShortcutList protected ()
    extends Component[IShortcutListProps, js.Object, Any] {
    def this(props: IShortcutListProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IShortcutListProps, context: Any) = this()
  }
  
  trait IShortcutListProps extends StObject {
    
    var clearConflicts: js.Function
    
    var contextMenu: js.Function
    
    var deleteShortcut: js.Function
    
    var errorSize: UISize
    
    var external: IShortcutUIexternal
    
    var handleUpdate: js.Function
    
    var height: Double
    
    var keyBindingsUsed: StringDictionary[TakenByObject]
    
    var resetShortcut: js.Function
    
    var shortcuts: js.Array[ShortcutObject]
    
    var showSelectors: Boolean
    
    var sortConflict: js.Function
  }
  object IShortcutListProps {
    
    inline def apply(
      clearConflicts: js.Function,
      contextMenu: js.Function,
      deleteShortcut: js.Function,
      errorSize: UISize,
      external: IShortcutUIexternal,
      handleUpdate: js.Function,
      height: Double,
      keyBindingsUsed: StringDictionary[TakenByObject],
      resetShortcut: js.Function,
      shortcuts: js.Array[ShortcutObject],
      showSelectors: Boolean,
      sortConflict: js.Function
    ): IShortcutListProps = {
      val __obj = js.Dynamic.literal(clearConflicts = clearConflicts.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], deleteShortcut = deleteShortcut.asInstanceOf[js.Any], errorSize = errorSize.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], handleUpdate = handleUpdate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keyBindingsUsed = keyBindingsUsed.asInstanceOf[js.Any], resetShortcut = resetShortcut.asInstanceOf[js.Any], shortcuts = shortcuts.asInstanceOf[js.Any], showSelectors = showSelectors.asInstanceOf[js.Any], sortConflict = sortConflict.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutListProps]
    }
    
    extension [Self <: IShortcutListProps](x: Self) {
      
      inline def setClearConflicts(value: js.Function): Self = StObject.set(x, "clearConflicts", value.asInstanceOf[js.Any])
      
      inline def setContextMenu(value: js.Function): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setDeleteShortcut(value: js.Function): Self = StObject.set(x, "deleteShortcut", value.asInstanceOf[js.Any])
      
      inline def setErrorSize(value: UISize): Self = StObject.set(x, "errorSize", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: IShortcutUIexternal): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setHandleUpdate(value: js.Function): Self = StObject.set(x, "handleUpdate", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setKeyBindingsUsed(value: StringDictionary[TakenByObject]): Self = StObject.set(x, "keyBindingsUsed", value.asInstanceOf[js.Any])
      
      inline def setResetShortcut(value: js.Function): Self = StObject.set(x, "resetShortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcuts(value: js.Array[ShortcutObject]): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
      
      inline def setShortcutsVarargs(value: ShortcutObject*): Self = StObject.set(x, "shortcuts", js.Array(value*))
      
      inline def setShowSelectors(value: Boolean): Self = StObject.set(x, "showSelectors", value.asInstanceOf[js.Any])
      
      inline def setSortConflict(value: js.Function): Self = StObject.set(x, "sortConflict", value.asInstanceOf[js.Any])
    }
  }
}
