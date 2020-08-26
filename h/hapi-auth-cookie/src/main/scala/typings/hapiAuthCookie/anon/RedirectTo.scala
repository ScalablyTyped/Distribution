package typings.hapiAuthCookie.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedirectTo extends js.Object {
  var redirectTo: js.UndefOr[Boolean] = js.native
}

object RedirectTo {
  @scala.inline
  def apply(): RedirectTo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedirectTo]
  }
  @scala.inline
  implicit class RedirectToOps[Self <: RedirectTo] (val x: Self) extends AnyVal {
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
    def setRedirectTo(value: Boolean): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectTo: Self = this.set("redirectTo", js.undefined)
  }
  
}

