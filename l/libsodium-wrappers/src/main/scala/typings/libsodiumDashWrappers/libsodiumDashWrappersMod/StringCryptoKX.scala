package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringCryptoKX extends js.Object {
  var sharedRx: String
  var sharedTx: String
}

object StringCryptoKX {
  @scala.inline
  def apply(sharedRx: String, sharedTx: String): StringCryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx, sharedTx = sharedTx)
  
    __obj.asInstanceOf[StringCryptoKX]
  }
}

