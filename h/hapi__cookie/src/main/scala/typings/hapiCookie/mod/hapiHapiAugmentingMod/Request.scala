package typings.hapiCookie.mod.hapiHapiAugmentingMod

import typings.hapiCookie.AnonClear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cookieAuth: AnonClear
}

object Request {
  @scala.inline
  def apply(cookieAuth: AnonClear): Request = {
    val __obj = js.Dynamic.literal(cookieAuth = cookieAuth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

