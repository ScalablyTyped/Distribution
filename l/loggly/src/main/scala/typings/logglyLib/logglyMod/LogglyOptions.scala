package typings
package logglyLib.logglyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogglyOptions extends js.Object {
  var auth: js.UndefOr[logglyLib.Anon_Password] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var json: js.UndefOr[scala.Boolean] = js.undefined
  var subdomain: java.lang.String
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var token: java.lang.String
}

object LogglyOptions {
  @scala.inline
  def apply(
    subdomain: java.lang.String,
    token: java.lang.String,
    auth: logglyLib.Anon_Password = null,
    host: java.lang.String = null,
    json: js.UndefOr[scala.Boolean] = js.undefined,
    tags: js.Array[java.lang.String] = null
  ): LogglyOptions = {
    val __obj = js.Dynamic.literal(subdomain = subdomain, token = token)
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[LogglyOptions]
  }
}

