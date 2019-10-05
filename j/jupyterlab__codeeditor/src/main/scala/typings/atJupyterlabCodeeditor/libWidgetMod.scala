package typings.atJupyterlabCodeeditor

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.Factory
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IConfig
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IEditor
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ISelectionStyle
import typings.atJupyterlabCodeeditor.libWidgetMod.CodeEditorWrapper.IOptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget.ResizeMessage
import typings.std.Event
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/codeeditor/lib/widget", JSImport.Namespace)
@js.native
object libWidgetMod extends js.Object {
  @js.native
  class CodeEditorWrapper protected () extends Widget {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
    /**
      * Handle the `'p-dragenter'` event for the widget.
      */
    var _evtDragEnter: js.Any = js.native
    /**
      * Handle the `'p-dragleave'` event for the widget.
      */
    var _evtDragLeave: js.Any = js.native
    /**
      * Handle the `'p-dragover'` event for the widget.
      */
    var _evtDragOver: js.Any = js.native
    /**
      * Handle the `'p-drop'` event for the widget.
      */
    var _evtDrop: js.Any = js.native
    /**
      * Handle a change in model selections.
      */
    var _onSelectionsChanged: js.Any = js.native
    var _updateOnShow: js.Any = js.native
    /**
      * Get the editor wrapped by the widget.
      */
    val editor: IEditor = js.native
    /**
      * Get the model used by the widget.
      */
    val model: IModel = js.native
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
      * A message handler invoked on a `'resize'` message.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
  
  @js.native
  object CodeEditorWrapper extends js.Object {
    /**
      * The options used to initialize a code editor widget.
      */
    @js.native
    trait IOptions extends js.Object {
      /**
        * The configuration options for the editor.
        */
      var config: js.UndefOr[Partial[IConfig]] = js.native
      /**
        * A code editor factory.
        *
        * #### Notes
        * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
        * object because it needs to provide its own node as the host.
        */
      @JSName("factory")
      var factory_Original: Factory = js.native
      /**
        * The model used to initialize the code editor.
        */
      var model: IModel = js.native
      /**
        * The default selection style for the editor.
        */
      var selectionStyle: js.UndefOr[ISelectionStyle] = js.native
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateOnShow: js.UndefOr[Boolean] = js.native
      /**
        * The desired uuid for the editor.
        */
      var uuid: js.UndefOr[String] = js.native
      /**
        * A code editor factory.
        *
        * #### Notes
        * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
        * object because it needs to provide its own node as the host.
        */
      def factory(options: typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IOptions): IEditor = js.native
    }
    
  }
  
}

