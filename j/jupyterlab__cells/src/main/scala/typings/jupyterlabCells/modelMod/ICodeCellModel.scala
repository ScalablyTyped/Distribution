package typings.jupyterlabCells.modelMod

import typings.jupyterlabCells.jupyterlabCellsStrings.code
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICodeCellModel extends ICellModel {
  
  /**
    * Clear execution, outputs, and related metadata
    */
  def clearExecution(): Unit = js.native
  
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  var executionCount: ExecutionCount = js.native
  
  /**
    * The cell outputs.
    */
  val outputs: IOutputAreaModel = js.native
  
  /**
    * The type of the cell.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("type")
  val type_ICodeCellModel: code = js.native
}
object ICodeCellModel {
  
  @scala.inline
  def apply(
    clearExecution: () => Unit,
    contentChanged: ISignal[ICellModel, Unit],
    dispose: () => Unit,
    id: String,
    isDisposed: Boolean,
    metadata: IObservableJSON,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
    modelDB: IModelDB,
    outputs: IOutputAreaModel,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, _, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: code,
    value: IObservableString
  ): ICodeCellModel = {
    val __obj = js.Dynamic.literal(clearExecution = js.Any.fromFunction0(clearExecution), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICodeCellModel]
  }
  
  @scala.inline
  implicit class ICodeCellModelOps[Self <: ICodeCellModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearExecution(value: () => Unit): Self = this.set("clearExecution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOutputs(value: IOutputAreaModel): Self = this.set("outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCount(value: ExecutionCount): Self = this.set("executionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionCountNull: Self = this.set("executionCount", null)
  }
}
