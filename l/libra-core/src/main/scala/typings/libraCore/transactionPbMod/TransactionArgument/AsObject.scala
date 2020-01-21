package typings.libraCore.transactionPbMod.TransactionArgument

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var data: Uint8Array | String
  var `type`: ArgType
}

object AsObject {
  @scala.inline
  def apply(data: Uint8Array | String, `type`: ArgType): AsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

