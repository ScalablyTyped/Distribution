package typings.atJupyterlabFilebrowser.libModelMod

import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabFilebrowser.libModelMod.FileBrowserModelNs.IOptions
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IChangedArgs
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.atJupyterlabServices.libKernelKernelMod.KernelNs.ISpecModels
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import typings.atPhosphorAlgorithm.libIterMod.IIterator
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Error
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/model", "FileBrowserModel")
@js.native
class FileBrowserModel protected () extends IDisposable {
  /**
    * Construct a new file browser model.
    */
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _driveName: js.Any = js.native
  var _fileChanged: js.Any = js.native
  /**
    * Handle an updated contents model.
    */
  var _handleContents: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _items: js.Any = js.native
  var _key: js.Any = js.native
  var _model: js.Any = js.native
  /**
    * Handle a change on the contents manager.
    */
  var _onFileChanged: js.Any = js.native
  /**
    * Handle a change to the running sessions.
    */
  var _onRunningChanged: js.Any = js.native
  var _pathChanged: js.Any = js.native
  var _paths: js.Any = js.native
  var _pending: js.Any = js.native
  var _pendingPath: js.Any = js.native
  var _poll: js.Any = js.native
  /**
    * Populate the model's sessions collection.
    */
  var _populateSessions: js.Any = js.native
  var _refreshed: js.Any = js.native
  var _restored: js.Any = js.native
  var _sessions: js.Any = js.native
  var _shouldUploadLarge: js.Any = js.native
  var _state: js.Any = js.native
  var _unloadEventListener: js.Any = js.native
  /**
    * Perform the actual upload.
    */
  var _upload: js.Any = js.native
  var _uploadChanged: js.Any = js.native
  var _uploadCheckDisposed: js.Any = js.native
  var _uploads: js.Any = js.native
  /**
    * A signal emitted when the file browser model loses connection.
    */
  val connectionFailure: ISignal[this.type, Error] = js.native
  /**
    * The drive name that gets prepended to the path.
    */
  val driveName: String = js.native
  /**
    * Get the file path changed signal.
    */
  val fileChanged: ISignal[this.type, IChangedArgs] = js.native
  /**
    * The icon registry instance used by the file browser model.
    */
  val iconRegistry: IIconRegistry = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The document manager instance used by the file browser model.
    */
  val manager: IDocumentManager = js.native
  /**
    * Get the current path.
    */
  val path: String = js.native
  /**
    * A signal emitted when the path changes.
    */
  val pathChanged: ISignal[this.type, typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[String]] = js.native
  /**
    * A signal emitted when the directory listing is refreshed.
    */
  val refreshed: ISignal[this.type, Unit] = js.native
  /**
    * A promise that resolves when the model is first restored.
    */
  val restored: js.Promise[Unit] = js.native
  /**
    * Get the kernel spec models.
    */
  val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when an upload progresses.
    */
  val uploadChanged: ISignal[
    this.type, 
    typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[IUploadModel]
  ] = js.native
  /**
    * Change directory.
    *
    * @param path - The path to the file or directory.
    *
    * @returns A promise with the contents of the directory.
    */
  def cd(): js.Promise[Unit] = js.native
  def cd(newValue: String): js.Promise[Unit] = js.native
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
    * Download a file.
    *
    * @param path - The path of the file to be downloaded.
    *
    * @returns A promise which resolves when the file has begun
    *   downloading.
    */
  def download(path: String): js.Promise[Unit] = js.native
  /**
    * Create an iterator over the model's items.
    *
    * @returns A new iterator over the model's items.
    */
  def items(): IIterator[IModel] = js.native
  /**
    * Force a refresh of the directory contents.
    */
  def refresh(): js.Promise[Unit] = js.native
  /**
    * Restore the state of the file browser.
    *
    * @param id - The unique ID that is used to construct a state database key.
    *
    * @returns A promise when restoration is complete.
    *
    * #### Notes
    * This function will only restore the model *once*. If it is called multiple
    * times, all subsequent invocations are no-ops.
    */
  def restore(id: String): js.Promise[Unit] = js.native
  /**
    * Create an iterator over the active sessions in the directory.
    *
    * @returns A new iterator over the model's active sessions.
    */
  def sessions(): IIterator[typings.atJupyterlabServices.libSessionSessionMod.SessionNs.IModel] = js.native
  /**
    * Upload a `File` object.
    *
    * @param file - The `File` object to upload.
    *
    * @returns A promise containing the new file contents model.
    *
    * #### Notes
    * On Notebook version < 5.1.0, this will fail to upload files that are too
    * big to be sent in one request to the server. On newer versions, it will
    * ask for confirmation then upload the file in 1 MB chunks.
    */
  def upload(file: File): js.Promise[IModel] = js.native
  /**
    * Create an iterator over the status of all in progress uploads.
    */
  def uploads(): IIterator[IUploadModel] = js.native
}

