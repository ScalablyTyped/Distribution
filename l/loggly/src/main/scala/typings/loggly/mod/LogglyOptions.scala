package typings.loggly.mod

import typings.loggly.anon.Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogglyOptions extends js.Object {
  var auth: js.UndefOr[Password] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var subdomain: String
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  var token: String
}

object LogglyOptions {
  @scala.inline
  def apply(
    subdomain: String,
    token: String,
    auth: Password = null,
    host: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null
  ): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogglyOptions]
  }
}

