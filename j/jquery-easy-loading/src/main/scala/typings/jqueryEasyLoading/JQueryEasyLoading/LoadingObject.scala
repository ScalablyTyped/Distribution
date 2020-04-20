package typings.jqueryEasyLoading.JQueryEasyLoading

import typings.jqueryEasyLoading.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingObject extends js.Object {
  /**
    * Check whether the loading state is active or not
    *
    * @return {Boolean}
    */
  def active(): Boolean
  /**
    * Attach some internal methods to external events
    * e.g. overlay click, window resize etc
    */
  def attachMethodsToExternalEvents(): Unit
  /**
    * Attach the handlers defined on `options` for the respective events
    */
  def attachOptionsHandlers(): Unit
  /**
    * Calculate the z-index for the default overlay element
    * Return the z-index passed as setting to the plugin or calculate it
    * based on the target's z-index
    */
  def calcZIndex(): Double
  /**
    * Return a new default overlay
    *
    * @return {jQuery} A new overlay already appended to the page's body
    */
  def createOerlay(): JQuery
  /**
    * Initializes the overlay and attach handlers to the appropriate events
    */
  def init(): Unit
  /**
    * Reposition the overlay on the top of the target element
    * This method needs to be called if the target element changes position
    *  or dimension
    */
  def resize(): Unit
  /**
    * Trigger the `loading.start` event and turn on the loading state
    */
  def start(): Unit
  /**
    * Trigger the `loading.stop` event and turn off the loading state
    */
  def stop(): Unit
  /**
    * Toggle the state of the loading overlay
    */
  def toggle(): Unit
}

object LoadingObject {
  @scala.inline
  def apply(
    active: () => Boolean,
    attachMethodsToExternalEvents: () => Unit,
    attachOptionsHandlers: () => Unit,
    calcZIndex: () => Double,
    createOerlay: () => JQuery,
    init: () => Unit,
    resize: () => Unit,
    start: () => Unit,
    stop: () => Unit,
    toggle: () => Unit
  ): LoadingObject = {
    val __obj = js.Dynamic.literal(active = js.Any.fromFunction0(active), attachMethodsToExternalEvents = js.Any.fromFunction0(attachMethodsToExternalEvents), attachOptionsHandlers = js.Any.fromFunction0(attachOptionsHandlers), calcZIndex = js.Any.fromFunction0(calcZIndex), createOerlay = js.Any.fromFunction0(createOerlay), init = js.Any.fromFunction0(init), resize = js.Any.fromFunction0(resize), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[LoadingObject]
  }
}

