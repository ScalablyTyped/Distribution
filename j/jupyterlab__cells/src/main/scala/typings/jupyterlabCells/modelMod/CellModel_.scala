package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.modelMod.CellModel.IOptions
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabCoreutils.nbformatMod.nbformat.CellType
import typings.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typings.jupyterlabObservables.modeldbMod.IObservableValue
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.phosphorSignaling.mod.ISignal
import typings.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.phosphorDisposable.mod.IDisposable because Already inherited
- typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
- typings.jupyterlabCells.modelMod.ICellModel because var conflicts: mimeType, mimeTypeChanged. Inlined `type`, id, contentChanged, stateChanged, trusted, metadata, toJSON */ @JSImport("@jupyterlab/cells/lib/model", "CellModel")
@js.native
class CellModel_ protected () extends Model {
  /**
    * Construct a cell model from optional cell content.
    */
  def this(options: IOptions) = this()
  /**
    * A signal emitted when the state of the model changes.
    */
  val contentChanged: (ISignal[ICellModel, Unit]) | (Signal[this.type, Unit]) = js.native
  /**
    * The id for the cell.
    */
  val id: String = js.native
  /**
    * The metadata associated with the cell.
    */
  val metadata: IObservableJSON = js.native
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: (ISignal[ICellModel, IChangedArgs[_, String]]) | (Signal[this.type, IChangedArgs[_, String]]) = js.native
  /**
    * Get the trusted state of the model.
    */
  /**
    * Set the trusted state of the model.
    */
  var trusted: Boolean = js.native
  /**
    * The type of cell.
    */
  val `type`: CellType = js.native
  /**
    * Handle a change to the observable value.
    */
  /* protected */ def onGenericChange(): Unit = js.native
  /**
    * Handle a change to the trusted state.
    *
    * The default implementation is a no-op.
    */
  def onTrustedChanged(trusted: IObservableValue, args: typings.jupyterlabObservables.mod.ObservableValue.IChangedArgs): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell = js.native
}

