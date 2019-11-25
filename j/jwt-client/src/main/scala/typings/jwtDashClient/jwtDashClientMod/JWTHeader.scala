package typings.jwtDashClient.jwtDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JWTHeader extends js.Object {
  var alg: String
  var typ: String
}

object JWTHeader {
  @scala.inline
  def apply(alg: String, typ: String): JWTHeader = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], typ = typ.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JWTHeader]
  }
}

