package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import typings.atJupyterlabCells.atJupyterlabCellsStrings.markdown
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IMarkdownCell
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMarkdownCellModel extends IAttachmentsCellModel {
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_IMarkdownCellModel: markdown
}

object IMarkdownCellModel {
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
    contentChanged: ISignal[ICellModel, Unit],
    id: String,
    metadata: IObservableJSON,
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => IMarkdownCell,
    trusted: Boolean,
    `type`: markdown
  ): IMarkdownCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, contentChanged = contentChanged, id = id, metadata = metadata, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IMarkdownCellModel]
  }
}

