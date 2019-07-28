package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCells.atJupyterlabCellsStrings.code
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.ICodeCell
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeCellModel extends ICellModel {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: ExecutionCount
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: code
}

object ICodeCellModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[ICellModel, Unit],
    executionCount: ExecutionCount,
    id: String,
    metadata: IObservableJSON,
    outputs: IOutputAreaModel,
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => ICodeCell,
    trusted: Boolean,
    `type`: code
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, executionCount = executionCount.asInstanceOf[js.Any], id = id, metadata = metadata, outputs = outputs, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICodeCellModel]
  }
}

