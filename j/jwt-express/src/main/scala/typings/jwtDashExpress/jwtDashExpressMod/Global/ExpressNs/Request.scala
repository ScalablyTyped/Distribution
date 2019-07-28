package typings.jwtDashExpress.jwtDashExpressMod.Global.ExpressNs

import typings.jwtDashExpress.jwtDashExpressMod.JWT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var jwt: JWT
}

object Request {
  @scala.inline
  def apply(jwt: JWT): Request = {
    val __obj = js.Dynamic.literal(jwt = jwt)
  
    __obj.asInstanceOf[Request]
  }
}

