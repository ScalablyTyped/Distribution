package typings.jupyterlabCells.modelMod

import typings.jupyterlabAttachments.modelMod.IAttachmentsModel
import typings.jupyterlabCells.jupyterlabCellsStrings.raw
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabCoreutils.nbformatMod.nbformat.ICell
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.phosphorSignaling.mod.ISignal
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
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: raw,
    value: IObservableString
  ): IRawCellModel = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any], contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRawCellModel]
  }
}

