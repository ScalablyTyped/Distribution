package typings
package harDashFormatLib.harDashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** The host of the cookie. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Cookie expiration time.
    * (ISO 8601 - `YYYY-MM-DDThh:mm:ss.sTZD`,
    * e.g. `2009-07-24T19:20:30.123+02:00`).
    */
  var expires: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true if the cookie is HTTP only, false otherwise. */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the cookie. */
  var name: java.lang.String
  /** The path pertaining to the cookie. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** True if the cookie was transmitted over ssl, false otherwise. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** The cookie value. */
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    comment: java.lang.String = null,
    domain: java.lang.String = null,
    expires: java.lang.String = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Cookie]
  }
}

