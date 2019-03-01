package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var bindCredentials: js.UndefOr[java.lang.String] = js.undefined
  var bindDN: js.UndefOr[java.lang.String] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var queueDisable: js.UndefOr[scala.Boolean] = js.undefined
  var queueSize: js.UndefOr[scala.Double] = js.undefined
  var queueTimeout: js.UndefOr[scala.Double] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean | ldapjsLib.Anon_FailAfter] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var strictDN: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  var url: java.lang.String
}

object ClientOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    bindCredentials: java.lang.String = null,
    bindDN: java.lang.String = null,
    connectTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    log: js.Any = null,
    queueDisable: js.UndefOr[scala.Boolean] = js.undefined,
    queueSize: scala.Int | scala.Double = null,
    queueTimeout: scala.Int | scala.Double = null,
    reconnect: scala.Boolean | ldapjsLib.Anon_FailAfter = null,
    socketPath: java.lang.String = null,
    strictDN: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    tlsOptions: js.Object = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials)
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (!js.isUndefined(queueDisable)) __obj.updateDynamic("queueDisable")(queueDisable)
    if (queueSize != null) __obj.updateDynamic("queueSize")(queueSize.asInstanceOf[js.Any])
    if (queueTimeout != null) __obj.updateDynamic("queueTimeout")(queueTimeout.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions)
    __obj.asInstanceOf[ClientOptions]
  }
}

