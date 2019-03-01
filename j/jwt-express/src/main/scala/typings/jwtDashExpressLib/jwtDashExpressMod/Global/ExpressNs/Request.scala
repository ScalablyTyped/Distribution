package typings
package jwtDashExpressLib.jwtDashExpressMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var jwt: jwtDashExpressLib.jwtDashExpressMod.JWT
}

object Request {
  @scala.inline
  def apply(jwt: jwtDashExpressLib.jwtDashExpressMod.JWT): Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jwt")(jwt)
    __obj.asInstanceOf[Request]
  }
}

