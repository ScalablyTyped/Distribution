package typings.jupyterlabCodeeditor.editorMod.CodeEditor

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.jupyterlabObservables.observablestringMod.IObservableString
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interface to manage selections by selection owners.
  *
  * #### Definitions
  * - a user code that has an associated uuid is called a selection owner, see `CodeEditor.ISelectionOwner`
  * - a selection belongs to a selection owner only if it is associated with the owner by an uuid, see `CodeEditor.ITextSelection`
  *
  * #### Read access
  * - any user code can observe any selection
  *
  * #### Write access
  * - if a user code is a selection owner then:
  *   - it can change selections belonging to it
  *   - but it must not change selections belonging to other selection owners
  * - otherwise it must not change any selection
  */
/**
  * An editor model.
  */
@js.native
trait IModel extends IDisposable {
  
  /**
    * A mime type of the model.
    *
    * #### Notes
    * It is never `null`, the default mime type is `text/plain`.
    */
  var mimeType: String = js.native
  
  /**
    * A signal emitted when a property changes.
    */
  var mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]] = js.native
  
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    */
  val modelDB: IModelDB = js.native
  
  /**
    * The currently selected code.
    */
  val selections: IObservableMap[js.Array[ITextSelection]] = js.native
  
  /**
    * The text stored in the model.
    */
  val value: IObservableString = js.native
}
object IModel {
  
  @scala.inline
  def apply(
    dispose: () => Unit,
    isDisposed: Boolean,
    mimeType: String,
    mimeTypeChanged: ISignal[IModel, IChangedArgs[String, String, String]],
    modelDB: IModelDB,
    selections: IObservableMap[js.Array[ITextSelection]],
    value: IObservableString
  ): IModel = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
  
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    
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
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeChanged(value: ISignal[IModel, IChangedArgs[String, String, String]]): Self = this.set("mimeTypeChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelections(value: IObservableMap[js.Array[ITextSelection]]): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: IObservableString): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
