package typings.atJupyterlabApputils.libDialogMod.Dialog

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create a dialog.
  */
trait IOptions[T] extends js.Object {
  /**
    * The main body element for the dialog or a message to display.
    * Defaults to an empty string.
    *
    * #### Notes
    * If a widget is given as the body, it will be disposed after the
    * dialog is resolved.  If the widget has a `getValue()` method,
    * the method will be called prior to disposal and the value
    * will be provided as part of the dialog result.
    * A string argument will be used as raw `textContent`.
    * All `input` and `select` nodes will be wrapped and styled.
    */
  var body: Body[T]
  /**
    * The buttons to display. Defaults to cancel and accept buttons.
    */
  var buttons: js.Array[IButton]
  /**
    * The index of the default button.  Defaults to the last button.
    */
  var defaultButton: Double
  /**
    * A selector for the primary element that should take focus in the dialog.
    * Defaults to an empty string, causing the [[defaultButton]] to take
    * focus.
    */
  var focusNodeSelector: String
  /**
    * The host element for the dialog. Defaults to `document.body`.
    */
  var host: HTMLElement
  /**
    * An optional renderer for dialog items.  Defaults to a shared
    * default renderer.
    */
  var renderer: IRenderer
  /**
    * The top level text for the dialog.  Defaults to an empty string.
    */
  var title: Header
}

object IOptions {
  @scala.inline
  def apply[T](
    body: Body[T],
    buttons: js.Array[IButton],
    defaultButton: Double,
    focusNodeSelector: String,
    host: HTMLElement,
    renderer: IRenderer,
    title: Header
  ): IOptions[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttons = buttons, defaultButton = defaultButton, focusNodeSelector = focusNodeSelector, host = host, renderer = renderer, title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions[T]]
  }
}

