package typings.jupyterlabShortcutsExtension

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsShortcutInputMod {
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutInput", "ErrorObject")
  @js.native
  open class ErrorObject () extends ShortcutObject {
    
    var takenBy: TakenByObject = js.native
  }
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutInput", "ShortcutInput")
  @js.native
  open class ShortcutInput protected () extends Component[IShortcutInputProps, IShortcutInputState, Any] {
    def this(props: IShortcutInputProps) = this()
    
    def checkConflict(takenByObject: TakenByObject, keys: String): Unit = js.native
    
    /**
      * Check if shorcut being typed will work
      * (does not end with ctrl, alt, command, or shift)
      * */
    def checkNonFunctional(shortcut: String): Boolean = js.native
    
    /** Check if shortcut being typed is already taken */
    def checkShortcutAvailability(userInput: String, keys: js.Array[String], currentChain: String): TakenByObject = js.native
    
    def handleBlur(event: FocusEvent[HTMLDivElement, Element]): Unit = js.native
    
    /** Parse and normalize user input */
    def handleInput(event: KeyboardEvent[Element]): Unit = js.native
    
    def handleOverwrite(): js.Promise[Unit] = js.native
    
    def handleReplace(): js.Promise[Unit] = js.native
    
    def handleUpdate(): Unit = js.native
    
    /** Parse user input for chained shortcuts */
    def parseChaining(
      event: KeyboardEvent[Element],
      value: String,
      userInput: String,
      keys: js.Array[String],
      currentChain: String
    ): js.Array[Any] = js.native
  }
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutInput", "ShortcutObject")
  @js.native
  open class ShortcutObject () extends StObject {
    
    var category: String = js.native
    
    var commandName: String = js.native
    
    def get(sortCriteria: String): String = js.native
    
    var hasConflict: Boolean = js.native
    
    var id: String = js.native
    
    var keys: StringDictionary[js.Array[String]] = js.native
    
    var label: String = js.native
    
    var numberOfShortcuts: Double = js.native
    
    var selector: String = js.native
    
    var source: String = js.native
  }
  
  @JSImport("@jupyterlab/shortcuts-extension/lib/components/ShortcutInput", "TakenByObject")
  @js.native
  open class TakenByObject () extends StObject {
    def this(shortcut: ShortcutObject) = this()
    
    var id: String = js.native
    
    var takenBy: ShortcutObject = js.native
    
    var takenByKey: String = js.native
    
    var takenByLabel: String = js.native
  }
  
  trait IShortcutInputProps extends StObject {
    
    var clearConflicts: js.Function
    
    var deleteShortcut: js.Function
    
    var displayInput: Boolean
    
    var handleUpdate: js.Function
    
    var keyBindingsUsed: StringDictionary[TakenByObject]
    
    var newOrReplace: String
    
    var placeholder: String
    
    var shortcut: ShortcutObject
    
    var shortcutId: String
    
    var sortConflict: js.Function
    
    var toSymbols: js.Function
    
    var toggleInput: js.Function
    
    var translator: ITranslator
  }
  object IShortcutInputProps {
    
    inline def apply(
      clearConflicts: js.Function,
      deleteShortcut: js.Function,
      displayInput: Boolean,
      handleUpdate: js.Function,
      keyBindingsUsed: StringDictionary[TakenByObject],
      newOrReplace: String,
      placeholder: String,
      shortcut: ShortcutObject,
      shortcutId: String,
      sortConflict: js.Function,
      toSymbols: js.Function,
      toggleInput: js.Function,
      translator: ITranslator
    ): IShortcutInputProps = {
      val __obj = js.Dynamic.literal(clearConflicts = clearConflicts.asInstanceOf[js.Any], deleteShortcut = deleteShortcut.asInstanceOf[js.Any], displayInput = displayInput.asInstanceOf[js.Any], handleUpdate = handleUpdate.asInstanceOf[js.Any], keyBindingsUsed = keyBindingsUsed.asInstanceOf[js.Any], newOrReplace = newOrReplace.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], shortcut = shortcut.asInstanceOf[js.Any], shortcutId = shortcutId.asInstanceOf[js.Any], sortConflict = sortConflict.asInstanceOf[js.Any], toSymbols = toSymbols.asInstanceOf[js.Any], toggleInput = toggleInput.asInstanceOf[js.Any], translator = translator.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutInputProps]
    }
    
    extension [Self <: IShortcutInputProps](x: Self) {
      
      inline def setClearConflicts(value: js.Function): Self = StObject.set(x, "clearConflicts", value.asInstanceOf[js.Any])
      
      inline def setDeleteShortcut(value: js.Function): Self = StObject.set(x, "deleteShortcut", value.asInstanceOf[js.Any])
      
      inline def setDisplayInput(value: Boolean): Self = StObject.set(x, "displayInput", value.asInstanceOf[js.Any])
      
      inline def setHandleUpdate(value: js.Function): Self = StObject.set(x, "handleUpdate", value.asInstanceOf[js.Any])
      
      inline def setKeyBindingsUsed(value: StringDictionary[TakenByObject]): Self = StObject.set(x, "keyBindingsUsed", value.asInstanceOf[js.Any])
      
      inline def setNewOrReplace(value: String): Self = StObject.set(x, "newOrReplace", value.asInstanceOf[js.Any])
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setShortcut(value: ShortcutObject): Self = StObject.set(x, "shortcut", value.asInstanceOf[js.Any])
      
      inline def setShortcutId(value: String): Self = StObject.set(x, "shortcutId", value.asInstanceOf[js.Any])
      
      inline def setSortConflict(value: js.Function): Self = StObject.set(x, "sortConflict", value.asInstanceOf[js.Any])
      
      inline def setToSymbols(value: js.Function): Self = StObject.set(x, "toSymbols", value.asInstanceOf[js.Any])
      
      inline def setToggleInput(value: js.Function): Self = StObject.set(x, "toggleInput", value.asInstanceOf[js.Any])
      
      inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
    }
  }
  
  trait IShortcutInputState extends StObject {
    
    var currentChain: String
    
    var isAvailable: Boolean
    
    var isFunctional: Boolean
    
    var keys: js.Array[String]
    
    var selected: Boolean
    
    var takenByObject: TakenByObject
    
    var userInput: String
    
    var value: String
  }
  object IShortcutInputState {
    
    inline def apply(
      currentChain: String,
      isAvailable: Boolean,
      isFunctional: Boolean,
      keys: js.Array[String],
      selected: Boolean,
      takenByObject: TakenByObject,
      userInput: String,
      value: String
    ): IShortcutInputState = {
      val __obj = js.Dynamic.literal(currentChain = currentChain.asInstanceOf[js.Any], isAvailable = isAvailable.asInstanceOf[js.Any], isFunctional = isFunctional.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], takenByObject = takenByObject.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IShortcutInputState]
    }
    
    extension [Self <: IShortcutInputState](x: Self) {
      
      inline def setCurrentChain(value: String): Self = StObject.set(x, "currentChain", value.asInstanceOf[js.Any])
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setIsFunctional(value: Boolean): Self = StObject.set(x, "isFunctional", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTakenByObject(value: TakenByObject): Self = StObject.set(x, "takenByObject", value.asInstanceOf[js.Any])
      
      inline def setUserInput(value: String): Self = StObject.set(x, "userInput", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
