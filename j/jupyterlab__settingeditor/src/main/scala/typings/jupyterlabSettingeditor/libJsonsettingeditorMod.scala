package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingeditor.libJsonsettingeditorMod.JsonSettingEditor.IOptions
import typings.jupyterlabSettingeditor.libSplitpanelMod.SplitPanel
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabStatedb.libTokensMod.IStateDB
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCoreutils.typesJsonMod.JSONObject
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonsettingeditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/jsonsettingeditor", "JsonSettingEditor")
  @js.native
  open class JsonSettingEditor protected () extends SplitPanel {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _editor: Any = js.native
    
    /**
      * Get the state of the panel.
      */
    /* private */ var _fetchState: Any = js.native
    
    /* private */ var _fetching: Any = js.native
    
    /* private */ var _instructions: Any = js.native
    
    /* private */ var _list: Any = js.native
    
    /**
      * Handle root level layout state changes.
      */
    /* private */ var _onStateChanged: Any = js.native
    
    /**
      * Set the state of the setting editor.
      */
    /* private */ var _saveState: Any = js.native
    
    /* private */ var _saving: Any = js.native
    
    /**
      * Set the layout sizes.
      */
    /* private */ var _setLayout: Any = js.native
    
    /**
      * Set the presets of the setting editor.
      */
    /* private */ var _setState: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _when: Any = js.native
    
    /**
      * Whether the raw editor revert functionality is enabled.
      */
    def canRevertRaw: Boolean = js.native
    
    /**
      * Whether the raw editor save functionality is enabled.
      */
    def canSaveRaw: Boolean = js.native
    
    /**
      * Emits when the commands passed in at instantiation change.
      */
    def commandsChanged: ISignal[Any, js.Array[String]] = js.native
    
    /**
      * The state database key for the editor's state management.
      */
    val key: String = js.native
    
    /**
      * The setting registry used by the editor.
      */
    val registry: ISettingRegistry = js.native
    
    /**
      * Revert raw editor back to original settings.
      */
    def revert(): Unit = js.native
    
    /**
      * Save the contents of the raw editor.
      */
    def save(): js.Promise[Unit] = js.native
    
    /**
      * The currently loaded settings.
      */
    def settings: ISettings | Null = js.native
    
    /**
      * The inspectable raw user editor source for the currently loaded settings.
      */
    def source: IEditor = js.native
    
    /**
      * The state database used to store layout.
      */
    val state: IStateDB[ReadonlyPartialJSONValue] = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object JsonSettingEditor {
    
    /**
      * The layout state for the setting editor.
      */
    trait ILayoutState
      extends StObject
         with JSONObject {
      
      /**
        * The layout state for a plugin editor container.
        */
      var container: IPluginLayout
      
      /**
        * The relative sizes of the plugin list and plugin editor.
        */
      var sizes: js.Array[Double]
    }
    object ILayoutState {
      
      inline def apply(container: IPluginLayout, sizes: js.Array[Double]): ILayoutState = {
        val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILayoutState]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ILayoutState] (val x: Self) extends AnyVal {
        
        inline def setContainer(value: IPluginLayout): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
      }
    }
    
    /**
      * The instantiation options for a setting editor.
      */
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: Registry
      
      /**
        * The editor factory used by the setting editor.
        */
      var editorFactory: Factory
      
      /**
        * The state database key for the editor's state management.
        */
      var key: String
      
      /**
        * The setting registry the editor modifies.
        */
      var registry: ISettingRegistry
      
      /**
        * The optional MIME renderer to use for rendering debug messages.
        */
      var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
      
      /**
        * The state database used to store layout.
        */
      var state: IStateDB[ReadonlyPartialJSONValue]
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
      
      /**
        * The point after which the editor should restore its state.
        */
      var when: js.UndefOr[js.Promise[Any] | js.Array[js.Promise[Any]]] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        commands: Registry,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
        key: String,
        registry: ISettingRegistry,
        state: IStateDB[ReadonlyPartialJSONValue]
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), key = key.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCommands(value: Registry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setRendermimeUndefined: Self = StObject.set(x, "rendermime", js.undefined)
        
        inline def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
        
        inline def setWhen(value: js.Promise[Any] | js.Array[js.Promise[Any]]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
        
        inline def setWhenVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "when", js.Array(value*))
      }
    }
    
    /**
      * The layout information that is stored and restored from the state database.
      */
    trait IPluginLayout
      extends StObject
         with JSONObject {
      
      /**
        * The current plugin being displayed.
        */
      var plugin: String
      
      var sizes: js.Array[Double]
    }
    object IPluginLayout {
      
      inline def apply(plugin: String, sizes: js.Array[Double]): IPluginLayout = {
        val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPluginLayout]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IPluginLayout] (val x: Self) extends AnyVal {
        
        inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        inline def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        inline def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value*))
      }
    }
  }
}
