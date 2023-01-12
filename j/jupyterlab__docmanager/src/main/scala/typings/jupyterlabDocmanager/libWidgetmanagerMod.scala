package typings.jupyterlabDocmanager

import typings.jupyterlabDocmanager.libWidgetmanagerMod.DocumentWidgetManager.IOptions
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.libRegistryMod.DocumentRegistry.WidgetFactory
import typings.jupyterlabDocregistry.libRegistryMod.IDocumentWidget
import typings.jupyterlabDocregistry.mod.DocumentRegistry
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.IMessageHandler
import typings.luminoMessaging.mod.Message
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWidgetmanagerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/widgetmanager", "DocumentWidgetManager")
  @js.native
  open class DocumentWidgetManager protected ()
    extends StObject
       with IDisposable {
    /**
      * Construct a new document widget manager.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _activateRequested: Any = js.native
    
    /**
      * When a new widget is created, we need to hook it up
      * with some signals, update the widget extensions (for
      * this kind of widget) in the docregistry, among
      * other things.
      */
    /* private */ var _initializeWidget: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * Ask the user whether to close an unsaved file.
      */
    /* private */ var _maybeClose: Any = js.native
    
    /**
      * Handle a file changed signal for a context.
      */
    /* private */ var _onFileChanged: Any = js.native
    
    /**
      * Handle a path changed signal for a context.
      */
    /* private */ var _onPathChanged: Any = js.native
    
    /**
      * Handle the disposal of a widget.
      */
    /* private */ var _onWidgetDisposed: Any = js.native
    
    /* private */ var _registry: Any = js.native
    
    /**
      * Handle the disposal of a widget.
      */
    /* private */ var _widgetDisposed: Any = js.native
    
    /**
      * A signal emitted when one of the documents is activated.
      */
    def activateRequested: ISignal[this.type, String] = js.native
    
    /**
      * Install the message hook for the widget and add to list
      * of known widgets.
      *
      * @param context - The document context object.
      *
      * @param widget - The widget to adopt.
      */
    def adoptWidget(context: Context, widget: IDocumentWidget[Widget, IModel]): Unit = js.native
    
    /**
      * Clone a widget.
      *
      * @param widget - The source widget.
      *
      * @returns A new widget or `undefined`.
      *
      * #### Notes
      *  Uses the same widget factory and context as the source, or throws
      *  if the source widget is not managed by this manager.
      */
    def cloneWidget(widget: Widget): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
    /**
      * Close the widgets associated with a given context.
      *
      * @param context - The document context object.
      */
    def closeWidgets(context: Context): js.Promise[Unit] = js.native
    
    /**
      * Get the document context for a widget.
      *
      * @param widget - The widget of interest.
      *
      * @returns The context associated with the widget, or `undefined`.
      */
    def contextForWidget(widget: Widget): js.UndefOr[Context] = js.native
    
    /**
      * Create a widget for a document and handle its lifecycle.
      *
      * @param factory - The widget factory.
      *
      * @param context - The document context object.
      *
      * @returns A widget created by the factory.
      *
      * @throws If the factory is not registered.
      */
    def createWidget(factory: WidgetFactory, context: Context): IDocumentWidget[Widget, IModel] = js.native
    
    /**
      * Dispose of the widgets associated with a given context
      * regardless of the widget's dirty state.
      *
      * @param context - The document context object.
      */
    def deleteWidgets(context: Context): js.Promise[Unit] = js.native
    
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
      * See if a widget already exists for the given context and widget name.
      *
      * @param context - The document context object.
      *
      * @returns The found widget, or `undefined`.
      *
      * #### Notes
      * This can be used to use an existing widget instead of opening
      * a new widget.
      */
    def findWidget(context: Context, widgetName: String): js.UndefOr[IDocumentWidget[Widget, IModel]] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the document widget manager is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDocumentWidgetManager: Boolean = js.native
    
    /**
      * Filter a message sent to a message handler.
      *
      * @param handler - The target handler of the message.
      *
      * @param msg - The message dispatched to the handler.
      *
      * @returns `false` if the message should be filtered, of `true`
      *   if the message should be dispatched to the handler as normal.
      */
    def messageHook(handler: IMessageHandler, msg: Message): Boolean = js.native
    
    /**
      * Handle `'close-request'` messages.
      *
      * @param widget - The target widget.
      *
      * @returns A promise that resolves with whether the widget was closed.
      */
    /* protected */ def onClose(widget: Widget): js.Promise[Boolean] = js.native
    
    /**
      * Dispose of widget regardless of widget's dirty state.
      *
      * @param widget - The target widget.
      */
    /* protected */ def onDelete(widget: Widget): js.Promise[Unit] = js.native
    
    /**
      * Set the caption for widget title.
      *
      * @param widget - The target widget.
      */
    /* protected */ def setCaption(widget: Widget): js.Promise[Unit] = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  object DocumentWidgetManager {
    
    /**
      * The options used to initialize a document widget manager.
      */
    trait IOptions extends StObject {
      
      /**
        * A document registry instance.
        */
      var registry: DocumentRegistry
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IOptions {
      
      inline def apply(registry: DocumentRegistry): IOptions = {
        val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setRegistry(value: DocumentRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
}
