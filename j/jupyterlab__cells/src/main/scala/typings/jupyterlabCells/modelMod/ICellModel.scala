package typings.jupyterlabCells.modelMod

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.ITextSelection
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabNbformat.mod.CellType
import typings.jupyterlabNbformat.mod.ICell
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablejsonMod.IObservableJSON
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellModel extends IModel {
  
  /**
    * A signal emitted when the content of the model changes.
    */
  val contentChanged: ISignal[ICellModel, Unit] = js.native
  
  /**
    * A unique identifier for the cell.
    */
  val id: String = js.native
  
  /**
    * The metadata associated with the cell.
    */
  val metadata: IObservableJSON = js.native
  
  /**
    * A signal emitted when a model state changes.
    */
  val stateChanged: ISignal[ICellModel, IChangedArgs[_, _, String]] = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): ICell = js.native
  
  /**
    * Whether the cell is trusted.
    */
  var trusted: Boolean = js.native
  
  /**
    * The type of the cell.
    */
  val `type`: CellType = js.native
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
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    stateChanged: ISignal[ICellModel, IChangedArgs[_, _, String]],
    toJSON: () => ICell,
    trusted: Boolean,
    `type`: CellType,
    value: IObservableString
  ): ICellModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), id = id.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellModel]
  }
  
  @scala.inline
  implicit class ICellModelOps[Self <: ICellModel] (val x: Self) extends AnyVal {
    
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
    def setContentChanged(value: ISignal[ICellModel, Unit]): Self = this.set("contentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: IObservableJSON): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChanged(value: ISignal[ICellModel, IChangedArgs[_, _, String]]): Self = this.set("stateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => ICell): Self = this.set("toJSON", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTrusted(value: Boolean): Self = this.set("trusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CellType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
