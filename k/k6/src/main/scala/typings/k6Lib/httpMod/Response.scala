package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /** Response body. */
  var body: ResponseBody = js.native
  /** Response cookies. */
  var cookies: org.scalablytyped.runtime.StringDictionary[js.Array[ResponseCookie]] = js.native
  /** Non-HTTP error message. */
  var error: java.lang.String = js.native
  /** Error code. Present for 4xx 5xx responses and non-HTTP errors. */
  var error_code: scala.Double = js.native
  /** Response headers. */
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /** Online Certificate Status Protocol response. */
  var ocsp: k6Lib.Anon_Nextupdate = js.native
  /** Protocol used to perform the transfer. */
  var proto: Protocol = js.native
  /** Server IP address. */
  var remote_ip: java.lang.String = js.native
  /** Remote port connected to. */
  var remote_port: scala.Double = js.native
  /** Inciting request details. */
  var request: k6Lib.Anon_Body = js.native
  /** HTTP status code. */
  var status: scala.Double = js.native
  /** Performance timing information. */
  var timings: k6Lib.Anon_Blocked = js.native
  /** TLS cipher suite used. */
  var tls_cipher_suite: CipherSuite = js.native
  /** TLS/SSL version used. One of `TLS_*` `SSL_*` constants. */
  var tls_version: java.lang.String = js.native
  /** Fetched URL. May differ from request URL due to redirects. */
  var url: java.lang.String = js.native
  /**
    * Click link on page.
    * https://docs.k6.io/docs/responseclicklink-params
    * @param selector - Selector expression locating link to click.
    * @param params - Parameters for link click request.
    * @returns Link click response.
    */
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](args: k6Lib.Anon_Params[RT]): RefinedResponse[RT] = js.native
  /**
    * Parse body as HTML. Optionally filter by selector.
    * https://docs.k6.io/docs/response-k6http
    * @param selector - Selector expression.
    * @returns Document node or selected elements.
    */
  def html(): k6Lib.htmlMod.Selection = js.native
  def html(selector: java.lang.String): k6Lib.htmlMod.Selection = js.native
  /**
    * Parse body as JSON. Optionally filter by selector.
    * https://docs.k6.io/docs/response-k6http
    * @param selector - GJSON expression.
    * @returns Parse result if successful, `undefined` if unsuccessful.
    */
  def json(): js.UndefOr[k6Lib.k6Mod.JSONValue] = js.native
  def json(selector: java.lang.String): js.UndefOr[k6Lib.k6Mod.JSONValue] = js.native
  /**
    * Submit form on page.
    * https://docs.k6.io/docs/responsesubmitform-params
    * @param formSelector - Selector expression locating form to submit.
    * @param fields - Form field values.
    * @param submitSelector - Selector expression locating submit button.
    * @param params - Parameters for form submission request.
    * @returns Form submission response.
    */
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](args: k6Lib.Anon_Fields[RT]): RefinedResponse[RT] = js.native
}

