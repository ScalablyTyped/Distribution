package typings.jupyterlabDocregistry

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IKernelPreference
import typings.jupyterlabApputils.mod.Toolbar
import typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.ITextSelection
import typings.jupyterlabDocregistry.anon.PartialIFileType
import typings.jupyterlabDocregistry.anon.PartialIModel
import typings.jupyterlabDocregistry.anon.PartialIModelChunk
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.added
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.fileType
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.modelFactory
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.removed
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.widgetExtension
import typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.widgetFactory
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IChangedArgs
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.ModelFactory
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.WidgetExtension
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.WidgetFactory
import typings.jupyterlabObservables.libModeldbMod.IModelDB
import typings.jupyterlabObservables.libObservablelistMod.IObservableList
import typings.jupyterlabObservables.libObservablemapMod.IObservableMap
import typings.jupyterlabObservables.libObservablestringMod.IObservableString
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IResolver
import typings.jupyterlabServices.libContentsMod.Contents.ContentType
import typings.jupyterlabServices.libContentsMod.Contents.FileFormat
import typings.jupyterlabServices.libContentsMod.Contents.ICheckpointModel
import typings.jupyterlabSharedModels.libApiMod.ISharedDocument
import typings.jupyterlabSharedModels.libApiMod.ISharedFile
import typings.jupyterlabSharedModels.libApiMod.ISharedText
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoCoreutils.typesJsonMod.PartialJSONValue
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.typesDocklayoutMod.DockLayout.InsertMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRegistryMod {
  
  @JSImport("@jupyterlab/docregistry/lib/registry", "DocumentRegistry")
  @js.native
  /**
    * Construct a new document registry.
    */
  open class DocumentRegistry ()
    extends StObject
       with IDisposable {
    def this(options: IOptions) = this()
    
    /* private */ var _changed: Any = js.native
    
    /* private */ var _defaultRenderedWidgetFactories: Any = js.native
    
    /* private */ var _defaultWidgetFactories: Any = js.native
    
    /* private */ var _defaultWidgetFactory: Any = js.native
    
    /* private */ var _defaultWidgetFactoryOverrides: Any = js.native
    
    /* private */ var _extenders: Any = js.native
    
    /* private */ var _fileTypes: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _modelFactories: Any = js.native
    
    /* private */ var _widgetFactories: Any = js.native
    
    /* private */ var _widgetFactoriesForFileType: Any = js.native
    
    /**
      * Add a file type to the document registry.
      *
      * @param fileType - The file type object to register.
      * @param factories - Optional factories to use for the file type.
      *
      * @returns A disposable which will unregister the command.
      *
      * #### Notes
      * These are used to populate the "Create New" dialog.
      *
      * If no default factory exists for the file type, the first factory will
      * be defined as default factory.
      */
    def addFileType(fileType: PartialIFileType): IDisposable = js.native
    def addFileType(fileType: PartialIFileType, factories: js.Array[String]): IDisposable = js.native
    
    /**
      * Add a model factory to the registry.
      *
      * @param factory - The factory instance.
      *
      * @returns A disposable which will unregister the factory.
      *
      * #### Notes
      * If a factory with the given `name` is already registered, or
      * the given factory is already registered, a warning will be logged
      * and this will be a no-op.
      */
    def addModelFactory(factory: ModelFactory): IDisposable = js.native
    
    /**
      * Add a widget extension to the registry.
      *
      * @param widgetName - The name of the widget factory.
      *
      * @param extension - A widget extension.
      *
      * @returns A disposable which will unregister the extension.
      *
      * #### Notes
      * If the extension is already registered for the given
      * widget name, a warning will be logged and this will be a no-op.
      */
    def addWidgetExtension(widgetName: String, `extension`: WidgetExtension): IDisposable = js.native
    
    /**
      * Add a widget factory to the registry.
      *
      * @param factory - The factory instance to register.
      *
      * @returns A disposable which will unregister the factory.
      *
      * #### Notes
      * If a factory with the given `'name'` is already registered,
      * a warning will be logged, and this will be a no-op.
      * If `'*'` is given as a default extension, the factory will be registered
      * as the global default.
      * If an extension or global default is already registered, this factory
      * will override the existing default.
      * The factory cannot be named an empty string or the string `'default'`.
      */
    def addWidgetFactory(factory: WidgetFactory): IDisposable = js.native
    
    /**
      * A signal emitted when the registry has changed.
      */
    def changed: ISignal[this.type, IChangedArgs] = js.native
    
    /**
      * Get the default rendered widget factory for a path.
      *
      * @param path - The path to for which to find a widget factory.
      *
      * @returns The default rendered widget factory for the path.
      *
      * ### Notes
      * If the widget factory has registered a separate set of `defaultRendered`
      * file types and there is a match in that set, this returns that.
      * Otherwise, this returns the same widget factory as
      * [[defaultWidgetFactory]].
      */
    def defaultRenderedWidgetFactory(path: String): WidgetFactory = js.native
    
    /**
      * Get the default widget factory for a path.
      *
      * @param path - An optional file path to filter the results.
      *
      * @returns The default widget factory for an path.
      *
      * #### Notes
      * This is equivalent to the first value in [[preferredWidgetFactories]].
      */
    def defaultWidgetFactory(): WidgetFactory = js.native
    def defaultWidgetFactory(path: String): WidgetFactory = js.native
    
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
      * Create an iterator over the file types that have been registered.
      *
      * @returns A new iterator of file types.
      */
    def fileTypes(): IIterator[IFileType] = js.native
    
    /**
      * Get a file type by name.
      */
    def getFileType(name: String): js.UndefOr[IFileType] = js.native
    
    /**
      * Get the best file type given a contents model.
      *
      * @param model - The contents model of interest.
      *
      * @returns The best matching file type.
      */
    def getFileTypeForModel(model: PartialIModelChunk): IFileType = js.native
    
    /**
      * Get the file types that match a file name.
      *
      * @param path - The path of the file.
      *
      * @returns An ordered list of matching file types.
      */
    def getFileTypesForPath(path: String): js.Array[IFileType] = js.native
    
    /**
      * Get a kernel preference.
      *
      * @param path - The file path.
      *
      * @param widgetName - The name of the widget factory.
      *
      * @param kernel - An optional existing kernel model.
      *
      * @returns A kernel preference.
      */
    def getKernelPreference(path: String, widgetName: String): js.UndefOr[IKernelPreference] = js.native
    def getKernelPreference(path: String, widgetName: String, kernel: PartialIModel): js.UndefOr[IKernelPreference] = js.native
    
    /**
      * Get a model factory by name.
      *
      * @param name - The name of the model factory.
      *
      * @returns A model factory instance.
      */
    def getModelFactory(name: String): js.UndefOr[ModelFactory] = js.native
    
    /**
      * Get a widget factory by name.
      *
      * @param widgetName - The name of the widget factory.
      *
      * @returns A widget factory instance.
      */
    def getWidgetFactory(widgetName: String): js.UndefOr[WidgetFactory] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the document registry has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDocumentRegistry: Boolean = js.native
    
    /**
      * Create an iterator over the model factories that have been registered.
      *
      * @returns A new iterator of model factories.
      */
    def modelFactories(): IIterator[ModelFactory] = js.native
    
    /**
      * Get a list of the preferred widget factories.
      *
      * @param path - The file path to filter the results.
      *
      * @returns A new array of widget factories.
      *
      * #### Notes
      * Only the widget factories whose associated model factory have
      * been registered will be returned.
      * The first item is considered the default. The returned array
      * has widget factories in the following order:
      * - path-specific default factory
      * - path-specific default rendered factory
      * - global default factory
      * - all other path-specific factories
      * - all other global factories
      */
    def preferredWidgetFactories(path: String): js.Array[WidgetFactory] = js.native
    
    /**
      * Set overrides for the default widget factory for a file type.
      *
      * Normally, a widget factory informs the document registry which file types
      * it should be the default for using the `defaultFor` option in the
      * IWidgetFactoryOptions. This function can be used to override that after
      * the fact.
      *
      * @param fileType: The name of the file type.
      *
      * @param factory: The name of the factory.
      *
      * #### Notes
      * If `factory` is undefined, then any override will be unset, and the
      * default factory will revert to the original value.
      *
      * If `factory` or `fileType` are not known to the docregistry, or
      * if `factory` cannot open files of type `fileType`, this will throw
      * an error.
      */
    def setDefaultWidgetFactory(fileType: String): Unit = js.native
    def setDefaultWidgetFactory(fileType: String, factory: String): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
    
    /**
      * Create an iterator over the registered extensions for a given widget.
      *
      * @param widgetName - The name of the widget factory.
      *
      * @returns A new iterator over the widget extensions.
      */
    def widgetExtensions(widgetName: String): IIterator[WidgetExtension] = js.native
    
    /**
      * Create an iterator over the widget factories that have been registered.
      *
      * @returns A new iterator of widget factories.
      */
    def widgetFactories(): IIterator[WidgetFactory] = js.native
  }
  object DocumentRegistry {
    
    @JSImport("@jupyterlab/docregistry/lib/registry", "DocumentRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default directory file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default directory file type.
      */
    inline def getDefaultDirectoryFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectoryFileType")().asInstanceOf[IFileType]
    inline def getDefaultDirectoryFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDirectoryFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The default file types used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default directory file types.
      */
    inline def getDefaultFileTypes(): js.Array[PartialIFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFileTypes")().asInstanceOf[js.Array[PartialIFileType]]
    inline def getDefaultFileTypes(translator: ITranslator): js.Array[PartialIFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFileTypes")(translator.asInstanceOf[js.Any]).asInstanceOf[js.Array[PartialIFileType]]
    
    /**
      * The default notebook file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default notebook file type.
      */
    inline def getDefaultNotebookFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNotebookFileType")().asInstanceOf[IFileType]
    inline def getDefaultNotebookFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultNotebookFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The default text file type used by the document registry.
      *
      * @param translator - The application language translator.
      *
      * @returns The default text file type.
      */
    inline def getDefaultTextFileType(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextFileType")().asInstanceOf[IFileType]
    inline def getDefaultTextFileType(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTextFileType")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
    /**
      * The defaults used for a file type.
      *
      * @param translator - The application language translator.
      *
      * @returns The default file type.
      */
    inline def getFileTypeDefaults(): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTypeDefaults")().asInstanceOf[IFileType]
    inline def getFileTypeDefaults(translator: ITranslator): IFileType = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileTypeDefaults")(translator.asInstanceOf[js.Any]).asInstanceOf[IFileType]
    
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
      * An arguments object for the `changed` signal.
      */
    trait IChangedArgs extends StObject {
      
      /**
        * Whether the item was added or removed.
        */
      val change: added | removed
      
      /**
        * The name of the item or the widget factory being extended.
        */
      val name: js.UndefOr[String] = js.undefined
      
      /**
        * The type of the changed item.
        */
      val `type`: widgetFactory | modelFactory | widgetExtension | fileType
    }
    object IChangedArgs {
      
      inline def apply(change: added | removed, `type`: widgetFactory | modelFactory | widgetExtension | fileType): IChangedArgs = {
        val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[IChangedArgs]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IChangedArgs] (val x: Self) extends AnyVal {
        
        inline def setChange(value: added | removed): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        
        inline def setType(value: widgetFactory | modelFactory | widgetExtension | fileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The interface for a document model that represents code.
      */
    trait ICodeModel
      extends StObject
         with IModel
         with typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel {
      
      /**
        * The underlying `IModelDB` instance in which model
        * data is stored.
        */
      /* InferMemberOverrides */
      override val modelDB: IModelDB
      
      /**
        * The shared model for the cell editor.
        */
      /* InferMemberOverrides */
      override val sharedModel: ISharedText & ISharedDocument
      @JSName("sharedModel")
      var sharedModel_ICodeModel: ISharedFile
    }
    object ICodeModel {
      
      inline def apply(
        contentChanged: ISignal[ICodeModel, Unit],
        defaultKernelLanguage: String,
        defaultKernelName: String,
        dirty: Boolean,
        dispose: () => Unit,
        fromJSON: ReadonlyPartialJSONValue => Unit,
        fromString: String => Unit,
        initialize: () => Unit,
        isDisposed: Boolean,
        mimeType: String,
        mimeTypeChanged: ISignal[
              typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel, 
              typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[String, String, String]
            ],
        modelDB: IModelDB,
        readOnly: Boolean,
        selections: IObservableMap[js.Array[ITextSelection]],
        sharedModel: (ISharedText & ISharedDocument) | ISharedFile,
        sharedModelSwitched: ISignal[typings.jupyterlabCodeeditor.libEditorMod.CodeEditor.IModel, Boolean],
        stateChanged: ISignal[
              ICodeModel, 
              typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
            ],
        switchSharedModel: (ISharedText, Boolean) => Unit,
        toJSON: () => PartialJSONValue,
        value: IObservableString
      ): ICodeModel = {
        val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], mimeTypeChanged = mimeTypeChanged.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], sharedModelSwitched = sharedModelSwitched.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], switchSharedModel = js.Any.fromFunction2(switchSharedModel), toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICodeModel]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ICodeModel] (val x: Self) extends AnyVal {
        
        inline def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        inline def setSharedModel(value: (ISharedText & ISharedDocument) | ISharedFile): Self = StObject.set(x, "sharedModel", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The document context object.
      */
    @js.native
    trait IContext[T /* <: IModel */]
      extends StObject
         with IDisposable {
      
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
        * The document metadata, stored as a services contents model.
        *
        * #### Notes
        * This will be null until the context is 'ready'. Since we only store
        * metadata here, the `.contents` attribute will always be empty.
        */
      val contentsModel: typings.jupyterlabServices.libContentsMod.Contents.IModel | Null = js.native
      
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
        * A signal emitted when the context is disposed.
        */
      var disposed: ISignal[this.type, Unit] = js.native
      
      /**
        * Save the document to a different path chosen by the user.
        */
      def download(): js.Promise[Unit] = js.native
      
      /**
        * A signal emitted when the contentsModel changes.
        */
      var fileChanged: ISignal[this.type, typings.jupyterlabServices.libContentsMod.Contents.IModel] = js.native
      
      /**
        * Whether the context is ready.
        */
      val isReady: Boolean = js.native
      
      /**
        * Configurable margin used to detect document modification conflicts, in milliseconds
        */
      var lastModifiedCheckMargin: Double = js.native
      
      /**
        * List available checkpoints for the file.
        *
        * @returns A promise which resolves with a list of checkpoint models for
        *    the file.
        */
      def listCheckpoints(): js.Promise[js.Array[ICheckpointModel]] = js.native
      
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
        * Rename the document.
        */
      def rename(newName: String): js.Promise[Unit] = js.native
      
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
      
      /**
        * A signal emitted on the start and end of a saving operation.
        */
      var saveState: ISignal[this.type, SaveState] = js.native
      
      /**
        * The session context object associated with the context.
        */
      val sessionContext: ISessionContext = js.native
      
      /**
        * The url resolver for the context.
        */
      val urlResolver: IResolver = js.native
    }
    
    /**
      * An interface for a file type.
      */
    trait IFileType extends StObject {
      
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
        * The icon for the file type.
        */
      val icon: js.UndefOr[LabIcon] = js.undefined
      
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
    object IFileType {
      
      inline def apply(contentType: ContentType, extensions: js.Array[String], mimeTypes: js.Array[String], name: String): IFileType = {
        val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], mimeTypes = mimeTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], fileFormat = null)
        __obj.asInstanceOf[IFileType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IFileType] (val x: Self) extends AnyVal {
        
        inline def setContentType(value: ContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
        
        inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
        
        inline def setFileFormat(value: FileFormat): Self = StObject.set(x, "fileFormat", value.asInstanceOf[js.Any])
        
        inline def setFileFormatNull: Self = StObject.set(x, "fileFormat", null)
        
        inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
        
        inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      }
    }
    
    /**
      * The interface for a document model.
      */
    trait IModel
      extends StObject
         with IDisposable {
      
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
        * Deserialize the model from JSON.
        *
        * #### Notes
        * Should emit a [contentChanged] signal.
        */
      def fromJSON(value: ReadonlyPartialJSONValue): Unit
      
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
        * The shared notebook model.
        */
      val sharedModel: ISharedDocument
      
      /**
        * A signal emitted when the model state changes.
        */
      var stateChanged: ISignal[
            this.type, 
            typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
          ]
      
      /**
        * Serialize the model to JSON.
        */
      def toJSON(): PartialJSONValue
    }
    object IModel {
      
      inline def apply(
        contentChanged: ISignal[IModel, Unit],
        defaultKernelLanguage: String,
        defaultKernelName: String,
        dirty: Boolean,
        dispose: () => Unit,
        fromJSON: ReadonlyPartialJSONValue => Unit,
        fromString: String => Unit,
        initialize: () => Unit,
        isDisposed: Boolean,
        modelDB: IModelDB,
        readOnly: Boolean,
        sharedModel: ISharedDocument,
        stateChanged: ISignal[
              IModel, 
              typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
            ],
        toJSON: () => PartialJSONValue
      ): IModel = {
        val __obj = js.Dynamic.literal(contentChanged = contentChanged.asInstanceOf[js.Any], defaultKernelLanguage = defaultKernelLanguage.asInstanceOf[js.Any], defaultKernelName = defaultKernelName.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), fromJSON = js.Any.fromFunction1(fromJSON), fromString = js.Any.fromFunction1(fromString), initialize = js.Any.fromFunction0(initialize), isDisposed = isDisposed.asInstanceOf[js.Any], modelDB = modelDB.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], sharedModel = sharedModel.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
        __obj.asInstanceOf[IModel]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IModel] (val x: Self) extends AnyVal {
        
        inline def setContentChanged(value: ISignal[IModel, Unit]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
        
        inline def setDefaultKernelLanguage(value: String): Self = StObject.set(x, "defaultKernelLanguage", value.asInstanceOf[js.Any])
        
        inline def setDefaultKernelName(value: String): Self = StObject.set(x, "defaultKernelName", value.asInstanceOf[js.Any])
        
        inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
        
        inline def setFromJSON(value: ReadonlyPartialJSONValue => Unit): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
        
        inline def setFromString(value: String => Unit): Self = StObject.set(x, "fromString", js.Any.fromFunction1(value))
        
        inline def setInitialize(value: () => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction0(value))
        
        inline def setModelDB(value: IModelDB): Self = StObject.set(x, "modelDB", value.asInstanceOf[js.Any])
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setSharedModel(value: ISharedDocument): Self = StObject.set(x, "sharedModel", value.asInstanceOf[js.Any])
        
        inline def setStateChanged(
          value: ISignal[
                  IModel, 
                  typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs[Any, Any, String]
                ]
        ): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
        
        inline def setToJSON(value: () => PartialJSONValue): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * The interface for a model factory.
      */
    @js.native
    trait IModelFactory[T /* <: IModel */]
      extends StObject
         with IDisposable {
      
      /**
        * The content type of the file (defaults to `"file"`).
        */
      val contentType: ContentType = js.native
      
      /**
        * Create a new model for a given path.
        *
        * @param languagePreference - An optional kernel language preference.
        * @param modelDB - An optional modelDB.
        * @param isInitialized - An optional flag to check if the model is initialized.
        *
        * @returns A new document model.
        */
      def createNew(): T = js.native
      def createNew(languagePreference: String): T = js.native
      def createNew(languagePreference: String, modelDB: Unit, isInitialized: Boolean): T = js.native
      def createNew(languagePreference: String, modelDB: IModelDB): T = js.native
      def createNew(languagePreference: String, modelDB: IModelDB, isInitialized: Boolean): T = js.native
      def createNew(languagePreference: Unit, modelDB: Unit, isInitialized: Boolean): T = js.native
      def createNew(languagePreference: Unit, modelDB: IModelDB): T = js.native
      def createNew(languagePreference: Unit, modelDB: IModelDB, isInitialized: Boolean): T = js.native
      
      /**
        * The format of the file (defaults to `"text"`).
        */
      val fileFormat: FileFormat = js.native
      
      /**
        * The name of the model.
        */
      val name: String = js.native
      
      /**
        * Get the preferred kernel language given a file path.
        */
      def preferredLanguage(path: String): String = js.native
    }
    
    /**
      * The options used to open a widget.
      */
    trait IOpenOptions extends StObject {
      
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
    object IOpenOptions {
      
      inline def apply(): IOpenOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOpenOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOpenOptions] (val x: Self) extends AnyVal {
        
        inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
        
        inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
        
        inline def setMode(value: InsertMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
        
        inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        inline def setRefNull: Self = StObject.set(x, "ref", null)
        
        inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      }
    }
    
    /**
      * The options used to create a document registry.
      */
    trait IOptions extends StObject {
      
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
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setInitialFileTypes(value: js.Array[IFileType]): Self = StObject.set(x, "initialFileTypes", value.asInstanceOf[js.Any])
        
        inline def setInitialFileTypesUndefined: Self = StObject.set(x, "initialFileTypes", js.undefined)
        
        inline def setInitialFileTypesVarargs(value: IFileType*): Self = StObject.set(x, "initialFileTypes", js.Array(value*))
        
        inline def setTextModelFactory(value: ModelFactory): Self = StObject.set(x, "textModelFactory", value.asInstanceOf[js.Any])
        
        inline def setTextModelFactoryUndefined: Self = StObject.set(x, "textModelFactory", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * The item to be added to document toolbar.
      */
    type IToolbarItem = typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IToolbarItem
    
    /**
      * An interface for a widget extension.
      */
    trait IWidgetExtension[T /* <: Widget */, U /* <: IModel */] extends StObject {
      
      /**
        * Create a new extension for a given widget.
        */
      def createNew(widget: T, context: IContext[U]): IDisposable | Unit
    }
    object IWidgetExtension {
      
      inline def apply[T /* <: Widget */, U /* <: IModel */](createNew: (T, IContext[U]) => IDisposable | Unit): IWidgetExtension[T, U] = {
        val __obj = js.Dynamic.literal(createNew = js.Any.fromFunction2(createNew))
        __obj.asInstanceOf[IWidgetExtension[T, U]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IWidgetExtension[?, ?], T /* <: Widget */, U /* <: IModel */] (val x: Self & (IWidgetExtension[T, U])) extends AnyVal {
        
        inline def setCreateNew(value: (T, IContext[U]) => IDisposable | Unit): Self = StObject.set(x, "createNew", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * The interface for a widget factory.
      */
    @js.native
    trait IWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */]
      extends StObject
         with IDisposable
         with IWidgetFactoryOptions[Widget] {
      
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
      
      /**
        * A signal emitted when a new widget is created.
        */
      var widgetCreated: ISignal[IWidgetFactory[T, U], T] = js.native
    }
    
    /**
      * The options used to initialize a widget factory.
      */
    trait IWidgetFactoryOptions[T /* <: Widget */] extends StObject {
      
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
      val toolbarFactory: js.UndefOr[
            js.Function1[/* widget */ T, js.Array[IToolbarItem] | IObservableList[IToolbarItem]]
          ] = js.undefined
      
      /**
        * The application language translator.
        */
      val translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IWidgetFactoryOptions {
      
      inline def apply[T /* <: Widget */](fileTypes: js.Array[String], name: String): IWidgetFactoryOptions[T] = {
        val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[IWidgetFactoryOptions[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IWidgetFactoryOptions[?], T /* <: Widget */] (val x: Self & IWidgetFactoryOptions[T]) extends AnyVal {
        
        inline def setCanStartKernel(value: Boolean): Self = StObject.set(x, "canStartKernel", value.asInstanceOf[js.Any])
        
        inline def setCanStartKernelUndefined: Self = StObject.set(x, "canStartKernel", js.undefined)
        
        inline def setDefaultFor(value: js.Array[String]): Self = StObject.set(x, "defaultFor", value.asInstanceOf[js.Any])
        
        inline def setDefaultForUndefined: Self = StObject.set(x, "defaultFor", js.undefined)
        
        inline def setDefaultForVarargs(value: String*): Self = StObject.set(x, "defaultFor", js.Array(value*))
        
        inline def setDefaultRendered(value: js.Array[String]): Self = StObject.set(x, "defaultRendered", value.asInstanceOf[js.Any])
        
        inline def setDefaultRenderedUndefined: Self = StObject.set(x, "defaultRendered", js.undefined)
        
        inline def setDefaultRenderedVarargs(value: String*): Self = StObject.set(x, "defaultRendered", js.Array(value*))
        
        inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
        
        inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
        
        inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
        
        inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPreferKernel(value: Boolean): Self = StObject.set(x, "preferKernel", value.asInstanceOf[js.Any])
        
        inline def setPreferKernelUndefined: Self = StObject.set(x, "preferKernel", js.undefined)
        
        inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        
        inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
        
        inline def setShutdownOnClose(value: Boolean): Self = StObject.set(x, "shutdownOnClose", value.asInstanceOf[js.Any])
        
        inline def setShutdownOnCloseUndefined: Self = StObject.set(x, "shutdownOnClose", js.undefined)
        
        inline def setToolbarFactory(value: /* widget */ T => js.Array[IToolbarItem] | IObservableList[IToolbarItem]): Self = StObject.set(x, "toolbarFactory", js.Any.fromFunction1(value))
        
        inline def setToolbarFactoryUndefined: Self = StObject.set(x, "toolbarFactory", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
    
    /**
      * A type alias for a standard model factory.
      */
    type ModelFactory = IModelFactory[IModel]
    
    /**
      * Document save state
      */
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.started
      - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed
      - typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed
    */
    trait SaveState extends StObject
    object SaveState {
      
      inline def completed: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed = "completed".asInstanceOf[typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.completed]
      
      inline def failed: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed = "failed".asInstanceOf[typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.failed]
      
      inline def started: typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.started = "started".asInstanceOf[typings.jupyterlabDocregistry.jupyterlabDocregistryStrings.started]
    }
    
    /**
      * A type alias for a standard widget extension.
      */
    type WidgetExtension = IWidgetExtension[Widget, IModel]
    
    /**
      * A type alias for a standard widget factory.
      */
    type WidgetFactory = IWidgetFactory[IDocumentWidget[Widget, IModel], IModel]
  }
  
  @js.native
  trait IDocumentWidget[T /* <: Widget */, U /* <: IModel */] extends Widget {
    
    /**
      * The content widget.
      */
    val content: T = js.native
    
    /**
      * The context associated with the document.
      */
    val context: IContext[U] = js.native
    
    /**
      * Whether the document has an auto-generated name or not.
      *
      * #### Notes
      * A document has auto-generated name if its name is untitled and up
      * to the instant the user saves it manually for the first time.
      */
    var isUntitled: js.UndefOr[Boolean] = js.native
    
    /**
      * A promise resolving after the content widget is revealed.
      */
    val revealed: js.Promise[Unit] = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
    
    /**
      * The toolbar for the widget.
      */
    val toolbar: Toolbar[Widget] = js.native
  }
}
