package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsoneditorMod {
  
  @JSImport("@jupyterlab/codeeditor/lib/jsoneditor", "JSONEditor")
  @js.native
  class JSONEditor protected () extends Widget {
    /**
      * Construct a new JSON editor.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _changeGuard: js.Any = js.native
    
    /* private */ var _dataDirty: js.Any = js.native
    
    /**
      * Handle blur events for the text area.
      */
    /* private */ var _evtBlur: js.Any = js.native
    
    /**
      * Handle click events for the buttons.
      */
    /* private */ var _evtClick: js.Any = js.native
    
    /* private */ var _inputDirty: js.Any = js.native
    
    /**
      * Merge the user content.
      */
    /* private */ var _mergeContent: js.Any = js.native
    
    /**
      * Handle a change to the metadata of the source.
      */
    /* private */ var _onSourceChanged: js.Any = js.native
    
    /**
      * Handle change events.
      */
    /* private */ var _onValueChanged: js.Any = js.native
    
    /* private */ var _originalValue: js.Any = js.native
    
    /**
      * Set the value given the owner contents.
      */
    /* private */ var _setValue: js.Any = js.native
    
    /* private */ var _source: js.Any = js.native
    
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
  }
  object JSONEditor {
    
    /**
      * The options used to initialize a json editor.
      */
    trait IOptions extends StObject {
      
      /**
        * The editor factory used by the editor.
        */
      var editorFactory: Factory
    }
    object IOptions {
      
      inline def apply(editorFactory: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): IOptions = {
        val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setEditorFactory(value: /* options */ typings.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
      }
    }
  }
}
