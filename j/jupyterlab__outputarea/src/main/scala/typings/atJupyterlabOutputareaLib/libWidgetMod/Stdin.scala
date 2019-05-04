package typings
package atJupyterlabOutputareaLib.libWidgetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/outputarea/lib/widget", "Stdin")
@js.native
class Stdin protected () extends IStdin {
  /**
    * Construct a new input widget.
    */
  def this(options: atJupyterlabOutputareaLib.libWidgetMod.StdinNs.IOptions) = this()
  var _future: js.Any = js.native
  var _input: js.Any = js.native
  var _promise: js.Any = js.native
  var _value: js.Any = js.native
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

