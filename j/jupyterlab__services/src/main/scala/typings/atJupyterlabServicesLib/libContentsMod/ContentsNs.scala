package typings
package atJupyterlabServicesLib.libContentsMod

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
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.notebook
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.file
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.directory
  */
  trait ContentType extends js.Object
  
  /**
    * A contents file format.
    */
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.json
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.text
    - atJupyterlabServicesLib.atJupyterlabServicesLibStrings.base64
  */
  trait FileFormat extends js.Object
  
  /**
    * The change args for a file change.
    */
  trait IChangedArgs extends js.Object {
    /**
      * The old contents.
      */
    var newValue: stdLib.Partial[IModel] | scala.Null
    /**
      * The new contents.
      */
    var oldValue: stdLib.Partial[IModel] | scala.Null
    /**
      * The type of change.
      */
    var `type`: atJupyterlabServicesLib.atJupyterlabServicesLibStrings.`new` | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.delete | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.rename | atJupyterlabServicesLib.atJupyterlabServicesLibStrings.save
  }
  
  /**
    * Checkpoint model.
    */
  trait ICheckpointModel extends js.Object {
    /**
      * The unique identifier for the checkpoint.
      */
    val id: java.lang.String
    /**
      * Last modified timestamp.
      */
    val last_modified: java.lang.String
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
    var ext: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The directory in which to create the file.
      */
    var path: js.UndefOr[java.lang.String] = js.undefined
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
  trait IDrive
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * A signal emitted when a file operation takes place.
      */
    var fileChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IDrive, IChangedArgs] = js.native
    /**
      * An optional ModelDB.IFactory instance for the
      * drive.
      */
    val modelDBFactory: js.UndefOr[atJupyterlabObservablesLib.libModeldbMod.ModelDBNs.IFactory] = js.native
    /**
      * The name of the drive, which is used at the leading
      * component of file paths.
      */
    val name: java.lang.String = js.native
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
    def copy(localPath: java.lang.String, toLocalDir: java.lang.String): js.Promise[IModel] = js.native
    /**
      * Create a checkpoint for a file.
      *
      * @param localPath - The path of the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(localPath: java.lang.String): js.Promise[ICheckpointModel] = js.native
    /**
      * Delete a file.
      *
      * @param localPath - The path to the file.
      *
      * @returns A promise which resolves when the file is deleted.
      */
    def delete(localPath: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Delete a checkpoint for a file.
      *
      * @param localPath - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(localPath: java.lang.String, checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Get a file or directory.
      *
      * @param localPath: The path to the file.
      *
      * @param options: The options used to fetch the file.
      *
      * @returns A promise which resolves with the file content.
      */
    def get(localPath: java.lang.String): js.Promise[IModel] = js.native
    def get(localPath: java.lang.String, options: IFetchOptions): js.Promise[IModel] = js.native
    /**
      * Get an encoded download url given a file path.
      *
      * @param A promise which resolves with the absolute POSIX
      *   file path on the server.
      */
    def getDownloadUrl(localPath: java.lang.String): js.Promise[java.lang.String] = js.native
    /**
      * List available checkpoints for a file.
      *
      * @param localPath - The path of the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(localPath: java.lang.String): js.Promise[js.Array[ICheckpointModel]] = js.native
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
    def rename(oldLocalPath: java.lang.String, newLocalPath: java.lang.String): js.Promise[IModel] = js.native
    /**
      * Restore a file to a known checkpoint state.
      *
      * @param localPath - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to restore.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(localPath: java.lang.String, checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
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
    def save(localPath: java.lang.String): js.Promise[IModel] = js.native
    def save(localPath: java.lang.String, options: stdLib.Partial[IModel]): js.Promise[IModel] = js.native
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
    var content: js.UndefOr[scala.Boolean] = js.undefined
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
  trait IManager
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * A signal emitted when a file operation takes place.
      */
    val fileChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IManager, IChangedArgs] = js.native
    /**
      * The server settings associated with the manager.
      */
    val serverSettings: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ServerConnection.ISettings */ js.Any = js.native
    /**
      * Add an `IDrive` to the manager.
      */
    def addDrive(drive: IDrive): scala.Unit = js.native
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
    def copy(path: java.lang.String, toDir: java.lang.String): js.Promise[IModel] = js.native
    /**
      * Create a checkpoint for a file.
      *
      * @param path - The path of the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(path: java.lang.String): js.Promise[ICheckpointModel] = js.native
    /**
      * Delete a file.
      *
      * @param path - The path to the file.
      *
      * @returns A promise which resolves when the file is deleted.
      */
    def delete(path: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Delete a checkpoint for a file.
      *
      * @param path - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(path: java.lang.String, checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Given a path of the form `drive:local/portion/of/it.txt`
      * get the name of the drive. If the path is missing
      * a drive portion, returns an empty string.
      *
      * @param path: the path.
      *
      * @returns The drive name for the path, or the empty string.
      */
    def driveName(path: java.lang.String): java.lang.String = js.native
    /**
      * Get a file or directory.
      *
      * @param path: The path to the file.
      *
      * @param options: The options used to fetch the file.
      *
      * @returns A promise which resolves with the file content.
      */
    def get(path: java.lang.String): js.Promise[IModel] = js.native
    def get(path: java.lang.String, options: IFetchOptions): js.Promise[IModel] = js.native
    /**
      * Get an encoded download url given a file path.
      *
      * @param A promise which resolves with the absolute POSIX
      *   file path on the server.
      */
    def getDownloadUrl(path: java.lang.String): js.Promise[java.lang.String] = js.native
    /**
      * Given a path, get a ModelDB.IFactory from the
      * relevant backend. Returns `null` if the backend
      * does not provide one.
      */
    def getModelDBFactory(path: java.lang.String): atJupyterlabObservablesLib.libModeldbMod.ModelDBNs.IFactory | scala.Null = js.native
    /**
      * List available checkpoints for a file.
      *
      * @param path - The path of the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(path: java.lang.String): js.Promise[js.Array[ICheckpointModel]] = js.native
    /**
      * Given a path of the form `drive:local/portion/of/it.txt`
      * get the local part of it.
      *
      * @param path: the path.
      *
      * @returns The local part of the path.
      */
    def localPath(path: java.lang.String): java.lang.String = js.native
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
      * @param path - The original file path.
      *
      * @param newPath - The new file path.
      *
      * @returns A promise which resolves with the new file content model when the
      *   file is renamed.
      */
    def rename(path: java.lang.String, newPath: java.lang.String): js.Promise[IModel] = js.native
    /**
      * Restore a file to a known checkpoint state.
      *
      * @param path - The path of the file.
      *
      * @param checkpointID - The id of the checkpoint to restore.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(path: java.lang.String, checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
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
    def save(path: java.lang.String): js.Promise[IModel] = js.native
    def save(path: java.lang.String, options: stdLib.Partial[IModel]): js.Promise[IModel] = js.native
  }
  
  /**
    * A contents model.
    */
  trait IModel extends js.Object {
    /**
      * The chunk of the file upload.
      */
    val chunk: js.UndefOr[scala.Double] = js.undefined
    /**
      * The optional file content.
      */
    val content: js.Any
    /**
      * File creation timestamp.
      */
    val created: java.lang.String
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
    val last_modified: java.lang.String
    /**
      * Specify the mime-type of file contents.
      *
      * #### Notes
      * Only non-`null` when `content` is present and `type` is `"file"`.
      */
    val mimetype: java.lang.String
    /**
      * Name of the contents file.
      *
      * #### Notes
      *  Equivalent to the last part of the `path` field.
      */
    val name: java.lang.String
    /**
      * The full file path.
      *
      * #### Notes
      * It will *not* start with `/`, and it will be `/`-delimited.
      */
    val path: java.lang.String
    /**
      * The type of file.
      */
    val `type`: ContentType
    /**
      * Whether the requester has permission to edit the file.
      */
    val writable: scala.Boolean
  }
  
  /**
    * Validates an ICheckpointModel, thowing an error if it does not pass.
    */
  def validateCheckpointModel(checkpoint: ICheckpointModel): scala.Unit = js.native
  /**
    * Validates an IModel, thowing an error if it does not pass.
    */
  def validateContentsModel(contents: IModel): scala.Unit = js.native
}

