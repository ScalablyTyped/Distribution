package typings
package atJupyterlabApputilsLib.libDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", "Dialog")
@js.native
/**
  * Create a dialog panel instance.
  *
  * @param options - The dialog setup options.
  */
class Dialog[T] ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  def this(options: stdLib.Partial[atJupyterlabApputilsLib.libDialogMod.DialogNs.IOptions[T]]) = this()
  var _body: js.Any = js.native
  var _buttonNodes: js.Any = js.native
  var _buttons: js.Any = js.native
  var _defaultButton: js.Any = js.native
  var _first: js.Any = js.native
  var _focusNodeSelector: js.Any = js.native
  var _host: js.Any = js.native
  var _original: js.Any = js.native
  var _primary: js.Any = js.native
  var _promise: js.Any = js.native
  /**
    * Resolve a button item.
    */
  var _resolve: js.Any = js.native
  /**
    * Handle the `'click'` event for a dialog button.
    *
    * @param event - The DOM event sent to the widget
    */
  /* protected */ def _evtClick(event: stdLib.MouseEvent): scala.Unit = js.native
  /**
    * Handle the `'focus'` event for the widget.
    *
    * @param event - The DOM event sent to the widget
    */
  /* protected */ def _evtFocus(event: stdLib.FocusEvent): scala.Unit = js.native
  /**
    * Handle the `'keydown'` event for the widget.
    *
    * @param event - The DOM event sent to the widget
    */
  /* protected */ def _evtKeydown(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * Handle the DOM events for the directory listing.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
  /**
    * Launch the dialog as a modal window.
    *
    * @returns a promise that resolves with the result of the dialog.
    */
  def launch(): js.Promise[atJupyterlabApputilsLib.libDialogMod.DialogNs.IResult[T]] = js.native
  /**
    * Reject the current dialog with a default reject value.
    *
    * #### Notes
    * Will be a no-op if the dialog is not shown.
    */
  def reject(): scala.Unit = js.native
  /**
    * Resolve the current dialog.
    *
    * @param index - An optional index to the button to resolve.
    *
    * #### Notes
    * Will default to the defaultIndex.
    * Will resolve the current `show()` with the button value.
    * Will be a no-op if the dialog is not shown.
    */
  def resolve(): scala.Unit = js.native
  def resolve(index: scala.Double): scala.Unit = js.native
}

