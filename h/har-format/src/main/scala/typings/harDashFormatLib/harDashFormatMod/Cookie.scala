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

