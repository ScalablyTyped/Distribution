package typings.jupyterlabSettingeditor

import typings.jupyterlabApplication.libStatusMod.ILabStatus
import typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor.IOptions
import typings.jupyterlabSettingeditor.libSettingseditorMod.SettingsEditor.SaveState
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabStatedb.libTokensMod.IStateDB
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabUiComponents.libFormComponentRegistryMod.IFormComponentRegistry
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.SplitPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSettingseditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/settingseditor", "SettingsEditor")
  @js.native
  open class SettingsEditor protected () extends SplitPanel {
    def this(options: IOptions) = this()
    
    /* private */ var _clearDirty: Any = js.native
    
    /* private */ var _dirty: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /* private */ var _saveStateChange: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    /**
      * A signal emitted on the start and end of a saving operation.
      */
    def saveStateChanged: ISignal[this.type, SaveState] = js.native
    
    /**
      * Set the dirty state status
      *
      * @param dirty New status
      */
    def setDirtyState(dirty: Boolean): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object SettingsEditor {
    
    /**
      * Settings editor options
      */
    trait IOptions extends StObject {
      
      /**
        * Command registry used to open the JSON settings editor.
        */
      var commands: CommandRegistry
      
      /**
        * Form component registry
        */
      var editorRegistry: IFormComponentRegistry
      
      /**
        * The state database key for the editor's state management.
        */
      var key: String
      
      var query: js.UndefOr[String] = js.undefined
      
      /**
        * The setting registry the editor modifies.
        */
      var registry: ISettingRegistry
      
      /**
        * The state database used to store layout.
        */
      var state: IStateDB[ReadonlyPartialJSONValue]
      
      /**
        * Application status
        */
      var status: ILabStatus
      
      /**
        * List of plugins to skip
        */
      var toSkip: js.UndefOr[js.Array[String]] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        commands: CommandRegistry,
        editorRegistry: IFormComponentRegistry,
        key: String,
        registry: ISettingRegistry,
        state: IStateDB[ReadonlyPartialJSONValue],
        status: ILabStatus
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorRegistry = editorRegistry.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setEditorRegistry(value: IFormComponentRegistry): Self = StObject.set(x, "editorRegistry", value.asInstanceOf[js.Any])
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: ILabStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setToSkip(value: js.Array[String]): Self = StObject.set(x, "toSkip", value.asInstanceOf[js.Any])
        
        inline def setToSkipUndefined: Self = StObject.set(x, "toSkip", js.undefined)
        
        inline def setToSkipVarargs(value: String*): Self = StObject.set(x, "toSkip", js.Array(value*))
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * Settings editor save state
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.started
      - typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.failed
      - typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.completed
    */
    trait SaveState extends StObject
    object SaveState {
      
      inline def completed: typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.completed = "completed".asInstanceOf[typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.completed]
      
      inline def failed: typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.failed = "failed".asInstanceOf[typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.failed]
      
      inline def started: typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.started = "started".asInstanceOf[typings.jupyterlabSettingeditor.jupyterlabSettingeditorStrings.started]
    }
  }
}
