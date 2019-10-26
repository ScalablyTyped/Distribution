package typings.atJupyterlabCells.libModelMod

import typings.atJupyterlabCells.atJupyterlabCellsStrings.code
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.IModel
import typings.atJupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ExecutionCount
import typings.atJupyterlabCoreutils.libNbformatMod.nbformat.ICodeCell
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabObservables.libObservablejsonMod.IObservableJSON
import typings.atJupyterlabObservables.libObservablemapMod.IObservableMap
import typings.atJupyterlabObservables.libObservablestringMod.IObservableString
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
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String]],
    modelDB: IModelDB,
    outputs: IOutputAreaModel,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_]],
    toJSON: () => ICodeCell,
    trusted: Boolean,
    `type`: code,
    value: IObservableString,
    executionCount: Int | Double = null
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, dispose = js.Any.fromFunction0(dispose), id = id, isDisposed = isDisposed, metadata = metadata, mimeType = mimeType, mimeTypeChanged = mimeTypeChanged, modelDB = modelDB, outputs = outputs, selections = selections, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), trusted = trusted, value = value)
    __obj.updateDynamic("type")(`type`)
    if (executionCount != null) __obj.updateDynamic("executionCount")(executionCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellModel]
  }
}

