package typings.luminoDatagrid.notificationMod.Notification

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a notification.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The message to show on notification.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * The placement of the notification.
    *
    * The default is `'bottom'`.
    */
  var placement: js.UndefOr[Placement] = js.native
  /**
    * Target element to attach notification to.
    *
    */
  var target: HTMLElement = js.native
  /**
    * Duration in ms after which to close notification popup.
    *
    * The default is undefined, and notification is kept visible
    * Timeout value needs to be greater than zero
    */
  var timeout: js.UndefOr[Double] = js.native
}

object IOptions {
  @scala.inline
  def apply(target: HTMLElement): IOptions = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
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
    def setTarget(value: HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

