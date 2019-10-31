package typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistry

import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a document model.
  */
trait IModel extends IDisposable {
  /**
    * A signal emitted when the document content changes.
    */
  var contentChanged: ISignal[this.type, Unit]
  /**
    * The default kernel language of the document.
    */
  val defaultKernelLanguage: String
  /**
    * The default kernel name of the document.
    */
  val defaultKernelName: String
  /**
    * The dirty state of the model.
    *
    * #### Notes
    * This should be cleared when the document is loaded from
    * or saved to disk.
    */
  var dirty: Boolean
  /**
    * The underlying `IModelDB` instance in which model
    * data is stored.
    *
    * ### Notes
    * Making direct edits to the values stored in the`IModelDB`
    * is not recommended, and may produce unpredictable results.
    */
  val modelDB: IModelDB
  /**
    * The read-only state of the model.
    */
  var readOnly: Boolean
  /**
    * A signal emitted when the model state changes.
    */
  var stateChanged: ISignal[this.type, typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[_, String]]
  /**
    * Deserialize the model from JSON.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromJSON(value: js.Any): Unit
  /**
    * Deserialize the model from a string.
    *
    * #### Notes
    * Should emit a [contentChanged] signal.
    */
  def fromString(value: String): Unit
  /**
    * Initialize model state after initial data load.
    *
    * #### Notes
    * This function must be called after the initial data is loaded to set up
    * initial model state, such as an initial undo stack, etc.
    */
  def initialize(): Unit
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): JSONValue
}

object IModel {
  @scala.inline
  def apply(
    contentChanged: ISignal[IModel, Unit],
    defaultKernelLanguage: String,
    defaultKernelName: String,
    dirty: Boolean,
    dispose: () => Unit,
    fromJSON: js.Any => Unit,
    fromString: String => Unit,
    initialize: () => Unit,
    isDisposed: Boolean,
    modelDB: IModelDB,
    readOnly: Boolean,
    stateChanged: ISignal[IModel, typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[_, String]],
    toJSON: () => JSONValue,
    toString: () => String
  ): IModel = {
    val __obj = js.Dynamic.literal(contentChanged = contentChanged, defaultKernelLanguage = defaultKernelLanguage, defaultKernelName = defaultKernelName, dirty = dirty, dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed, modelDB = modelDB, readOnly = readOnly, stateChanged = stateChanged, toJSON = js.Any.fromFunction0(toJSON), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[IModel]
  }
}

