package typings.k6.httpMod

import org.scalablytyped.runtime.StringDictionary
import typings.k6.anon.Blocked
import typings.k6.anon.Body
import typings.k6.anon.Fields
import typings.k6.anon.Nextupdate
import typings.k6.htmlMod.Selection
import typings.k6.mod.JSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends js.Object {
  
  /** Response body. */
  var body: ResponseBody = js.native
  
  /**
    * Click link on page.
    * https://k6.io/docs/javascript-api/k6-http/response-k6-http/response-clicklink-params
    * @param selector - Selector expression locating link to click.
    * @param params - Parameters for link click request.
    * @returns Link click response.
    */
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def clickLink[RT /* <: js.UndefOr[ResponseType] */](args: typings.k6.anon.Params[RT]): RefinedResponse[RT] = js.native
  
  /** Response cookies. */
  var cookies: StringDictionary[js.Array[ResponseCookie]] = js.native
  
  /** Non-HTTP error message. */
  var error: String = js.native
  
  /** Error code. Present for 4xx 5xx responses and non-HTTP errors. */
  var error_code: Double = js.native
  
  /** Response headers. */
  var headers: StringDictionary[String] = js.native
  
  /**
    * Parse body as HTML. Optionally filter by selector.
    * https://docs.k6.io/docs/response-k6http
    * @param selector - Selector expression.
    * @returns Document node or selected elements.
    * @example
    * let res = http.get("https://stackoverflow.com");
    * let doc = res.html();
    */
  def html(): Selection = js.native
  def html(selector: String): Selection = js.native
  
  /**
    * Parse body as JSON. Optionally filter by selector.
    * https://docs.k6.io/docs/response-k6http
    * @param selector - GJSON expression.
    * @returns Parse result if successful, `undefined` if unsuccessful.
    * @example
    * let res = http.get(url);
    * res.json();
    */
  def json(): js.UndefOr[JSONValue] = js.native
  def json(selector: String): js.UndefOr[JSONValue] = js.native
  
  /** Online Certificate Status Protocol response. */
  var ocsp: Nextupdate = js.native
  
  /** Protocol used to perform the transfer. */
  var proto: Protocol = js.native
  
  /** Server IP address. */
  var remote_ip: String = js.native
  
  /** Remote port connected to. */
  var remote_port: Double = js.native
  
  /** Inciting request details. */
  var request: Body = js.native
  
  /** HTTP status code. */
  var status: Double = js.native
  
  /**
    * Submit form on page.
    * https://k6.io/docs/javascript-api/k6-http/response-k6-http/response-submitform-params
    * @param formSelector - Selector expression locating form to submit.
    * @param fields - Form field values.
    * @param submitSelector - Selector expression locating submit button.
    * @param params - Parameters for form submission request.
    * @returns Form submission response.
    */
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
  def submitForm[RT /* <: js.UndefOr[ResponseType] */](args: Fields[RT]): RefinedResponse[RT] = js.native
  
  /** Performance timing information. */
  var timings: Blocked = js.native
  
  /** TLS cipher suite used. */
  var tls_cipher_suite: CipherSuite = js.native
  
  /** TLS/SSL version used. One of `TLS_*` `SSL_*` constants. */
  var tls_version: String = js.native
  
  /** Fetched URL. May differ from request URL due to redirects. */
  var url: String = js.native
}
