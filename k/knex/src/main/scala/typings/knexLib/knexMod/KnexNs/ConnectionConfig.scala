package typings
package knexLib.knexMod.KnexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionConfig extends js.Object {
  var database: java.lang.String
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var instanceName: js.UndefOr[java.lang.String] = js.undefined
  var password: java.lang.String
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var user: java.lang.String
}

object ConnectionConfig {
  @scala.inline
  def apply(
    database: java.lang.String,
    host: java.lang.String,
    password: java.lang.String,
    user: java.lang.String,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    domain: java.lang.String = null,
    instanceName: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): ConnectionConfig = {
    val __obj = js.Dynamic.literal(database = database, host = host, password = password, user = user)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionConfig]
  }
}

