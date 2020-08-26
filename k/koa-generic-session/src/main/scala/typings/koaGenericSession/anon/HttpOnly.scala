package typings.koaGenericSession.anon

import typings.koaGenericSession.koaGenericSessionStrings.lax
import typings.koaGenericSession.koaGenericSessionStrings.none
import typings.koaGenericSession.koaGenericSessionStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpOnly extends js.Object {
  var httpOnly: js.UndefOr[Boolean] = js.native
  var maxAge: js.UndefOr[Double | Null] = js.native
  var path: js.UndefOr[String] = js.native
  var rewrite: js.UndefOr[Boolean] = js.native
  var sameSite: js.UndefOr[Boolean | lax | none | strict] = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var signed: js.UndefOr[Boolean] = js.native
}

object HttpOnly {
  @scala.inline
  def apply(): HttpOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpOnly]
  }
  @scala.inline
  implicit class HttpOnlyOps[Self <: HttpOnly] (val x: Self) extends AnyVal {
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
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    @scala.inline
    def setMaxAge(value: Double): Self = this.set("maxAge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxAge: Self = this.set("maxAge", js.undefined)
    @scala.inline
    def setMaxAgeNull: Self = this.set("maxAge", null)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setRewrite(value: Boolean): Self = this.set("rewrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewrite: Self = this.set("rewrite", js.undefined)
    @scala.inline
    def setSameSite(value: Boolean | lax | none | strict): Self = this.set("sameSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSameSite: Self = this.set("sameSite", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSigned(value: Boolean): Self = this.set("signed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigned: Self = this.set("signed", js.undefined)
  }
  
}

