package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "CookieJar")
@js.native
abstract class CookieJar () extends js.Object {
  /**
    * Get cookies set for a particular URL.
    * https://docs.k6.io/docs/cookiejarcookiesforurlurl
    * @param url - URL for which to get cookies.
    * @returns Cookies for URL.
    */
  def cookiesForURL(url: String): CookieJarCookies = js.native
  /**
    * Set cookie.
    * https://docs.k6.io/docs/cookiejarsetname-value-options
    * @param name - Cookie name.
    * @param value - Cookie value.
    * @param options - Optional settings.
    */
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, options: CookieOptions): Unit = js.native
}

@JSImport("k6/http", "cookieJar")
@js.native
object cookieJar extends js.Object {
  def apply(): CookieJar = js.native
}

