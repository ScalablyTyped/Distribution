package typings.jupyterlabFilebrowser.crumbsMod

import typings.jupyterlabFilebrowser.crumbsMod.BreadCrumbs.IOptions
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/crumbs", "BreadCrumbs")
@js.native
class BreadCrumbs_ protected () extends Widget {
  /**
    * Construct a new file browser crumb widget.
    *
    * @param model - The file browser view model.
    */
  def this(options: IOptions) = this()
  var _crumbSeps: js.Any = js.native
  var _crumbs: js.Any = js.native
  /**
    * Handle the `'click'` event for the widget.
    */
  var _evtClick: js.Any = js.native
  /**
    * Handle the `'lm-dragenter'` event for the widget.
    */
  var _evtDragEnter: js.Any = js.native
  /**
    * Handle the `'lm-dragleave'` event for the widget.
    */
  var _evtDragLeave: js.Any = js.native
  /**
    * Handle the `'lm-dragover'` event for the widget.
    */
  var _evtDragOver: js.Any = js.native
  /**
    * Handle the `'lm-drop'` event for the widget.
    */
  var _evtDrop: js.Any = js.native
  var _model: js.Any = js.native
  /**
    * Handle the DOM events for the bread crumbs.
    *
    * @param event - The DOM event sent to the widget.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the panel's DOM node. It should
    * not be called directly by user code.
    */
  def handleEvent(event: Event): Unit = js.native
}

