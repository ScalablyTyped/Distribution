package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.modelMod.CellModel.IOptions
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabObservables.mod.ObservableValue.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IObservableValue
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.luminoDisposable.mod.IDisposable because Already inherited
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
  def metadata: IObservableJSON = js.native
  /**
    * The metadata associated with the cell.
    */
  @JSName("metadata")
  val metadata_FCellModel_ : IObservableJSON = js.native
  
  /**
    * Handle a change to the observable value.
    */
  /* protected */ def onGenericChange(): Unit = js.native
  
  /**
    * Handle a change to the trusted state.
    *
    * The default implementation is a no-op.
    */
  def onTrustedChanged(trusted: IObservableValue, args: IChangedArgs): Unit = js.native
  
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: (ISignal[ICellModel, typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]]) | (Signal[this.type, typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]]) = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell = js.native
  
  /**
    * Get the trusted state of the model.
    */
  def trusted: Boolean = js.native
  /**
    * Set the trusted state of the model.
    */
  def trusted_=(newValue: Boolean): Unit = js.native
  /**
    * Whether the cell is trusted.
    */
  @JSName("trusted")
  var trusted_FCellModel_ : Boolean = js.native
  
  /**
    * The type of cell.
    */
  val `type`: CellType = js.native
}
