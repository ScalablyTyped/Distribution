package typings.atJupyterlabApputils.libMainareawidgetMod

import typings.atJupyterlabApputils.libMainareawidgetMod.MainAreaWidgetNs.IOptions
import typings.atJupyterlabApputils.libPrintingMod.PrintingNs.IPrintable
import typings.atJupyterlabApputils.libToolbarMod.Toolbar
import typings.atPhosphorMessaging.atPhosphorMessagingMod.Message
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/mainareawidget", "MainAreaWidget")
@js.native
class MainAreaWidget[T /* <: Widget */] protected ()
  extends Widget
     with IPrintable {
  /**
    * Construct a new main area widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: IOptions[T]) = this()
  var _changeGuard: js.Any = js.native
  var _content: js.Any = js.native
  /**
    * Give focus to the content.
    */
  var _focusContent: js.Any = js.native
  var _isRevealed: js.Any = js.native
  var _revealed: js.Any = js.native
  var _spinner: js.Any = js.native
  var _toolbar: js.Any = js.native
  /**
    * Update the content title based on attributes of the main widget.
    */
  var _updateContentTitle: js.Any = js.native
  /**
    * Update the title based on the attributes of the child widget.
    */
  var _updateTitle: js.Any = js.native
  /**
    * The content hosted by the widget.
    */
  val content: T = js.native
  /**
    * Whether the content widget or an error is revealed.
    */
  val isRevealed: Boolean = js.native
  /**
    * A promise that resolves when the widget is revealed.
    */
  val revealed: js.Promise[Unit] = js.native
  /**
    * The toolbar hosted by the widget.
    */
  val toolbar: Toolbar[Widget] = js.native
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
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Process a message sent to the handler.
    *
    * @param msg - The message to be processed.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def processMessage(msg: Message): Unit = js.native
}

