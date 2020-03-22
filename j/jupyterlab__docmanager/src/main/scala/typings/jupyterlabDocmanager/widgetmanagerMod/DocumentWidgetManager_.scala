package typings.jupyterlabDocmanager.widgetmanagerMod

import typings.jupyterlabDocmanager.widgetmanagerMod.DocumentWidgetManager.IOptions
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.Context
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.WidgetFactory
import typings.jupyterlabDocregistry.registryMod.IDocumentWidget
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.IMessageHandler
import typings.luminoMessaging.mod.Message
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/widgetmanager", "DocumentWidgetManager")
@js.native
class DocumentWidgetManager_ protected () extends IDisposable {
  /**
    * Construct a new document widget manager.
    */
  def this(options: IOptions) = this()
  var _activateRequested: js.Any = js.native
  /**
    * When a new widget is created, we need to hook it up
    * with some signals, update the widget extensions (for
    * this kind of widget) in the docregistry, among
    * other things.
    */
  var _initializeWidget: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Ask the user whether to close an unsaved file.
    */
  var _maybeClose: js.Any = js.native
  /**
    * Handle a file changed signal for a context.
    */
  var _onFileChanged: js.Any = js.native
  /**
    * Handle a path changed signal for a context.
    */
  var _onPathChanged: js.Any = js.native
  /**
    * Handle the disposal of a widget.
    */
  var _onWidgetDisposed: js.Any = js.native
  var _registry: js.Any = js.native
  /**
    * Handle the disposal of a widget.
    */
  var _widgetDisposed: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A signal emitted when one of the documents is activated.
    */
  def activateRequested(): ISignal[this.type, String] = js.native
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
    * Test whether the document widget manager is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MDocumentWidgetManager_(): Boolean = js.native
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
}

