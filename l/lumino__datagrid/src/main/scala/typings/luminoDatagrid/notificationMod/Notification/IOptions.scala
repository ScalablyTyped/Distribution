package typings.luminoDatagrid.notificationMod.Notification

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a notification.
  */
trait IOptions extends js.Object {
  /**
    * The message to show on notification.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * The placement of the notification.
    *
    * The default is `'bottom'`.
    */
  var placement: js.UndefOr[Placement] = js.undefined
  /**
    * Target element to attach notification to.
    *
    */
  var target: HTMLElement
  /**
    * Duration in ms after which to close notification popup.
    *
    * The default is undefined, and notification is kept visible
    * Timeout value needs to be greater than zero
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    target: HTMLElement,
    message: String = null,
    placement: Placement = null,
    timeout: Int | Double = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

