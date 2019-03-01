package typings
package jsDashNaclLib.jsDashNaclMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boxPk")(boxPk)
    __obj.updateDynamic("boxSk")(boxSk)
    __obj.asInstanceOf[BoxKeyPair]
  }
}

