package typings.jupyterlabCelltags

import typings.jupyterlabCelltags.toolMod.TagTool
import typings.luminoWidgets.mod.Widget
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/celltags/lib/addwidget", JSImport.Namespace)
@js.native
object addwidgetMod extends js.Object {
  @js.native
  /**
    * Construct a new tag widget.
    */
  class AddWidget () extends Widget {
    /**
      * Handle the `'focusout'` event for the input box.
      */
    var _evtBlur: js.Any = js.native
    /**
      * Handle the `'focus'` event for the input box.
      */
    var _evtFocus: js.Any = js.native
    /**
      * Handle the `'keydown'` event for the input box.
      *
      * @param event - The DOM event sent to the widget
      */
    var _evtKeyDown: js.Any = js.native
    /**
      * Handle the `'mousedown'` event for the input box.
      *
      * @param event - The DOM event sent to the widget
      */
    var _evtMouseDown: js.Any = js.native
    var editing: js.Any = js.native
    var input: js.Any = js.native
    @JSName("parent")
    var parent_AddWidget: TagTool = js.native
    /**
      * Create input box with icon and attach to this.node.
      */
    def buildTag(): Unit = js.native
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
    /**
      * Handle `after-attach` messages for the widget.
      */
    def onAfterAttach(): Unit = js.native
    /**
      * Handle `before-detach` messages for the widget.
      */
    def onBeforeDetach(): Unit = js.native
  }
  
}

