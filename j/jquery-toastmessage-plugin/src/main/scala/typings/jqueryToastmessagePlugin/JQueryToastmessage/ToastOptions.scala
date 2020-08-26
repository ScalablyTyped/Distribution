package typings.jqueryToastmessagePlugin.JQueryToastmessage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastOptions extends js.Object {
  /** callback function when the toastmessage is closed @default null */
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * text which will be shown as close button,
    * set to '' when you want to introduce an image via css
    * @default ''
    */
  var closeText: js.UndefOr[String] = js.native
  /** in effect duration in miliseconds @default 600 */
  var inEffectDuration: js.UndefOr[Double] = js.native
  /**
    * Position of the toast container holding different toast.
    * Position can be set only once at the very first call,
    * changing the position after the first call does nothing
    * @default 'top-right'
    */
  var position: js.UndefOr[ToastPosition] = js.native
  /**
    * time in miliseconds before the item has to disappear @default 3000
    */
  var stayTime: js.UndefOr[Double] = js.native
  /** should the toast item sticky or not? @default false */
  var sticky: js.UndefOr[Boolean] = js.native
  /** content of the item @default '' */
  var text: js.UndefOr[String] = js.native
  /** the type of toast @default 'notice' */
  var `type`: js.UndefOr[ToastType] = js.native
}

object ToastOptions {
  @scala.inline
  def apply(): ToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastOptions]
  }
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCloseText(value: String): Self = this.set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseText: Self = this.set("closeText", js.undefined)
    @scala.inline
    def setInEffectDuration(value: Double): Self = this.set("inEffectDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInEffectDuration: Self = this.set("inEffectDuration", js.undefined)
    @scala.inline
    def setPosition(value: ToastPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStayTime(value: Double): Self = this.set("stayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStayTime: Self = this.set("stayTime", js.undefined)
    @scala.inline
    def setSticky(value: Boolean): Self = this.set("sticky", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticky: Self = this.set("sticky", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setType(value: ToastType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

