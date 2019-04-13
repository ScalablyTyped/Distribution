package typings
package jsdomLib.jsdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in toughCookieNs */
@JSImport("jsdom", "toughCookie")
@js.native
object toughCookie extends js.Object {
  var Cookie: jsdomLib.Anon_CookieString = js.native
  var CookieJar: jsdomLib.Anon_Cb = js.native
  val CookieJarNs: js.Any = js.native
  val CookieNs: js.Any = js.native
  var MemoryCookieStore: org.scalablytyped.runtime.Instantiable0[toughDashCookieLib.toughDashCookieMod.MemoryCookieStore] = js.native
  var Store: org.scalablytyped.runtime.Instantiable0[toughDashCookieLib.toughDashCookieMod.Store] = js.native
  def canonicalDomain(str: java.lang.String): java.lang.String = js.native
  def cookieCompare(a: toughDashCookieLib.toughDashCookieMod.Cookie, b: toughDashCookieLib.toughDashCookieMod.Cookie): scala.Double = js.native
  def defaultPath(path: java.lang.String): java.lang.String = js.native
  def domainMatch(str: java.lang.String, domStr: java.lang.String): scala.Boolean = js.native
  def domainMatch(str: java.lang.String, domStr: java.lang.String, canonicalize: scala.Boolean): scala.Boolean = js.native
  def formatDate(date: stdLib.Date): java.lang.String = js.native
  def fromJSON(string: java.lang.String): toughDashCookieLib.toughDashCookieMod.Cookie = js.native
  def getPublicSuffix(hostname: java.lang.String): java.lang.String | scala.Null = js.native
  def parseDate(string: java.lang.String): stdLib.Date = js.native
  def pathMatch(reqPath: java.lang.String, cookiePath: java.lang.String): scala.Boolean = js.native
  def permuteDomain(domain: java.lang.String): js.Array[java.lang.String] = js.native
  def permutePath(path: java.lang.String): js.Array[java.lang.String] = js.native
}

