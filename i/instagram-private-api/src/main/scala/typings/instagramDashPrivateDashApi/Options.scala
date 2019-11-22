package typings.instagramDashPrivateDashApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`4`
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiNumbers.`6`
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.AgentOptions
import typings.node.httpMod.IncomingMessage
import typings.node.urlMod.Url
import typings.request.requestMod.AWSOptions
import typings.request.requestMod.AuthOptions
import typings.request.requestMod.CookieJar
import typings.request.requestMod.HawkOptions
import typings.request.requestMod.Headers
import typings.request.requestMod.HttpArchiveRequest
import typings.request.requestMod.Multipart
import typings.request.requestMod.OAuthOptions
import typings.request.requestMod.RequestCallback
import typings.request.requestMod.RequestPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined request.request.Options */
@js.native
trait Options extends js.Object {
  var agent: js.UndefOr[Agent | typings.node.httpsMod.Agent] = js.native
  var agentClass: js.UndefOr[js.Any] = js.native
  var agentOptions: js.UndefOr[AgentOptions | typings.node.httpsMod.AgentOptions] = js.native
  var auth: js.UndefOr[AuthOptions] = js.native
  var aws: js.UndefOr[AWSOptions] = js.native
  var baseUrl: js.UndefOr[String] = js.native
  var body: js.UndefOr[js.Any] = js.native
  var ca: js.UndefOr[String | Buffer | (js.Array[Buffer | String])] = js.native
  var callback: js.UndefOr[RequestCallback] = js.native
  var cert: js.UndefOr[Buffer] = js.native
  var encoding: js.UndefOr[String | Null] = js.native
  var family: js.UndefOr[`4` | `6`] = js.native
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  var followOriginalHttpMethod: js.UndefOr[Boolean] = js.native
  var followRedirect: js.UndefOr[Boolean | (js.Function1[/* response */ IncomingMessage, Boolean])] = js.native
  var forever: js.UndefOr[js.Any] = js.native
  var form: js.UndefOr[StringDictionary[js.Any] | String] = js.native
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var har: js.UndefOr[HttpArchiveRequest] = js.native
  var hawk: js.UndefOr[HawkOptions] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var host: js.UndefOr[String] = js.native
  var jar: js.UndefOr[CookieJar | Boolean] = js.native
  var json: js.UndefOr[js.Any] = js.native
  var jsonReplacer: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var jsonReviver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.native
  var key: js.UndefOr[Buffer] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var maxRedirects: js.UndefOr[Double] = js.native
  var method: js.UndefOr[String] = js.native
  var multipart: js.UndefOr[js.Array[RequestPart] | Multipart] = js.native
  var oauth: js.UndefOr[OAuthOptions] = js.native
  var passphrase: js.UndefOr[String] = js.native
  var pool: js.UndefOr[js.Any] = js.native
  var port: js.UndefOr[Double] = js.native
  var postambleCRLF: js.UndefOr[Boolean] = js.native
  var preambleCRLF: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[js.Any] = js.native
  var qs: js.UndefOr[js.Any] = js.native
  var qsParseOptions: js.UndefOr[js.Any] = js.native
  var qsStringifyOptions: js.UndefOr[js.Any] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var removeRefererHeader: js.UndefOr[Boolean] = js.native
  var strictSSL: js.UndefOr[Boolean] = js.native
  var time: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
  var uri: js.UndefOr[String | Url] = js.native
  var url: js.UndefOr[String | Url] = js.native
  var useQuerystring: js.UndefOr[Boolean] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

