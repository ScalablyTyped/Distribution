package typings.jupyterlabSettingeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabSettingeditor.raweditorMod.RawEditor.IOptions
import typings.jupyterlabSettingeditor.splitpanelMod.SplitPanel
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raweditorMod {
  
  @JSImport("@jupyterlab/settingeditor/lib/raweditor", "RawEditor")
  @js.native
  class RawEditor protected () extends SplitPanel {
    /**
      * Create a new plugin editor.
      */
    def this(options: IOptions) = this()
    
    var _canRevert: js.Any = js.native
    
    var _canSave: js.Any = js.native
    
    var _commands: js.Any = js.native
    
    var _commandsChanged: js.Any = js.native
    
    var _defaults: js.Any = js.native
    
    var _inspector: js.Any = js.native
    
    var _onSaveError: js.Any = js.native
    
    /**
      * Handle updates to the settings.
      */
    var _onSettingsChanged: js.Any = js.native
    
    /**
      * Handle text changes in the underlying editor.
      */
    var _onTextChanged: js.Any = js.native
    
    var _settings: js.Any = js.native
    
    var _toolbar: js.Any = js.native
    
    var _updateToolbar: js.Any = js.native
    
    var _user: js.Any = js.native
    
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
    def commandsChanged: ISignal[_, js.Array[String]] = js.native
    
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
  }
  object RawEditor {
    
    /**
      * The toolbar commands and registry for the setting editor toolbar.
      */
    @js.native
    trait ICommandBundle extends StObject {
      
      /**
        * The command registry.
        */
      var registry: CommandRegistry = js.native
      
      /**
        * The revert command ID.
        */
      var revert: String = js.native
      
      /**
        * The save command ID.
        */
      var save: String = js.native
    }
    object ICommandBundle {
      
      @scala.inline
      def apply(registry: CommandRegistry, revert: String, save: String): ICommandBundle = {
        val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICommandBundle]
      }
      
      @scala.inline
      implicit class ICommandBundleMutableBuilder[Self <: ICommandBundle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRevert(value: String): Self = StObject.set(x, "revert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSave(value: String): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for a raw editor.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The toolbar commands and registry for the setting editor toolbar.
        */
      var commands: ICommandBundle = js.native
      
      /**
        * The editor factory used by the raw editor.
        */
      var editorFactory: Factory = js.native
      
      /**
        * A function the raw editor calls on save errors.
        */
      def onSaveError(reason: js.Any): Unit = js.native
      
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
        commands: ICommandBundle,
        editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
        onSaveError: js.Any => Unit,
        registry: ISettingRegistry
      ): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], editorFactory = js.Any.fromFunction1(editorFactory), onSaveError = js.Any.fromFunction1(onSaveError), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCommands(value: ICommandBundle): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnSaveError(value: js.Any => Unit): Self = StObject.set(x, "onSaveError", js.Any.fromFunction1(value))
        
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
