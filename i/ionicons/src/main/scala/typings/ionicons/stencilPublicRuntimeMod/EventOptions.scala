package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOptions extends js.Object {
  /**
    * A Boolean indicating whether the event bubbles up through the DOM or not.
    */
  var bubbles: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean indicating whether the event is cancelable.
    */
  var cancelable: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value indicating whether or not the event can bubble across the boundary between the shadow DOM and the regular DOM.
    */
  var composed: js.UndefOr[Boolean] = js.native
  /**
    * A string custom event name to override the default.
    */
  var eventName: js.UndefOr[String] = js.native
}

object EventOptions {
  @scala.inline
  def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  @scala.inline
  implicit class EventOptionsOps[Self <: EventOptions] (val x: Self) extends AnyVal {
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
    def setBubbles(value: Boolean): Self = this.set("bubbles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBubbles: Self = this.set("bubbles", js.undefined)
    @scala.inline
    def setCancelable(value: Boolean): Self = this.set("cancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelable: Self = this.set("cancelable", js.undefined)
    @scala.inline
    def setComposed(value: Boolean): Self = this.set("composed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposed: Self = this.set("composed", js.undefined)
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
  }
  
}

