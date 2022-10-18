package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`0`
import typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`1`
import typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`2`
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.ShortcutObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.TakenByObject
import typings.jupyterlabShortcutsExtension.libComponentsTopNavMod.IShortcutUIexternal
import typings.react.mod.Component
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShortcutUIMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutUI", "ShortcutUI")
  @js.native
  open class ShortcutUI protected () extends Component[IShortcutUIProps, IShortcutUIState, Any] {
    def this(props: Any) = this()
    
    /** Fetch shortcut list from SettingRegistry  */
    /* private */ var _refreshShortcutList: Any = js.native
    
    /** Remove conflict flag from all shortcuts */
    def clearConflicts(): Unit = js.native
    
    /** Fetch shortcut list on mount */
    @JSName("componentDidMount")
    def componentDidMount_MShortcutUI(): Unit = js.native
    
    def contextMenu(event: Any, commandIDs: js.Array[String]): Unit = js.native
    
    /** Delete shortcut for command, refresh state */
    def deleteShortcut(shortcutObject: ShortcutObject, shortcutId: String): js.Promise[Unit] = js.native
    
    /** Set new shortcut for command, refresh state */
    def handleUpdate(shortcutObject: ShortcutObject, keys: js.Array[String]): js.Promise[Unit] = js.native
    
    /** Reset a specific shortcut to its default settings */
    def resetShortcut(shortcutObject: ShortcutObject): js.Promise[Unit] = js.native
    
    /** Reset all shortcuts to their defaults */
    def resetShortcuts(): js.Promise[Unit] = js.native
    
    /** Filter shortcut list using current search query */
    /* private */ var searchFilterShortcuts: Any = js.native
    
    /** Sort shortcut list so that an error row is right below the one currently being set */
    def sortConflict(newShortcut: ShortcutObject, takenBy: TakenByObject): Unit = js.native
    
    /** Sort shortcut list using current sort property  */
    def sortShortcuts(): Unit = js.native
    
    /** Toggles showing command selectors */
    def toggleSelectors(): Unit = js.native
    
    /** Set the current seach query */
    def updateSearchQuery(event: MouseEvent): Unit = js.native
    
    /** Set the current list sort order */
    def updateSort(value: String): Unit = js.native
  }
  
  trait IShortcutUIProps extends StObject {
    
    var external: IShortcutUIexternal
    
    var height: Double
    
    var width: Double
  }
  object IShortcutUIProps {
    
    inline def apply(external: IShortcutUIexternal, height: Double, width: Double): IShortcutUIProps = {
      val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutUIProps]
    }
    
    extension [Self <: IShortcutUIProps](x: Self) {
      
      inline def setExternal(value: IShortcutUIexternal): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShortcutUIState extends StObject {
    
    var contextMenu: Any
    
    var currentSort: String
    
    var filteredShortcutList: js.Array[ShortcutObject]
    
    var keyBindingsUsed: StringDictionary[TakenByObject]
    
    var searchQuery: String
    
    var shortcutList: StringDictionary[ShortcutObject]
    
    var shortcutsFetched: Boolean
    
    var showSelectors: Boolean
  }
  object IShortcutUIState {
    
    inline def apply(
      contextMenu: Any,
      currentSort: String,
      filteredShortcutList: js.Array[ShortcutObject],
      keyBindingsUsed: StringDictionary[TakenByObject],
      searchQuery: String,
      shortcutList: StringDictionary[ShortcutObject],
      shortcutsFetched: Boolean,
      showSelectors: Boolean
    ): IShortcutUIState = {
      val __obj = js.Dynamic.literal(contextMenu = contextMenu.asInstanceOf[js.Any], currentSort = currentSort.asInstanceOf[js.Any], filteredShortcutList = filteredShortcutList.asInstanceOf[js.Any], keyBindingsUsed = keyBindingsUsed.asInstanceOf[js.Any], searchQuery = searchQuery.asInstanceOf[js.Any], shortcutList = shortcutList.asInstanceOf[js.Any], shortcutsFetched = shortcutsFetched.asInstanceOf[js.Any], showSelectors = showSelectors.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutUIState]
    }
    
    extension [Self <: IShortcutUIState](x: Self) {
      
      inline def setContextMenu(value: Any): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setCurrentSort(value: String): Self = StObject.set(x, "currentSort", value.asInstanceOf[js.Any])
      
      inline def setFilteredShortcutList(value: js.Array[ShortcutObject]): Self = StObject.set(x, "filteredShortcutList", value.asInstanceOf[js.Any])
      
      inline def setFilteredShortcutListVarargs(value: ShortcutObject*): Self = StObject.set(x, "filteredShortcutList", js.Array(value*))
      
      inline def setKeyBindingsUsed(value: StringDictionary[TakenByObject]): Self = StObject.set(x, "keyBindingsUsed", value.asInstanceOf[js.Any])
      
      inline def setSearchQuery(value: String): Self = StObject.set(x, "searchQuery", value.asInstanceOf[js.Any])
      
      inline def setShortcutList(value: StringDictionary[ShortcutObject]): Self = StObject.set(x, "shortcutList", value.asInstanceOf[js.Any])
      
      inline def setShortcutsFetched(value: Boolean): Self = StObject.set(x, "shortcutsFetched", value.asInstanceOf[js.Any])
      
      inline def setShowSelectors(value: Boolean): Self = StObject.set(x, "showSelectors", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`0`
    - typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`1`
    - typings.jupyterlabShortcutsExtension.jupyterlabShortcutsExtensionInts.`2`
  */
  trait UISize extends StObject
  object UISize {
    
    inline def Regular: `0` = 0.asInstanceOf[`0`]
    
    inline def Small: `1` = 1.asInstanceOf[`1`]
    
    inline def Tiny: `2` = 2.asInstanceOf[`2`]
  }
}
