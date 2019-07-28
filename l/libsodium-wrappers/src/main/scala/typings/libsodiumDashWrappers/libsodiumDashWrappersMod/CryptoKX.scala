package typings.libsodiumDashWrappers.libsodiumDashWrappersMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKX extends js.Object {
  var sharedRx: Uint8Array
  var sharedTx: Uint8Array
}

object CryptoKX {
  @scala.inline
  def apply(sharedRx: Uint8Array, sharedTx: Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx, sharedTx = sharedTx)
  
    __obj.asInstanceOf[CryptoKX]
  }
}

