package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICell
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify CodeEditor.IModel * / any */ trait ICellModel extends js.Object {
  /**
    * A signal emitted when the content of the model changes.
    */
  val contentChanged: ISignal[ICellModel, Unit]
  /**
    * A unique identifier for the cell.
    */
  val id: String
  /**
    * The metadata associated with the cell.
    */
  val metadata: IObservableJSON
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: ISignal[ICellModel, IChangedArgs[_]]
  /**
    * Whether the cell is trusted.
    */
  var trusted: Boolean
  /**
    * The type of the cell.
    */
  val `type`: CellType
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell
}

object ICellModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICellModel, Unit],
    id: String,
    metadata: IObservableJSON,
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: CellType
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICellModel]
  }
}

