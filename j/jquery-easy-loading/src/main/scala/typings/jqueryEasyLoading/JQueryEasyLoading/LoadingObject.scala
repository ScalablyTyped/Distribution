package typings.jqueryEasyLoading.JQueryEasyLoading

import typings.jqueryEasyLoading.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadingObject extends js.Object {
  /**
    * Check whether the loading state is active or not
    *
    * @return {Boolean}
    */
  def active(): Boolean = js.native
  /**
    * Attach some internal methods to external events
    * e.g. overlay click, window resize etc
    */
  def attachMethodsToExternalEvents(): Unit = js.native
  /**
    * Attach the handlers defined on `options` for the respective events
    */
  def attachOptionsHandlers(): Unit = js.native
  /**
    * Calculate the z-index for the default overlay element
    * Return the z-index passed as setting to the plugin or calculate it
    * based on the target's z-index
    */
  def calcZIndex(): Double = js.native
  /**
    * Return a new default overlay
    *
    * @return {jQuery} A new overlay already appended to the page's body
    */
  def createOerlay(): JQuery = js.native
  /**
    * Initializes the overlay and attach handlers to the appropriate events
    */
  def init(): Unit = js.native
  /**
    * Reposition the overlay on the top of the target element
    * This method needs to be called if the target element changes position
    *  or dimension
    */
  def resize(): Unit = js.native
  /**
    * Trigger the `loading.start` event and turn on the loading state
    */
  def start(): Unit = js.native
  /**
    * Trigger the `loading.stop` event and turn off the loading state
    */
  def stop(): Unit = js.native
  /**
    * Toggle the state of the loading overlay
    */
  def toggle(): Unit = js.native
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
  @scala.inline
  implicit class LoadingObjectOps[Self <: LoadingObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: () => Boolean): Self = this.set("active", js.Any.fromFunction0(value))
    @scala.inline
    def setAttachMethodsToExternalEvents(value: () => Unit): Self = this.set("attachMethodsToExternalEvents", js.Any.fromFunction0(value))
    @scala.inline
    def setAttachOptionsHandlers(value: () => Unit): Self = this.set("attachOptionsHandlers", js.Any.fromFunction0(value))
    @scala.inline
    def setCalcZIndex(value: () => Double): Self = this.set("calcZIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateOerlay(value: () => JQuery): Self = this.set("createOerlay", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setResize(value: () => Unit): Self = this.set("resize", js.Any.fromFunction0(value))
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
  
}

