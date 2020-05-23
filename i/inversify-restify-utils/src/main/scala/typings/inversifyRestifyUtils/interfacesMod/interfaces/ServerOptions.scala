package typings.inversifyRestifyUtils.interfacesMod.interfaces

import typings.bunyan.mod.^
import typings.node.Buffer
import typings.restify.mod.Formatters_
import typings.restify.mod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions
  extends typings.restify.mod.ServerOptions {
  var defaultRoot: js.UndefOr[String] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    certificate: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    defaultRoot: String = null,
    dtrace: js.UndefOr[Boolean] = js.undefined,
    formatters: Formatters_ = null,
    handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined,
    handleUpgrades: js.UndefOr[Boolean] = js.undefined,
    http2: js.Any = null,
    httpsServerOptions: typings.node.httpsMod.ServerOptions = null,
    ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[String | Buffer]) = null,
    log: ^ = null,
    maxParamLength: js.UndefOr[Double] = js.undefined,
    name: String = null,
    noWriteContinue: js.UndefOr[Boolean] = js.undefined,
    onceNext: js.UndefOr[Boolean] = js.undefined,
    passphrase: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    router: Router = null,
    secureOptions: js.UndefOr[Double] = js.undefined,
    socketio: js.UndefOr[Boolean] = js.undefined,
    spdy: typings.spdy.mod.ServerOptions = null,
    strictNext: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    versions: js.Array[String] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (defaultRoot != null) __obj.updateDynamic("defaultRoot")(defaultRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(dtrace)) __obj.updateDynamic("dtrace")(dtrace.get.asInstanceOf[js.Any])
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (!js.isUndefined(handleUncaughtExceptions)) __obj.updateDynamic("handleUncaughtExceptions")(handleUncaughtExceptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleUpgrades)) __obj.updateDynamic("handleUpgrades")(handleUpgrades.get.asInstanceOf[js.Any])
    if (http2 != null) __obj.updateDynamic("http2")(http2.asInstanceOf[js.Any])
    if (httpsServerOptions != null) __obj.updateDynamic("httpsServerOptions")(httpsServerOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(maxParamLength)) __obj.updateDynamic("maxParamLength")(maxParamLength.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noWriteContinue)) __obj.updateDynamic("noWriteContinue")(noWriteContinue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.get.asInstanceOf[js.Any])
    if (router != null) __obj.updateDynamic("router")(router.asInstanceOf[js.Any])
    if (!js.isUndefined(secureOptions)) __obj.updateDynamic("secureOptions")(secureOptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(socketio)) __obj.updateDynamic("socketio")(socketio.get.asInstanceOf[js.Any])
    if (spdy != null) __obj.updateDynamic("spdy")(spdy.asInstanceOf[js.Any])
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (versions != null) __obj.updateDynamic("versions")(versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
}

