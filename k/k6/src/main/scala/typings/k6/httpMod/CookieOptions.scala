package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieOptions extends js.Object {
  /** Domain allowed to receive. */
  var domain: js.UndefOr[String] = js.native
  /** Expiry time in RFC1123 format. */
  var expires: js.UndefOr[String] = js.native
  /** HTTP only. */
  var http_only: js.UndefOr[Boolean] = js.native
  /** Seconds until expiration. */
  var max_age: js.UndefOr[Double] = js.native
  /** Scope path. */
  var path: js.UndefOr[String] = js.native
  /** Secure. */
  var secure: js.UndefOr[Boolean] = js.native
}

object CookieOptions {
  @scala.inline
  def apply(): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOptions]
  }
  @scala.inline
  implicit class CookieOptionsOps[Self <: CookieOptions] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setExpires(value: String): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setHttp_only(value: Boolean): Self = this.set("http_only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp_only: Self = this.set("http_only", js.undefined)
    @scala.inline
    def setMax_age(value: Double): Self = this.set("max_age", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_age: Self = this.set("max_age", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
  
}

