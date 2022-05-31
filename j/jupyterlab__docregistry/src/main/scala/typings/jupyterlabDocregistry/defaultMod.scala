package typings.jupyterlabDocregistry

import typings.jupyterlabApputils.mod.MainAreaWidget
import typings.jupyterlabCodeeditor.mod.CodeEditor.Model
import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModelFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IToolbarItem
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactory
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.jupyterlabObservables.modeldbMod.IModelDB
import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMod {
  
  @JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected ()
    extends StObject
       with IWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
    
    /* private */ var _canStartKernel: js.Any = js.native
    
    /* private */ var _defaultFor: js.Any = js.native
    
    /* private */ var _defaultRendered: js.Any = js.native
    
    /* private */ var _fileTypes: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _modelName: js.Any = js.native
    
    /* private */ var _name: js.Any = js.native
    
    /* private */ var _preferKernel: js.Any = js.native
    
    /* private */ var _readOnly: js.Any = js.native
    
    /* private */ var _shutdownOnClose: js.Any = js.native
    
    /* private */ var _toolbarFactory: js.Any = js.native
    
    /* private */ var _widgetCreated: js.Any = js.native
    
    /**
      * Whether the widgets can start a kernel when opened.
      */
    @JSName("canStartKernel")
    def canStartKernel_MABCWidgetFactory: Boolean = js.native
    
    /**
      * Create a widget for a context.
      */
    /* protected */ def createNewWidget(context: IContext[U]): T = js.native
    /* protected */ def createNewWidget(context: IContext[U], source: T): T = js.native
    
    /**
      * The file types for which the factory should be the default.
      */
    @JSName("defaultFor")
    def defaultFor_MABCWidgetFactory: js.Array[String] = js.native
    
    /**
      * The file types for which the factory should be the default for
      * rendering a document model, if different from editing.
      */
    @JSName("defaultRendered")
    def defaultRendered_MABCWidgetFactory: js.Array[String] = js.native
    
    /**
      * Default factory for toolbar items to be added after the widget is created.
      */
    /* protected */ def defaultToolbarFactory(widget: T): js.Array[IToolbarItem] = js.native
    
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
      * The file types the widget can view.
      */
    /* CompleteClass */
    override val fileTypes: js.Array[String] = js.native
    /**
      * The file types the widget can view.
      */
    @JSName("fileTypes")
    def fileTypes_MABCWidgetFactory: js.Array[String] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the model factory has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MABCWidgetFactory: Boolean = js.native
    
    /**
      * The registered name of the model type used to create the widgets.
      */
    @JSName("modelName")
    def modelName_MABCWidgetFactory: String = js.native
    
    /**
      * The name of the widget to display in dialogs.
      */
    /* CompleteClass */
    override val name: String = js.native
    /**
      * The name of the widget to display in dialogs.
      */
    @JSName("name")
    def name_MABCWidgetFactory: String = js.native
    
    /**
      * Whether the widgets prefer having a kernel started.
      */
    @JSName("preferKernel")
    def preferKernel_MABCWidgetFactory: Boolean = js.native
    
    /**
      * Whether the widget factory is read only.
      */
    @JSName("readOnly")
    def readOnly_MABCWidgetFactory: Boolean = js.native
    
    def shutdownOnClose_=(value: Boolean): Unit = js.native
    /**
      * Whether the kernel should be shutdown when the widget is closed.
      */
    @JSName("shutdownOnClose")
    def shutdownOnClose_MABCWidgetFactory: Boolean = js.native
    
    /**
      * A signal emitted when a widget is created.
      */
    @JSName("widgetCreated")
    def widgetCreated_MABCWidgetFactory: ISignal[IWidgetFactory[T, U], T] = js.native
  }
  
  @JSImport("@jupyterlab/docregistry/lib/default", "Base64ModelFactory")
  @js.native
  class Base64ModelFactory () extends TextModelFactory {
    
    /**
      * The type of the file.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("contentType")
    def contentType_MBase64ModelFactory: ContentType = js.native
    
    /**
      * The format of the file.
      *
      * This is a read-only property.
      */
    @JSName("fileFormat")
    def fileFormat_MBase64ModelFactory: FileFormat = js.native
    
    /**
      * The name of the model type.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("name")
    def name_MBase64ModelFactory: String = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
  - typings.jupyterlabDocregistry.registryMod.DocumentRegistry.ICodeModel because var conflicts: mimeType, mimeTypeChanged. Inlined  */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentModel")
  @js.native
  /**
    * Construct a new document model.
    */
  class DocumentModel ()
    extends Model
       with IModel {
    def this(languagePreference: String) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
    def this(languagePreference: Unit, modelDB: IModelDB) = this()
    
    /* private */ var _contentChanged: js.Any = js.native
    
    /* private */ var _defaultLang: js.Any = js.native
    
    /* private */ var _dirty: js.Any = js.native
    
    /* private */ var _readOnly: js.Any = js.native
    
    /* private */ var _stateChanged: js.Any = js.native
    
    /**
      * A signal emitted when the document content changes.
      */
    /* CompleteClass */
    var contentChanged: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the document content changes.
      */
    @JSName("contentChanged")
    def contentChanged_MDocumentModel: ISignal[this.type, Unit] = js.native
    
    /**
      * The default kernel language of the document.
      */
    /* CompleteClass */
    override val defaultKernelLanguage: String = js.native
    /**
      * The default kernel language of the document.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("defaultKernelLanguage")
    def defaultKernelLanguage_MDocumentModel: String = js.native
    
    /**
      * The default kernel name of the document.
      */
    /* CompleteClass */
    override val defaultKernelName: String = js.native
    /**
      * The default kernel name of the document.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("defaultKernelName")
    def defaultKernelName_MDocumentModel: String = js.native
    
    /**
      * The dirty state of the model.
      *
      * #### Notes
      * This should be cleared when the document is loaded from
      * or saved to disk.
      */
    /* CompleteClass */
    var dirty: Boolean = js.native
    /**
      * The dirty state of the document.
      */
    @JSName("dirty")
    def dirty_MDocumentModel: Boolean = js.native
    
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
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Deserialize the model from JSON.
      *
      * #### Notes
      * Should emit a [contentChanged] signal.
      */
    /* CompleteClass */
    override def fromJSON(value: ReadonlyPartialJSONValue): Unit = js.native
    
    /**
      * Deserialize the model from a string.
      *
      * #### Notes
      * Should emit a [contentChanged] signal.
      */
    /* CompleteClass */
    override def fromString(value: String): Unit = js.native
    
    /**
      * Initialize model state after initial data load.
      *
      * #### Notes
      * This function must be called after the initial data is loaded to set up
      * initial model state, such as an initial undo stack, etc.
      */
    /* CompleteClass */
    override def initialize(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    
    /**
      * The underlying `IModelDB` instance in which model
      * data is stored.
      *
      * ### Notes
      * Making direct edits to the values stored in the`IModelDB`
      * is not recommended, and may produce unpredictable results.
      */
    /* InferMemberOverrides */
    override val modelDB: IModelDB = js.native
    
    /**
      * The read-only state of the model.
      */
    /* CompleteClass */
    var readOnly: Boolean = js.native
    /**
      * The read only state of the document.
      */
    @JSName("readOnly")
    def readOnly_MDocumentModel: Boolean = js.native
    
    /**
      * A signal emitted when the model state changes.
      */
    /* CompleteClass */
    var stateChanged: ISignal[this.type, IChangedArgs[js.Any, js.Any, String]] = js.native
    /**
      * A signal emitted when the document state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MDocumentModel: ISignal[this.type, IChangedArgs[js.Any, js.Any, String]] = js.native
    
    /**
      * Serialize the model to JSON.
      */
    /* CompleteClass */
    override def toJSON(): PartialJSONValue = js.native
    
    /**
      * Trigger a content changed signal.
      */
    /* protected */ def triggerContentChange(): Unit = js.native
    
    /**
      * Trigger a state change signal.
      */
    /* protected */ def triggerStateChange(args: IChangedArgs[js.Any, js.Any, String]): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.luminoMessaging.mod.IMessageHandler because Already inherited
  - typings.luminoWidgets.widgetMod.Widget because Already inherited
  - typings.luminoWidgets.mod.Widget because Already inherited
  - typings.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, content, id, layout, parent, revealed, toolbar. Inlined context, setFragment */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected () extends MainAreaWidget[T] {
    def this(options: IOptions[T, U]) = this()
    
    /**
      * Handle the dirty state of the context model.
      */
    /* private */ var _handleDirtyState: js.Any = js.native
    
    /**
      * Handle a change to the context model state.
      */
    /* private */ var _onModelStateChanged: js.Any = js.native
    
    /**
      * Handle a path change.
      */
    /* private */ var _onPathChanged: js.Any = js.native
    
    val context: IContext[U] = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
  }
  object DocumentWidget {
    
    trait IOptions[T /* <: Widget */, U /* <: IModel */]
      extends StObject
         with typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T] {
      
      var context: IContext[U]
    }
    object IOptions {
      
      inline def apply[T /* <: Widget */, U /* <: IModel */](content: T, context: IContext[U]): IOptions[T, U] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T, U]]
      }
      
      extension [Self <: IOptions[?, ?], T /* <: Widget */, U /* <: IModel */](x: Self & (IOptions[T, U])) {
        
        inline def setContext(value: IContext[U]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
    
    trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
      extends StObject
         with typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptionsOptionalContent[T] {
      
      var context: IContext[U]
    }
    object IOptionsOptionalContent {
      
      inline def apply[T /* <: Widget */, U /* <: IModel */](context: IContext[U]): IOptionsOptionalContent[T, U] = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
      }
      
      extension [Self <: IOptionsOptionalContent[?, ?], T /* <: Widget */, U /* <: IModel */](x: Self & (IOptionsOptionalContent[T, U])) {
        
        inline def setContext(value: IContext[U]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/docregistry/lib/default", "TextModelFactory")
  @js.native
  class TextModelFactory ()
    extends StObject
       with IModelFactory[ICodeModel] {
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /**
      * The type of the file.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("contentType")
    def contentType_MTextModelFactory: ContentType = js.native
    
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
      * The format of the file.
      *
      * This is a read-only property.
      */
    @JSName("fileFormat")
    def fileFormat_MTextModelFactory: FileFormat = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Get whether the model factory has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MTextModelFactory: Boolean = js.native
    
    /**
      * The name of the model type.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("name")
    def name_MTextModelFactory: String = js.native
  }
}
