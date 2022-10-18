package typings.jupyterlabCodemirror

import typings.jupyterlabApputils.mod.VDomModel
import typings.jupyterlabApputils.mod.VDomRenderer
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodemirror.libSyntaxstatusMod.EditorSyntaxStatus.IOptions
import typings.jupyterlabCodemirror.libSyntaxstatusMod.EditorSyntaxStatus.Model
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoCommands.mod.CommandRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxstatusMod {
  
  @JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus")
  @js.native
  open class EditorSyntaxStatus protected () extends VDomRenderer[Model] {
    /**
      * Construct a new VDomRenderer for the status item.
      */
    def this(opts: IOptions) = this()
    
    /* private */ var _commands: Any = js.native
    
    /**
      * Create a menu for selecting the mode of the editor.
      */
    /* private */ var _handleClick: Any = js.native
    
    /* private */ var _popup: Any = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object EditorSyntaxStatus {
    
    /**
      * A VDomModel for the current editor/mode combination.
      */
    @JSImport("@jupyterlab/codemirror/lib/syntaxstatus", "EditorSyntaxStatus.Model")
    @js.native
    open class Model () extends VDomModel {
      
      /* private */ var _editor: Any = js.native
      
      /* private */ var _mode: Any = js.native
      
      /**
        * If the editor mode changes, update the model.
        */
      /* private */ var _onMIMETypeChange: Any = js.native
      
      /**
        * Trigger a rerender of the model.
        */
      /* private */ var _triggerChange: Any = js.native
      
      /**
        * The current editor for the application editor tracker.
        */
      def editor: IEditor | Null = js.native
      def editor_=(editor: IEditor | Null): Unit = js.native
      
      /**
        * The current mode for the editor. If no editor is present,
        * returns the empty string.
        */
      def mode: String = js.native
    }
    
    /**
      * Options for the EditorSyntax status item.
      */
    trait IOptions extends StObject {
      
      /**
        * The application command registry.
        */
      var commands: CommandRegistry
      
      /**
        * The language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(commands: CommandRegistry): IOptions = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
