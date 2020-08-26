package typings.lazyBrush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateOptions extends js.Object {
  var both: Boolean = js.native
}

object UpdateOptions {
  @scala.inline
  def apply(both: Boolean): UpdateOptions = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
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
    def setBoth(value: Boolean): Self = this.set("both", value.asInstanceOf[js.Any])
  }
  
}

