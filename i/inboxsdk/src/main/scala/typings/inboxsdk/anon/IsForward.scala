package typings.inboxsdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsForward extends js.Object {
  var isForward: Boolean = js.native
}

object IsForward {
  @scala.inline
  def apply(isForward: Boolean): IsForward = {
    val __obj = js.Dynamic.literal(isForward = isForward.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsForward]
  }
  @scala.inline
  implicit class IsForwardOps[Self <: IsForward] (val x: Self) extends AnyVal {
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
    def setIsForward(value: Boolean): Self = this.set("isForward", value.asInstanceOf[js.Any])
  }
  
}

