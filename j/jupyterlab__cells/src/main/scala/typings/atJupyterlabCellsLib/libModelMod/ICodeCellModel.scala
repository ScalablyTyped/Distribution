package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICodeCellModel extends ICellModel {
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount
  /**
    * The cell outputs.
    */
  val outputs: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.code
}

object ICodeCellModel {
  @scala.inline
  def apply(
    contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit],
    executionCount: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ExecutionCount,
    id: java.lang.String,
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    outputs: atJupyterlabOutputareaLib.libModelMod.IOutputAreaModel,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICodeCell,
    trusted: scala.Boolean,
    `type`: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.code
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, executionCount = executionCount.asInstanceOf[js.Any], id = id, metadata = metadata, outputs = outputs, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICodeCellModel]
  }
}

