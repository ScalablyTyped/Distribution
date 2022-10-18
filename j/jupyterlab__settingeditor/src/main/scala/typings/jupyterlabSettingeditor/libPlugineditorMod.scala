package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.anon.Registry
import typings.jupyterlabSettingeditor.libJsonsettingeditorMod.JsonSettingEditor.IPluginLayout
import typings.jupyterlabSettingeditor.libPlugineditorMod.PluginEditor.IOptions
import typings.jupyterlabSettingeditor.libRaweditorMod.RawEditor
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlugineditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/plugineditor", "PluginEditor")
  @js.native
  open class PluginEditor protected () extends Widget {
    /**
      * Create a new plugin editor.
      *
      * @param options - The plugin editor instantiation options.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle layout state changes that need to be saved.
      */
    /* private */ var _onStateChanged: Any = js.native
    
    /* private */ var _rawEditor: Any = js.native
    
    /* private */ var _settings: Any = js.native
    
    /* private */ var _stateChanged: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
  }
  object PluginEditor {
    
    /**
      * The instantiation options for a plugin editor.
      */
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: Registry
      
      /**
        * The editor factory used by the plugin editor.
        */
      var editorFactory: Factory
      
      /**
        * The setting registry used by the editor.
        */
      var registry: ISettingRegistry
      
      /**
        * The optional MIME renderer to use for rendering debug messages.
        */
      var rendermime: js.UndefOr[IRenderMimeRegistry] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        commands: Registry,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
        registry: ISettingRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCommands(value: Registry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setRendermimeUndefined: Self = StObject.set(x, "rendermime", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
