package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSqlOptionsConfig extends js.Object {
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var encrypt: js.UndefOr[scala.Boolean] = js.undefined
  var parseJSON: js.UndefOr[scala.Boolean] = js.undefined
  var pool: js.UndefOr[PoolConfig] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object MsSqlOptionsConfig {
  @scala.inline
  def apply(
    connectionTimeout: scala.Int | scala.Double = null,
    domain: java.lang.String = null,
    encrypt: js.UndefOr[scala.Boolean] = js.undefined,
    parseJSON: js.UndefOr[scala.Boolean] = js.undefined,
    pool: PoolConfig = null,
    port: scala.Int | scala.Double = null,
    requestTimeout: scala.Int | scala.Double = null,
    stream: js.UndefOr[scala.Boolean] = js.undefined
  ): MsSqlOptionsConfig = {
    val __obj = js.Dynamic.literal()
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt)
    if (!js.isUndefined(parseJSON)) __obj.updateDynamic("parseJSON")(parseJSON)
    if (pool != null) __obj.updateDynamic("pool")(pool)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[MsSqlOptionsConfig]
  }
}

