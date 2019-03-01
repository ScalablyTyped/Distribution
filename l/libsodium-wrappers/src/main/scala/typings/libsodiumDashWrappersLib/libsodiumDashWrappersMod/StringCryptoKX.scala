package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCryptoKX extends js.Object {
  var sharedRx: java.lang.String
  var sharedTx: java.lang.String
}

object StringCryptoKX {
  @scala.inline
  def apply(sharedRx: java.lang.String, sharedTx: java.lang.String): StringCryptoKX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sharedRx")(sharedRx)
    __obj.updateDynamic("sharedTx")(sharedTx)
    __obj.asInstanceOf[StringCryptoKX]
  }
}

