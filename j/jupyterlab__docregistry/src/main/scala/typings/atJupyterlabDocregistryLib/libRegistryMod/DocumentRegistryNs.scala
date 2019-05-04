package typings
package atJupyterlabDocregistryLib.libRegistryMod

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
    val change: atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.added | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.removed
    /**
      * The name of the item or the widget factory being extended.
      */
    val name: java.lang.String
    /**
      * The type of the changed item.
      */
    val `type`: atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.widgetFactory | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.modelFactory | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.widgetExtension | atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.fileType
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
  trait IContext[T /* <: IModel */]
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * The document metadata, stored as a services contents model.
      *
      * #### Notes
      * This will be null until the context is 'ready'. Since we only store
      * metadata here, the `.contents` attribute will always be empty.
      */
    val contentsModel: atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel | scala.Null = js.native
    /**
      * A signal emitted when the context is disposed.
      */
    var disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
    /**
      * A signal emitted when the contentsModel changes.
      */
    var fileChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabServicesLib.libContentsMod.ContentsNs.IModel] = js.native
    /**
      * Whether the context is ready.
      */
    val isReady: scala.Boolean = js.native
    /**
      * The current local path associated with the document.
      * If the document is in the default notebook file browser,
      * this is the same as the path.
      */
    val localPath: java.lang.String = js.native
    /**
      * The data model for the document.
      */
    val model: T = js.native
    /**
      * The current path associated with the document.
      */
    val path: java.lang.String = js.native
    /**
      * A signal emitted when the path changes.
      */
    var pathChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
    /**
      * A promise that is fulfilled when the context is ready.
      */
    val ready: js.Promise[scala.Unit] = js.native
    /**
      * A signal emitted on the start and end of a saving operation.
      */
    var saveState: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, SaveState] = js.native
    /**
      * The client session object associated with the context.
      */
    val session: atJupyterlabApputilsLib.libClientsessionMod.IClientSession = js.native
    /**
      * The url resolver for the context.
      */
    val urlResolver: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IResolver = js.native
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
    def addSibling(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
    def addSibling(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, options: IOpenOptions): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
    /**
      * Create a checkpoint for the file.
      *
      * @returns A promise which resolves with the new checkpoint model when the
      *   checkpoint is created.
      */
    def createCheckpoint(): js.Promise[atJupyterlabServicesLib.libContentsMod.ContentsNs.ICheckpointModel] = js.native
    /**
      * Delete a checkpoint for the file.
      *
      * @param checkpointID - The id of the checkpoint to delete.
      *
      * @returns A promise which resolves when the checkpoint is deleted.
      */
    def deleteCheckpoint(checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * List available checkpoints for the file.
      *
      * @returns A promise which resolves with a list of checkpoint models for
      *    the file.
      */
    def listCheckpoints(): js.Promise[js.Array[atJupyterlabServicesLib.libContentsMod.ContentsNs.ICheckpointModel]] = js.native
    /**
      * Restore the file to a known checkpoint state.
      *
      * @param checkpointID - The optional id of the checkpoint to restore,
      *   defaults to the most recent checkpoint.
      *
      * @returns A promise which resolves when the checkpoint is restored.
      */
    def restoreCheckpoint(): js.Promise[scala.Unit] = js.native
    def restoreCheckpoint(checkpointID: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Revert the document contents to disk contents.
      */
    def revert(): js.Promise[scala.Unit] = js.native
    /**
      * Save the document contents to disk.
      */
    def save(): js.Promise[scala.Unit] = js.native
    /**
      * Save the document to a different path chosen by the user.
      */
    def saveAs(): js.Promise[scala.Unit] = js.native
  }
  
  /**
    * An interface for a file type.
    */
  trait IFileType extends js.Object {
    /**
      * The content type of the new file.
      */
    val contentType: atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType
    /**
      * An optional display name for the file type.
      */
    val displayName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The extensions of the file type (e.g. `".txt"`).  Can be a compound
      * extension (e.g. `".table.json`).
      */
    val extensions: js.Array[java.lang.String]
    /**
      * The format of the new file.
      */
    val fileFormat: atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat
    /**
      * The icon class name for the file type.
      */
    val iconClass: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The icon label for the file type.
      */
    val iconLabel: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The mime types associated the file type.
      */
    val mimeTypes: js.Array[java.lang.String]
    /**
      * The name of the file type.
      */
    val name: java.lang.String
    /**
      * An optional pattern for a file name (e.g. `^Dockerfile$`).
      */
    val pattern: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * The interface for a document model.
    */
  trait IModel
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * A signal emitted when the document content changes.
      */
    var contentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
    /**
      * The default kernel language of the document.
      */
    val defaultKernelLanguage: java.lang.String
    /**
      * The default kernel name of the document.
      */
    val defaultKernelName: java.lang.String
    /**
      * The dirty state of the model.
      *
      * #### Notes
      * This should be cleared when the document is loaded from
      * or saved to disk.
      */
    var dirty: scala.Boolean
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      *
      * ### Notes
      * Making direct edits to the values stored in the`IModelDB`
      * is not recommended, and may produce unpredictable results.
      */
    val modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB
    /**
      * The read-only state of the model.
      */
    var readOnly: scala.Boolean
    /**
      * A signal emitted when the model state changes.
      */
    var stateChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libInterfacesMod.IChangedArgs[_]]
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * Should emit a [contentChanged] signal.
      */
    def fromJSON(value: js.Any): scala.Unit
    /**
      * Deserialize the model from a string.
      *
      * #### Notes
      * Should emit a [contentChanged] signal.
      */
    def fromString(value: java.lang.String): scala.Unit
    /**
      * Initialize model state after initial data load.
      *
      * #### Notes
      * This function must be called after the initial data is loaded to set up
      * initial model state, such as an initial undo stack, etc.
      */
    def initialize(): scala.Unit
    /**
      * Serialize the model to JSON.
      */
    def toJSON(): atPhosphorCoreutilsLib.libJsonMod.JSONValue
  }
  
  /**
    * The interface for a model factory.
    */
  @js.native
  trait IModelFactory[T /* <: IModel */]
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
    /**
      * The content type of the file (defaults to `"file"`).
      */
    val contentType: atJupyterlabServicesLib.libContentsMod.ContentsNs.ContentType = js.native
    /**
      * The format of the file (defaults to `"text"`).
      */
    val fileFormat: atJupyterlabServicesLib.libContentsMod.ContentsNs.FileFormat = js.native
    /**
      * The name of the model.
      */
    val name: java.lang.String = js.native
    /**
      * Create a new model for a given path.
      *
      * @param languagePreference - An optional kernel language preference.
      *
      * @returns A new document model.
      */
    def createNew(): T = js.native
    def createNew(languagePreference: java.lang.String): T = js.native
    def createNew(languagePreference: java.lang.String, modelDB: atJupyterlabObservablesLib.libModeldbMod.IModelDB): T = js.native
    /**
      * Get the preferred kernel language given a file path.
      */
    def preferredLanguage(path: java.lang.String): java.lang.String = js.native
  }
  
  /**
    * The options used to open a widget.
    */
  trait IOpenOptions extends js.Object {
    /**
      * Whether to activate the widget.  Defaults to `true`.
      */
    var activate: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The supported insertion modes.
      *
      * An insert mode is used to specify how a widget should be added
      * to the main area relative to a reference widget.
      */
    var mode: js.UndefOr[atPhosphorWidgetsLib.libDocklayoutMod.DockLayoutNs.InsertMode] = js.undefined
    /**
      * The reference widget id for the insert location.
      *
      * The default is `null`.
      */
    var ref: js.UndefOr[java.lang.String | scala.Null] = js.undefined
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
    var name: java.lang.String
    var widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget
  }
  
  /**
    * An interface for a widget extension.
    */
  trait IWidgetExtension[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */, U /* <: IModel */] extends js.Object {
    /**
      * Create a new extension for a given widget.
      */
    def createNew(widget: T, context: IContext[U]): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
  }
  
  /**
    * The interface for a widget factory.
    */
  trait IWidgetFactory[T /* <: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, IModel] */, U /* <: IModel */]
    extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable
       with IWidgetFactoryOptions[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] {
    /**
      * A signal emitted when a new widget is created.
      */
    var widgetCreated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IWidgetFactory[T, U], T]
    /**
      * Create a new widget given a context.
      *
      * #### Notes
      * It should emit the [widgetCreated] signal with the new widget.
      */
    def createNew(context: IContext[U]): T
  }
  
  /**
    * The options used to initialize a widget factory.
    */
  trait IWidgetFactoryOptions[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] extends js.Object {
    /**
      * Whether the widgets can start a kernel when opened.
      */
    val canStartKernel: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The file types for which the factory should be the default.
      */
    val defaultFor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * The file types for which the factory should be the default for rendering,
      * if that is different than the default factory (which may be for editing).
      * If undefined, then it will fall back on the default file type.
      */
    val defaultRendered: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * The file types the widget can view.
      */
    val fileTypes: js.Array[java.lang.String]
    /**
      * The registered name of the model type used to create the widgets.
      */
    val modelName: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The name of the widget to display in dialogs.
      */
    val name: java.lang.String
    /**
      * Whether the widgets prefer having a kernel started.
      */
    val preferKernel: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether the widget factory is read only.
      */
    val readOnly: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A function producing toolbar widgets, overriding the default toolbar widgets.
      */
    val toolbarFactory: js.UndefOr[js.Function1[/* widget */ T, js.Array[IToolbarItem]]] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.started
    - atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.completed
    - atJupyterlabDocregistryLib.atJupyterlabDocregistryLibStrings.failed
  */
  trait SaveState extends js.Object
  
  /**
    * The default directory file type used by the document registry.
    */
  val defaultDirectoryFileType: IFileType = js.native
  /**
    * The default file types used by the document registry.
    */
  val defaultFileTypes: js.Array[stdLib.Partial[IFileType]] = js.native
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
  type WidgetExtension = IWidgetExtension[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, IModel]
  /**
    * A type alias for a standard widget factory.
    */
  type WidgetFactory = IWidgetFactory[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, IModel], 
    IModel
  ]
}

