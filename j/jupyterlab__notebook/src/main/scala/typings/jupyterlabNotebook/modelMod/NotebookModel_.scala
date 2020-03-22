package typings.jupyterlabNotebook.modelMod

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabDocregistry.mod.DocumentModel
import typings.jupyterlabNbformat.mod.INotebookContent
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabNotebook.modelMod.NotebookModel.IOptions
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel because Already inherited
- typings.jupyterlabNotebook.modelMod.INotebookModel because var conflicts: contentChanged, dirty, readOnly, stateChanged. Inlined cells, contentFactory, nbformat, nbformatMinor, metadata, deletedCells */ @JSImport("@jupyterlab/notebook/lib/model", "NotebookModel")
@js.native
/**
  * Construct a new notebook model.
  */
class NotebookModel_ () extends DocumentModel {
  def this(options: IOptions) = this()
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
    * The list of cells in the notebook.
    */
  @JSName("cells")
  val cells_FNotebookModel_ : IObservableUndoableList[ICellModel] = js.native
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: IContentFactory = js.native
  /**
    * The array of deleted cells since the notebook was last run.
    */
  @JSName("deletedCells")
  val deletedCells_FNotebookModel_ : js.Array[String] = js.native
  /**
    * The metadata associated with the notebook.
    */
  @JSName("metadata")
  val metadata_FNotebookModel_ : IObservableJSON = js.native
  /**
    * The minor version number of the nbformat.
    */
  @JSName("nbformatMinor")
  val nbformatMinor_FNotebookModel_ : Double = js.native
  /**
    * The major version number of the nbformat.
    */
  @JSName("nbformat")
  val nbformat_FNotebookModel_ : Double = js.native
  /**
    * Get the observable list of notebook cells.
    */
  def cells(): IObservableUndoableList[ICellModel] = js.native
  /**
    * The default kernel language of the document.
    */
  @JSName("defaultKernelLanguage")
  def defaultKernelLanguage_MNotebookModel_(): String = js.native
  /**
    * The default kernel name of the document.
    */
  @JSName("defaultKernelName")
  def defaultKernelName_MNotebookModel_(): String = js.native
  /**
    * A list of deleted cells for the notebook..
    */
  def deletedCells(): js.Array[String] = js.native
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: INotebookContent): Unit = js.native
  /**
    * The metadata associated with the notebook.
    */
  def metadata(): IObservableJSON = js.native
  /**
    * The major version number of the nbformat.
    */
  def nbformat(): Double = js.native
  /**
    * The minor version number of the nbformat.
    */
  def nbformatMinor(): Double = js.native
}

