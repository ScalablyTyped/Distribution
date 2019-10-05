package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.CellType
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICell
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellModel extends IModel {
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
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: CellType,
    value: IObservableString
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, dispose = js.Any.fromFunction0(dispose), id = id, isDisposed = isDisposed, metadata = metadata, mimeType = mimeType, mimeTypeChanged = mimeTypeChanged, modelDB = modelDB, selections = selections, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICellModel]
  }
}

