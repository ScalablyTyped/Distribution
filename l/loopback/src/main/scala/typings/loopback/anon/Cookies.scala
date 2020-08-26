package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cookies extends js.Object {
  var cookies: js.UndefOr[js.Array[_]] = js.native
  var currentUserLiteral: js.UndefOr[String] = js.native
  var enableDoublecheck: js.UndefOr[Boolean] = js.native
  var headers: js.UndefOr[js.Array[_]] = js.native
  var model: js.UndefOr[js.Function0[Unit | String]] = js.native
  var overwriteExistingToken: js.UndefOr[Boolean] = js.native
  var params: js.UndefOr[js.Array[_]] = js.native
  var searchDefaultTokenKeys: js.UndefOr[Boolean] = js.native
}

object Cookies {
  @scala.inline
  def apply(): Cookies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cookies]
  }
  @scala.inline
  implicit class CookiesOps[Self <: Cookies] (val x: Self) extends AnyVal {
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
    def setCookiesVarargs(value: js.Any*): Self = this.set("cookies", js.Array(value :_*))
    @scala.inline
    def setCookies(value: js.Array[_]): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookies: Self = this.set("cookies", js.undefined)
    @scala.inline
    def setCurrentUserLiteral(value: String): Self = this.set("currentUserLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentUserLiteral: Self = this.set("currentUserLiteral", js.undefined)
    @scala.inline
    def setEnableDoublecheck(value: Boolean): Self = this.set("enableDoublecheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableDoublecheck: Self = this.set("enableDoublecheck", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: js.Any*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: js.Array[_]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setModel(value: () => Unit | String): Self = this.set("model", js.Any.fromFunction0(value))
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setOverwriteExistingToken(value: Boolean): Self = this.set("overwriteExistingToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwriteExistingToken: Self = this.set("overwriteExistingToken", js.undefined)
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setSearchDefaultTokenKeys(value: Boolean): Self = this.set("searchDefaultTokenKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchDefaultTokenKeys: Self = this.set("searchDefaultTokenKeys", js.undefined)
  }
  
}

