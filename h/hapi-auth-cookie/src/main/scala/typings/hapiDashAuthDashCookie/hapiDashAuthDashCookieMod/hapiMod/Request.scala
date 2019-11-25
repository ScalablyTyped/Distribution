package typings.hapiDashAuthDashCookie.hapiDashAuthDashCookieMod.hapiMod

import typings.hapiDashAuthDashCookie.Anon_Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookieAuth: Anon_Clear
}

object Request {
  @scala.inline
  def apply(cookieAuth: Anon_Clear): Request = {
    val __obj = js.Dynamic.literal(cookieAuth = cookieAuth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

