package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DialogShowHideOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var effect: String = js.native
}

object DialogShowHideOptions {
  @scala.inline
  def apply(effect: String): DialogShowHideOptions = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogShowHideOptions]
  }
  @scala.inline
  implicit class DialogShowHideOptionsOps[Self <: DialogShowHideOptions] (val x: Self) extends AnyVal {
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
    def setEffect(value: String): Self = this.set("effect", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

