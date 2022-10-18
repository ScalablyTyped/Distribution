package typings.jupyterlabServices

import typings.jupyterlabObservables.libModeldbMod.ModelDB.IFactory
import typings.jupyterlabServices.anon.PartialIModel
import typings.jupyterlabServices.jupyterlabServicesStrings.`new`
import typings.jupyterlabServices.jupyterlabServicesStrings.delete
import typings.jupyterlabServices.jupyterlabServicesStrings.rename
import typings.jupyterlabServices.jupyterlabServicesStrings.save
import typings.jupyterlabServices.libContentsMod.Contents.IChangedArgs
import typings.jupyterlabServices.libContentsMod.Contents.IDrive
import typings.jupyterlabServices.libContentsMod.Contents.IManager
import typings.jupyterlabServices.libContentsMod.ContentsManager.IOptions
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContentsMod {
  
  object Contents {
    
    @JSImport("@jupyterlab/services/lib/contents", "Contents")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Validates an ICheckpointModel, throwing an error if it does not pass.
      */
    inline def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCheckpointModel")(checkpoint.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Validates an IModel, throwing an error if it does not pass.
      */
    inline def validateContentsModel(contents: IModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateContentsModel")(contents.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * A contents file type.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabServices.jupyterlabServicesStrings.notebook
      - typings.jupyterlabServices.jupyterlabServicesStrings.file
      - typings.jupyterlabServices.jupyterlabServicesStrings.directory
    */
    trait ContentType extends StObject
    object ContentType {
      
      inline def directory: typings.jupyterlabServices.jupyterlabServicesStrings.directory = "directory".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.directory]
      
      inline def file: typings.jupyterlabServices.jupyterlabServicesStrings.file = "file".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.file]
      
      inline def notebook: typings.jupyterlabServices.jupyterlabServicesStrings.notebook = "notebook".asInstanceOf[typings.jupyterlabServices.jupyterlabServicesStrings.notebook]
    }
    
    /**
      * A contents file format.
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabServices.jupyterlabServicesStrings.json
      - typings.jupyterlabServices.jupyterlabServicesStrings.text
      - typings.jupyterlabServices.jupyterlabServicesStrings.base64
      - scala.Null
    */
    type FileFormat = _FileFormat | Null
    
    /**
      * The change args for a file change.
      */
    trait IChangedArgs extends StObject {
      
      /**
        * The old contents.
        */
      var newValue: PartialIModel | Null
      
      /**
        * The new contents.
        */
      var oldValue: PartialIModel | Null
      
      /**
        * The type of change.
        */
      var `type`: `new` | delete | rename | save
    }
    object IChangedArgs {
      
      inline def apply(`type`: `new` | delete | rename | save): IChangedArgs = {
        val __obj = js.Dynamic.literal(newValue = null, oldValue = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs]
      }
      
      extension [Self <: IChangedArgs](x: Self) {
        
        inline def setNewValue(value: PartialIModel): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
        
        inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
        
        inline def setOldValue(value: PartialIModel): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
        
        inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
        
        inline def setType(value: `new` | delete | rename | save): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Checkpoint model.
      */
    trait ICheckpointModel extends StObject {
      
      /**
        * The unique identifier for the checkpoint.
        */
      val id: String
      
      /**
        * Last modified timestamp.
        */
      val last_modified: String
    }
    object ICheckpointModel {
      
      inline def apply(id: String, last_modified: String): ICheckpointModel = {
        val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICheckpointModel]
      }
      
      extension [Self <: ICheckpointModel](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLast_modified(value: String): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a file.
      */
    trait ICreateOptions extends StObject {
      
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
    object ICreateOptions {
      
      inline def apply(): ICreateOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICreateOptions]
      }
      
      extension [Self <: ICreateOptions](x: Self) {
        
        inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * The interface for a network drive that can be mounted
      * in the contents manager.
      */
    @js.native
    trait IDrive
      extends StObject
         with IDisposable {
      
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
        * A signal emitted when a file operation takes place.
        */
      var fileChanged: ISignal[IDrive, IChangedArgs] = js.native
      
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
        *
        * #### Notes
        * The returned URL may include a query parameter.
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
      def save(localPath: String, options: PartialIModel): js.Promise[IModel] = js.native
      
      /**
        * The server settings of the manager.
        */
      val serverSettings: ISettings = js.native
    }
    
    /**
      * The options used to fetch a file.
      */
    trait IFetchOptions extends StObject {
      
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
    object IFetchOptions {
      
      inline def apply(): IFetchOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFetchOptions]
      }
      
      extension [Self <: IFetchOptions](x: Self) {
        
        inline def setContent(value: Boolean): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
        
        inline def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatNull: Self = StObject.set(x, "format", null)
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    /**
      * The interface for a contents manager.
      */
    @js.native
    trait IManager
      extends StObject
         with IDisposable {
      
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
        * A signal emitted when a file operation takes place.
        */
      val fileChanged: ISignal[IManager, IChangedArgs] = js.native
      
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
        *
        * #### Notes
        * The returned URL may include a query parameter.
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
        * Resolve a global path, starting from the root path. Behaves like
        * posix-path.resolve, with 3 differences:
        *  - will never prepend cwd
        *  - if root has a drive name, the result is prefixed with "<drive>:"
        *  - before adding drive name, leading slashes are removed
        *
        * @param path: the path.
        *
        * @returns The normalized path.
        */
      def resolvePath(root: String, path: String): String = js.native
      
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
      def save(path: String, options: PartialIModel): js.Promise[IModel] = js.native
      
      /**
        * The server settings associated with the manager.
        */
      val serverSettings: ISettings = js.native
    }
    
    /**
      * A contents model.
      */
    trait IModel extends StObject {
      
      /**
        * The chunk of the file upload.
        */
      val chunk: js.UndefOr[Double] = js.undefined
      
      /**
        * The optional file content.
        */
      val content: Any
      
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
        * The indices of the matched characters in the name.
        */
      var indices: js.UndefOr[js.Array[Double] | Null] = js.undefined
      
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
        * The size of then file in bytes.
        */
      val size: js.UndefOr[Double] = js.undefined
      
      /**
        * The type of file.
        */
      val `type`: ContentType
      
      /**
        * Whether the requester has permission to edit the file.
        */
      val writable: Boolean
    }
    object IModel {
      
      inline def apply(
        content: Any,
        created: String,
        last_modified: String,
        mimetype: String,
        name: String,
        path: String,
        `type`: ContentType,
        writable: Boolean
      ): IModel = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any], format = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IModel]
      }
      
      extension [Self <: IModel](x: Self) {
        
        inline def setChunk(value: Double): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
        
        inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
        
        inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
        
        inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        inline def setFormat(value: FileFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatNull: Self = StObject.set(x, "format", null)
        
        inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        inline def setIndicesNull: Self = StObject.set(x, "indices", null)
        
        inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
        
        inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
        
        inline def setLast_modified(value: String): Self = StObject.set(x, "last_modified", value.asInstanceOf[js.Any])
        
        inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
        
        inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
        
        inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      }
    }
    
    trait _FileFormat extends StObject
  }
  
  @JSImport("@jupyterlab/services/lib/contents", "ContentsManager")
  @js.native
  /**
    * Construct a new contents manager object.
    *
    * @param options - The options used to initialize the object.
    */
  open class ContentsManager ()
    extends StObject
       with IManager {
    def this(options: IOptions) = this()
    
    /* private */ var _additionalDrives: Any = js.native
    
    /* private */ var _defaultDrive: Any = js.native
    
    /**
      * Given a path, get the `IDrive to which it refers,
      * where the path satisfies the pattern
      * `'driveName:path/to/file'`. If there is no `driveName`
      * prepended to the path, it returns the default drive.
      *
      * @param path: a path to a file.
      *
      * @returns A tuple containing an `IDrive` object for the path,
      * and a local path for that drive.
      */
    /* private */ var _driveForPath: Any = js.native
    
    /* private */ var _fileChanged: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Respond to fileChanged signals from the drives attached to
      * the manager. This prepends the drive name to the path if necessary,
      * and then forwards the signal.
      */
    /* private */ var _onFileChanged: Any = js.native
    
    /**
      * Given a drive and a local path, construct a fully qualified
      * path. The inverse of `_driveForPath`.
      *
      * @param drive: an `IDrive`.
      *
      * @param localPath: the local path on the drive.
      *
      * @returns the fully qualified path.
      */
    /* private */ var _toGlobalPath: Any = js.native
    
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
      * A signal emitted when a file operation takes place.
      */
    @JSName("fileChanged")
    def fileChanged_MContentsManager: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the manager has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MContentsManager: Boolean = js.native
  }
  object ContentsManager {
    
    /**
      * The options used to initialize a contents manager.
      */
    trait IOptions extends StObject {
      
      /**
        * The default drive backend for the contents manager.
        */
      var defaultDrive: js.UndefOr[IDrive] = js.undefined
      
      /**
        * The server settings associated with the manager.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setDefaultDrive(value: IDrive): Self = StObject.set(x, "defaultDrive", value.asInstanceOf[js.Any])
        
        inline def setDefaultDriveUndefined: Self = StObject.set(x, "defaultDrive", js.undefined)
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/services/lib/contents", "Drive")
  @js.native
  /**
    * Construct a new contents manager object.
    *
    * @param options - The options used to initialize the object.
    */
  open class Drive ()
    extends StObject
       with IDrive {
    def this(options: typings.jupyterlabServices.libContentsMod.Drive.IOptions) = this()
    
    /* private */ var _apiEndpoint: Any = js.native
    
    /* private */ var _fileChanged: Any = js.native
    
    /**
      * Get a REST url for a file given a path.
      */
    /* private */ var _getUrl: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
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
      * A signal emitted when a file operation takes place.
      */
    @JSName("fileChanged")
    def fileChanged_MDrive: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the manager has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDrive: Boolean = js.native
  }
  object Drive {
    
    /**
      * The options used to initialize a `Drive`.
      */
    trait IOptions extends StObject {
      
      /**
        * A REST endpoint for drive requests.
        * If not given, defaults to the Jupyter
        * REST API given by [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/contents).
        */
      var apiEndpoint: js.UndefOr[String] = js.undefined
      
      /**
        * The name for the `Drive`, which is used in file
        * paths to disambiguate it from other drives.
        */
      var name: js.UndefOr[String] = js.undefined
      
      /**
        * The server settings for the server.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.jupyterlabServices.libContentsMod.Drive.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabServices.libContentsMod.Drive.IOptions]
      }
      
      extension [Self <: typings.jupyterlabServices.libContentsMod.Drive.IOptions](x: Self) {
        
        inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
        
        inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
}
