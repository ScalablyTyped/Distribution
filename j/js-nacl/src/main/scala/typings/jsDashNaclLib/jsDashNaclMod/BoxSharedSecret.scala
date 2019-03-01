package typings
package jsDashNaclLib.jsDashNaclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxSharedSecret extends js.Object {
  var boxK: stdLib.Uint8Array
}

object BoxSharedSecret {
  @scala.inline
  def apply(boxK: stdLib.Uint8Array): BoxSharedSecret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("boxK")(boxK)
    __obj.asInstanceOf[BoxSharedSecret]
  }
}

