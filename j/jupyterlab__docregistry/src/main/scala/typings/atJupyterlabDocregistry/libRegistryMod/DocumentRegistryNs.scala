package typings.atJupyterlabDocregistry.libRegistryMod

import typings.atJupyterlabApputils.libClientsessionMod.IClientSession
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.added
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.fileType
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.modelFactory
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.removed
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetExtension
import typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.widgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.ICodeModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IContext
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IFileType
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModel
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IModelFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IOpenOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IToolbarItem
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IWidgetExtension
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IWidgetFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.IWidgetFactoryOptions
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.ModelFactory
import typings.atJupyterlabDocregistry.libRegistryMod.DocumentRegistryNs.SaveState
import typings.atJupyterlabObservables.libModeldbMod.IModelDB
import typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver
import typings.atJupyterlabServices.libContentsMod.ContentsNs.ContentType
import typings.atJupyterlabServices.libContentsMod.ContentsNs.FileFormat
import typings.atJupyterlabServices.libContentsMod.ContentsNs.ICheckpointModel
import typings.atPhosphorCoreutils.libJsonMod.JSONValue
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.atPhosphorWidgets.libDocklayoutMod.DockLayoutNs.InsertMode
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/registry", "DocumentRegistry")
@js.native
object DocumentRegistryNs extends js.Object {
  /**
    * An arguments object for the `changed` signal.
    */
  trait IChangedArgs extends js.Object {
    /**
      * Whether the item was added or removed.
      */
    val change: added | removed
    /**
      * The name of the item or the widget factory being extended.
      */
    val name: String
    /**
      * The type of the changed item.
      */
    val `type`: widgetFactory | modelFactory | widgetExtension | fileType
  }
  
  /**
    * The interface for a document model that represents code.
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait ICodeModel extends IModel
  
  /**
    * The document context object.
    */
  @js.native
  trait IContext[T /* <: IModel */] extends IDisposable {
    /**
      * The document metadata, stored as a services contents model.
      *
      * #### Notes
      * This will be null until the context is 'ready'. Since we only store
      * metadata here, the `.contents` attribute will always be empty.
      */
    val contentsModel: typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel | Null = js.native
    /**
      * A signal emitted when the context is disposed.
      */
    var disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the contentsModel changes.
      */
    var fileChanged: ISignal[this.type, typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel] = js.native
    /**
      * Whether the context is ready.
      */
    val isReady: Boolean = js.native
    /**
      * The current local path associated with the document.
      * If the document is in the default notebook file browser,
      * this is the same as the path.
      */
    val localPath: String = js.native
    /**
      * The data model for the document.
      */
    val model: T = js.native
    /**
      * The current path associated with the document.
      */
    val path: String = js.native
    /**
      * A signal emitted when the path changes.
      */
    var pathChanged: ISignal[this.type, String] = js.native
    /**
      * A promise that is fulfilled when the context is ready.
      */
    val ready: js.Promise[Unit] = js.native
    /**
      * A signal emitted on the start and end of a saving operation.
      */
    var saveState: ISignal[this.type, SaveState] = js.native
    /**
      * The client session object associated with the context.
      */
    val session: IClientSession = js.native
    /**
      * The url resolver for the context.
      */
    val urlResolver: IResolver = js.native
    /**
      * Add a sibling widget to the document manager.
      *
      * @param widget - The widget to add to the document manager.
      *
      * @param options - The desired options for adding the sibling.
      *
      * @returns A disposable used to remove the sibling if desired.
      *
      * #### Notes
      * It is assumed that the widget has the same model and context
      * as the original widget.
      */
    def addSibling(widget: Widget): IDisposable = js.native
    def addSibling(widget: Widget, options: IOpenOptions): IDisposable = js.native
    /**
      * Create a checkpoint for the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(): js.Promise[ICheckpointModel] = js.native
    /**
      * Delete a checkpoint for the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(checkpointID: String): js.Promise[Unit] = js.native
    /**
      * List available checkpoints for the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(): js.Promise[js.Array[ICheckpointModel]] = js.native
    /**
      * Restore the file to a known checkpoint state.
      *
      * @param checkpointID - The optional id of the checkpoint to restore,
      *   defaults to the most recent checkpoint.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(): js.Promise[Unit] = js.native
    def restoreCheckpoint(checkpointID: String): js.Promise[Unit] = js.native
    /**
      * Revert the document contents to disk contents.
      */
    def revert(): js.Promise[Unit] = js.native
    /**
      * Save the document contents to disk.
      */
    def save(): js.Promise[Unit] = js.native
    /**
      * Save the document to a different path chosen by the user.
      */
    def saveAs(): js.Promise[Unit] = js.native
  }
  
  /**
    * An interface for a file type.
    */
  trait IFileType extends js.Object {
    /**
      * The content type of the new file.
      */
    val contentType: ContentType
    /**
      * An optional display name for the file type.
      */
    val displayName: js.UndefOr[String] = js.undefined
    /**
      * The extensions of the file type (e.g. `".txt"`).  Can be a compound
      * extension (e.g. `".table.json`).
      */
    val extensions: js.Array[String]
    /**
      * The format of the new file.
      */
    val fileFormat: FileFormat
    /**
      * The icon class name for the file type.
      */
    val iconClass: js.UndefOr[String] = js.undefined
    /**
      * The icon label for the file type.
      */
    val iconLabel: js.UndefOr[String] = js.undefined
    /**
      * The mime types associated the file type.
      */
    val mimeTypes: js.Array[String]
    /**
      * The name of the file type.
      */
    val name: String
    /**
      * An optional pattern for a file name (e.g. `^Dockerfile$`).
      */
    val pattern: js.UndefOr[String] = js.undefined
  }
  
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
    var stateChanged: ISignal[this.type, typings.atJupyterlabCoreutils.libInterfacesMod.IChangedArgs[_]]
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
  
  /**
    * The interface for a model factory.
    */
  @js.native
  trait IModelFactory[T /* <: IModel */] extends IDisposable {
    /**
      * The content type of the file (defaults to `"file"`).
      */
    val contentType: ContentType = js.native
    /**
      * The format of the file (defaults to `"text"`).
      */
    val fileFormat: FileFormat = js.native
    /**
      * The name of the model.
      */
    val name: String = js.native
    /**
      * Create a new model for a given path.
      *
      * @param languagePreference - An optional kernel language preference.
      *
      * @returns A new document model.
      */
    def createNew(): T = js.native
    def createNew(languagePreference: String): T = js.native
    def createNew(languagePreference: String, modelDB: IModelDB): T = js.native
    /**
      * Get the preferred kernel language given a file path.
      */
    def preferredLanguage(path: String): String = js.native
  }
  
  /**
    * The options used to open a widget.
    */
  trait IOpenOptions extends js.Object {
    /**
      * Whether to activate the widget.  Defaults to `true`.
      */
    var activate: js.UndefOr[Boolean] = js.undefined
    /**
      * The supported insertion modes.
      *
      * An insert mode is used to specify how a widget should be added
      * to the main area relative to a reference widget.
      */
    var mode: js.UndefOr[InsertMode] = js.undefined
    /**
      * The rank order of the widget among its siblings.
      *
      * #### Notes
      * This field may be used or ignored depending on shell implementation.
      */
    var rank: js.UndefOr[Double] = js.undefined
    /**
      * The reference widget id for the insert location.
      *
      * The default is `null`.
      */
    var ref: js.UndefOr[String | Null] = js.undefined
  }
  
  /**
    * The options used to create a document registry.
    */
  trait IOptions extends js.Object {
    /**
      * The initial file types for the registry.
      * The [[DocumentRegistry.defaultFileTypes]] will be used if not given.
      */
    var initialFileTypes: js.UndefOr[js.Array[IFileType]] = js.undefined
    /**
      * The text model factory for the registry.  A default instance will
      * be used if not given.
      */
    var textModelFactory: js.UndefOr[ModelFactory] = js.undefined
  }
  
  /**
    * The item to be added to document toolbar.
    */
  trait IToolbarItem extends js.Object {
    var name: String
    var widget: Widget
  }
  
  /**
    * An interface for a widget extension.
    */
  trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends js.Object {
    /**
      * Create a new extension for a given widget.
      */
    def createNew(widget: T, context: IContext[U]): IDisposable
  }
  
  /**
    * The interface for a widget factory.
    */
  @js.native
  trait IWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */]
    extends IDisposable
       with IWidgetFactoryOptions[Widget] {
    /**
      * A signal emitted when a new widget is created.
      */
    var widgetCreated: ISignal[IWidgetFactory[T, U], T] = js.native
    /**
      * Create a new widget given a context.
      *
      * @param source - A widget to clone
      *
      * #### Notes
      * It should emit the [widgetCreated] signal with the new widget.
      */
    def createNew(context: IContext[U]): T = js.native
    def createNew(context: IContext[U], source: T): T = js.native
  }
  
  /**
    * The options used to initialize a widget factory.
    */
  trait IWidgetFactoryOptions[T /* <: Widget */] extends js.Object {
    /**
      * Whether the widgets can start a kernel when opened.
      */
    val canStartKernel: js.UndefOr[Boolean] = js.undefined
    /**
      * The file types for which the factory should be the default.
      */
    val defaultFor: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * The file types for which the factory should be the default for rendering,
      * if that is different than the default factory (which may be for editing).
      * If undefined, then it will fall back on the default file type.
      */
    val defaultRendered: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * The file types the widget can view.
      */
    val fileTypes: js.Array[String]
    /**
      * The registered name of the model type used to create the widgets.
      */
    val modelName: js.UndefOr[String] = js.undefined
    /**
      * The name of the widget to display in dialogs.
      */
    val name: String
    /**
      * Whether the widgets prefer having a kernel started.
      */
    val preferKernel: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the widget factory is read only.
      */
    val readOnly: js.UndefOr[Boolean] = js.undefined
    /**
      * Whether the kernel should be shutdown when the widget is closed.
      */
    val shutdownOnClose: js.UndefOr[Boolean] = js.undefined
    /**
      * A function producing toolbar widgets, overriding the default toolbar widgets.
      */
    val toolbarFactory: js.UndefOr[js.Function1[/* widget */ T, js.Array[IToolbarItem]]] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.started
    - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.completed
    - typings.atJupyterlabDocregistry.atJupyterlabDocregistryStrings.failed
  */
  trait SaveState extends js.Object
  
  /**
    * The default directory file type used by the document registry.
    */
  val defaultDirectoryFileType: IFileType = js.native
  /**
    * The default file types used by the document registry.
    */
  val defaultFileTypes: js.Array[Partial[IFileType]] = js.native
  /**
    * The default notebook file type used by the document registry.
    */
  val defaultNotebookFileType: IFileType = js.native
  /**
    * The default text file type used by the document registry.
    */
  val defaultTextFileType: IFileType = js.native
  /**
    * The defaults used for a file type.
    */
  val fileTypeDefaults: IFileType = js.native
  /**
    * A type alias for a code context.
    */
  type CodeContext = IContext[ICodeModel]
  /**
    * A type alias for a code model factory.
    */
  type CodeModelFactory = IModelFactory[ICodeModel]
  /**
    * A type alias for a context.
    */
  type Context = IContext[IModel]
  /**
    * A type alias for a standard model factory.
    */
  type ModelFactory = IModelFactory[IModel]
  /**
    * A type alias for a standard widget extension.
    */
  type WidgetExtension = IWidgetExtension[Widget, IModel]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = IWidgetFactory[IDocumentWidget[Widget, IModel], IModel]
}

