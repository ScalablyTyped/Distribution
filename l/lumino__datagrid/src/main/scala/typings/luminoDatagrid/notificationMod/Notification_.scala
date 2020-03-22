package typings.luminoDatagrid.notificationMod

import typings.luminoDatagrid.notificationMod.Notification.IOptions
import typings.luminoDatagrid.notificationMod.Notification.Placement
import typings.luminoWidgets.mod.Widget
import typings.std.Event_
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/datagrid/lib/notification", "Notification")
@js.native
class Notification_ protected () extends Widget {
  /**
    * Construct a new notification.
    *
    * @param options - The options for initializing the notification.
    */
  def this(options: IOptions) = this()
  /**
    * Handle the `'mousedown'` event for the notification.
    */
  var _evtMouseDown: js.Any = js.native
  var _message: js.Any = js.native
  var _placement: js.Any = js.native
  var _target: js.Any = js.native
  /**
    * Get the current value of the message.
    */
  /**
    * Set the current value of the message.
    *
    */
  var message: String = js.native
  /**
    * Get the node presenting the message.
    */
  val messageNode: HTMLSpanElement = js.native
  /**
    * Get the placement of the notification.
    */
  /**
    * Set the placement of the notification.
    */
  var placement: Placement = js.native
  /**
    * Handle the DOM events for the notification.
    *
    * @param event - The DOM event sent to the notification.
    *
    * #### Notes
    * This method implements the DOM `EventListener` interface and is
    * called in response to events on the notification's DOM node.
    *
    * This should not be called directly by user code.
    */
  def handleEvent(event: Event_): Unit = js.native
}

