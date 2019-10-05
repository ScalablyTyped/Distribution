package typings.atJupyterlabTooltip.libWidgetMod

import typings.atJupyterlabTooltip.libWidgetMod.Tooltip.IOptions
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/tooltip/lib/widget", "Tooltip")
@js.native
class Tooltip_ protected () extends Widget {
  /**
    * Instantiate a tooltip.
    */
  def this(options: IOptions) = this()
  var _content: js.Any = js.native
  var _editor: js.Any = js.native
  /**
    * Handle scroll events for the widget
    */
  var _evtScroll: js.Any = js.native
  var _rendermime: js.Any = js.native
  /**
    * Set the geometry of the tooltip widget.
    */
  var _setGeometry: js.Any = js.native
  /**
    * The anchor widget that the tooltip widget tracks.
    */
  val anchor: Widget = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the dock panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
}

