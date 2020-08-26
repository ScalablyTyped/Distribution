package typings.highland.Highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PipeOptions extends js.Object {
  var end: Boolean = js.native
}

object PipeOptions {
  @scala.inline
  def apply(end: Boolean): PipeOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipeOptions]
  }
  @scala.inline
  implicit class PipeOptionsOps[Self <: PipeOptions] (val x: Self) extends AnyVal {
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
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
  }
  
}

