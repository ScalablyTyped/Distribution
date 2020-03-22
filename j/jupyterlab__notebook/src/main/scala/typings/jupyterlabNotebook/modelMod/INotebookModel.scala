package typings.jupyterlabNotebook.modelMod

import typings.jupyterlabCells.modelMod.ICellModel
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabNotebook.modelMod.NotebookModel.IContentFactory
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.undoablelistMod.IObservableUndoableList
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookModel extends IModel {
  /**
    * The list of cells in the notebook.
    */
  val cells: IObservableUndoableList[ICellModel]
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: IContentFactory
  /**
    * The array of deleted cells since the notebook was last run.
    */
  val deletedCells: js.Array[String]
  /**
    * The metadata associated with the notebook.
    */
  val metadata: IObservableJSON
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: Double
}

object INotebookModel {
  @scala.inline
  def apply(
    cells: IObservableUndoableList[ICellModel],
    contentChanged: ISignal[INotebookModel, Unit],
    contentFactory: IContentFactory,
    defaultKernelLanguage: String,
    defaultKernelName: String,
    deletedCells: js.Array[String],
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: ReadonlyPartialJSONValue => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    modelDB: IModelDB,
    nbformat: Double,
    nbformatMinor: Double,
    readOnly: Boolean,
    stateChanged: ISignal[INotebookModel, IChangedArgs[_, _, String]],
    toJSON: () => PartialJSONValue
  ): INotebookModel = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], contentFactory = contentFactory.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], deletedCells = deletedCells.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformatMinor = nbformatMinor.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[INotebookModel]
  }
}

