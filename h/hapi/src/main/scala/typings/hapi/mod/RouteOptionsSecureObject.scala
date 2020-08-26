package typings.hapi.mod

import typings.hapi.anon.IncludeSubdomains
import typings.hapi.anon.Rule
import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiBooleans.`true`
import typings.hapi.hapiStrings.deny
import typings.hapi.hapiStrings.sameorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteOptionsSecureObject extends js.Object {
  /**
    * hsts - controls the 'Strict-Transport-Security' header
    */
  var hsts: js.UndefOr[Boolean | Double | IncludeSubdomains] = js.native
  /**
    * boolean controlling the 'X-Download-Options' header for Internet Explorer, preventing downloads from executing in your context. Defaults to true setting the header to 'noopen'.
    */
  var noOpen: js.UndefOr[Boolean] = js.native
  /**
    * boolean controlling the 'X-Content-Type-Options' header. Defaults to true setting the header to its only and default option, 'nosniff'.
    */
  var noSniff: js.UndefOr[Boolean] = js.native
  /**
    * Controls the `Referrer-Policy` header, which has the following possible values.
    * @default false Header will not be send.
    */
  var referrer: js.UndefOr[`false` | ReferrerPolicy] = js.native
  /**
    * controls the 'X-Frame-Options' header
    */
  var xframe: js.UndefOr[`true` | deny | sameorigin | Rule] = js.native
  /**
    * boolean that controls the 'X-XSS-PROTECTION' header for Internet Explorer. Defaults to true which sets the header to equal '1; mode=block'.
    * Note: this setting can create a security vulnerability in versions of Internet Exploere below 8, as well as unpatched versions of IE8. See here and here for more information. If you actively
    * support old versions of IE, it may be wise to explicitly set this flag to false.
    */
  var xss: Boolean = js.native
}

object RouteOptionsSecureObject {
  @scala.inline
  def apply(xss: Boolean): RouteOptionsSecureObject = {
    val __obj = js.Dynamic.literal(xss = xss.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsSecureObject]
  }
  @scala.inline
  implicit class RouteOptionsSecureObjectOps[Self <: RouteOptionsSecureObject] (val x: Self) extends AnyVal {
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
    def setXss(value: Boolean): Self = this.set("xss", value.asInstanceOf[js.Any])
    @scala.inline
    def setHsts(value: Boolean | Double | IncludeSubdomains): Self = this.set("hsts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHsts: Self = this.set("hsts", js.undefined)
    @scala.inline
    def setNoOpen(value: Boolean): Self = this.set("noOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoOpen: Self = this.set("noOpen", js.undefined)
    @scala.inline
    def setNoSniff(value: Boolean): Self = this.set("noSniff", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSniff: Self = this.set("noSniff", js.undefined)
    @scala.inline
    def setReferrer(value: `false` | ReferrerPolicy): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setXframe(value: `true` | deny | sameorigin | Rule): Self = this.set("xframe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXframe: Self = this.set("xframe", js.undefined)
  }
  
}

