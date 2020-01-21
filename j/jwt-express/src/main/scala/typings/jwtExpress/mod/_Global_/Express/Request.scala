package typings.jwtExpress.mod._Global_.Express

import typings.jwtExpress.mod.JWT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var jwt: JWT
}

object Request {
  @scala.inline
  def apply(jwt: JWT): Request = {
    val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Request]
  }
}

