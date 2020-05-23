package typings.hapiCookie.mod.hapiHapiAugmentingMod

import typings.hapiCookie.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookieAuth: Clear
}

object Request {
  @scala.inline
  def apply(cookieAuth: Clear): Request = {
    val __obj = js.Dynamic.literal(cookieAuth = cookieAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

