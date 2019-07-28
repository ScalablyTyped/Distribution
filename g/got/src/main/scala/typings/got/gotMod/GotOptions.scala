package typings.got.gotMod

import typings.node.Buffer
import typings.node.Error
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Record
import typings.toughDashCookie.toughDashCookieMod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotOptions[E /* <: String | Null */] extends InternalRequestOptions {
  @JSName("agent")
  var agent_GotOptions: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var cache: js.UndefOr[Cache] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  var decompress: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[E] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.undefined
  var request: js.UndefOr[RequestFunction] = js.undefined
  var retry: js.UndefOr[Double | RetryOptions] = js.undefined
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  @JSName("timeout")
  var timeout_GotOptions: js.UndefOr[Double | TimeoutOptions] = js.undefined
  var useElectronNet: js.UndefOr[Boolean] = js.undefined
}

object GotOptions {
  @scala.inline
  def apply[E /* <: String | Null */](
    _defaultAgent: Agent = null,
    agent: Agent | Boolean | AgentOptions = null,
    auth: String = null,
    baseUrl: String = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cache: Cache = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    cookieJar: CookieJar = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    decompress: js.UndefOr[Boolean] = js.undefined,
    defaultPort: Double | String = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    encoding: E = null,
    family: Int | Double = null,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: OutgoingHttpHeaders = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    localAddress: String = null,
    maxVersion: SecureVersion = null,
    method: String = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    port: Double | String = null,
    protocol: String = null,
    query: (Record[String, _]) | URLSearchParams | String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    request: RequestFunction = null,
    retry: Double | RetryOptions = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | TimeoutOptions = null,
    useElectronNet: js.UndefOr[Boolean] = js.undefined
  ): GotOptions[E] = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress)
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (method != null) __obj.updateDynamic("method")(method)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (request != null) __obj.updateDynamic("request")(request)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useElectronNet)) __obj.updateDynamic("useElectronNet")(useElectronNet)
    __obj.asInstanceOf[GotOptions[E]]
  }
}

