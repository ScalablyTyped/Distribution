package typings
package libsodiumDashWrappersLib.libsodiumDashWrappersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKX extends js.Object {
  var sharedRx: stdLib.Uint8Array
  var sharedTx: stdLib.Uint8Array
}

object CryptoKX {
  @scala.inline
  def apply(sharedRx: stdLib.Uint8Array, sharedTx: stdLib.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx, sharedTx = sharedTx)
  
    __obj.asInstanceOf[CryptoKX]
  }
}

