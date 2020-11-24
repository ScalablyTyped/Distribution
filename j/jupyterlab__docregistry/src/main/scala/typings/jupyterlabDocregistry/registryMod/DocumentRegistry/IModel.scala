package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for a document model.
  */
@js.native
trait IModel extends IDisposable {
  
  /**
    * A signal emitted when the document content changes.
    */
  var contentChanged: ISignal[this.type, Unit] = js.native
  
  /**
    * The default kernel language of the document.
    */
  val defaultKernelLanguage: String = js.native
  
  /**
    * The default kernel name of the document.
    */
  val defaultKernelName: String = js.native
  
  /**
    * The dirty state of the model.
    *
    * #### Notes
    * This should be cleared when the document is loaded from
    * or saved to disk.
    */
  var dirty: Boolean = js.native
  
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: ReadonlyPartialJSONValue): Unit = js.native
  
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: String): Unit = js.native
  
  /**
    * Initialize model state after initial data load.
    *
    * #### Notes
    * This function must be called after the initial data is loaded to set up
    * initial model state, such as an initial undo stack, etc.
    */
  def initialize(): Unit = js.native
  
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  val modelDB: IModelDB = js.native
  
  /**
    * The read-only state of the model.
    */
  var readOnly: Boolean = js.native
  
  /**
    * A signal emitted when the model state changes.
    */
  var stateChanged: ISignal[this.type, typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]] = js.native
  
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): PartialJSONValue = js.native
}
object IModel {
  
  @scala.inline
  def apply(
    contentChanged: ISignal[IModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: ReadonlyPartialJSONValue => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    modelDB: IModelDB,
    readOnly: Boolean,
    stateChanged: ISignal[IModel, typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]],
    toJSON: () => PartialJSONValue
  ): IModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
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
    def setContentChanged(value: ISignal[IModel, Unit]): Self = this.set("contentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKernelLanguage(value: String): Self = this.set("defaultKernelLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultKernelName(value: String): Self = this.set("defaultKernelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromJSON(value: ReadonlyPartialJSONValue => Unit): Self = this.set("fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromString(value: String => Unit): Self = this.set("fromString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: () => Unit): Self = this.set("initialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelDB(value: IModelDB): Self = this.set("modelDB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChanged(value: ISignal[IModel, typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[_, _, String]]): Self = this.set("stateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToJSON(value: () => PartialJSONValue): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
