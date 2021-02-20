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
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultMod {
  
  @JSImport("@jupyterlab/docregistry/lib/default", "ABCWidgetFactory")
  @js.native
  abstract class ABCWidgetFactory[T /* <: IDocumentWidget[Widget, IModel] */, U /* <: IModel */] protected () extends IWidgetFactory[T, U] {
    /**
      * Construct a new `ABCWidgetFactory`.
      */
    def this(options: IWidgetFactoryOptions[T]) = this()
    
    var _canStartKernel: js.Any = js.native
    
    var _defaultFor: js.Any = js.native
    
    var _defaultRendered: js.Any = js.native
    
    var _fileTypes: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    var _modelName: js.Any = js.native
    
    var _name: js.Any = js.native
    
    var _preferKernel: js.Any = js.native
    
    var _readOnly: js.Any = js.native
    
    var _shutdownOnClose: js.Any = js.native
    
    var _toolbarFactory: js.Any = js.native
    
    var _widgetCreated: js.Any = js.native
    
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
      * The file types the widget can view.
      */
    @JSName("fileTypes")
    def fileTypes_MABCWidgetFactory: js.Array[String] = js.native
    
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
    def this(languagePreference: js.UndefOr[scala.Nothing], modelDB: IModelDB) = this()
    def this(languagePreference: String, modelDB: IModelDB) = this()
    
    var _contentChanged: js.Any = js.native
    
    var _defaultLang: js.Any = js.native
    
    var _dirty: js.Any = js.native
    
    var _readOnly: js.Any = js.native
    
    var _stateChanged: js.Any = js.native
    
    /**
      * A signal emitted when the document content changes.
      */
    @JSName("contentChanged")
    def contentChanged_MDocumentModel: ISignal[this.type, Unit] = js.native
    
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
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("defaultKernelName")
    def defaultKernelName_MDocumentModel: String = js.native
    
    /**
      * The dirty state of the document.
      */
    @JSName("dirty")
    def dirty_MDocumentModel: Boolean = js.native
    
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
      * The read only state of the document.
      */
    @JSName("readOnly")
    def readOnly_MDocumentModel: Boolean = js.native
    
    /**
      * A signal emitted when the document state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MDocumentModel: ISignal[this.type, IChangedArgs[_, _, String]] = js.native
    
    /**
      * Trigger a content changed signal.
      */
    /* protected */ def triggerContentChange(): Unit = js.native
    
    /**
      * Trigger a state change signal.
      */
    /* protected */ def triggerStateChange(args: IChangedArgs[_, _, String]): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoMessaging.mod.IMessageHandler because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.luminoWidgets.widgetMod.Widget because Already inherited
  - typings.luminoWidgets.mod.Widget because Already inherited
  - typings.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, content, id, layout, parent, revealed, toolbar. Inlined context, setFragment */ @JSImport("@jupyterlab/docregistry/lib/default", "DocumentWidget")
  @js.native
  class DocumentWidget[T /* <: Widget */, U /* <: IModel */] protected () extends MainAreaWidget[T] {
    def this(options: IOptions[T, U]) = this()
    
    /**
      * Handle the dirty state of the context model.
      */
    var _handleDirtyState: js.Any = js.native
    
    /**
      * Handle a change to the context model state.
      */
    var _onModelStateChanged: js.Any = js.native
    
    /**
      * Handle a path change.
      */
    var _onPathChanged: js.Any = js.native
    
    val context: IContext[U] = js.native
    
    /**
      * Set URI fragment identifier.
      */
    def setFragment(fragment: String): Unit = js.native
  }
  object DocumentWidget {
    
    @js.native
    trait IOptions[T /* <: Widget */, U /* <: IModel */]
      extends typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T] {
      
      var context: IContext[U] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T /* <: Widget */, U /* <: IModel */](content: T, context: IContext[U]): IOptions[T, U] = {
        val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T, U]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_, _], T /* <: Widget */, U /* <: IModel */] (val x: Self with (IOptions[T, U])) extends AnyVal {
        
        @scala.inline
        def setContext(value: IContext[U]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IOptionsOptionalContent[T /* <: Widget */, U /* <: IModel */]
      extends typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptionsOptionalContent[T] {
      
      var context: IContext[U] = js.native
    }
    object IOptionsOptionalContent {
      
      @scala.inline
      def apply[T /* <: Widget */, U /* <: IModel */](context: IContext[U]): IOptionsOptionalContent[T, U] = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptionsOptionalContent[T, U]]
      }
      
      @scala.inline
      implicit class IOptionsOptionalContentMutableBuilder[Self <: IOptionsOptionalContent[_, _], T /* <: Widget */, U /* <: IModel */] (val x: Self with (IOptionsOptionalContent[T, U])) extends AnyVal {
        
        @scala.inline
        def setContext(value: IContext[U]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/docregistry/lib/default", "TextModelFactory")
  @js.native
  class TextModelFactory () extends IModelFactory[ICodeModel] {
    
    var _isDisposed: js.Any = js.native
    
    /**
      * The type of the file.
      *
      * #### Notes
      * This is a read-only property.
      */
    @JSName("contentType")
    def contentType_MTextModelFactory: ContentType = js.native
    
    /**
      * The format of the file.
      *
      * This is a read-only property.
      */
    @JSName("fileFormat")
    def fileFormat_MTextModelFactory: FileFormat = js.native
    
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
