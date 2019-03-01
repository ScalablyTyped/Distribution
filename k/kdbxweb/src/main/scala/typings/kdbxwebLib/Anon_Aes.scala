package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Aes extends js.Object {
  var Aes: java.lang.String
  var ChaCha20: java.lang.String
}

object Anon_Aes {
  @scala.inline
  def apply(Aes: java.lang.String, ChaCha20: java.lang.String): Anon_Aes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Aes")(Aes)
    __obj.updateDynamic("ChaCha20")(ChaCha20)
    __obj.asInstanceOf[Anon_Aes]
  }
}

