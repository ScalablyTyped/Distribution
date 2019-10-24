package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICell
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachmentsCellModel extends ICellModel {
  /**
    * The cell attachments
    */
  val attachments: IAttachmentsModel
}

object IAttachmentsCellModel {
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
    contentChanged: ISignal[ICellModel, Unit],
    id: String,
    metadata: IObservableJSON,
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: CellType
  ): IAttachmentsCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IAttachmentsCellModel]
  }
}

