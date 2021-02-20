package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingeditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/settingeditor", "SettingEditor")
  @js.native
  class SettingEditor protected () extends Widget {
    /**
      * Create a new setting editor.
      */
    def this(options: IOptions) = this()
    
    var _editor: js.Any = js.native
    
    /**
      * Get the state of the panel.
      */
    var _fetchState: js.Any = js.native
    
    var _fetching: js.Any = js.native
    
    var _instructions: js.Any = js.native
    
    var _list: js.Any = js.native
    
    /**
      * Handle root level layout state changes.
      */
    var _onStateChanged: js.Any = js.native
    
    var _panel: js.Any = js.native
    
    /**
      * Set the state of the setting editor.
      */
    var _saveState: js.Any = js.native
    
    var _saving: js.Any = js.native
    
    /**
      * Set the layout sizes.
      */
    var _setLayout: js.Any = js.native
    
    /**
      * Set the presets of the setting editor.
      */
    var _setState: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _when: js.Any = js.native
    
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
    def commandsChanged: ISignal[_, js.Array[String]] = js.native
    
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
  }
  object SettingEditor {
    
    /**
      * The layout state for the setting editor.
      */
    @js.native
    trait ILayoutState extends JSONObject {
      
      /**
        * The layout state for a plugin editor container.
        */
      var container: IPluginLayout = js.native
      
      /**
        * The relative sizes of the plugin list and plugin editor.
        */
      var sizes: js.Array[Double] = js.native
    }
    object ILayoutState {
      
      @scala.inline
      def apply(container: IPluginLayout, sizes: js.Array[Double]): ILayoutState = {
        val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.asInstanceOf[ILayoutState]
      }
      
      @scala.inline
      implicit class ILayoutStateMutableBuilder[Self <: ILayoutState] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainer(value: IPluginLayout): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
      }
    }
    
    /**
      * The instantiation options for a setting editor.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: Registry = js.native
      
      /**
        * The editor factory used by the setting editor.
        */
      var editorFactory: Factory = js.native
      
      /**
        * The state database key for the editor's state management.
        */
      var key: String = js.native
      
      /**
        * The setting registry the editor modifies.
        */
      var registry: ISettingRegistry = js.native
      
      /**
        * The optional MIME renderer to use for rendering debug messages.
        */
      var rendermime: js.UndefOr[IRenderMimeRegistry] = js.native
      
      /**
        * The state database used to store layout.
        */
      var state: IStateDB[ReadonlyPartialJSONValue] = js.native
      
      /**
        * The point after which the editor should restore its state.
        */
      var when: js.UndefOr[js.Promise[_] | js.Array[js.Promise[_]]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        commands: Registry,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
        key: String,
        registry: ISettingRegistry,
        state: IStateDB[ReadonlyPartialJSONValue]
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), key = key.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: Registry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermimeUndefined: Self = StObject.set(x, "rendermime", js.undefined)
        
        @scala.inline
        def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhen(value: js.Promise[_] | js.Array[js.Promise[_]]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
        
        @scala.inline
        def setWhenVarargs(value: js.Promise[js.Any]*): Self = StObject.set(x, "when", js.Array(value :_*))
      }
    }
    
    /**
      * The layout information that is stored and restored from the state database.
      */
    @js.native
    trait IPluginLayout extends JSONObject {
      
      /**
        * The current plugin being displayed.
        */
      var plugin: String = js.native
      
      var sizes: js.Array[Double] = js.native
    }
    object IPluginLayout {
      
      @scala.inline
      def apply(plugin: String, sizes: js.Array[Double]): IPluginLayout = {
        val __obj = js.Dynamic.literal(plugin = plugin.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPluginLayout]
      }
      
      @scala.inline
      implicit class IPluginLayoutMutableBuilder[Self <: IPluginLayout] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizes(value: js.Array[Double]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSizesVarargs(value: Double*): Self = StObject.set(x, "sizes", js.Array(value :_*))
      }
    }
  }
}
