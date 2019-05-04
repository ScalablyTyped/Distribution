package typings
package atJupyterlabCellsLib.libModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentsCellModel extends ICellModel {
  /**
    * The cell attachments
    */
  val attachments: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel
}

object IAttachmentsCellModel {
  @scala.inline
  def apply(
    attachments: atJupyterlabAttachmentsLib.libModelMod.IAttachmentsModel,
    contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, scala.Unit],
    id: java.lang.String,
    metadata: atJupyterlabObservablesLib.libObservablejsonMod.IObservableJSON,
    stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[ICellModel, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]],
    toJSON: () => atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.ICell,
    trusted: scala.Boolean,
    `type`: atJupyterlabCoreutilsLib.libNbformatMod.nbformatNs.CellType
  ): IAttachmentsCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAttachmentsCellModel]
  }
}

