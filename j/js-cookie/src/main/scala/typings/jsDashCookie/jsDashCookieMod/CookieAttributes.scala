package typings.jsDashCookie.jsDashCookieMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsDashCookie.jsDashCookieStrings.Lax
import typings.jsDashCookie.jsDashCookieStrings.None
import typings.jsDashCookie.jsDashCookieStrings.Strict
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieAttributes
  extends /**
  * An attribute which will be serialized, conformably to RFC 6265
  * section 5.2.
  */
/* property */ StringDictionary[js.Any] {
  /**
    * Define the domain where the cookie is available. Defaults to
    * the domain of the page where the cookie was created.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Define when the cookie will be removed. Value can be a Number
    * which will be interpreted as days from time of creation or a
    * Date instance. If omitted, the cookie becomes a session cookie.
    */
  var expires: js.UndefOr[Double | Date] = js.undefined
  /**
    * Define the path where the cookie is available. Defaults to '/'
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Asserts that a cookie must not be sent with cross-origin requests,
    * providing some protection against cross-site request forgery
    * attacks (CSRF)
    */
  var sameSite: js.UndefOr[Strict | Lax | None] = js.undefined
  /**
    * A Boolean indicating if the cookie transmission requires a
    * secure protocol (https). Defaults to false.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieAttributes {
  @scala.inline
  def apply(
    StringDictionary: /**
    * An attribute which will be serialized, conformably to RFC 6265
    * section 5.2.
    */
  /* property */ StringDictionary[js.Any] = null,
    domain: String = null,
    expires: Double | Date = null,
    path: String = null,
    sameSite: Strict | Lax | None = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieAttributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieAttributes]
  }
}

