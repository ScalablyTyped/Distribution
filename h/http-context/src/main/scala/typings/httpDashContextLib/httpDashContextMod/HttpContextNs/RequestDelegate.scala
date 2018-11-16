package typings
package httpDashContextLib.httpDashContextMod.HttpContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestDelegate extends js.Object {
  var fresh: scala.Boolean = js.native
  var header: nodeLib.httpMod.IncomingHttpHeaders = js.native
  var headers: nodeLib.httpMod.IncomingHttpHeaders = js.native
  var host: java.lang.String = js.native
  var hostname: java.lang.String = js.native
  var href: java.lang.String = js.native
  var idempotent: scala.Boolean = js.native
  var method: java.lang.String = js.native
  var path: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var query: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = js.native
  var querystring: java.lang.String = js.native
  var search: java.lang.String = js.native
  var secure: scala.Boolean = js.native
  var subdomains: js.Array[java.lang.String] = js.native
  var url: java.lang.String = js.native
  def accepts(types: java.lang.String*): js.Array[java.lang.String] | java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def accepts(types: js.Array[java.lang.String]): js.Array[java.lang.String] | java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsCharsets(charsets: java.lang.String*): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsCharsets(charsets: js.Array[java.lang.String]): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsEncodings(encodings: java.lang.String*): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsEncodings(encodings: js.Array[java.lang.String]): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsLanguages(languages: java.lang.String*): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def acceptsLanguages(languages: js.Array[java.lang.String]): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def get(field: java.lang.String): java.lang.String = js.native
  def is(types: java.lang.String*): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
  def is(types: js.Array[java.lang.String]): java.lang.String | httpDashContextLib.httpDashContextLibNumbers.`false` = js.native
}

