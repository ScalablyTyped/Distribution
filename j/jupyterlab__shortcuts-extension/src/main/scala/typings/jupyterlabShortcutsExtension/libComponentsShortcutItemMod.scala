package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.ErrorObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.ShortcutObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutInputMod.TakenByObject
import typings.jupyterlabShortcutsExtension.libComponentsShortcutUIMod.UISize
import typings.jupyterlabShortcutsExtension.libComponentsTopNavMod.IShortcutUIexternal
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShortcutItemMod {
  
  @js.native
  sealed trait ShortCutLocation extends StObject
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutItem", "ShortCutLocation")
  @js.native
  object ShortCutLocation extends StObject {
    
    @js.native
    sealed trait Left
      extends StObject
         with ShortCutLocation
    
    @js.native
    sealed trait Right
      extends StObject
         with ShortCutLocation
  }
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutItem", "ShortcutItem")
  @js.native
  open class ShortcutItem protected () extends Component[IShortcutItemProps, IShortcutItemState, Any] {
    def this(props: IShortcutItemProps) = this()
    
    /* private */ var _commands: Any = js.native
    
    /* private */ var addCommandIfNeeded: Any = js.native
    
    def getAddLink(): Element = js.native
    
    def getCategoryCell(): Element = js.native
    
    def getClassNameForShortCuts(nonEmptyKeys: js.Array[String]): String = js.native
    
    def getDisplayReplaceInput(location: ShortCutLocation): Boolean = js.native
    
    def getDivForKey(index: Double, key: String, nonEmptyKeys: js.Array[String]): Element = js.native
    
    def getErrorRow(): Element = js.native
    
    def getInputBoxWhenToggled(): Element = js.native
    
    def getLabelCell(): Element = js.native
    
    def getLocationFromIndex(index: Double): ShortCutLocation = js.native
    
    def getOptionalSelectorCell(): Element = js.native
    
    def getOrDiplayIfNeeded(nonEmptyKeys: js.Array[String]): Element = js.native
    
    def getResetShortCutLink(): Element = js.native
    
    def getShortCutAsInput(key: String, location: ShortCutLocation): Element = js.native
    
    def getShortCutForDisplayOnly(key: String): js.Array[Element] = js.native
    
    def getShortCutsCell(nonEmptyKeys: js.Array[String]): Element = js.native
    
    def getSourceCell(): Element = js.native
    
    def getToggleInputReplaceMethod(location: ShortCutLocation): js.Function0[Unit] = js.native
    
    /* private */ var handleRightClick: Any = js.native
    
    def isLocationBeingEdited(location: ShortCutLocation): Boolean = js.native
    
    /** Transform special key names into unicode characters */
    def toSymbols(value: String): String = js.native
    
    /** Toggle display state of input box */
    /* private */ var toggleInputNew: Any = js.native
    
    /* private */ var toggleInputReplaceLeft: Any = js.native
    
    /* private */ var toggleInputReplaceRight: Any = js.native
  }
  
  trait IShortcutItemProps extends StObject {
    
    var clearConflicts: js.Function
    
    var contextMenu: js.Function
    
    var deleteShortcut: js.Function
    
    var errorSize: UISize
    
    var external: IShortcutUIexternal
    
    var handleUpdate: js.Function
    
    var keyBindingsUsed: StringDictionary[TakenByObject]
    
    var resetShortcut: js.Function
    
    var shortcut: ShortcutObject | ErrorObject
    
    var showSelectors: Boolean
    
    var sortConflict: js.Function
  }
  object IShortcutItemProps {
    
    inline def apply(
      clearConflicts: js.Function,
      contextMenu: js.Function,
      deleteShortcut: js.Function,
      errorSize: UISize,
      external: IShortcutUIexternal,
      handleUpdate: js.Function,
      keyBindingsUsed: StringDictionary[TakenByObject],
      resetShortcut: js.Function,
      shortcut: ShortcutObject | ErrorObject,
      showSelectors: Boolean,
      sortConflict: js.Function
    ): IShortcutItemProps = {
      val __obj = js.Dynamic.literal(clearConflicts = clearConflicts.asInstanceOf[js.Any], contextMenu = contextMenu.asInstanceOf[js.Any], deleteShortcut = deleteShortcut.asInstanceOf[js.Any], errorSize = errorSize.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], handleUpdate = handleUpdate.asInstanceOf[js.Any], keyBindingsUsed = keyBindingsUsed.asInstanceOf[js.Any], resetShortcut = resetShortcut.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], showSelectors = showSelectors.asInstanceOf[js.Any], sortConflict = sortConflict.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutItemProps]
    }
    
    extension [Self <: IShortcutItemProps](x: Self) {
      
      inline def setClearConflicts(value: js.Function): Self = StObject.set(x, "clearConflicts", value.asInstanceOf[js.Any])
      
      inline def setContextMenu(value: js.Function): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      inline def setDeleteShortcut(value: js.Function): Self = StObject.set(x, "deleteShortcut", value.asInstanceOf[js.Any])
      
      inline def setErrorSize(value: UISize): Self = StObject.set(x, "errorSize", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: IShortcutUIexternal): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setHandleUpdate(value: js.Function): Self = StObject.set(x, "handleUpdate", value.asInstanceOf[js.Any])
      
      inline def setKeyBindingsUsed(value: StringDictionary[TakenByObject]): Self = StObject.set(x, "keyBindingsUsed", value.asInstanceOf[js.Any])
      
      inline def setResetShortcut(value: js.Function): Self = StObject.set(x, "resetShortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: ShortcutObject | ErrorObject): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShowSelectors(value: Boolean): Self = StObject.set(x, "showSelectors", value.asInstanceOf[js.Any])
      
      inline def setSortConflict(value: js.Function): Self = StObject.set(x, "sortConflict", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShortcutItemState extends StObject {
    
    var displayNewInput: Boolean
    
    var displayReplaceInputLeft: Boolean
    
    var displayReplaceInputRight: Boolean
    
    var numShortcuts: Double
  }
  object IShortcutItemState {
    
    inline def apply(
      displayNewInput: Boolean,
      displayReplaceInputLeft: Boolean,
      displayReplaceInputRight: Boolean,
      numShortcuts: Double
    ): IShortcutItemState = {
      val __obj = js.Dynamic.literal(displayNewInput = displayNewInput.asInstanceOf[js.Any], displayReplaceInputLeft = displayReplaceInputLeft.asInstanceOf[js.Any], displayReplaceInputRight = displayReplaceInputRight.asInstanceOf[js.Any], numShortcuts = numShortcuts.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutItemState]
    }
    
    extension [Self <: IShortcutItemState](x: Self) {
      
      inline def setDisplayNewInput(value: Boolean): Self = StObject.set(x, "displayNewInput", value.asInstanceOf[js.Any])
      
      inline def setDisplayReplaceInputLeft(value: Boolean): Self = StObject.set(x, "displayReplaceInputLeft", value.asInstanceOf[js.Any])
      
      inline def setDisplayReplaceInputRight(value: Boolean): Self = StObject.set(x, "displayReplaceInputRight", value.asInstanceOf[js.Any])
      
      inline def setNumShortcuts(value: Double): Self = StObject.set(x, "numShortcuts", value.asInstanceOf[js.Any])
    }
  }
}
