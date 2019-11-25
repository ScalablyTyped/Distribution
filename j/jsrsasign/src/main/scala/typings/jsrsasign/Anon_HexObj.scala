package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HexObj extends js.Object {
  var hex: String
  var obj: RSAKey | DSA | ECDSA
}

object Anon_HexObj {
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): Anon_HexObj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_HexObj]
  }
}

