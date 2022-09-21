package typings.k6.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/http", "CookieJar")
@js.native
open class CookieJar_ () extends StObject {
  
  /**
    * Delete all cookies for the given URL.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar/cookiejar-clear
    * @param url - URL to delete all cookies for.
    */
  def clear(url: String): Unit = js.native
  
  /**
    * Get cookies set for a particular URL.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-cookiesforurl-url/
    * @param url - URL for which to get cookies.
    * @returns Cookies for URL.
    */
  def cookiesForURL(url: String): CookieJarCookies = js.native
  
  /**
    * Deletes specific cookie by name for the given URL.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar/cookiejar-delete/
    * @param url - URL to delete cookie for.
    * @param name - Cookie name to delete.
    */
  def delete(url: String, name: String): Unit = js.native
  
  /**
    * Set cookie.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-set-name-value-options/
    * @param url - Cookie URL.
    * @param name - Cookie name.
    * @param value - Cookie value.
    * @param options - Optional settings.
    */
  def set(url: String, name: String, value: String): Unit = js.native
  def set(url: String, name: String, value: String, options: CookieOptions): Unit = js.native
}
