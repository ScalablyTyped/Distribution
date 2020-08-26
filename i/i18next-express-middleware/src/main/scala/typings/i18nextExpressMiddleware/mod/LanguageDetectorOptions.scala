package typings.i18nextExpressMiddleware.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageDetectorOptions extends js.Object {
  var caches: js.UndefOr[LanguageDetectorCaches] = js.native
  var cookieDomain: js.UndefOr[String] = js.native
  var cookieExpirationDate: js.UndefOr[Date] = js.native
  var lookupCookie: js.UndefOr[String] = js.native
  var lookupFromPathIndex: js.UndefOr[Double] = js.native
  var lookupQuerystring: js.UndefOr[String] = js.native
  var lookupSession: js.UndefOr[String] = js.native
  var order: js.UndefOr[LanguageDetectorOrder] = js.native
}

object LanguageDetectorOptions {
  @scala.inline
  def apply(): LanguageDetectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageDetectorOptions]
  }
  @scala.inline
  implicit class LanguageDetectorOptionsOps[Self <: LanguageDetectorOptions] (val x: Self) extends AnyVal {
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
    def setCachesVarargs(value: String*): Self = this.set("caches", js.Array(value :_*))
    @scala.inline
    def setCaches(value: LanguageDetectorCaches): Self = this.set("caches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaches: Self = this.set("caches", js.undefined)
    @scala.inline
    def setCookieDomain(value: String): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    @scala.inline
    def setCookieExpirationDate(value: Date): Self = this.set("cookieExpirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCookieExpirationDate: Self = this.set("cookieExpirationDate", js.undefined)
    @scala.inline
    def setLookupCookie(value: String): Self = this.set("lookupCookie", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupCookie: Self = this.set("lookupCookie", js.undefined)
    @scala.inline
    def setLookupFromPathIndex(value: Double): Self = this.set("lookupFromPathIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupFromPathIndex: Self = this.set("lookupFromPathIndex", js.undefined)
    @scala.inline
    def setLookupQuerystring(value: String): Self = this.set("lookupQuerystring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupQuerystring: Self = this.set("lookupQuerystring", js.undefined)
    @scala.inline
    def setLookupSession(value: String): Self = this.set("lookupSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookupSession: Self = this.set("lookupSession", js.undefined)
    @scala.inline
    def setOrderVarargs(value: String*): Self = this.set("order", js.Array(value :_*))
    @scala.inline
    def setOrder(value: LanguageDetectorOrder): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
  
}

