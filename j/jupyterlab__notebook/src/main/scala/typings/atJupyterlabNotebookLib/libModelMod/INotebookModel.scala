package typings
package atJupyterlabNotebookLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookModel
  extends atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel {
  /**
    * The list of cells in the notebook.
    */
  val cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel]
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory
  /**
    * The array of deleted cells since the notebook was last run.
    */
  val deletedCells: js.Array[java.lang.String]
  /**
    * The metadata associated with the notebook.
    */
  val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON
  /**
    * The major version number of the nbformat.
    */
  val nbformat: scala.Double
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: scala.Double
}

object INotebookModel {
  @scala.inline
  def apply(
    cells: atJupyterlabObservablesLib.libUndoablelistMod.IObservableUndoableList[atJupyterlabCellsLib.libModelMod.ICellModel],
    contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[INotebookModel, scala.Unit],
    contentFactory: atJupyterlabNotebookLib.libModelMod.NotebookModelNs.IContentFactory,
    defaultKernelLanguage: java.lang.String,
    defaultKernelName: java.lang.String,
    deletedCells: js.Array[java.lang.String],
    dirty: scala.Boolean,
    dispose: () => scala.Unit,
    fromJSON: js.Any => scala.Unit,
    fromString: java.lang.String => scala.Unit,
    initialize: () => scala.Unit,
    isDisposed: scala.Boolean,
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB,
    nbformat: scala.Double,
    nbformatMinor: scala.Double,
    readOnly: scala.Boolean,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[INotebookModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => atPhosphorCoreutilsLib.libJsonMod.JSONValue
  ): INotebookModel = {
    val __obj = js.Dynamic.literal(cells = cells, contentChanged = contentChanged, contentFactory = contentFactory, defaultKernelLanguage = defaultKernelLanguage, defaultKernelName = defaultKernelName, deletedCells = deletedCells, dirty = dirty, dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed, metadata = metadata, modelDB = modelDB, nbformat = nbformat, nbformatMinor = nbformatMinor, readOnly = readOnly, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[INotebookModel]
  }
}

