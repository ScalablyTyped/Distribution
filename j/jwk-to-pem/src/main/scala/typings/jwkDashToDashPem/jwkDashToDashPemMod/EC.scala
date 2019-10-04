package typings.jwkDashToDashPem.jwkDashToDashPemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC extends JWK {
  var crv: String
  var kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.EC
  var x: String
  var y: String
}

object EC {
  @scala.inline
  def apply(crv: String, kty: typings.jwkDashToDashPem.jwkDashToDashPemStrings.EC, x: String, y: String): EC = {
    val __obj = js.Dynamic.literal(crv = crv, kty = kty, x = x, y = y)
  
    __obj.asInstanceOf[EC]
  }
}

