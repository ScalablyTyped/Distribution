package typings.got.gotMod

import typings.node.Anon_RejectUnauthorized
import typings.node.Buffer
import typings.node.Error
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecureVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalRequestOptions
  extends ClientRequestArgs
     with SecureContextOptions
     with Anon_RejectUnauthorized {
  @JSName("agent")
  var agent_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
  // Redeclare options with `any` type for allow specify types incompatible with http.RequestOptions.
  @JSName("timeout")
  var timeout_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
}

object InternalRequestOptions {
  @scala.inline
  def apply(
    _defaultAgent: Agent = null,
    agent: js.Any = null,
    auth: String = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    createConnection: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ Error, /* socket */ Socket, Unit]) => Socket = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    defaultPort: Double | String = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    family: Int | Double = null,
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
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    timeout: js.Any = null
  ): InternalRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent)
    if (agent != null) __obj.updateDynamic("agent")(agent)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[InternalRequestOptions]
  }
}

