package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.libJsoneditorMod.JSONEditor.IOptions
import typings.jupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsoneditorMod {
  
  @JSImport("@jupyterlab/codeeditor/lib/jsoneditor", "JSONEditor")
  @js.native
  open class JSONEditor protected () extends Widget {
    /**
      * Construct a new JSON editor.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _changeGuard: Any = js.native
    
    /* private */ var _dataDirty: Any = js.native
    
    /**
      * Handle blur events for the text area.
      */
    /* private */ var _evtBlur: Any = js.native
    
    /**
      * Handle click events for the buttons.
      */
    /* private */ var _evtClick: Any = js.native
    
    /* private */ var _inputDirty: Any = js.native
    
    /**
      * Merge the user content.
      */
    /* private */ var _mergeContent: Any = js.native
    
    /**
      * Handle a change to the metadata of the source.
      */
    /* private */ var _onSourceChanged: Any = js.native
    
    /**
      * Handle change events.
      */
    /* private */ var _onValueChanged: Any = js.native
    
    /* private */ var _originalValue: Any = js.native
    
    /**
      * Set the value given the owner contents.
      */
    /* private */ var _setValue: Any = js.native
    
    /* private */ var _source: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /**
      * The commit button used by the JSON editor.
      */
    val commitButtonNode: HTMLSpanElement = js.native
    
    /**
      * The code editor used by the editor.
      */
    val editor: IEditor = js.native
    
    /**
      * The editor host node used by the JSON editor.
      */
    val editorHostNode: HTMLDivElement = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * The editor host node used by the JSON editor.
      */
    val headerNode: HTMLDivElement = js.native
    
    /**
      * Get whether the editor is dirty.
      */
    def isDirty: Boolean = js.native
    
    /**
      * The code editor model used by the editor.
      */
    val model: IModel = js.native
    
    /**
      * The revert button used by the JSON editor.
      */
    val revertButtonNode: HTMLSpanElement = js.native
    
    /**
      * The observable source.
      */
    def source: IObservableJSON | Null = js.native
    def source_=(value: IObservableJSON | Null): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object JSONEditor {
    
    /**
      * The options used to initialize a json editor.
      */
    trait IOptions extends StObject {
      
      /**
        * The editor factory used by the editor.
        */
      def editorFactory(options: typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions): IEditor
      /**
        * The editor factory used by the editor.
        */
      @JSName("editorFactory")
      var editorFactory_Original: Factory
      
      /**
        * The language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        editorFactory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor
      ): IOptions = {
        val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
