package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsSecureObject extends js.Object {
  /**
    * hsts - controls the 'Strict-Transport-Security' header
    */
  var hsts: js.UndefOr[scala.Boolean | scala.Double | hapiLib.Anon_IncludeSubdomains] = js.undefined
  /**
    * boolean controlling the 'X-Download-Options' header for Internet Explorer, preventing downloads from executing in your context. Defaults to true setting the header to 'noopen'.
    */
  var noOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * boolean controlling the 'X-Content-Type-Options' header. Defaults to true setting the header to its only and default option, 'nosniff'.
    */
  var noSniff: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Controls the `Referrer-Policy` header, which has the following possible values.
    * @default false Header will not be send.
    */
  var referrer: js.UndefOr[hapiLib.hapiLibNumbers.`false` | ReferrerPolicy] = js.undefined
  /**
    * controls the 'X-Frame-Options' header
    */
  var xframe: js.UndefOr[
    hapiLib.hapiLibNumbers.`true` | hapiLib.hapiLibStrings.deny | hapiLib.hapiLibStrings.sameorigin | hapiLib.Anon_Allowfrom
  ] = js.undefined
  /**
    * boolean that controls the 'X-XSS-PROTECTION' header for Internet Explorer. Defaults to true which sets the header to equal '1; mode=block'.
    * Note: this setting can create a security vulnerability in versions of Internet Exploere below 8, as well as unpatched versions of IE8. See here and here for more information. If you actively
    * support old versions of IE, it may be wise to explicitly set this flag to false.
    */
  var xss: scala.Boolean
}

object RouteOptionsSecureObject {
  @scala.inline
  def apply(
    xss: scala.Boolean,
    hsts: scala.Boolean | scala.Double | hapiLib.Anon_IncludeSubdomains = null,
    noOpen: js.UndefOr[scala.Boolean] = js.undefined,
    noSniff: js.UndefOr[scala.Boolean] = js.undefined,
    referrer: hapiLib.hapiLibNumbers.`false` | ReferrerPolicy = null,
    xframe: hapiLib.hapiLibNumbers.`true` | hapiLib.hapiLibStrings.deny | hapiLib.hapiLibStrings.sameorigin | hapiLib.Anon_Allowfrom = null
  ): RouteOptionsSecureObject = {
    val __obj = js.Dynamic.literal(xss = xss)
    if (hsts != null) __obj.updateDynamic("hsts")(hsts.asInstanceOf[js.Any])
    if (!js.isUndefined(noOpen)) __obj.updateDynamic("noOpen")(noOpen)
    if (!js.isUndefined(noSniff)) __obj.updateDynamic("noSniff")(noSniff)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (xframe != null) __obj.updateDynamic("xframe")(xframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsSecureObject]
  }
}

