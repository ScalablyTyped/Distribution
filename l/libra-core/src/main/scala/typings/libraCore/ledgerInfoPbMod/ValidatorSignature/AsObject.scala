package typings.libraCore.ledgerInfoPbMod.ValidatorSignature

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var signature: Uint8Array | String
  var validatorId: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(signature: Uint8Array | String, validatorId: Uint8Array | String): AsObject = {
    val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any], validatorId = validatorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

