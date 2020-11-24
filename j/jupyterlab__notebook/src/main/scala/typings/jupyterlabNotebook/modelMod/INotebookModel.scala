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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INotebookModel extends IModel {
  
  /**
    * The list of cells in the notebook.
    */
  val cells: IObservableUndoableList[ICellModel] = js.native
  
  /**
    * The cell model factory for the notebook.
    */
  val contentFactory: IContentFactory = js.native
  
  /**
    * The array of deleted cells since the notebook was last run.
    */
  val deletedCells: js.Array[String] = js.native
  
  /**
    * The metadata associated with the notebook.
    */
  val metadata: IObservableJSON = js.native
  
  /**
    * The major version number of the nbformat.
    */
  val nbformat: Double = js.native
  
  /**
    * The minor version number of the nbformat.
    */
  val nbformatMinor: Double = js.native
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
  
  @scala.inline
  implicit class INotebookModelOps[Self <: INotebookModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCells(value: IObservableUndoableList[ICellModel]): Self = this.set("cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFactory(value: IContentFactory): Self = this.set("contentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedCellsVarargs(value: String*): Self = this.set("deletedCells", js.Array(value :_*))
    
    @scala.inline
    def setDeletedCells(value: js.Array[String]): Self = this.set("deletedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IObservableJSON): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformat(value: Double): Self = this.set("nbformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbformatMinor(value: Double): Self = this.set("nbformatMinor", value.asInstanceOf[js.Any])
  }
}
