package typings.libraCore.transactionPbMod.SignedTransaction

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var rawTxnBytes: Uint8Array | String
  var senderPublicKey: Uint8Array | String
  var senderSignature: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    rawTxnBytes: Uint8Array | String,
    senderPublicKey: Uint8Array | String,
    senderSignature: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

