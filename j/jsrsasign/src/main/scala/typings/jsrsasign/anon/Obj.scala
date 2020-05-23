package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Obj extends js.Object {
  var hex: String
  var obj: RSAKey | DSA | ECDSA
}

object Obj {
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): Obj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Obj]
  }
}

