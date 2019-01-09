package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: java.lang.String = js.native
  var cookies: js.Object = js.native
  var error: java.lang.String = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var ocsp: k6Lib.Anon_Nextupdate = js.native
  var proto: java.lang.String = js.native
  var remote_ip: java.lang.String = js.native
  var remote_port: scala.Double = js.native
  var request: k6Lib.Anon_Body = js.native
  var status: scala.Double = js.native
  var timings: k6Lib.Anon_Blocked = js.native
  var tls_cipher_suite: java.lang.String = js.native
  var tls_version: java.lang.String = js.native
  var url: java.lang.String = js.native
  def clickLink(): Response = js.native
  def clickLink(params: k6Lib.Anon_Params): Response = js.native
  def html(): js.Any = js.native
  def html(selector: java.lang.String): js.Any = js.native
  def json(): js.Any = js.native
  def submitForm(): Response = js.native
  def submitForm(params: k6Lib.Anon_Fields): Response = js.native
}

