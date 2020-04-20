package typings.jwkToPem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC extends JWK {
  var crv: String
  var kty: typings.jwkToPem.jwkToPemStrings.EC
  var x: String
  var y: String
}

object EC {
  @scala.inline
  def apply(crv: String, kty: typings.jwkToPem.jwkToPemStrings.EC, x: String, y: String): EC = {
    val __obj = js.Dynamic.literal(crv = crv.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC]
  }
}

