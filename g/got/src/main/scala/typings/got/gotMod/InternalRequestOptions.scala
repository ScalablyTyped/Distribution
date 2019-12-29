package typings.got.gotMod

import typings.node.Anon_RejectUnauthorized
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.netMod.Socket
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecureVersion
import typings.std.Error
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
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    localAddress: String = null,
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
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    sessionIdContext: String = null,
    setHost: js.UndefOr[Boolean] = js.undefined,
    sigalgs: String = null,
    socketPath: String = null,
    timeout: js.Any = null
  ): InternalRequestOptions = {
    val __obj = js.Dynamic.literal()
    if (_defaultAgent != null) __obj.updateDynamic("_defaultAgent")(_defaultAgent.asInstanceOf[js.Any])
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (defaultPort != null) __obj.updateDynamic("defaultPort")(defaultPort.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
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
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(setHost)) __obj.updateDynamic("setHost")(setHost.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalRequestOptions]
  }
}

