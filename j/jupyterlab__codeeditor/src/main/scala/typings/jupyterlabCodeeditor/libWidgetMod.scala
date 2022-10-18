package typings.jupyterlabCodeeditor

import typings.jupyterlabCodeeditor.anon.PartialIConfig
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typings.jupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetMod {
  
  @JSImport("@jupyterlab/codeeditor/lib/widget", "CodeEditorWrapper")
  @js.native
  open class CodeEditorWrapper protected () extends Widget {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'lm-dragenter'` event for the widget.
      */
    /* private */ var _evtDragEnter: Any = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the widget.
      */
    /* private */ var _evtDragLeave: Any = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the widget.
      */
    /* private */ var _evtDragOver: Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    /* private */ var _evtDrop: Any = js.native
    
    /* private */ var _hasRefreshedSinceAttach: Any = js.native
    
    /**
      * Handle a change in model selections.
      */
    /* private */ var _onSelectionsChanged: Any = js.native
    
    /* private */ var _updateOnShow: Any = js.native
    
    /**
      * Get the editor wrapped by the widget.
      */
    val editor: IEditor = js.native
    
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
      * Get the model used by the widget.
      */
    def model: IModel = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
  object CodeEditorWrapper {
    
    /**
      * The options used to initialize a code editor widget.
      */
    trait IOptions extends StObject {
      
      /**
        * The configuration options for the editor.
        */
      var config: js.UndefOr[PartialIConfig] = js.undefined
      
      /**
        * A code editor factory.
        *
        * #### Notes
        * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
        * object because it needs to provide its own node as the host.
        */
      def factory(options: typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions): IEditor
      /**
        * A code editor factory.
        *
        * #### Notes
        * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
        * object because it needs to provide its own node as the host.
        */
      @JSName("factory")
      var factory_Original: Factory
      
      /**
        * The model used to initialize the code editor.
        */
      var model: IModel
      
      /**
        * The default selection style for the editor.
        */
      var selectionStyle: js.UndefOr[ISelectionStyle] = js.undefined
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateOnShow: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The desired uuid for the editor.
        */
      var uuid: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(
        factory: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor,
        model: IModel
      ): IOptions = {
        val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory), model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setConfig(value: PartialIConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        inline def setFactory(value: /* options */ typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
        
        inline def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def setSelectionStyle(value: ISelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
        
        inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
        
        inline def setUpdateOnShow(value: Boolean): Self = StObject.set(x, "updateOnShow", value.asInstanceOf[js.Any])
        
        inline def setUpdateOnShowUndefined: Self = StObject.set(x, "updateOnShow", js.undefined)
        
        inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
        
        inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      }
    }
  }
}
