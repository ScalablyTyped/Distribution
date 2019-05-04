package typings
package atJupyterlabCellsLib.libModelMod

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
  def this(options: atJupyterlabCellsLib.libModelMod.CellModelNs.IOptions) = this()
  /**
    * A signal emitted when the content of the model changes.
    */
  /* CompleteClass */
  override val contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit] = js.native
  /**
    * A signal emitted when the state of the model changes.
    */
  @JSName("contentChanged")
  val contentChanged_CellModel: atPhosphorSignalingLib.atPhosphorSignalingMod.Signal[this.type, scala.Unit] = js.native
  /**
    * A unique identifier for the cell.
    */
  /* CompleteClass */
  override val id: java.lang.String = js.native
  /**
    * The metadata associated with the cell.
    */
  /* CompleteClass */
  override val metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON = js.native
  /**
    * A signal emitted when a model state changes.
    */
  /* CompleteClass */
  override val stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]] = js.native
  /**
    * A signal emitted when a model state changes.
    */
  @JSName("stateChanged")
  val stateChanged_CellModel: atPhosphorSignalingLib.atPhosphorSignalingMod.Signal[this.type, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]] = js.native
  /**
    * Whether the cell is trusted.
    */
  /* CompleteClass */
  override var trusted: scala.Boolean = js.native
  /**
    * The type of the cell.
    */
  /* CompleteClass */
  override val `type`: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.CellType = js.native
  /**
    * Handle a change to the observable value.
    */
  /* protected */ def onGenericChange(): scala.Unit = js.native
  /**
    * Handle a change to the trusted state.
    *
    * The default implementation is a no-op.
    */
  def onTrustedChanged(
    trusted: atJupyterlabObservablesLib.libModeldbMod.IObservableValue,
    args: atJupyterlabObservablesLib.atJupyterlabObservablesMod.ObservableValueNs.IChangedArgs
  ): scala.Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* CompleteClass */
  override def toJSON(): atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell = js.native
}

