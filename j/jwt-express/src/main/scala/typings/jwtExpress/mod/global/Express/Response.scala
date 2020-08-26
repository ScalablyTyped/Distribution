package typings.jwtExpress.mod.global.Express

import typings.jwtExpress.mod.JWT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  /**
    * Returns a newly created / signed JWT Object from the payload. If you are using cookies,
    * it will automatically store the JWT in the cookie as well.
    *
    * @param payload The payload of the JWT
    * @return The newly created JWT
    */
  def jwt(payload: js.Any): JWT = js.native
}

object Response {
  @scala.inline
  def apply(jwt: js.Any => JWT): Response = {
    val __obj = js.Dynamic.literal(jwt = js.Any.fromFunction1(jwt))
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJwt(value: js.Any => JWT): Self = this.set("jwt", js.Any.fromFunction1(value))
  }
  
}

