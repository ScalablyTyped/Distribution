package typings
package atJupyterlabNotebookLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/widget", "StaticNotebook")
@js.native
class StaticNotebook protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a notebook widget.
    */
  def this(options: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IOptions) = this()
  /**
    * Create a code cell widget from a code cell model.
    */
  var _createCodeCell: js.Any = js.native
  /**
    * Create a markdown cell widget from a markdown cell model.
    */
  var _createMarkdownCell: js.Any = js.native
  /**
    * Create a raw cell widget from a raw cell model.
    */
  var _createRawCell: js.Any = js.native
  var _editorConfig: js.Any = js.native
  /**
    * Create a cell widget and insert into the notebook.
    */
  var _insertCell: js.Any = js.native
  var _mimetype: js.Any = js.native
  var _mimetypeService: js.Any = js.native
  var _model: js.Any = js.native
  var _modelChanged: js.Any = js.native
  var _modelContentChanged: js.Any = js.native
  /**
    * Move a cell widget.
    */
  var _moveCell: js.Any = js.native
  /**
    * Handle a change cells event.
    */
  var _onCellsChanged: js.Any = js.native
  /**
    * Handle an update to the collaborators.
    */
  var _onCollaboratorsChanged: js.Any = js.native
  /**
    * Handle a new model on the widget.
    */
  var _onModelChanged: js.Any = js.native
  /**
    * Remove a cell widget.
    */
  var _removeCell: js.Any = js.native
  /**
    * Update editor settings for notebook cells.
    */
  var _updateEditorConfig: js.Any = js.native
  /**
    * Update the mimetype of the notebook.
    */
  var _updateMimetype: js.Any = js.native
  /**
    * Get the mimetype for code cells.
    */
  val codeMimetype: java.lang.String = js.native
  /**
    * The cell factory used by the widget.
    */
  val contentFactory: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IContentFactory = js.native
  /**
    * A configuration object for cell editor settings.
    */
  var editorConfig: atJupyterlabNotebookLib.libWidgetMod.StaticNotebookNs.IEditorConfig = js.native
  /**
    * The model for the widget.
    */
  var model: atJupyterlabNotebookLib.libModelMod.INotebookModel = js.native
  /**
    * A signal emitted when the model of the notebook changes.
    */
  val modelChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * A signal emitted when the model content changes.
    *
    * #### Notes
    * This is a convenience signal that follows the current model.
    */
  val modelContentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The Rendermime instance used by the widget.
    */
  val rendermime: atJupyterlabRendermimeLib.atJupyterlabRendermimeMod.RenderMimeRegistry = js.native
  /**
    * A read-only sequence of the widgets in the notebook.
    */
  val widgets: js.Array[atJupyterlabCellsLib.atJupyterlabCellsMod.Cell] = js.native
  /**
    * Handle a cell being inserted.
    *
    * The default implementation is a no-op
    */
  /* protected */ def onCellInserted(index: scala.Double, cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell): scala.Unit = js.native
  /**
    * Handle a cell being moved.
    *
    * The default implementation is a no-op
    */
  /* protected */ def onCellMoved(fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  /**
    * Handle a cell being removed.
    *
    * The default implementation is a no-op
    */
  /* protected */ def onCellRemoved(index: scala.Double, cell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell): scala.Unit = js.native
  /**
    * Handle changes to the notebook model metadata.
    *
    * #### Notes
    * The default implementation updates the mimetypes of the code cells
    * when the `language_info` metadata changes.
    */
  /* protected */ def onMetadataChanged(
    sender: atJupyterlabObservablesLib.libObservablemapMod.IObservableMap[atPhosphorCoreutilsLib.libJsonMod.JSONValue],
    args: atJupyterlabObservablesLib.libObservablemapMod.IObservableMapNs.IChangedArgs[atPhosphorCoreutilsLib.libJsonMod.JSONValue]
  ): scala.Unit = js.native
  /**
    * Handle a new model.
    *
    * #### Notes
    * This method is called after the model change has been handled
    * internally and before the `modelChanged` signal is emitted.
    * The default implementation is a no-op.
    */
  /* protected */ def onModelChanged(
    oldValue: atJupyterlabNotebookLib.libModelMod.INotebookModel,
    newValue: atJupyterlabNotebookLib.libModelMod.INotebookModel
  ): scala.Unit = js.native
  /**
    * Handle changes to the notebook model content.
    *
    * #### Notes
    * The default implementation emits the `modelContentChanged` signal.
    */
  /* protected */ def onModelContentChanged(model: atJupyterlabNotebookLib.libModelMod.INotebookModel, args: scala.Unit): scala.Unit = js.native
}

