package typings
package hapiDashAuthDashCookieLib.hapiDashAuthDashCookieMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookieAuth: hapiDashAuthDashCookieLib.Anon_Clear
}

object Request {
  @scala.inline
  def apply(cookieAuth: hapiDashAuthDashCookieLib.Anon_Clear): Request = {
    val __obj = js.Dynamic.literal(cookieAuth = cookieAuth)
  
    __obj.asInstanceOf[Request]
  }
}

