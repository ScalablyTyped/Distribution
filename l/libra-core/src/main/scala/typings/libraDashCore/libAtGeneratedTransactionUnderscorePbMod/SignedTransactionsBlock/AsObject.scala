package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionsBlock

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var transactionsList: js.Array[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ]
  var validatorPublicKey: Uint8Array | String
  var validatorSignature: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    transactionsList: js.Array[
      typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
    ],
    validatorPublicKey: Uint8Array | String,
    validatorSignature: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(transactionsList = transactionsList.asInstanceOf[js.Any], validatorPublicKey = validatorPublicKey.asInstanceOf[js.Any], validatorSignature = validatorSignature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

