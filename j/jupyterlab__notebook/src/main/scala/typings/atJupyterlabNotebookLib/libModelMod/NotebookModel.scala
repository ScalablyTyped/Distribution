package typings
package atJupyterlabNotebookLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atJupyterlabNotebookLib.libModelMod.INotebookModel because var conflicts: contentChanged, dirty, readOnly, stateChanged. Inlined cells, contentFactory, nbformat, nbformatMinor, metadata, deletedCells */ @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel")
@js.native
/**
  * Construct a new notebook model.
  */
class NotebookModel ()
  extends atJupyterlabDocregistryLib.atJupyterlabDocregistryMod.DocumentModel {
  def this(options: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IOptions) = this()
  var _cells: js.Any = js.native
  var _deletedCells: js.Any = js.native
  /**
    * Make sure we have the required metadata fields.
    */
  var _ensureMetadata: js.Any = js.native
  var _nbformat: js.Any = js.native
  var _nbformatMinor: js.Any = js.native
  /**
    * Handle a change in the cells list.
    */
  var _onCellsChanged: js.Any = js.native
  /**
    * Get the observable list of notebook cells.
    */
  val cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel] = js.native
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory = js.native
  /**
    * The default kernel name of the document.
    */
  val deletedCells: js.Array[java.lang.String] = js.native
  /**
    * The metadata associated with the notebook.
    */
  val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON = js.native
  /**
    * The major version number of the nbformat.
    */
  val nbformat: scala.Double = js.native
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: scala.Double = js.native
  /**
    * Dispose of the resources held by the model.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.INotebookContent): scala.Unit = js.native
}

