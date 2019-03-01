package typings
package jsDashCookieLib.jsDashCookieMod.CookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieAttributes extends js.Object {
  /**
    * Define the domain where the cookie is available. Defaults to
    * the domain of the page where the cookie was created.
    */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define when the cookie will be removed. Value can be a Number
    * which will be interpreted as days from time of creation or a
    * Date instance. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
    * Define the path where the cookie is available. Defaults to '/'
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A Boolean indicating if the cookie transmission requires a
    * secure protocol (https). Defaults to false.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieAttributes {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    expires: scala.Double | stdLib.Date = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieAttributes = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieAttributes]
  }
}

