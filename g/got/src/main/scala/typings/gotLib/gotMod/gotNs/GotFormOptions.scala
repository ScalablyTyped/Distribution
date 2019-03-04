package typings
package gotLib.gotMod.gotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GotFormOptions[E /* <: java.lang.String | scala.Null */] extends GotOptions[E] {
  var body: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var form: gotLib.gotLibNumbers.`true`
  var hooks: js.UndefOr[Hooks[GotFormOptions[E], stdLib.Record[java.lang.String, _]]] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
}

object GotFormOptions {
  @scala.inline
  def apply[E /* <: java.lang.String | scala.Null */](
    form: gotLib.gotLibNumbers.`true`,
    _defaultAgent: nodeLib.httpMod.Agent = null,
    agent: nodeLib.httpMod.Agent | scala.Boolean | AgentOptions = null,
    auth: java.lang.String = null,
    baseUrl: java.lang.String = null,
    body: stdLib.Record[java.lang.String, _] = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cache: Cache = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    cookieJar: toughDashCookieLib.toughDashCookieMod.CookieJar = null,
    createConnection: js.Function2[
      /* options */ nodeLib.httpMod.ClientRequestArgs, 
      /* oncreate */ js.Function2[/* err */ nodeLib.Error, /* socket */ nodeLib.netMod.Socket, scala.Unit], 
      nodeLib.netMod.Socket
    ] = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    decompress: js.UndefOr[scala.Boolean] = js.undefined,
    defaultPort: scala.Double | java.lang.String = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    encoding: E = null,
    family: scala.Int | scala.Double = null,
    followRedirect: js.UndefOr[scala.Boolean] = js.undefined,
    headers: nodeLib.httpMod.OutgoingHttpHeaders = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: Hooks[GotFormOptions[E], stdLib.Record[java.lang.String, _]] = null,
    host: java.lang.String = null,
    hostname: java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    localAddress: java.lang.String = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    method: java.lang.String = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    port: scala.Double | java.lang.String = null,
    protocol: java.lang.String = null,
    query: java.lang.String | js.Object = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    retry: scala.Double | RetryOptions = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    sessionIdContext: java.lang.String = null,
    setHost: js.UndefOr[scala.Boolean] = js.undefined,
    socketPath: java.lang.String = null,
    throwHttpErrors: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | TimeoutOptions = null,
    useElectronNet: js.UndefOr[scala.Boolean] = js.undefined
  ): GotFormOptions[E] = {
    val __obj = js.Dynamic.literal(form = form)
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (body != null) __obj.updateDynamic("body")(body)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (cookieJar != null) __obj.updateDynamic("cookieJar")(cookieJar)
    if (createConnection != null) __obj.updateDynamic("createConnection")(createConnection)
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
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (host != null) __obj.updateDynamic("host")(host)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
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
    __obj.asInstanceOf[GotFormOptions[E]]
  }
}

