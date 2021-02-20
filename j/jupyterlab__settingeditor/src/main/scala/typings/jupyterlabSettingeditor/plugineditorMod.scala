package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingeditor.plugineditorMod.PluginEditor.IOptions
import typings.jupyterlabSettingeditor.raweditorMod.RawEditor
import typings.jupyterlabSettingeditor.settingeditorMod.SettingEditor.IPluginLayout
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plugineditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/plugineditor", "PluginEditor")
  @js.native
  class PluginEditor protected () extends Widget {
    /**
      * Create a new plugin editor.
      *
      * @param options - The plugin editor instantiation options.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle layout state changes that need to be saved.
      */
    var _onStateChanged: js.Any = js.native
    
    var _rawEditor: js.Any = js.native
    
    var _settings: js.Any = js.native
    
    var _stateChanged: js.Any = js.native
    
    /**
      * If the editor is in a dirty state, confirm that the user wants to leave.
      */
    def confirm(): js.Promise[Unit] = js.native
    
    /**
      * Tests whether the settings have been modified and need saving.
      */
    def isDirty: Boolean = js.native
    
    /**
      * The plugin editor's raw editor.
      */
    val raw: RawEditor = js.native
    
    /**
      * The plugin settings being edited.
      */
    def settings: ISettings | Null = js.native
    def settings_=(settings: ISettings | Null): Unit = js.native
    
    /**
      * The plugin editor layout state.
      */
    def state: IPluginLayout = js.native
    
    /**
      * A signal that emits when editor layout state changes and needs to be saved.
      */
    def stateChanged: ISignal[this.type, Unit] = js.native
    
    def state_=(state: IPluginLayout): Unit = js.native
  }
  object PluginEditor {
    
    /**
      * The instantiation options for a plugin editor.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: Registry = js.native
      
      /**
        * The editor factory used by the plugin editor.
        */
      var editorFactory: Factory = js.native
      
      /**
        * The setting registry used by the editor.
        */
      var registry: ISettingRegistry = js.native
      
      /**
        * The optional MIME renderer to use for rendering debug messages.
        */
      var rendermime: js.UndefOr[IRenderMimeRegistry] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        commands: Registry,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
        registry: ISettingRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: Registry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRendermimeUndefined: Self = StObject.set(x, "rendermime", js.undefined)
      }
    }
  }
}
