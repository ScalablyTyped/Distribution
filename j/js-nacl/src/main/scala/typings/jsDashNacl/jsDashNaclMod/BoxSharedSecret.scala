package typings.jsDashNacl.jsDashNaclMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSharedSecret extends js.Object {
  var boxK: Uint8Array
}

object BoxSharedSecret {
  @scala.inline
  def apply(boxK: Uint8Array): BoxSharedSecret = {
    val __obj = js.Dynamic.literal(boxK = boxK)
  
    __obj.asInstanceOf[BoxSharedSecret]
  }
}

