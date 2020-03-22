package typings.googlepay.google.payments.api

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object allows you to configure a Google Pay payment button. For
  * more information about button types, colors, and display requirements,
  * see Google's [Brand
  * guidelines](https://developers.google.com/pay/api/web/guides/brand-guidelines).
  */
trait ButtonOptions extends js.Object {
  /**
    * @default "default"
    */
  var buttonColor: js.UndefOr[ButtonColor] = js.undefined
  /**
    * @default "long"
    */
  var buttonType: js.UndefOr[ButtonType] = js.undefined
  /**
    * An [event listener
    * callback](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget/addEventListener#The_event_listener_callback)
    * to call when a click event is delivered to the `<button>` target.
    */
  def onClick(event: Event_): Unit
}

object ButtonOptions {
  @scala.inline
  def apply(onClick: Event_ => Unit, buttonColor: ButtonColor = null, buttonType: ButtonType = null): ButtonOptions = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    if (buttonColor != null) __obj.updateDynamic("buttonColor")(buttonColor.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonOptions]
  }
}

