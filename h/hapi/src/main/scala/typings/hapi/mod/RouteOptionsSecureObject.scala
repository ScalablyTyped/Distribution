package typings.hapi.mod

import typings.hapi.AnonAllowfrom
import typings.hapi.AnonIncludeSubdomains
import typings.hapi.hapiBooleans.`false`
import typings.hapi.hapiBooleans.`true`
import typings.hapi.hapiStrings.deny
import typings.hapi.hapiStrings.sameorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsSecureObject extends js.Object {
  /**
    * hsts - controls the 'Strict-Transport-Security' header
    */
  var hsts: js.UndefOr[Boolean | Double | AnonIncludeSubdomains] = js.undefined
  /**
    * boolean controlling the 'X-Download-Options' header for Internet Explorer, preventing downloads from executing in your context. Defaults to true setting the header to 'noopen'.
    */
  var noOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * boolean controlling the 'X-Content-Type-Options' header. Defaults to true setting the header to its only and default option, 'nosniff'.
    */
  var noSniff: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the `Referrer-Policy` header, which has the following possible values.
    * @default false Header will not be send.
    */
  var referrer: js.UndefOr[`false` | ReferrerPolicy] = js.undefined
  /**
    * controls the 'X-Frame-Options' header
    */
  var xframe: js.UndefOr[`true` | deny | sameorigin | AnonAllowfrom] = js.undefined
  /**
    * boolean that controls the 'X-XSS-PROTECTION' header for Internet Explorer. Defaults to true which sets the header to equal '1; mode=block'.
    * Note: this setting can create a security vulnerability in versions of Internet Exploere below 8, as well as unpatched versions of IE8. See here and here for more information. If you actively
    * support old versions of IE, it may be wise to explicitly set this flag to false.
    */
  var xss: Boolean
}

object RouteOptionsSecureObject {
  @scala.inline
  def apply(
    xss: Boolean,
    hsts: Boolean | Double | AnonIncludeSubdomains = null,
    noOpen: js.UndefOr[Boolean] = js.undefined,
    noSniff: js.UndefOr[Boolean] = js.undefined,
    referrer: `false` | ReferrerPolicy = null,
    xframe: `true` | deny | sameorigin | AnonAllowfrom = null
  ): RouteOptionsSecureObject = {
    val __obj = js.Dynamic.literal(xss = xss.asInstanceOf[js.Any])
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(noOpen)) __obj.updateDynamic("noOpen")(noOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(noSniff)) __obj.updateDynamic("noSniff")(noSniff.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (xframe != null) __obj.updateDynamic("xframe")(xframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsSecureObject]
  }
}

