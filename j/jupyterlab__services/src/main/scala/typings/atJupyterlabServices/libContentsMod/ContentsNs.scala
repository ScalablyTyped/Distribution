package typings.atJupyterlabServices.libContentsMod

import typings.atJupyterlabObservables.libModeldbMod.ModelDBNs.IFactory
import typings.atJupyterlabServices.atJupyterlabServicesStrings.`new`
import typings.atJupyterlabServices.atJupyterlabServicesStrings.delete
import typings.atJupyterlabServices.atJupyterlabServicesStrings.rename
import typings.atJupyterlabServices.atJupyterlabServicesStrings.save
import typings.atJupyterlabServices.libContentsMod.ContentsNs.ContentType
import typings.atJupyterlabServices.libContentsMod.ContentsNs.FileFormat
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IChangedArgs
import typings.atJupyterlabServices.libContentsMod.ContentsNs.ICheckpointModel
import typings.atJupyterlabServices.libContentsMod.ContentsNs.ICreateOptions
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IDrive
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IFetchOptions
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IManager
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/contents", "Contents")
@js.native
object ContentsNs extends js.Object {
  /**
    * A contents file type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.notebook
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.file
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.directory
  */
  trait ContentType extends js.Object
  
  /**
    * A contents file format.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.json
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.text
    - typings.atJupyterlabServices.atJupyterlabServicesStrings.base64
  */
  trait FileFormat extends js.Object
  
  /**
    * The change args for a file change.
    */
  trait IChangedArgs extends js.Object {
    /**
      * The old contents.
      */
    var newValue: Partial[IModel] | Null
    /**
      * The new contents.
      */
    var oldValue: Partial[IModel] | Null
    /**
      * The type of change.
      */
    var `type`: `new` | delete | rename | save
  }
  
  /**
    * Checkpoint model.
    */
  trait ICheckpointModel extends js.Object {
    /**
      * The unique identifier for the checkpoint.
      */
    val id: String
    /**
      * Last modified timestamp.
      */
    val last_modified: String
  }
  
  /**
    * The options used to create a file.
    */
  trait ICreateOptions extends js.Object {
    /**
      * The optional file extension for the new file (e.g. `".txt"`).
      *
      * #### Notes
      * This ignored if `type` is `'notebook'`.
      */
    var ext: js.UndefOr[String] = js.undefined
    /**
      * The directory in which to create the file.
      */
    var path: js.UndefOr[String] = js.undefined
    /**
      * The file type.
      */
    var `type`: js.UndefOr[ContentType] = js.undefined
  }
  
  /**
    * The interface for a network drive that can be mounted
    * in the contents manager.
    */
  @js.native
  trait IDrive extends IDisposable {
    /**
      * A signal emitted when a file operation takes place.
      */
    var fileChanged: ISignal[IDrive, IChangedArgs] = js.native
    /**
      * An optional ModelDB.IFactory instance for the
      * drive.
      */
    val modelDBFactory: js.UndefOr[IFactory] = js.native
    /**
      * The name of the drive, which is used at the leading
      * component of file paths.
      */
    val name: String = js.native
    /**
      * The server settings of the manager.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
    /**
      * Copy a file into a given directory.
      *
      * @param localPath - The original file path.
      *
      * @param toLocalDir - The destination directory path.
      *
      * @returns A promise which resolves with the new content model when the
      *  file is copied.
      */
    def copy(localPath: String, toLocalDir: String): js.Promise[IModel] = js.native
    /**
      * Create a checkpoint for a file.
      *
      * @param localPath - The path of the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(localPath: String): js.Promise[ICheckpointModel] = js.native
    /**
      * Delete a file.
      *
      * @param localPath - The path to the file.
      *
      * @returns A promise which resolves when the file is deleted.
      */
    def delete(localPath: String): js.Promise[Unit] = js.native
    /**
      * Delete a checkpoint for a file.
      *
      * @param localPath - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(localPath: String, checkpointID: String): js.Promise[Unit] = js.native
    /**
      * Get a file or directory.
      *
      * @param localPath: The path to the file.
      *
      * @param options: The options used to fetch the file.
      *
      * @returns A promise which resolves with the file content.
      */
    def get(localPath: String): js.Promise[IModel] = js.native
    def get(localPath: String, options: IFetchOptions): js.Promise[IModel] = js.native
    /**
      * Get an encoded download url given a file path.
      *
      * @param A promise which resolves with the absolute POSIX
      *   file path on the server.
      */
    def getDownloadUrl(localPath: String): js.Promise[String] = js.native
    /**
      * List available checkpoints for a file.
      *
      * @param localPath - The path of the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(localPath: String): js.Promise[js.Array[ICheckpointModel]] = js.native
    /**
      * Create a new untitled file or directory in the specified directory path.
      *
      * @param options: The options used to create the file.
      *
      * @returns A promise which resolves with the created file content when the
      *    file is created.
      */
    def newUntitled(): js.Promise[IModel] = js.native
    def newUntitled(options: ICreateOptions): js.Promise[IModel] = js.native
    /**
      * Rename a file or directory.
      *
      * @param oldLocalPath - The original file path.
      *
      * @param newLocalPath - The new file path.
      *
      * @returns A promise which resolves with the new file content model when the
      *   file is renamed.
      */
    def rename(oldLocalPath: String, newLocalPath: String): js.Promise[IModel] = js.native
    /**
      * Restore a file to a known checkpoint state.
      *
      * @param localPath - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to restore.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(localPath: String, checkpointID: String): js.Promise[Unit] = js.native
    /**
      * Save a file.
      *
      * @param localPath - The desired file path.
      *
      * @param options - Optional overrides to the model.
      *
      * @returns A promise which resolves with the file content model when the
      *   file is saved.
      */
    def save(localPath: String): js.Promise[IModel] = js.native
    def save(localPath: String, options: Partial[IModel]): js.Promise[IModel] = js.native
  }
  
  /**
    * The options used to fetch a file.
    */
  trait IFetchOptions extends js.Object {
    /**
      * Whether to include the file content.
      *
      * The default is `true`.
      */
    var content: js.UndefOr[Boolean] = js.undefined
    /**
      * The override file format for the request.
      */
    var format: js.UndefOr[FileFormat] = js.undefined
    /**
      * The override file type for the request.
      */
    var `type`: js.UndefOr[ContentType] = js.undefined
  }
  
  /**
    * The interface for a contents manager.
    */
  @js.native
  trait IManager extends IDisposable {
    /**
      * A signal emitted when a file operation takes place.
      */
    val fileChanged: ISignal[IManager, IChangedArgs] = js.native
    /**
      * The server settings associated with the manager.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
    /**
      * Add an `IDrive` to the manager.
      */
    def addDrive(drive: IDrive): Unit = js.native
    /**
      * Copy a file into a given directory.
      *
      * @param path - The original file path.
      *
      * @param toDir - The destination directory path.
      *
      * @returns A promise which resolves with the new content model when the
      *  file is copied.
      */
    def copy(path: String, toDir: String): js.Promise[IModel] = js.native
    /**
      * Create a checkpoint for a file.
      *
      * @param path - The path of the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(path: String): js.Promise[ICheckpointModel] = js.native
    /**
      * Delete a file.
      *
      * @param path - The path to the file.
      *
      * @returns A promise which resolves when the file is deleted.
      */
    def delete(path: String): js.Promise[Unit] = js.native
    /**
      * Delete a checkpoint for a file.
      *
      * @param path - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(path: String, checkpointID: String): js.Promise[Unit] = js.native
    /**
      * Given a path of the form `drive:local/portion/of/it.txt`
      * get the name of the drive. If the path is missing
      * a drive portion, returns an empty string.
      *
      * @param path: the path.
      *
      * @returns The drive name for the path, or the empty string.
      */
    def driveName(path: String): String = js.native
    /**
      * Get a file or directory.
      *
      * @param path: The path to the file.
      *
      * @param options: The options used to fetch the file.
      *
      * @returns A promise which resolves with the file content.
      */
    def get(path: String): js.Promise[IModel] = js.native
    def get(path: String, options: IFetchOptions): js.Promise[IModel] = js.native
    /**
      * Get an encoded download url given a file path.
      *
      * @param A promise which resolves with the absolute POSIX
      *   file path on the server.
      */
    def getDownloadUrl(path: String): js.Promise[String] = js.native
    /**
      * Given a path, get a ModelDB.IFactory from the
      * relevant backend. Returns `null` if the backend
      * does not provide one.
      */
    def getModelDBFactory(path: String): IFactory | Null = js.native
    /**
      * List available checkpoints for a file.
      *
      * @param path - The path of the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(path: String): js.Promise[js.Array[ICheckpointModel]] = js.native
    /**
      * Given a path of the form `drive:local/portion/of/it.txt`
      * get the local part of it.
      *
      * @param path: the path.
      *
      * @returns The local part of the path.
      */
    def localPath(path: String): String = js.native
    /**
      * Create a new untitled file or directory in the specified directory path.
      *
      * @param options: The options used to create the file.
      *
      * @returns A promise which resolves with the created file content when the
      *    file is created.
      */
    def newUntitled(): js.Promise[IModel] = js.native
    def newUntitled(options: ICreateOptions): js.Promise[IModel] = js.native
    /**
      * Normalize a global path. Reduces '..' and '.' parts, and removes
      * leading slashes from the local part of the path, while retaining
      * the drive name if it exists.
      *
      * @param path: the path.
      *
      * @returns The normalized path.
      */
    def normalize(path: String): String = js.native
    /**
      * Rename a file or directory.
      *
      * @param path - The original file path.
      *
      * @param newPath - The new file path.
      *
      * @returns A promise which resolves with the new file content model when the
      *   file is renamed.
      */
    def rename(path: String, newPath: String): js.Promise[IModel] = js.native
    /**
      * Restore a file to a known checkpoint state.
      *
      * @param path - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to restore.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(path: String, checkpointID: String): js.Promise[Unit] = js.native
    /**
      * Save a file.
      *
      * @param path - The desired file path.
      *
      * @param options - Optional overrides to the model.
      *
      * @returns A promise which resolves with the file content model when the
      *   file is saved.
      */
    def save(path: String): js.Promise[IModel] = js.native
    def save(path: String, options: Partial[IModel]): js.Promise[IModel] = js.native
  }
  
  /**
    * A contents model.
    */
  trait IModel extends js.Object {
    /**
      * The chunk of the file upload.
      */
    val chunk: js.UndefOr[Double] = js.undefined
    /**
      * The optional file content.
      */
    val content: js.Any
    /**
      * File creation timestamp.
      */
    val created: String
    /**
      * The format of the file `content`.
      *
      * #### Notes
      * Only relevant for type: 'file'
      */
    val format: FileFormat
    /**
      * Last modified timestamp.
      */
    val last_modified: String
    /**
      * Specify the mime-type of file contents.
      *
      * #### Notes
      * Only non-`null` when `content` is present and `type` is `"file"`.
      */
    val mimetype: String
    /**
      * Name of the contents file.
      *
      * #### Notes
      *  Equivalent to the last part of the `path` field.
      */
    val name: String
    /**
      * The full file path.
      *
      * #### Notes
      * It will *not* start with `/`, and it will be `/`-delimited.
      */
    val path: String
    /**
      * The type of file.
      */
    val `type`: ContentType
    /**
      * Whether the requester has permission to edit the file.
      */
    val writable: Boolean
  }
  
  /**
    * Validates an ICheckpointModel, thowing an error if it does not pass.
    */
  def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = js.native
  /**
    * Validates an IModel, thowing an error if it does not pass.
    */
  def validateContentsModel(contents: IModel): Unit = js.native
}

