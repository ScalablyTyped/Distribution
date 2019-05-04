package typings
package atJupyterlabDocmanagerLib.libWidgetmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docmanager/lib/widgetmanager", "DocumentWidgetManager")
@js.native
class DocumentWidgetManager protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * Construct a new document widget manager.
    */
  def this(options: atJupyterlabDocmanagerLib.libWidgetmanagerMod.DocumentWidgetManagerNs.IOptions) = this()
  var _activateRequested: js.Any = js.native
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
    * A signal emitted when one of the documents is activated.
    */
  val activateRequested: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * Install the message hook for the widget and add to list
    * of known widgets.
    *
    * @param context - The document context object.
    *
    * @param widget - The widget to adopt.
    */
  def adoptWidget(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context,
    widget: atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ): scala.Unit = js.native
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
  def cloneWidget(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
  /**
    * Close the widgets associated with a given context.
    *
    * @param context - The document context object.
    */
  def closeWidgets(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context): js.Promise[scala.Unit] = js.native
  /**
    * Get the document context for a widget.
    *
    * @param widget - The widget of interest.
    *
    * @returns The context associated with the widget, or `undefined`.
    */
  def contextForWidget(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.UndefOr[atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context] = js.native
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
  def createWidget(
    factory: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.WidgetFactory,
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context
  ): atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
    atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
    atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
  ] = js.native
  /**
    * Dispose of the widgets associated with a given context
    * regardless of the widget's dirty state.
    *
    * @param context - The document context object.
    */
  def deleteWidgets(context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context): js.Promise[scala.Unit] = js.native
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
  override def dispose(): scala.Unit = js.native
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
  def findWidget(
    context: atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.Context,
    widgetName: java.lang.String
  ): js.UndefOr[
    atJupyterlabDocregistryLib.libRegistryMod.IDocumentWidget[
      atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget, 
      atJupyterlabDocregistryLib.libRegistryMod.DocumentRegistryNs.IModel
    ]
  ] = js.native
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
  def messageHook(
    handler: atPhosphorMessagingLib.atPhosphorMessagingMod.IMessageHandler,
    msg: atPhosphorMessagingLib.atPhosphorMessagingMod.Message
  ): scala.Boolean = js.native
  /**
    * Handle `'close-request'` messages.
    *
    * @param widget - The target widget.
    *
    * @returns A promise that resolves with whether the widget was closed.
    */
  /* protected */ def onClose(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.Promise[scala.Boolean] = js.native
  /**
    * Dispose of widget regardless of widget's dirty state.
    *
    * @param widget - The target widget.
    */
  /* protected */ def onDelete(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): js.Promise[scala.Unit] = js.native
  /**
    * Set the caption for widget title.
    *
    * @param widget - The target widget.
    */
  /* protected */ def setCaption(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Unit = js.native
}

