package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var application_name: js.UndefOr[String] = js.undefined
  var database: js.UndefOr[String] = js.undefined
  var fallback_application_name: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String | Null] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object ConnectionInfo {
  @scala.inline
  def apply(
    application_name: String = null,
    database: String = null,
    fallback_application_name: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal()
    if (application_name != null) __obj.updateDynamic("application_name")(application_name.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (!js.isUndefined(fallback_application_name)) __obj.updateDynamic("fallback_application_name")(fallback_application_name.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

