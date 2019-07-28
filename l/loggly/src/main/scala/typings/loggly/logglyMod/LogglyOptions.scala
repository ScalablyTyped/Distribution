package typings.loggly.logglyMod

import typings.loggly.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogglyOptions extends js.Object {
  var auth: js.UndefOr[Anon_Password] = js.undefined
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
    auth: Anon_Password = null,
    host: String = null,
    json: js.UndefOr[Boolean] = js.undefined,
    tags: js.Array[String] = null
  ): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain, token = token)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LogglyOptions]
  }
}

