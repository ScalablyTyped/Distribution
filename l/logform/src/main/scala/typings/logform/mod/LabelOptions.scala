package typings.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelOptions extends js.Object {
  /**
    * A label to be added before the message.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * If set to `true` the `label` will be added to `info.message`. If set to `false` the `label`
    * will be added as `info.label`.
    */
  var message: js.UndefOr[Boolean] = js.native
}

object LabelOptions {
  @scala.inline
  def apply(): LabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOptions]
  }
  @scala.inline
  implicit class LabelOptionsOps[Self <: LabelOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMessage(value: Boolean): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

