package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.libRaweditorMod.RawEditor.IOptions
import typings.jupyterlabSettingeditor.libSplitpanelMod.SplitPanel
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry.ISettings
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRaweditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/raweditor", "RawEditor")
  @js.native
  open class RawEditor protected () extends SplitPanel {
    /**
      * Create a new plugin editor.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _canRevert: Any = js.native
    
    /* private */ var _canSave: Any = js.native
    
    /* private */ var _commands: Any = js.native
    
    /* private */ var _commandsChanged: Any = js.native
    
    /* private */ var _defaults: Any = js.native
    
    /* private */ var _inspector: Any = js.native
    
    /* private */ var _onSaveError: Any = js.native
    
    /**
      * Handle updates to the settings.
      */
    /* private */ var _onSettingsChanged: Any = js.native
    
    /**
      * Handle text changes in the underlying editor.
      */
    /* private */ var _onTextChanged: Any = js.native
    
    /* private */ var _settings: Any = js.native
    
    /* private */ var _toolbar: Any = js.native
    
    /* private */ var _updateToolbar: Any = js.native
    
    /* private */ var _user: Any = js.native
    
    /**
      * Whether the raw editor revert functionality is enabled.
      */
    def canRevert: Boolean = js.native
    
    /**
      * Whether the raw editor save functionality is enabled.
      */
    def canSave: Boolean = js.native
    
    /**
      * Emits when the commands passed in at instantiation change.
      */
    def commandsChanged: ISignal[Any, js.Array[String]] = js.native
    
    /**
      * Tests whether the settings have been modified and need saving.
      */
    def isDirty: Boolean = js.native
    
    /**
      * The setting registry used by the editor.
      */
    val registry: ISettingRegistry = js.native
    
    /**
      * Revert the editor back to original settings.
      */
    def revert(): Unit = js.native
    
    /**
      * Save the contents of the raw editor.
      */
    def save(): js.Promise[Unit] = js.native
    
    /**
      * The plugin settings being edited.
      */
    def settings: ISettings | Null = js.native
    def settings_=(settings: ISettings | Null): Unit = js.native
    
    /**
      * Get the relative sizes of the two editor panels.
      */
    def sizes: js.Array[Double] = js.native
    def sizes_=(sizes: js.Array[Double]): Unit = js.native
    
    /**
      * The inspectable source editor for user input.
      */
    def source: IEditor = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object RawEditor {
    
    /**
      * The toolbar commands and registry for the setting editor toolbar.
      */
    trait ICommandBundle extends StObject {
      
      /**
        * The command registry.
        */
      var registry: CommandRegistry
      
      /**
        * The revert command ID.
        */
      var revert: String
      
      /**
        * The save command ID.
        */
      var save: String
    }
    object ICommandBundle {
      
      inline def apply(registry: CommandRegistry, revert: String, save: String): ICommandBundle = {
        val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICommandBundle]
      }
      
      extension [Self <: ICommandBundle](x: Self) {
        
        inline def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRevert(value: String): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
        
        inline def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for a raw editor.
      */
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: ICommandBundle
      
      /**
        * The editor factory used by the raw editor.
        */
      var editorFactory: Factory
      
      /**
        * A function the raw editor calls on save errors.
        */
      def onSaveError(reason: Any): Unit
      
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
        commands: ICommandBundle,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
        onSaveError: Any => Unit,
        registry: ISettingRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), onSaveError = js.Any.fromFunction1(onSaveError), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCommands(value: ICommandBundle): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        inline def setOnSaveError(value: Any => Unit): Self = StObject.set(x, "onSaveError", js.Any.fromFunction1(value))
        
        inline def setRegistry(value: ISettingRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
        
        inline def setRendermimeUndefined: Self = StObject.set(x, "rendermime", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
