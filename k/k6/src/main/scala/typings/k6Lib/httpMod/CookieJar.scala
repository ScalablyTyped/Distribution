package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "CookieJar")
@js.native
abstract class CookieJar () extends js.Object {
  var __brand: scala.Nothing = js.native
  /**
    * Get cookies set for a particular URL.
    * https://docs.k6.io/docs/cookiejarcookiesforurlurl
    * @param url - URL for which to get cookies.
    * @returns Cookies for URL.
    */
  def cookiesForURL(url: java.lang.String): CookieJarCookies = js.native
  /**
    * Set cookie.
    * https://docs.k6.io/docs/cookiejarsetname-value-options
    * @param name - Cookie name.
    * @param value - Cookie value.
    * @param options - Optional settings.
    */
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, options: CookieOptions): scala.Unit = js.native
}

