package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraSignedTransaction extends js.Object {
  var publicKey: stdLib.Uint8Array
  var signature: stdLib.Uint8Array
  var transaction: LibraTransaction
}

object LibraSignedTransaction {
  @scala.inline
  def apply(publicKey: stdLib.Uint8Array, signature: stdLib.Uint8Array, transaction: LibraTransaction): LibraSignedTransaction = {
    val __obj = js.Dynamic.literal(publicKey = publicKey, signature = signature, transaction = transaction)
  
    __obj.asInstanceOf[LibraSignedTransaction]
  }
}

