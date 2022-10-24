package typings.jupyterlabFilebrowser

import typings.jupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.jupyterlabFilebrowser.anon.PartialIScore
import typings.jupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions
import typings.jupyterlabServices.libContentsMod.Contents.IChangedArgs
import typings.jupyterlabServices.libContentsMod.Contents.IManager
import typings.jupyterlabServices.libContentsMod.Contents.IModel
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.jupyterlabStatedb.libTokensMod.IStateDB
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoAlgorithm.typesIterMod.IterableOrArrayLike
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "CHUNK_SIZE")
  @js.native
  val CHUNK_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "FileBrowserModel")
  @js.native
  open class FileBrowserModel protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new file browser model.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _driveName: Any = js.native
    
    /* private */ var _fileChanged: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _items: Any = js.native
    
    /* private */ var _key: Any = js.native
    
    /* private */ var _model: Any = js.native
    
    /* private */ var _pathChanged: Any = js.native
    
    /* private */ var _paths: Any = js.native
    
    /* private */ var _pending: Any = js.native
    
    /* private */ var _pendingPath: Any = js.native
    
    /* private */ var _poll: Any = js.native
    
    /**
      * Populate the model's sessions collection.
      */
    /* private */ var _populateSessions: Any = js.native
    
    /* private */ var _refreshed: Any = js.native
    
    /* private */ var _restored: Any = js.native
    
    /* private */ var _sessions: Any = js.native
    
    /* private */ var _shouldUploadLarge: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* private */ var _unloadEventListener: Any = js.native
    
    /**
      * Perform the actual upload.
      */
    /* private */ var _upload: Any = js.native
    
    /* private */ var _uploadChanged: Any = js.native
    
    /* private */ var _uploadCheckDisposed: Any = js.native
    
    /* private */ var _uploads: Any = js.native
    
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
      * A signal emitted when the file browser model loses connection.
      */
    def connectionFailure: ISignal[this.type, js.Error] = js.native
    
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
      * The drive name that gets prepended to the path.
      */
    def driveName: String = js.native
    
    /**
      * Get the file path changed signal.
      */
    def fileChanged: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Handle an updated contents model.
      */
    /* protected */ def handleContents(contents: IModel): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the model is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MFileBrowserModel: Boolean = js.native
    
    /**
      * Create an iterator over the model's items.
      *
      * @returns A new iterator over the model's items.
      */
    def items(): IIterator[IModel] = js.native
    
    /**
      * The document manager instance used by the file browser model.
      */
    val manager: IDocumentManager = js.native
    
    /**
      * Handle a change on the contents manager.
      */
    /* protected */ def onFileChanged(sender: IManager, change: IChangedArgs): Unit = js.native
    
    /**
      * Handle a change to the running sessions.
      */
    /* protected */ def onRunningChanged(
      sender: typings.jupyterlabServices.libSessionSessionMod.IManager,
      models: IterableOrArrayLike[typings.jupyterlabServices.libSessionSessionMod.IModel]
    ): Unit = js.native
    
    /**
      * Get the current path.
      */
    def path: String = js.native
    
    /**
      * A signal emitted when the path changes.
      */
    def pathChanged: ISignal[
        this.type, 
        typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
      ] = js.native
    
    /**
      * Force a refresh of the directory contents.
      */
    def refresh(): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the directory listing is refreshed.
      */
    def refreshed: ISignal[this.type, Unit] = js.native
    
    /**
      * Restore the state of the file browser.
      *
      * @param id - The unique ID that is used to construct a state database key.
      *
      * @param populate - If `false`, the restoration ID will be set but the file
      * browser state will not be fetched from the state database.
      *
      * @returns A promise when restoration is complete.
      *
      * #### Notes
      * This function will only restore the model *once*. If it is called multiple
      * times, all subsequent invocations are no-ops.
      */
    def restore(id: String): js.Promise[Unit] = js.native
    def restore(id: String, populate: Boolean): js.Promise[Unit] = js.native
    
    /**
      * A promise that resolves when the model is first restored.
      */
    def restored: js.Promise[Unit] = js.native
    
    /**
      * Get the root path
      */
    def rootPath: String = js.native
    
    /**
      * Create an iterator over the active sessions in the directory.
      *
      * @returns A new iterator over the model's active sessions.
      */
    def sessions(): IIterator[typings.jupyterlabServices.libSessionSessionMod.IModel] = js.native
    
    /**
      * Get the kernel spec models.
      */
    def specs: ISpecModels | Null = js.native
    
    /* protected */ var translator: ITranslator = js.native
    
    /**
      * Upload a `File` object.
      *
      * @param file - The `File` object to upload.
      *
      * @returns A promise containing the new file contents model.
      *
      * #### Notes
      * On Notebook version < 5.1.0, this will fail to upload files that are too
      * big to be sent in one request to the server. On newer versions, or on
      * Jupyter Server, it will ask for confirmation then upload the file in 1 MB
      * chunks.
      */
    def upload(file: File): js.Promise[IModel] = js.native
    
    /**
      * A signal emitted when an upload progresses.
      */
    def uploadChanged: ISignal[
        this.type, 
        typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[IUploadModel | Null, IUploadModel | Null, String]
      ] = js.native
    
    /**
      * Create an iterator over the status of all in progress uploads.
      */
    def uploads(): IIterator[IUploadModel] = js.native
  }
  object FileBrowserModel {
    
    /**
      * An options object for initializing a file browser.
      */
    trait IOptions extends StObject {
      
      /**
        * Whether a file browser automatically loads its initial path.
        * The default is `true`.
        */
      var auto: js.UndefOr[Boolean] = js.undefined
      
      /**
        * An optional `Contents.IDrive` name for the model.
        * If given, the model will prepend `driveName:` to
        * all paths used in file operations.
        */
      var driveName: js.UndefOr[String] = js.undefined
      
      /**
        * A document manager instance.
        */
      var manager: IDocumentManager
      
      /**
        * The time interval for browser refreshing, in ms.
        */
      var refreshInterval: js.UndefOr[Double] = js.undefined
      
      /**
        * An optional state database. If provided, the model will restore which
        * folder was last opened when it is restored.
        */
      var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue]] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(manager: IDocumentManager): IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
        
        inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
        
        inline def setDriveName(value: String): Self = StObject.set(x, "driveName", value.asInstanceOf[js.Any])
        
        inline def setDriveNameUndefined: Self = StObject.set(x, "driveName", js.undefined)
        
        inline def setManager(value: IDocumentManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
        
        inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
        
        inline def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "FilterFileBrowserModel")
  @js.native
  open class FilterFileBrowserModel protected () extends TogglableHiddenFileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions) = this()
    
    /* private */ var _filter: Any = js.native
    
    /* private */ var _filterDirectories: Any = js.native
    
    /**
      * Whether to filter directories.
      */
    def filterDirectories: Boolean = js.native
    def filterDirectories_=(value: Boolean): Unit = js.native
    
    def setFilter(filter: js.Function1[/* value */ IModel, Boolean | PartialIScore | Null]): Unit = js.native
  }
  object FilterFileBrowserModel {
    
    /**
      * Constructor options
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions {
      
      /**
        * Filter function on file browser item model
        */
      var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean | PartialIScore | Null]] = js.undefined
      
      /**
        * Filter directories
        */
      var filterDirectories: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(manager: IDocumentManager): typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions]
      }
      
      extension [Self <: typings.jupyterlabFilebrowser.libModelMod.FilterFileBrowserModel.IOptions](x: Self) {
        
        inline def setFilter(value: /* value */ IModel => Boolean | PartialIScore | Null): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        inline def setFilterDirectories(value: Boolean): Self = StObject.set(x, "filterDirectories", value.asInstanceOf[js.Any])
        
        inline def setFilterDirectoriesUndefined: Self = StObject.set(x, "filterDirectories", js.undefined)
        
        inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "LARGE_FILE_SIZE")
  @js.native
  val LARGE_FILE_SIZE: Double = js.native
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "TogglableHiddenFileBrowserModel")
  @js.native
  open class TogglableHiddenFileBrowserModel protected () extends FileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions) = this()
    
    /* private */ var _includeHiddenFiles: Any = js.native
    
    /**
      * Set the inclusion of hidden files. Triggers a model refresh.
      */
    def showHiddenFiles(value: Boolean): Unit = js.native
  }
  object TogglableHiddenFileBrowserModel {
    
    /**
      * Constructor options
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabFilebrowser.libModelMod.FileBrowserModel.IOptions {
      
      /**
        * Whether hidden files should be included in the items.
        */
      var includeHiddenFiles: js.UndefOr[Boolean] = js.undefined
    }
    object IOptions {
      
      inline def apply(manager: IDocumentManager): typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions]
      }
      
      extension [Self <: typings.jupyterlabFilebrowser.libModelMod.TogglableHiddenFileBrowserModel.IOptions](x: Self) {
        
        inline def setIncludeHiddenFiles(value: Boolean): Self = StObject.set(x, "includeHiddenFiles", value.asInstanceOf[js.Any])
        
        inline def setIncludeHiddenFilesUndefined: Self = StObject.set(x, "includeHiddenFiles", js.undefined)
      }
    }
  }
  
  trait IUploadModel extends StObject {
    
    var path: String
    
    /**
      * % uploaded [0, 1)
      */
    var progress: Double
  }
  object IUploadModel {
    
    inline def apply(path: String, progress: Double): IUploadModel = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUploadModel]
    }
    
    extension [Self <: IUploadModel](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
