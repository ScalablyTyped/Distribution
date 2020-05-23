package typings.got.anon

import typings.got.gotBooleans.`true`
import typings.got.mod.AgentOptions
import typings.got.mod.Cache
import typings.got.mod.GotJSONOptions
import typings.got.mod.Hooks
import typings.got.mod.RequestFunction
import typings.got.mod.RetryOptions
import typings.got.mod.TimeoutOptions
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URLSearchParams
import typings.std.Error
import typings.std.Record
import typings.toughCookie.mod.CookieJar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<got.got.GotJSONOptions> */
trait PartialGotJSONOptions extends js.Object {
  var _defaultAgent: js.UndefOr[Agent] = js.undefined
  var agent: js.UndefOr[Agent | Boolean | AgentOptions] = js.undefined
  var auth: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[js.Object] = js.undefined
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var cache: js.UndefOr[Cache] = js.undefined
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var ciphers: js.UndefOr[String] = js.undefined
  var clientCertEngine: js.UndefOr[String] = js.undefined
  var cookieJar: js.UndefOr[CookieJar] = js.undefined
  var createConnection: js.UndefOr[
    js.Function2[
      /* options */ ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit], 
      Socket
    ]
  ] = js.undefined
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
  var decompress: js.UndefOr[Boolean] = js.undefined
  var defaultPort: js.UndefOr[Double | String] = js.undefined
  var dhparam: js.UndefOr[String | Buffer] = js.undefined
  var ecdhCurve: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[Double] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
  var hooks: js.UndefOr[Hooks[GotJSONOptions, js.Object]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[`true`] = js.undefined
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var maxHeaderSize: js.UndefOr[Double] = js.undefined
  var maxVersion: js.UndefOr[SecureVersion] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var minVersion: js.UndefOr[SecureVersion] = js.undefined
  var passphrase: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
  var port: js.UndefOr[Double | String] = js.undefined
  var privateKeyEngine: js.UndefOr[String] = js.undefined
  var privateKeyIdentifier: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[(Record[String, _]) | URLSearchParams | String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  var request: js.UndefOr[RequestFunction] = js.undefined
  var retry: js.UndefOr[Double | RetryOptions] = js.undefined
  var secureOptions: js.UndefOr[Double] = js.undefined
  var secureProtocol: js.UndefOr[String] = js.undefined
  var servername: js.UndefOr[String] = js.undefined
  var sessionIdContext: js.UndefOr[String] = js.undefined
  var setHost: js.UndefOr[Boolean] = js.undefined
  var sigalgs: js.UndefOr[String] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double | TimeoutOptions] = js.undefined
  var useElectronNet: js.UndefOr[Boolean] = js.undefined
}

object PartialGotJSONOptions {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: Agent | Boolean | AgentOptions = null,
    auth: String = null,
    baseUrl: String = null,
    body: js.Object = null,
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
    encoding: String = null,
    family: js.UndefOr[Double] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    form: js.UndefOr[Boolean] = js.undefined,
    headers: OutgoingHttpHeaders = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    hooks: Hooks[GotJSONOptions, js.Object] = null,
    host: String = null,
    hostname: String = null,
    json: `true` = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    localAddress: String = null,
    maxHeaderSize: js.UndefOr[Double] = js.undefined,
    maxVersion: SecureVersion = null,
    method: String = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: Double | String = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    protocol: String = null,
    query: (Record[String, _]) | URLSearchParams | String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    request: RequestFunction = null,
    retry: Double | RetryOptions = null,
    secureOptions: js.UndefOr[Double] = js.undefined,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    sigalgs: String = null,
    socketPath: String = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | TimeoutOptions = null,
    useElectronNet: js.UndefOr[Boolean] = js.undefined
  ): PartialGotJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.get.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(form)) __obj.updateDynamic("form")(form.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.get.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderSize)) __obj.updateDynamic("maxHeaderSize")(maxHeaderSize.get.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(secureOptions)) __obj.updateDynamic("secureOptions")(secureOptions.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.get.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useElectronNet)) __obj.updateDynamic("useElectronNet")(useElectronNet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialGotJSONOptions]
  }
}

