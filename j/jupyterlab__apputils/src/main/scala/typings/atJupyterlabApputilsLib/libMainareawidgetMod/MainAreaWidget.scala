package typings
package atJupyterlabApputilsLib.libMainareawidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/mainareawidget", "MainAreaWidget")
@js.native
class MainAreaWidget[T /* <: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget */] protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new main area widget.
    *
    * @param options - The options for initializing the widget.
    */
  def this(options: atJupyterlabApputilsLib.libMainareawidgetMod.MainAreaWidgetNs.IOptions[T]) = this()
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
  val isRevealed: scala.Boolean = js.native
  /**
    * A promise that resolves when the widget is revealed.
    */
  val revealed: js.Promise[scala.Unit] = js.native
  /**
    * The toolbar hosted by the widget.
    */
  val toolbar: atJupyterlabApputilsLib.libToolbarMod.Toolbar[atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget] = js.native
}

