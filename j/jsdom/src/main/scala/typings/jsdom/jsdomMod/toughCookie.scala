package typings.jsdom.jsdomMod

import org.scalablytyped.runtime.Instantiable0
import typings.jsdom.TypeofClassCookie
import typings.jsdom.TypeofClassCookieJar
import typings.std.Date
import typings.toughDashCookie.toughDashCookieMod.Cookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in toughCookieNs */
@JSImport("jsdom", "toughCookie")
@js.native
object toughCookie extends js.Object {
  var Cookie: TypeofClassCookie = js.native
  var CookieJar: TypeofClassCookieJar = js.native
  val CookieJarNs: js.Any = js.native
  val CookieNs: js.Any = js.native
  var MemoryCookieStore: Instantiable0[typings.toughDashCookie.toughDashCookieMod.MemoryCookieStore] = js.native
  var Store: Instantiable0[typings.toughDashCookie.toughDashCookieMod.Store] = js.native
  def canonicalDomain(str: String): String = js.native
  def cookieCompare(a: Cookie, b: Cookie): Double = js.native
  def defaultPath(path: String): String = js.native
  def domainMatch(str: String, domStr: String): Boolean = js.native
  def domainMatch(str: String, domStr: String, canonicalize: Boolean): Boolean = js.native
  def formatDate(date: Date): String = js.native
  def fromJSON(string: String): Cookie = js.native
  def getPublicSuffix(hostname: String): String | Null = js.native
  def parseDate(string: String): Date = js.native
  def pathMatch(reqPath: String, cookiePath: String): Boolean = js.native
  def permuteDomain(domain: String): js.Array[String] = js.native
  def permutePath(path: String): js.Array[String] = js.native
}

