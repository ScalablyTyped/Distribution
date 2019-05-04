package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawCellModel extends IAttachmentsCellModel {
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_IRawCellModel: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.raw
}

object IRawCellModel {
  @scala.inline
  def apply(
    attachments: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel,
    contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit],
    id: java.lang.String,
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.IRawCell,
    trusted: scala.Boolean,
    `type`: atJupyterlabCellsLib.atJupyterlabCellsLibStrings.raw
  ): IRawCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IRawCellModel]
  }
}

