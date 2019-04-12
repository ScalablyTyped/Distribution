package typings
package atHapiIronLib.atHapiIronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var `aes-128-ctr`: atHapiIronLib.Anon_IvBits
  var `aes-256-cbc`: atHapiIronLib.Anon_IvBits
  var sha256: atHapiIronLib.Anon_KeyBits
}

object Algorithms {
  @scala.inline
  def apply(
    `aes-128-ctr`: atHapiIronLib.Anon_IvBits,
    `aes-256-cbc`: atHapiIronLib.Anon_IvBits,
    sha256: atHapiIronLib.Anon_KeyBits
  ): Algorithms = {
    val __obj = js.Dynamic.literal(sha256 = sha256)
    __obj.updateDynamic("aes-128-ctr")(`aes-128-ctr`)
    __obj.updateDynamic("aes-256-cbc")(`aes-256-cbc`)
    __obj.asInstanceOf[Algorithms]
  }
}

