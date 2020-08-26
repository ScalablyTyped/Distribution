package typings.hapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpiresIn extends js.Object {
  var expiresAt: js.UndefOr[String] = js.native
  var expiresIn: js.UndefOr[scala.Nothing] = js.native
}

object ExpiresIn {
  @scala.inline
  def apply(): ExpiresIn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpiresIn]
  }
  @scala.inline
  implicit class ExpiresInOps[Self <: ExpiresIn] (val x: Self) extends AnyVal {
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
    def setExpiresAt(value: String): Self = this.set("expiresAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiresAt: Self = this.set("expiresAt", js.undefined)
  }
  
}

