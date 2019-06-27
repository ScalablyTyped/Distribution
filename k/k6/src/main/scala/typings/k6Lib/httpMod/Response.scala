package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: ResponseBody = js.native
  var cookies: org.scalablytyped.runtime.StringDictionary[js.Array[ResponseCookie]] = js.native
  var error: java.lang.String = js.native
  var error_code: scala.Double = js.native
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
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](args: k6Lib.Anon_Params[RT]): RefinedResponse[RT] = js.native
  def html(): k6Lib.htmlMod.Selection = js.native
  def html(selector: java.lang.String): k6Lib.htmlMod.Selection = js.native
  def json(): js.UndefOr[k6Lib.k6Mod.JSON] = js.native
  def json(selector: java.lang.String): js.UndefOr[k6Lib.k6Mod.JSON] = js.native
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](args: k6Lib.Anon_Fields[RT]): RefinedResponse[RT] = js.native
}

