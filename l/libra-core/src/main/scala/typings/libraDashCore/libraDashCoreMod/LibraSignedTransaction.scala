package typings.libraDashCore.libraDashCoreMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraSignedTransaction extends js.Object {
  var publicKey: Uint8Array
  var signature: Uint8Array
  var transaction: LibraTransaction
}

object LibraSignedTransaction {
  @scala.inline
  def apply(publicKey: Uint8Array, signature: Uint8Array, transaction: LibraTransaction): LibraSignedTransaction = {
    val __obj = js.Dynamic.literal(publicKey = publicKey, signature = signature, transaction = transaction)
  
    __obj.asInstanceOf[LibraSignedTransaction]
  }
}

