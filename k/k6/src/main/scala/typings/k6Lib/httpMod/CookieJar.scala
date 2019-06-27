package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/http", "CookieJar")
@js.native
abstract class CookieJar () extends js.Object {
  var __brand: scala.Nothing = js.native
  def cookiesForURL(url: java.lang.String): CookieJarCookies = js.native
  def set(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def set(name: java.lang.String, value: java.lang.String, options: CookieOptions): scala.Unit = js.native
}

