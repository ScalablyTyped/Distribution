package typings.ldapjs.mod

import typings.ldapjs.anon.FailAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var bindCredentials: js.UndefOr[String] = js.undefined
  var bindDN: js.UndefOr[String] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleTimeout: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var queueDisable: js.UndefOr[Boolean] = js.undefined
  var queueSize: js.UndefOr[Double] = js.undefined
  var queueTimeout: js.UndefOr[Double] = js.undefined
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var strictDN: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  var url: String
}

object ClientOptions {
  @scala.inline
  def apply(
    url: String,
    bindCredentials: String = null,
    bindDN: String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    idleTimeout: js.UndefOr[Double] = js.undefined,
    log: js.Any = null,
    queueDisable: js.UndefOr[Boolean] = js.undefined,
    queueSize: js.UndefOr[Double] = js.undefined,
    queueTimeout: js.UndefOr[Double] = js.undefined,
    reconnect: Boolean | FailAfter = null,
    socketPath: String = null,
    strictDN: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    tlsOptions: js.Object = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (bindCredentials != null) __obj.updateDynamic("bindCredentials")(bindCredentials.asInstanceOf[js.Any])
    if (bindDN != null) __obj.updateDynamic("bindDN")(bindDN.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(idleTimeout)) __obj.updateDynamic("idleTimeout")(idleTimeout.get.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (!js.isUndefined(queueDisable)) __obj.updateDynamic("queueDisable")(queueDisable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queueSize)) __obj.updateDynamic("queueSize")(queueSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queueTimeout)) __obj.updateDynamic("queueTimeout")(queueTimeout.get.asInstanceOf[js.Any])
    if (reconnect != null) __obj.updateDynamic("reconnect")(reconnect.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (tlsOptions != null) __obj.updateDynamic("tlsOptions")(tlsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

