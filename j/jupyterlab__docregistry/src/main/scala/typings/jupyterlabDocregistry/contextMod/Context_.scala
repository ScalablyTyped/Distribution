package typings.jupyterlabDocregistry.contextMod

import typings.jupyterlabApputils.mod.SessionContext
import typings.jupyterlabDocregistry.contextMod.Context.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.SaveState
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/docregistry/lib/context", "Context")
@js.native
class Context_[T /* <: IModel */] protected () extends IContext[T] {
  /**
    * Construct a new document context.
    */
  def this(options: IOptions[T]) = this()
  
  var _contentsModel: js.Any = js.native
  
  var _dialogs: js.Any = js.native
  
  var _disposed: js.Any = js.native
  
  var _factory: js.Any = js.native
  
  var _fileChanged: js.Any = js.native
  
  /**
    * Finish a saveAs operation given a new path.
    */
  var _finishSaveAs: js.Any = js.native
  
  /**
    * Handle a save/load error with a dialog.
    */
  var _handleError: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  var _isPopulated: js.Any = js.native
  
  var _isReady: js.Any = js.native
  
  var _manager: js.Any = js.native
  
  /**
    * Add a checkpoint the file is writable.
    */
  var _maybeCheckpoint: js.Any = js.native
  
  /**
    * Handle a time conflict.
    */
  var _maybeOverWrite: js.Any = js.native
  
  /**
    * Save a file, dealing with conflicts.
    */
  var _maybeSave: js.Any = js.native
  
  var _model: js.Any = js.native
  
  var _modelDB: js.Any = js.native
  
  /**
    * Handle a change on the contents manager.
    */
  var _onFileChanged: js.Any = js.native
  
  /**
    * Handle a change to a session property.
    */
  var _onSessionChanged: js.Any = js.native
  
  var _opener: js.Any = js.native
  
  var _path: js.Any = js.native
  
  var _pathChanged: js.Any = js.native
  
  /**
    * Handle an initial population.
    */
  var _populate: js.Any = js.native
  
  var _populatedPromise: js.Any = js.native
  
  var _readyPromise: js.Any = js.native
  
  /**
    * Revert the document contents to disk contents.
    *
    * @param initializeModel - call the model's initialization function after
    * deserializing the content.
    */
  var _revert: js.Any = js.native
  
  /**
    * Save the document contents to disk.
    */
  var _save: js.Any = js.native
  
  var _saveState: js.Any = js.native
  
  /**
    * Handle a time conflict.
    */
  var _timeConflict: js.Any = js.native
  
  /**
    * Update our contents model, without the content.
    */
  var _updateContentsModel: js.Any = js.native
  
  var _useCRLF: js.Any = js.native
  
  /**
    * The current contents model associated with the document.
    *
    * #### Notes
    * The contents model will be null until the context is populated.
    * It will have an  empty `contents` field.
    */
  @JSName("contentsModel")
  def contentsModel_MContext_ : typings.jupyterlabServices.contentsMod.Contents.IModel | Null = js.native
  
  /**
    * A signal emitted when the context is disposed.
    */
  @JSName("disposed")
  def disposed_MContext_ : ISignal[this.type, Unit] = js.native
  
  /**
    * Get the model factory name.
    *
    * #### Notes
    * This is not part of the `IContext` API.
    */
  def factoryName: String = js.native
  
  /**
    * A signal emitted when the model is saved or reverted.
    */
  @JSName("fileChanged")
  def fileChanged_MContext_ : ISignal[this.type, typings.jupyterlabServices.contentsMod.Contents.IModel] = js.native
  
  /**
    * Initialize the context.
    *
    * @param isNew - Whether it is a new file.
    *
    * @returns a promise that resolves upon initialization.
    */
  def initialize(isNew: Boolean): js.Promise[Unit] = js.native
  
  /**
    * Test whether the context is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MContext_ : Boolean = js.native
  
  /**
    * Whether the context is ready.
    */
  @JSName("isReady")
  def isReady_MContext_ : Boolean = js.native
  
  /**
    * The current local path associated with the document.
    * If the document is in the default notebook file browser,
    * this is the same as the path.
    */
  @JSName("localPath")
  def localPath_MContext_ : String = js.native
  
  /**
    * Get the model associated with the document.
    */
  @JSName("model")
  def model_MContext_ : T = js.native
  
  /**
    * A signal emitted when the path changes.
    */
  @JSName("pathChanged")
  def pathChanged_MContext_ : ISignal[this.type, String] = js.native
  
  /**
    * The current path associated with the document.
    */
  @JSName("path")
  def path_MContext_ : String = js.native
  
  /**
    * A promise that is fulfilled when the context is ready.
    */
  @JSName("ready")
  def ready_MContext_ : js.Promise[Unit] = js.native
  
  /**
    * A signal emitted on the start and end of a saving operation.
    */
  @JSName("saveState")
  def saveState_MContext_ : ISignal[this.type, SaveState] = js.native
  
  /**
    * The client session object associated with the context.
    */
  @JSName("sessionContext")
  val sessionContext_Context_ : SessionContext = js.native
}
