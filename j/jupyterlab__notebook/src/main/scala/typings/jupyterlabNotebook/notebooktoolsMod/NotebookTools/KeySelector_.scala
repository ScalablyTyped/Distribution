package typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools

import typings.std.Event_
import typings.std.HTMLSelectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A cell tool that provides a selection for a given metadata key.
  */
@JSImport("@jupyterlab/notebook/lib/notebooktools", "NotebookTools.KeySelector")
@js.native
class KeySelector_ protected () extends Tool {
  /**
    * Construct a new KeySelector.
    */
  def this(options: typings.jupyterlabNotebook.notebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
  var _changeGuard: js.Any = js.native
  var _default: js.Any = js.native
  /**
    * Get the value for the data.
    */
  var _getValue: js.Any = js.native
  var _getter: js.Any = js.native
  /**
    * Set the value for the data.
    */
  var _setValue: js.Any = js.native
  var _setter: js.Any = js.native
  var _validCellTypes: js.Any = js.native
  /**
    * The metadata key used by the selector.
    */
  val key: String = js.native
  /**
    * The select node for the widget.
    */
  val selectNode: HTMLSelectElement = js.native
  /**
    * Handle the DOM events for the widget.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notebook panel's node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
  /**
    * Handle a change to the value.
    */
  /* protected */ def onValueChanged(): Unit = js.native
}

