package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabAttachments.libModelMod.IAttachmentsModel
import typings.atJupyterlabCells.atJupyterlabCellsStrings.raw
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditorNs.ITextSelection
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformatNs.IRawCell
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRawCellModel extends IAttachmentsCellModel {
  /**
    * The type of the cell.
    */
  @JSName("type")
  val type_IRawCellModel: raw
}

object IRawCellModel {
  @scala.inline
  def apply(
    attachments: IAttachmentsModel,
    contentChanged: ISignal[ICellModel, Unit],
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => IRawCell,
    trusted: Boolean,
    `type`: raw,
    value: IObservableString
  ): IRawCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments, contentChanged = contentChanged, dispose = js.Any.fromFunction0(dispose), id = id, isDisposed = isDisposed, metadata = metadata, mimeType = mimeType, mimeTypeChanged = mimeTypeChanged, modelDB = modelDB, selections = selections, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IRawCellModel]
  }
}

