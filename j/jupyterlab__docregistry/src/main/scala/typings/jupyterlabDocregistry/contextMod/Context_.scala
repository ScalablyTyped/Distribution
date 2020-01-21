package typings.jupyterlabDocregistry.contextMod

import typings.jupyterlabApputils.mod.ClientSession
import typings.jupyterlabDocregistry.contextMod.Context.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/context", "Context")
@js.native
class Context_[T /* <: IModel */] protected () extends IContext[T] {
  /**
    * Construct a new document context.
    */
  def this(options: IOptions[T]) = this()
  var _contentsModel: js.Any = js.native
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
    * Get the model factory name.
    *
    * #### Notes
    * This is not part of the `IContext` API.
    */
  val factoryName: String = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The client session object associated with the context.
    */
  @JSName("session")
  val session_Context_ : ClientSession = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Initialize the context.
    *
    * @param isNew - Whether it is a new file.
    *
    * @returns a promise that resolves upon initialization.
    */
  def initialize(isNew: Boolean): js.Promise[Unit] = js.native
}

