package typings.inboxsdk.mod.ButterBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingMessageDescriptorText
  extends SavingMessageDescriptorBase
     with SavingMessageDescriptor {
  var text: String = js.native
}

object SavingMessageDescriptorText {
  @scala.inline
  def apply(text: String): SavingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingMessageDescriptorText]
  }
  @scala.inline
  implicit class SavingMessageDescriptorTextOps[Self <: SavingMessageDescriptorText] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

