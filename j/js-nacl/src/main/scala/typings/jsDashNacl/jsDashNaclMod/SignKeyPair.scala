package typings.jsDashNacl.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignKeyPair extends js.Object {
  var signPk: SignerPublicKey
  var signSk: SignerSecretKey
}

object SignKeyPair {
  @scala.inline
  def apply(signPk: SignerPublicKey, signSk: SignerSecretKey): SignKeyPair = {
    val __obj = js.Dynamic.literal(signPk = signPk, signSk = signSk)
  
    __obj.asInstanceOf[SignKeyPair]
  }
}

