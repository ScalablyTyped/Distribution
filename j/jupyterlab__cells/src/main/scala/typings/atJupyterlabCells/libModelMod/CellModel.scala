package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCells.libModelMod.CellModelNs.IOptions
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.CellType
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICell
import typings.atJupyterlabObservables.libModeldbMod.IObservableValue
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorSignaling.atPhosphorSignalingMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("@jupyterlab/cells/lib/model", "CellModel")
@js.native
class CellModel protected () extends ICellModel {
  /**
    * Construct a cell model from optional cell content.
    */
  def this(options: IOptions) = this()
  /**
    * A signal emitted when the content of the model changes.
    */
  /* CompleteClass */
  override val contentChanged: ISignal[ICellModel, Unit] = js.native
  /**
    * A signal emitted when the state of the model changes.
    */
  @JSName("contentChanged")
  val contentChanged_CellModel: Signal[this.type, Unit] = js.native
  /**
    * A unique identifier for the cell.
    */
  /* CompleteClass */
  override val id: String = js.native
  /**
    * The metadata associated with the cell.
    */
  /* CompleteClass */
  override val metadata: IObservableJSON = js.native
  /**
    * A signal emitted when a model state changes.
    */
  /* CompleteClass */
  override val stateChanged: ISignal[ICellModel, IChangedArgs[_]] = js.native
  /**
    * A signal emitted when a model state changes.
    */
  @JSName("stateChanged")
  val stateChanged_CellModel: Signal[this.type, IChangedArgs[_]] = js.native
  /**
    * Whether the cell is trusted.
    */
  /* CompleteClass */
  override var trusted: Boolean = js.native
  /**
    * The type of the cell.
    */
  /* CompleteClass */
  override val `type`: CellType = js.native
  /**
    * Handle a change to the observable value.
    */
  /* protected */ def onGenericChange(): Unit = js.native
  /**
    * Handle a change to the trusted state.
    *
    * The default implementation is a no-op.
    */
  def onTrustedChanged(
    trusted: IObservableValue,
    args: typings.atJupyterlabObservables.atJupyterlabObservablesMod.ObservableValueNs.IChangedArgs
  ): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): ICell = js.native
}

