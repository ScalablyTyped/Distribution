package typings.libraCore.transactionPbMod.AccountState

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var address: Uint8Array | String
  var blob: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(address: Uint8Array | String, blob: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

