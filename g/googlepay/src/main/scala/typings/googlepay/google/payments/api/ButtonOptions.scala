package typings.googlepay.google.payments.api

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object allows you to configure a Google Pay payment button. For
  * more information about button types, colors, and display requirements,
  * see Google's [Brand
  * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines).
  */
@js.native
trait ButtonOptions extends js.Object {
  /**
    * @default "default"
    */
  var buttonColor: js.UndefOr[ButtonColor] = js.native
  /**
    * @default "long"
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  /**
    * An [event listener
    * callback](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#The_event_listener_callback)
    * to call when a click event is delivered to the `<button>` target.
    */
  def onClick(event: Event): Unit = js.native
}

object ButtonOptions {
  @scala.inline
  def apply(onClick: Event => Unit): ButtonOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonOptions]
  }
  @scala.inline
  implicit class ButtonOptionsOps[Self <: ButtonOptions] (val x: Self) extends AnyVal {
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
    def setOnClick(value: Event => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setButtonColor(value: ButtonColor): Self = this.set("buttonColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonColor: Self = this.set("buttonColor", js.undefined)
    @scala.inline
    def setButtonType(value: ButtonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
  }
  
}

