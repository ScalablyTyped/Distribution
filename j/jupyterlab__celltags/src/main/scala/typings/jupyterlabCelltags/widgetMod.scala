package typings.jupyterlabCelltags

import typings.jupyterlabCelltags.toolMod.TagTool
import typings.luminoWidgets.mod.Widget
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/celltags/lib/widget", JSImport.Namespace)
@js.native
object widgetMod extends js.Object {
  @js.native
  class TagWidget protected () extends Widget {
    /**
      * Construct a new tag widget.
      */
    def this(name: String) = this()
    /**
      * Handle the `'click'` event for the widget.
      */
    var _evtClick: js.Any = js.native
    /**
      * Handle the `'mouseout'` event for the widget.
      */
    var _evtMouseOut: js.Any = js.native
    /**
      * Handle the `'mouseover'` event for the widget.
      */
    var _evtMouseOver: js.Any = js.native
    var applied: js.Any = js.native
    var name: String = js.native
    @JSName("parent")
    var parent_TagWidget: TagTool = js.native
    /**
      * Create tag div with icon and attach to this.node.
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
    def handleEvent(event: Event_): Unit = js.native
    /**
      * Handle `after-attach` messages for the widget.
      */
    def onAfterAttach(): Unit = js.native
    /**
      * Handle `before-detach` messages for the widget.
      */
    def onBeforeDetach(): Unit = js.native
    /**
      * Handle `update-request` messages. Check if applied to current active cell.
      */
    def onUpdateRequest(): Unit = js.native
    /**
      * Update styling to reflect whether tag is applied to current active cell.
      */
    def toggleApplied(): Unit = js.native
  }
  
}

