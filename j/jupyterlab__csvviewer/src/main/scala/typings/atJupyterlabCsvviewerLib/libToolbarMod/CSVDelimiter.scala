package typings
package atJupyterlabCsvviewerLib.libToolbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/toolbar", "CSVDelimiter")
@js.native
class CSVDelimiter protected ()
  extends atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget {
  /**
    * Construct a new csv table widget.
    */
  def this(options: atJupyterlabCsvviewerLib.libToolbarMod.CSVToolbarNs.IOptions) = this()
  var _delimiterChanged: js.Any = js.native
  /**
    * A signal emitted when the delimiter selection has changed.
    */
  val delimiterChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, java.lang.String] = js.native
  /**
    * The delimiter dropdown menu.
    */
  val selectNode: stdLib.HTMLSelectElement = js.native
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
  def handleEvent(event: stdLib.Event): scala.Unit = js.native
}

