package typings.jupyterlabCsvviewer.toolbarMod

import typings.jupyterlabCsvviewer.toolbarMod.CSVToolbar.IOptions
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import typings.std.Event_
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/csvviewer/lib/toolbar", "CSVDelimiter")
@js.native
class CSVDelimiter protected () extends Widget {
  /**
    * Construct a new csv table widget.
    */
  def this(options: IOptions) = this()
  var _delimiterChanged: js.Any = js.native
  /**
    * A signal emitted when the delimiter selection has changed.
    */
  def delimiterChanged(): ISignal[this.type, String] = js.native
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
  def handleEvent(event: Event_): Unit = js.native
  /**
    * The delimiter dropdown menu.
    */
  def selectNode(): HTMLSelectElement = js.native
}

