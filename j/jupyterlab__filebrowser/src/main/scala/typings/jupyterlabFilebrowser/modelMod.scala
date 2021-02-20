package typings.jupyterlabFilebrowser

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions
import typings.jupyterlabServices.contentsMod.Contents.IChangedArgs
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelMod {
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "CHUNK_SIZE")
  @js.native
  val CHUNK_SIZE: Double = js.native
  
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
    def connectionFailure: ISignal[this.type, Error] = js.native
    
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
      * Get the current path.
      */
    def path: String = js.native
    
    /**
      * A signal emitted when the path changes.
      */
    def pathChanged: ISignal[
        this.type, 
        typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[String, String, String]
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
      * Create an iterator over the active sessions in the directory.
      *
      * @returns A new iterator over the model's active sessions.
      */
    def sessions(): IIterator[typings.jupyterlabServices.sessionSessionMod.IModel] = js.native
    
    /**
      * Get the kernel spec models.
      */
    def specs: ISpecModels | Null = js.native
    
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
      * A signal emitted when an upload progresses.
      */
    def uploadChanged: ISignal[
        this.type, 
        typings.jupyterlabCoreutils.interfacesMod.IChangedArgs[IUploadModel | Null, IUploadModel | Null, String]
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Whether a file browser automatically loads its initial path.
        * The default is `true`.
        */
      var auto: js.UndefOr[Boolean] = js.native
      
      /**
        * An optional `Contents.IDrive` name for the model.
        * If given, the model will prepend `driveName:` to
        * all paths used in file operations.
        */
      var driveName: js.UndefOr[String] = js.native
      
      /**
        * A document manager instance.
        */
      var manager: IDocumentManager = js.native
      
      /**
        * The time interval for browser refreshing, in ms.
        */
      var refreshInterval: js.UndefOr[Double] = js.native
      
      /**
        * An optional state database. If provided, the model will restore which
        * folder was last opened when it is restored.
        */
      var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(manager: IDocumentManager): IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
        
        @scala.inline
        def setDriveName(value: String): Self = StObject.set(x, "driveName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDriveNameUndefined: Self = StObject.set(x, "driveName", js.undefined)
        
        @scala.inline
        def setManager(value: IDocumentManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
        
        @scala.inline
        def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "FilterFileBrowserModel")
  @js.native
  class FilterFileBrowserModel protected () extends FileBrowserModel {
    def this(options: typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions) = this()
    
    var _filter: js.Any = js.native
  }
  object FilterFileBrowserModel {
    
    /**
      * Constructor options
      */
    @js.native
    trait IOptions
      extends typings.jupyterlabFilebrowser.modelMod.FileBrowserModel.IOptions {
      
      /**
        * Filter function on file browser item model
        */
      var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(manager: IDocumentManager): typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabFilebrowser.modelMod.FilterFileBrowserModel.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFilter(value: /* value */ IModel => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/filebrowser/lib/model", "LARGE_FILE_SIZE")
  @js.native
  val LARGE_FILE_SIZE: Double = js.native
  
  @js.native
  trait IUploadModel extends StObject {
    
    var path: String = js.native
    
    /**
      * % uploaded [0, 1)
      */
    var progress: Double = js.native
  }
  object IUploadModel {
    
    @scala.inline
    def apply(path: String, progress: Double): IUploadModel = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUploadModel]
    }
    
    @scala.inline
    implicit class IUploadModelMutableBuilder[Self <: IUploadModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    }
  }
}
