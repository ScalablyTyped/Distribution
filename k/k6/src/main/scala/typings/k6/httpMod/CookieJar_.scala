package typings.k6.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/http", "CookieJar")
@js.native
class CookieJar_ () extends js.Object {
  
  /**
    * Get cookies set for a particular URL.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-cookiesforurl-url
    * @param url - URL for which to get cookies.
    * @returns Cookies for URL.
    */
  def cookiesForURL(url: String): CookieJarCookies = js.native
  
  /**
    * Set cookie.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-set-name-value-options
    * @param name - Cookie name.
    * @param value - Cookie value.
    * @param options - Optional settings.
    */
  def set(name: String, value: String): Unit = js.native
  def set(name: String, value: String, options: CookieOptions): Unit = js.native
}
