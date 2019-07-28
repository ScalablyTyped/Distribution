package typings.jsDashNacl.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxKeyPair extends js.Object {
  var boxPk: BoxPublicKey
  var boxSk: BoxSecretKey
}

object BoxKeyPair {
  @scala.inline
  def apply(boxPk: BoxPublicKey, boxSk: BoxSecretKey): BoxKeyPair = {
    val __obj = js.Dynamic.literal(boxPk = boxPk, boxSk = boxSk)
  
    __obj.asInstanceOf[BoxKeyPair]
  }
}

