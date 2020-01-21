package typings.layzrJs.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayzrInstance extends js.Object {
  /**
    * Manually check if elements are in the viewport. This method is called while the window is scrolled or resized.
    */
  def check(): LayzrInstance = js.native
  /**
    * Emit an event, firing all of its handlers.
    * @param name Event name
    * @param args Arguments that will be passed to each handler
    */
  def emit(name: LayzrEvents, args: js.Any*): LayzrInstance = js.native
  /**
    * Add or remove the scroll and resize event handlers.
    * @param flag
    */
  def handlers(flag: Boolean): LayzrInstance = js.native
  /**
    * Remove a specific handler from an event.
    * @param name Event name
    * @param handler Event handler
    */
  def off(name: LayzrEvents): LayzrInstance = js.native
  def off(name: LayzrEvents, handler: js.Function0[js.Object]): LayzrInstance = js.native
  /**
    * This event is emitted immediately before/after an image source is set. The image node is passed to the event handler.
    * @param name Event name
    * @param handler Event handler
    */
  def on(name: LayzrEvents, handler: js.Function1[/* element */ HTMLElement, Unit]): LayzrInstance = js.native
  /**
    * This event is emitted immediately before/after an image source is set. The image node is passed to the event handler. Fires once.
    * @param name Event name
    * @param handler Event handler
    */
  def once(name: LayzrEvents, handler: js.Function1[/* element */ HTMLElement, Unit]): LayzrInstance = js.native
  /**
    * Update the elements Layzr is checking.
    */
  def update(): LayzrInstance = js.native
}

