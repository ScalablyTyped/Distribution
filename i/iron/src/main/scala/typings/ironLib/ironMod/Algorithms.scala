package typings
package ironLib.ironMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithms extends js.Object {
  var `aes-128-ctr`: ironLib.Anon_IvBits
  var `aes-256-cbc`: ironLib.Anon_IvBits
  var sha256: ironLib.Anon_KeyBits
}

object Algorithms {
  @scala.inline
  def apply(
    `aes-128-ctr`: ironLib.Anon_IvBits,
    `aes-256-cbc`: ironLib.Anon_IvBits,
    sha256: ironLib.Anon_KeyBits
  ): Algorithms = {
    val __obj = js.Dynamic.literal(`aes-128-ctr` = `aes-128-ctr`, `aes-256-cbc` = `aes-256-cbc`)
    __obj.updateDynamic("sha256")(sha256)
    __obj.asInstanceOf[Algorithms]
  }
}

