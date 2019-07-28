package typings.jwtDashExpress.jwtDashExpressMod.Global.ExpressNs

import typings.jwtDashExpress.jwtDashExpressMod.JWT
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
  def jwt(payload: js.Any): JWT
}

object Response {
  @scala.inline
  def apply(jwt: js.Any => JWT): Response = {
    val __obj = js.Dynamic.literal(jwt = js.Any.fromFunction1(jwt))
  
    __obj.asInstanceOf[Response]
  }
}

