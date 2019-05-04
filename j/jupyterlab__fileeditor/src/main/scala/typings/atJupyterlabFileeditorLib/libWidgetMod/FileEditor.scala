package typings
package atJupyterlabFileeditorLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/fileeditor/lib/widget", "FileEditor")
@js.native
class FileEditor protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new editor widget.
    */
  def this(options: atJupyterlabFileeditorLib.libWidgetMod.FileEditorNs.IOptions) = this()
  var _context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
  /**
    * Ensure that the widget has focus.
    */
  var _ensureFocus: js.Any = js.native
  var _mimeTypeService: js.Any = js.native
  /**
    * Handle a change to the path.
    */
  var _onPathChanged: js.Any = js.native
  /**
    * Get the context for the editor widget.
    */
  val context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context = js.native
  var editor: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IEditor */ js.Any = js.native
  var editorWidget: js.Any = js.native
  var model: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IModel */ js.Any = js.native
  /**
    * A promise that resolves when the file editor is ready.
    */
  val ready: js.Promise[scala.Unit] = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the widget's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
}

