package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHexObj extends js.Object {
  var hex: String
  var obj: RSAKey | DSA | ECDSA
}

object AnonHexObj {
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): AnonHexObj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHexObj]
  }
}

