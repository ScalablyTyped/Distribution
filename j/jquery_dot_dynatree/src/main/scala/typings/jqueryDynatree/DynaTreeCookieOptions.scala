package typings.jqueryDynatree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynaTreeCookieOptions extends js.Object {
  var expires: js.Any = js.native
}

object DynaTreeCookieOptions {
  @scala.inline
  def apply(expires: js.Any): DynaTreeCookieOptions = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynaTreeCookieOptions]
  }
  @scala.inline
  implicit class DynaTreeCookieOptionsOps[Self <: DynaTreeCookieOptions] (val x: Self) extends AnyVal {
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
    def setExpires(value: js.Any): Self = this.set("expires", value.asInstanceOf[js.Any])
  }
  
}

