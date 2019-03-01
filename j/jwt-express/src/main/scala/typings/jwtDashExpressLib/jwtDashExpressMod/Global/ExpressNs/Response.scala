package typings
package jwtDashExpressLib.jwtDashExpressMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /**
    * Returns a newly created / signed JWT Object from the payload. If you are using cookies,
    * it will automatically store the JWT in the cookie as well.
    *
    * @param payload The payload of the JWT
    * @return The newly created JWT
    */
  def jwt(payload: js.Any): jwtDashExpressLib.jwtDashExpressMod.JWT
}

object Response {
  @scala.inline
  def apply(jwt: js.Function1[js.Any, jwtDashExpressLib.jwtDashExpressMod.JWT]): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jwt")(jwt)
    __obj.asInstanceOf[Response]
  }
}

